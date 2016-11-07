
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Stationboard {

    @SerializedName("stop")
    @Expose
    private Stop stop;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("to")
    @Expose
    private String to;

    /**
     * @return The stop
     */
    public Stop getStop() {
        return stop;
    }

    /**
     * @param stop The stop
     */
    public void setStop(Stop stop) {
        this.stop = stop;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return The number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return The operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator The operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return The to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to The to
     */
    public void setTo(String to) {
        this.to = to;
    }

}
