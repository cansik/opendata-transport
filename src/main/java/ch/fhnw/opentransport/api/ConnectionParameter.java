package ch.fhnw.opentransport.api;

import ch.fhnw.opentransport.api.types.AccessibilityType;
import ch.fhnw.opentransport.api.types.TransportationType;

import java.util.List;

/**
 * Created by cansik on 06.11.16.
 */
public class ConnectionParameter {
    String from;
    String to;

    List<String> via;
    String date;
    String time;
    boolean isArrivalTime = false;

    TransportationType transportations;

    int limit;
    int page;

    boolean direct;
    boolean sleeper;
    boolean couchette;
    boolean bike;

    AccessibilityType accessability = AccessibilityType.INDEPENDENT_BOARDING;
}
