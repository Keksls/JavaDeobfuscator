/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bsP
 */
public class bsp_1
implements ffr {
    protected static final Logger a = Logger.getLogger(bsp_1.class);
    public static final bsp_1 b = new bsp_1();

    @Override
    public ffq a(feW feW2, vb_1 vb_12) {
        bFZ bFZ2 = (bFZ)bfv_0.b().d(vb_12.a);
        if (bFZ2 != null && bFZ2 instanceof bgf_1) {
            bgf_1 bgf_12 = (bgf_1)((Object)bFZ2);
            bgf_12.a(feW2);
            bgf_12.b(vb_12);
            return bgf_12;
        }
        a.error((Object)("Impossible de cr\u00e9er un RoomContent de templateId=" + vb_12.a));
        return null;
    }
}

