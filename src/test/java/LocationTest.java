import ch.fhnw.opentransport.OpenTransportClient;
import ch.fhnw.opentransport.model.LocationResult;
import ch.fhnw.opentransport.type.LocationType;
import ch.fhnw.opentransport.type.TransportationType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cansik on 06.11.16.
 */
public class LocationTest {
    private OpenTransportClient client;

    @Before
    public void initObjects() {
        client = new OpenTransportClient();
    }

    @Test
    public void testLocationByQuery() {
        String city = "Basel";

        LocationResult result = client.getLocations(city, LocationType.All);
        assertEquals("Locations not matching!", city, result.getStations().get(0).getName());
    }

    @Test
    public void testLocationByCoordinates() {
        String city = "Basel SBB";

        double x = 47.5476;
        double y = 7.5897;

        LocationResult result = client.getLocations(x, y, TransportationType.ICE_TGV_RJ);
        assertEquals("Locations not matching!", city, result.getStations().get(0).getName());
    }
}