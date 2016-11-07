
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Prognosis {

    @SerializedName("platform")
    @Expose
    private Integer platform;
    @SerializedName("arrival")
    @Expose
    private String arrival;
    @SerializedName("departure")
    @Expose
    private String departure;
    @SerializedName("capacity1st")
    @Expose
    private String capacity1st;
    @SerializedName("capacity2nd")
    @Expose
    private String capacity2nd;

    /**
     * @return The platform
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * @param platform The platform
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
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
     * @return The capacity1st
     */
    public String getCapacity1st() {
        return capacity1st;
    }

    /**
     * @param capacity1st The capacity1st
     */
    public void setCapacity1st(String capacity1st) {
        this.capacity1st = capacity1st;
    }

    /**
     * @return The capacity2nd
     */
    public String getCapacity2nd() {
        return capacity2nd;
    }

    /**
     * @param capacity2nd The capacity2nd
     */
    public void setCapacity2nd(String capacity2nd) {
        this.capacity2nd = capacity2nd;
    }

}
