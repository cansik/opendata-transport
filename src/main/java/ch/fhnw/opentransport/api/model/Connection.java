
package ch.fhnw.opentransport.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Connection {

    @SerializedName("from")
    @Expose
    private Checkpoint from;
    @SerializedName("to")
    @Expose
    private Checkpoint to;

    /**
     * @return The from
     */
    public Checkpoint getFrom() {
        return from;
    }

    /**
     * @param from The from
     */
    public void setFrom(Checkpoint from) {
        this.from = from;
    }

    /**
     * @return The to
     */
    public Checkpoint getTo() {
        return to;
    }

    /**
     * @param to The to
     */
    public void setTo(Checkpoint to) {
        this.to = to;
    }

}
