/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bVv
implements afk_0<afe_0>,
aha_0<afe_0, cch_1> {
    protected static final Logger a = Logger.getLogger(bVv.class);
    public static final bVv b = new bVv();

    public void a() {
        ccm_1.g().b(this);
    }

    @Override
    public void a(afe_0 afe_02, cch_1 cch_12, cch_1 cch_13) {
        blx_1 blx_12;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.bz() == null && afe_02 instanceof biI && (blx_12 = ((biI)afe_02).bI()) instanceof bnh_1) {
            blx_12.z();
        }
    }

    public void a(afe_0 afe_02, int n, int n2, short s2) {
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }
}

