
package ch.opendata.transport.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Service {

    @SerializedName("regular")
    @Expose
    private Object regular;
    @SerializedName("irregular")
    @Expose
    private String irregular;

    /**
     * @return The regular
     */
    public Object getRegular() {
        return regular;
    }

    /**
     * @param regular The regular
     */
    public void setRegular(Object regular) {
        this.regular = regular;
    }

    /**
     * @return The irregular
     */
    public String getIrregular() {
        return irregular;
    }

    /**
     * @param irregular The irregular
     */
    public void setIrregular(String irregular) {
        this.irregular = irregular;
    }

}
