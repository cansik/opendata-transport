package ch.opendata.transport.type;

/**
 * Created by cansik on 07.11.16.
 */
public enum DateTimeType {
    Departure("departure"),
    Arrival("arrival");

    private final String text;

    /**
     * @param text
     */
    private DateTimeType(final String text) {
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
