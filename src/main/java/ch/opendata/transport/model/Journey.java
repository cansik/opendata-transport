
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Journey {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("subcategory")
    @Expose
    private Object subcategory;
    @SerializedName("categoryCode")
    @Expose
    private Integer categoryCode;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("operator")
    @Expose
    private String operator;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("passList")
    @Expose
    private List<Checkpoint> passList = new ArrayList<Checkpoint>();
    @SerializedName("capacity1st")
    @Expose
    private Integer capacity1st;
    @SerializedName("capacity2nd")
    @Expose
    private Integer capacity2nd;

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
     * @return The subcategory
     */
    public Object getSubcategory() {
        return subcategory;
    }

    /**
     * @param subcategory The subcategory
     */
    public void setSubcategory(Object subcategory) {
        this.subcategory = subcategory;
    }

    /**
     * @return The categoryCode
     */
    public Integer getCategoryCode() {
        return categoryCode;
    }

    /**
     * @param categoryCode The categoryCode
     */
    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
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

    /**
     * @return The passList
     */
    public List<Checkpoint> getPassList() {
        return passList;
    }

    /**
     * @param passList The passList
     */
    public void setPassList(List<Checkpoint> passList) {
        this.passList = passList;
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

}
