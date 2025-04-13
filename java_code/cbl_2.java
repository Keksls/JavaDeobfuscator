/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cbl
 */
public class cbl_2
implements fjc_0 {
    private static final Logger b = Logger.getLogger(cbl_2.class);
    public static final cbl_2 a = new cbl_2();

    private cbl_2() {
    }

    @Override
    public float a(fjb_0 fjb_02) {
        return fjb_02.c;
    }

    @Override
    public void a(fjb_0 fjb_02, float f2) {
    }

    @Override
    public long a(eyg_2 eyg_22, fjb_0 fjb_02, long l) {
        return Hw.b((float)l * this.a(fjb_02));
    }

    @Override
    public void a(fjb_0 fjb_02, int n) {
        b.info((Object)("[TAX] R\u00e9cup\u00e9ration de " + n + " kamas pour le context " + fjb_02));
    }

    @Override
    public boolean a(eyg_2 eyg_22) {
        if (!(eyg_22 instanceof bmr_1)) {
            return false;
        }
        long l = ((bmr_1)eyg_22).T_();
        if (cci_2.a.d(l)) {
            return true;
        }
        return bwy_2.h().j() == null && bwy_2.h().k() == null;
    }
}

