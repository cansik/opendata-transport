
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Connection {

    @SerializedName("from")
    @Expose
    private Checkpoint from;
    @SerializedName("to")
    @Expose
    private Checkpoint to;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("transfers")
    @Expose
    private Integer transfers;
    @SerializedName("service")
    @Expose
    private Service service;
    @SerializedName("products")
    @Expose
    private List<String> products = new ArrayList<String>();
    @SerializedName("capacity1st")
    @Expose
    private Integer capacity1st;
    @SerializedName("capacity2nd")
    @Expose
    private Integer capacity2nd;
    @SerializedName("sections")
    @Expose
    private List<Section> sections = new ArrayList<Section>();

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

    /**
     * @return The duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration The duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return The transfers
     */
    public Integer getTransfers() {
        return transfers;
    }

    /**
     * @param transfers The transfers
     */
    public void setTransfers(Integer transfers) {
        this.transfers = transfers;
    }

    /**
     * @return The service
     */
    public Service getService() {
        return service;
    }

    /**
     * @param service The service
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * @return The products
     */
    public List<String> getProducts() {
        return products;
    }

    /**
     * @param products The products
     */
    public void setProducts(List<String> products) {
        this.products = products;
    }

    /**
     * @return The capacity1st
     */
    public Integer getCapacity1st() {
        return capacity1st;
    }

    /**
     * @param capacity1st The capacity1st
     */
    public void setCapacity1st(Integer capacity1st) {
        this.capacity1st = capacity1st;
    }

    /**
     * @return The capacity2nd
     */
    public Integer getCapacity2nd() {
        return capacity2nd;
    }

    /**
     * @param capacity2nd The capacity2nd
     */
    public void setCapacity2nd(Integer capacity2nd) {
        this.capacity2nd = capacity2nd;
    }

    /**
     * @return The sections
     */
    public List<Section> getSections() {
        return sections;
    }

    /**
     * @param sections The sections
     */
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

}
