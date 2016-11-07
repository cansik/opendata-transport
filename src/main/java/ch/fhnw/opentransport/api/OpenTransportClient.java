package ch.fhnw.opentransport.api;

import ch.fhnw.opentransport.api.model.ConnectionResult;
import ch.fhnw.opentransport.api.model.LocationResult;
import ch.fhnw.opentransport.api.types.LocationType;
import ch.fhnw.opentransport.api.types.TransportationType;
import ch.fhnw.opentransport.api.util.BooleanUtils;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

/**
 * Created by cansik on 06.11.16.
 */
public class OpenTransportClient {
    final String baseUrl = "http://transport.opendata.ch/v1/";

    private Gson gson = new Gson();

    public LocationResult getLocations(String query, LocationType locationType) {
        HttpRequest request = Unirest.get(baseUrl.concat("locations"))
                .queryString("query", query)
                .queryString("type", locationType);

        return gson.fromJson(runRequest(request).getBody(), LocationResult.class);
    }

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
     */
    public ConnectionResult getConnections(String from, String to) {
        return getConnections(new ConnectionParameter(from, to));
    }

    /**
     * Returns the next connections from a location to another.
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

    public void getStationboard() {

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
