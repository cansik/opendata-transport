import ch.fhnw.opentransport.OpenTransportClient;
import ch.fhnw.opentransport.model.StationboardResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cansik on 07.11.16.
 */
public class StationboardTest {
    private OpenTransportClient client;
    private String station;
    private String id;

    @Before
    public void initObjects() {
        client = new OpenTransportClient();

        station = "Aarau";
        id = "008502113";
    }

    @Test
    public void testSimpleStationboard() {
        StationboardResult result1 = client.getStationboardByStation(station);
        StationboardResult result2 = client.getStationboardById(id);

        assertEquals("Stationboards not the same!",
                result1.getStationboard().size(),
                result2.getStationboard().size());
    }
}
