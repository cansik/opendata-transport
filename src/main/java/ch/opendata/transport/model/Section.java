
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Section {

    @SerializedName("journey")
    @Expose
    private Journey journey;
    @SerializedName("walk")
    @Expose
    private Object walk;
    @SerializedName("departure")
    @Expose
    private Checkpoint departure;
    @SerializedName("arrival")
    @Expose
    private Checkpoint arrival;

    /**
     * @return The journey
     */
    public Journey getJourney() {
        return journey;
    }

    /**
     * @param journey The journey
     */
    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    /**
     * @return The walk
     */
    public Object getWalk() {
        return walk;
    }

    /**
     * @param walk The walk
     */
    public void setWalk(Object walk) {
        this.walk = walk;
    }

    /**
     * @return The departure
     */
    public Checkpoint getDeparture() {
        return departure;
    }

    /**
     * @param departure The departure
     */
    public void setDeparture(Checkpoint departure) {
        this.departure = departure;
    }

    /**
     * @return The arrival
     */
    public Checkpoint getArrival() {
        return arrival;
    }

    /**
     * @param arrival The arrival
     */
    public void setArrival(Checkpoint arrival) {
        this.arrival = arrival;
    }

}
