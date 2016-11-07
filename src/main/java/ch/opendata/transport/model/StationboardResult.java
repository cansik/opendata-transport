
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class StationboardResult {

    @SerializedName("stationboard")
    @Expose
    private List<Stationboard> stationboard = new ArrayList<Stationboard>();

    /**
     * @return The stationboard
     */
    public List<Stationboard> getStationboard() {
        return stationboard;
    }

    /**
     * @param stationboard The stationboard
     */
    public void setStationboard(List<Stationboard> stationboard) {
        this.stationboard = stationboard;
    }

}
