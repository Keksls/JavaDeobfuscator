/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cbm
 */
public class cbm_1 {
    public static final cbm_1 a = new cbm_1();
    private static final Logger b = Logger.getLogger(cbm_1.class);

    protected cbm_1() {
    }

    public boolean a(blx_1 blx_12) {
        int n = ((bvx_0)ans_0.D().h()).d(bWe.aJ);
        bvv_0 bvv_02 = bvv_0.a(n).orElse(bvv_0.a);
        switch (bvv_02) {
            case d: {
                return false;
            }
            case b: {
                long l = azu_0.j().n().u();
                return l == blx_12.U_();
            }
            case a: {
                return true;
            }
        }
        b.warn((Object)String.format("Following TitleDisplayStyle isn't managed : %s", bvv_02));
        return true;
    }
}

