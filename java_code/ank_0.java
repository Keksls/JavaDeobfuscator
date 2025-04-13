/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ank
 */
public class ank_0
implements anc_0 {
    private static final Logger a = Logger.getLogger(ank_0.class);
    private String b;

    public ank_0(arf_1 arf_12) {
        this.a(arf_12);
    }

    public ank_0(String string) {
        this.b = string;
    }

    @Override
    public void a(aty_1 aty_12) {
        Byte by = aty_12.bv();
        Integer n = aty_12.bw();
        if (by == null || n == null) {
            a.error((Object)("PlayMountSoundData call while AnimatedObject has no mount info " + aty_12));
            return;
        }
        akp_0 akp_02 = aki_0.h().g();
        akr_0 akr_02 = akp_02.a(by, n, this.b);
        if (akr_02 == null) {
            a.error((Object)("Unable to apply PlayMountSoundData for type " + by + " skin " + n + " and type " + this.b));
            return;
        }
        aki_0.h().a(akr_02.a(), akr_02.b(), akr_02.i(), 1, -1L, -1L, aty_12.az(), (alo_1)((Object)aty_12), akr_02.e());
    }

    @Override
    public int a() {
        return 7;
    }

    @Override
    public void a(arf_1 arf_12) {
        int n = arf_12.c();
        this.b = Cz.a(arf_12.a(n));
    }

    @Override
    public void a(gk_0 gk_02) {
        byte[] byArray = Cz.a(this.b);
        gk_02.a(byArray.length);
        gk_02.a(byArray);
    }

    public void a(String string) {
        this.b = string;
    }
}

