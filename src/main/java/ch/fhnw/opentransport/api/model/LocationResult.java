
package ch.fhnw.opentransport.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class LocationResult {

    @SerializedName("stations")
    @Expose
    private List<Station> stations = new ArrayList<Station>();

    /**
     * @return The stations
     */
    public List<Station> getStations() {
        return stations;
    }

    /**
     * @param stations The stations
     */
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

}
