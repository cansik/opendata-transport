package ch.fhnw.opentransport.api;

import ch.fhnw.opentransport.api.types.AccessibilityType;
import ch.fhnw.opentransport.api.types.TransportationType;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cansik on 06.11.16.
 */
public class ConnectionParameter {
    String from;
    String to;

    List<String> via = new ArrayList<String>();
    String date;
    String time;
    boolean isArrivalTime = false;

    List<TransportationType> transportations = new ArrayList<TransportationType>();

    int limit = 4;
    int page = 0;

    boolean direct = false;
    boolean sleeper = false;
    boolean couchette = false;
    boolean bike = false;

    AccessibilityType accessability = AccessibilityType.INDEPENDENT_BOARDING;

    public ConnectionParameter(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void setDateTime(Date date) {
        setDate(new SimpleDateFormat("yyyy-MM-dd").format(date));
        setTime(new SimpleDateFormat("HH:mm").format(date));
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<String> getVia() {
        return via;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isArrivalTime() {
        return isArrivalTime;
    }

    public void setArrivalTime(boolean arrivalTime) {
        isArrivalTime = arrivalTime;
    }

    public List<TransportationType> getTransportations() {
        return transportations;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isDirect() {
        return direct;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }

    public boolean isSleeper() {
        return sleeper;
    }

    public void setSleeper(boolean sleeper) {
        this.sleeper = sleeper;
    }

    public boolean isCouchette() {
        return couchette;
    }

    public void setCouchette(boolean couchette) {
        this.couchette = couchette;
    }

    public boolean isBike() {
        return bike;
    }

    public void setBike(boolean bike) {
        this.bike = bike;
    }

    public AccessibilityType getAccessability() {
        return accessability;
    }

    public void setAccessability(AccessibilityType accessability) {
        this.accessability = accessability;
    }
}
