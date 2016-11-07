
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Coordinate {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("x")
    @Expose
    private Double x;
    @SerializedName("y")
    @Expose
    private Double y;

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The x
     */
    public Double getX() {
        return x;
    }

    /**
     * @param x The x
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * @return The y
     */
    public Double getY() {
        return y;
    }

    /**
     * @param y The y
     */
    public void setY(Double y) {
        this.y = y;
    }

}
