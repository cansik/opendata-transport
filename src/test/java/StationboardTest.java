import ch.opendata.transport.TransportClient;
import ch.opendata.transport.model.StationboardResult;
import ch.opendata.transport.parameter.StationboardParameter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cansik on 07.11.16.
 */
public class StationboardTest {
    private TransportClient client;
    private String station;
    private String id;

    @Before
    public void initObjects() {
        client = new TransportClient();

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

    @Test
    public void testEnhancedStationboard() {
        StationboardParameter param = new StationboardParameter();
        param.setStation(station);
        param.setLimit(0);

        StationboardResult result = client.getStationboard(param);

        assertEquals("Stationboards is not empty!",
                0,
                result.getStationboard().size());
    }
}
