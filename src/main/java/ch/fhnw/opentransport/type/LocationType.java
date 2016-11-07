package ch.fhnw.opentransport.type;

/**
 * Created by cansik on 06.11.16.
 */
public enum LocationType {
    /**
     * Looks up for all types of locations (default)
     */
    All("all"),

    /**
     * Looks up for stations (train station, bus station)
     */
    Station("station"),

    /**
     * Looks up for points of interest (Clock tower, China garden)
     */
    POI("poi"),

    /**
     * Looks up for an address (Zurich Bahnhofstrasse 33)
     */
    ADDRESS("address");

    private final String text;

    /**
     * @param text
     */
    private LocationType(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
