
package ch.fhnw.opentransport.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Station {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("score")
    @Expose
    private Object score;
    @SerializedName("coordinate")
    @Expose
    private Coordinate coordinate;
    @SerializedName("distance")
    @Expose
    private Object distance;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return The score
     */
    public Object getScore() {
        return score;
    }

    /**
     * @param score The score
     */
    public void setScore(Object score) {
        this.score = score;
    }

    /**
     * @return The coordinate
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * @param coordinate The coordinate
     */
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * @return The distance
     */
    public Object getDistance() {
        return distance;
    }

    /**
     * @param distance The distance
     */
    public void setDistance(Object distance) {
        this.distance = distance;
    }

}
