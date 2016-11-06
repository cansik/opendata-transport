package ch.fhnw.opentransport.api;

import ch.fhnw.opentransport.api.model.LocationResult;
import ch.fhnw.opentransport.api.types.LocationType;
import ch.fhnw.opentransport.api.types.TransportationType;
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

    public void getConnections() {

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
