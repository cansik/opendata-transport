package ch.opendata.transport.parameter;

import ch.opendata.transport.type.DateTimeType;
import ch.opendata.transport.type.TransportationType;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cansik on 07.11.16.
 */
public class StationboardParameter {
    private String station;
    private String id;

    private int limit = 10;
    private String dateTime;
    private List<TransportationType> transportations = new ArrayList<TransportationType>();
    private DateTimeType dateTimeType = DateTimeType.Departure;

    public StationboardParameter() {

    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(dateTime);
    }

    public List<TransportationType> getTransportations() {
        return transportations;
    }

    public DateTimeType getDateTimeType() {
        return dateTimeType;
    }

    public void setDateTimeType(DateTimeType dateTimeType) {
        this.dateTimeType = dateTimeType;
    }
}
