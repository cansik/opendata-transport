import ch.fhnw.opentransport.api.OpenTransportClient;
import ch.fhnw.opentransport.api.model.ConnectionResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cansik on 07.11.16.
 */
public class ConnectionTest {
    private OpenTransportClient client;

    @Before
    public void initObjects() {
        client = new OpenTransportClient();
    }

    @Test
    public void testSimpleConnection() {
        String city1 = "Basel SBB";
        String city2 = "Zurich";

        ConnectionResult result = client.getConnections(city1, city2);
        assertEquals("Locations not matching!",
                "Basel SBB",
                result.getConnections().get(0).getFrom().getStation().getName());
    }
}
