
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sun.org.apache.xpath.internal.operations.String;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Stop {

    @SerializedName("station")
    @Expose
    private Station station;
    @SerializedName("arrival")
    @Expose
    private String arrival;
    @SerializedName("arrivalTimestamp")
    @Expose
    private Long arrivalTimestamp;
    @SerializedName("departure")
    @Expose
    private String departure;
    @SerializedName("departureTimestamp")
    @Expose
    private Long departureTimestamp;
    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("prognosis")
    @Expose
    private Prognosis prognosis;

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

    /**
     * @return The arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival The arrival
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return The arrivalTimestamp
     */
    public Long getArrivalTimestamp() {
        return arrivalTimestamp;
    }

    /**
     * @param arrivalTimestamp The arrivalTimestamp
     */
    public void setArrivalTimestamp(Long arrivalTimestamp) {
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
    public Long getDepartureTimestamp() {
        return departureTimestamp;
    }

    /**
     * @param departureTimestamp The departureTimestamp
     */
    public void setDepartureTimestamp(Long departureTimestamp) {
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

}
