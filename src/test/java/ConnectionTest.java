import ch.fhnw.opentransport.OpenTransportClient;
import ch.fhnw.opentransport.model.ConnectionResult;
import ch.fhnw.opentransport.parameter.ConnectionParameter;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by cansik on 07.11.16.
 */
public class ConnectionTest {
    private OpenTransportClient client;
    private String city1;
    private String city2;
    private Date connectionDate;

    @Before
    public void initObjects() {
        client = new OpenTransportClient();

        city1 = "Basel SBB";
        city2 = "Zurich";

        connectionDate = new Date(2016 - 1900, 1, 1, 15, 0, 0);
    }

    @Test
    public void testSimpleConnection() {
        ConnectionResult result = client.getConnections(city1, city2);
        assertEquals("Locations not matching!", city1,
                result.getConnections().get(0).getFrom().getStation().getName());
    }

    @Test
    public void testDateConnection() {
        ConnectionParameter params = new ConnectionParameter(city1, city2);
        params.setDateTime(connectionDate);

        ConnectionResult result = client.getConnections(params);
        assertEquals("Timestamp not matching!",
                Long.valueOf(1454335620),
                result.getConnections().get(0).getFrom().getDepartureTimestamp());
    }
}
