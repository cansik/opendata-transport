
package ch.fhnw.opentransport.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Checkpoint {

    @SerializedName("arrival")
    @Expose
    private Object arrival;
    @SerializedName("arrivalTimestamp")
    @Expose
    private Object arrivalTimestamp;
    @SerializedName("departure")
    @Expose
    private String departure;
    @SerializedName("departureTimestamp")
    @Expose
    private Integer departureTimestamp;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("prognosis")
    @Expose
    private Prognosis prognosis;
    @SerializedName("station")
    @Expose
    private Station station;

    /**
     * @return The arrival
     */
    public Object getArrival() {
        return arrival;
    }

    /**
     * @param arrival The arrival
     */
    public void setArrival(Object arrival) {
        this.arrival = arrival;
    }

    /**
     * @return The arrivalTimestamp
     */
    public Object getArrivalTimestamp() {
        return arrivalTimestamp;
    }

    /**
     * @param arrivalTimestamp The arrivalTimestamp
     */
    public void setArrivalTimestamp(Object arrivalTimestamp) {
        this.arrivalTimestamp = arrivalTimestamp;
    }

    /**
     * @return The departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure The departure
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return The departureTimestamp
     */
    public Integer getDepartureTimestamp() {
        return departureTimestamp;
    }

    /**
     * @param departureTimestamp The departureTimestamp
     */
    public void setDepartureTimestamp(Integer departureTimestamp) {
        this.departureTimestamp = departureTimestamp;
    }

    /**
     * @return The platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform The platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return The prognosis
     */
    public Prognosis getPrognosis() {
        return prognosis;
    }

    /**
     * @param prognosis The prognosis
     */
    public void setPrognosis(Prognosis prognosis) {
        this.prognosis = prognosis;
    }

    /**
     * @return The station
     */
    public Station getStation() {
        return station;
    }

    /**
     * @param station The station
     */
    public void setStation(Station station) {
        this.station = station;
    }

}
