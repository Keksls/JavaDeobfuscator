/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cxL
 */
public class cxl_2
implements fhj {
    private static final Logger b = Logger.getLogger(cxl_2.class);
    public static final cxl_2 a = new cxl_2();

    @Override
    public void a(fhe_0 fhe_02, boolean bl, int n) {
        cxl_2.a(fhe_02, bl);
    }

    private static void a(fhe_0 fhe_02, boolean bl) {
        Object object = fis_1.a().e("battlegroundView");
        if (object == null) {
            b.error((Object)("Received a score set but no battleground is present on properties :" + fhe_02));
            return;
        }
        bkn_2 bkn_22 = (bkn_2)object;
        bkj_2 bkj_22 = bl ? bkn_22.j() : bkn_22.i();
        fis_1.a().a((ajf_1)bkj_22, "score");
    }
}

