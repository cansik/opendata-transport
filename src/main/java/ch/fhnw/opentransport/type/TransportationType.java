package ch.fhnw.opentransport.type;

/**
 * Created by cansik on 06.11.16.
 */
public enum TransportationType {
    ICE_TGV_RJ("ice_tgv_rj"),
    EC_IC("ec_ic"),
    IR("ir"),
    RE_D("re_d"),
    SHIP("ship"),
    S_SN_R("s_sn_r"),
    BUS("bus"),
    CABLEWAY("cableway"),
    ARZ_EXT("arz_ext"),
    TRAMWAY_UNDERGROUND("tramway_underground");

    private final String text;

    /**
     * @param text
     */
    private TransportationType(final String text) {
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
