package ch.opendata.transport;

import ch.opendata.transport.model.ConnectionResult;
import ch.opendata.transport.model.LocationResult;
import ch.opendata.transport.model.StationboardResult;
import ch.opendata.transport.parameter.ConnectionParameter;
import ch.opendata.transport.parameter.StationboardParameter;
import ch.opendata.transport.type.LocationType;
import ch.opendata.transport.type.TransportationType;
import ch.opendata.transport.util.BooleanUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

/**
 * Handles the connection the open data transport api.
 */
public class TransportClient {
    private final String baseUrl = "http://transport.opendata.ch/v1/";

    private final Gson gson;

    public TransportClient() {
        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
    }

    /**
     * Returns the matching locations for the given parameters.
     *
     * @param query        Specifies the location name to search for
     * @param locationType Specifies the location type
     * @return Returns the matching locations for the given parameters.
     */
    public LocationResult getLocations(String query, LocationType locationType) {
        HttpRequest request = Unirest.get(baseUrl.concat("locations"))
                .queryString("query", query)
                .queryString("type", locationType);

        return gson.fromJson(runRequest(request).getBody(), LocationResult.class);
    }

    /**
     * Returns the matching locations for the given parameters.
     *
     * @param x                   Latitude
     * @param y                   Longitude
     * @param transportationTypes Transportation means
     * @return Returns the matching locations for the given parameters.
     */
    public LocationResult getLocations(double x, double y, TransportationType... transportationTypes) {
        HttpRequest request = Unirest.get(baseUrl.concat("locations"))
                .queryString("x", x)
                .queryString("y", y);

        for (TransportationType t : transportationTypes) {
            request.queryString("transportations[]", t);
        }

        return gson.fromJson(runRequest(request).getBody(), LocationResult.class);
    }

    /**
     * Returns the next connections from a location to another.
     *
     * @param from Specifies the departure location of the connection
     * @param to   Specifies the arrival location of the connection
     * @return Returns the next connections from a location to another.
     */
    public ConnectionResult getConnections(String from, String to) {
        return getConnections(new ConnectionParameter(from, to));
    }

    /**
     * Returns the next connections from a location to another.
     *
     * @param params Connections parameter object
     * @return Returns the next connections from a location to another.
     */
    public ConnectionResult getConnections(ConnectionParameter params) {
        HttpRequest request = Unirest.get(baseUrl.concat("connections"))
                .queryString("from", params.getFrom())
                .queryString("to", params.getTo());

        for (String via : params.getVia()) {
            request.queryString("via[]", via);
        }

        if (params.getDate() != null) request.queryString("date", params.getDate());
        if (params.getTime() != null) request.queryString("time", params.getTime());

        for (TransportationType t : params.getTransportations()) {
            request.queryString("transportations[]", t);
        }

        request.queryString("direct", BooleanUtils.toNumeralString(params.isDirect()));
        request.queryString("sleeper", BooleanUtils.toNumeralString(params.isSleeper()));
        request.queryString("couchette", BooleanUtils.toNumeralString(params.isCouchette()));
        request.queryString("bike", BooleanUtils.toNumeralString(params.isBike()));

        request.queryString("accessability", params.getAccessability());

        return gson.fromJson(runRequest(request).getBody(), ConnectionResult.class);
    }

    /**
     * Returns the next connections leaving from a specific location.
     *
     * @param station Specifies the location of which a stationboard should be returned
     * @return Returns the next connections leaving from a specific location.
     */
    public StationboardResult getStationboardByStation(final String station) {
        return getStationboard(new StationboardParameter() {{
            setId(station);
        }});
    }

    /**
     * Returns the next connections leaving from a specific location.
     *
     * @param id The id of the station whose stationboard should be returned
     * @return Returns the next connections leaving from a specific location.
     */
    public StationboardResult getStationboardById(final String id) {
        return getStationboard(new StationboardParameter() {{
            setId(id);
        }});
    }

    /**
     * Returns the next connections leaving from a specific location.
     *
     * @param params Stationboard parameter object
     * @return Returns the next connections leaving from a specific location.
     */
    public StationboardResult getStationboard(StationboardParameter params) {
        HttpRequest request = Unirest.get(baseUrl.concat("stationboard"));

        if (params.getStation() != null) request.queryString("station", params.getStation());
        if (params.getId() != null) request.queryString("id", params.getId());

        for (TransportationType t : params.getTransportations()) {
            request.queryString("transportations[]", t);
        }

        if (params.getDateTime() != null) request.queryString("datetime", params.getDateTime());
        request.queryString("type", params.getDateTimeType());
        request.queryString("limit", params.getLimit());

        return gson.fromJson(runRequest(request).getBody(), StationboardResult.class);
    }

    private HttpResponse<String> runRequest(HttpRequest request) {
        try {
            return request.asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }
}
