
package ch.fhnw.opentransport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ConnectionResult {

    @SerializedName("connections")
    @Expose
    private List<Connection> connections = new ArrayList<Connection>();

    /**
     * @return The connections
     */
    public List<Connection> getConnections() {
        return connections;
    }

    /**
     * @param connections The connections
     */
    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

}
