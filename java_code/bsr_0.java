/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bsR
 */
public class bsr_0
implements ajh_1 {
    private static final Logger j = Logger.getLogger(bsr_0.class);
    public static final String a = "isExtended";
    public static final String b = "hasAPrimaryGem";
    public static final String d = "primaryGem";
    public static final String e = "primaryGemIconUrl";
    public static final String f = "primaryGemIsLocked";
    public static final String g = "hasASecondaryGem";
    public static final String h = "secondaryGemIconUrl";
    public static final String i = "secondaryGem";
    private final ffi k;

    public bsr_0(ffi ffi2) {
        this.k = ffi2;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            exk_2 exk_22 = this.k.a(true);
            if (exk_22 == null) {
                return false;
            }
            exk_2 exk_23 = this.k.a(false);
            if (exk_23 == null) {
                return false;
            }
            return exk_22.aT_() == exk_23.aT_();
        }
        if (string.equals(b)) {
            return this.k.a(true) != null;
        }
        if (string.equals(g)) {
            return this.k.a(false) != null;
        }
        if (string.equals(e)) {
            exk_2 exk_24 = this.k.a(true);
            if (exk_24 == null) {
                return null;
            }
            int n = this.a(exk_24);
            if (n == -1) {
                return null;
            }
            try {
                return String.format(azs_0.a().a("dimensionalBagPrimaryGemPath"), n);
            }
            catch (gm_0 gm_02) {
                j.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 dimensionalBagPrimaryGemPath");
                return null;
            }
        }
        if (string.equals(h)) {
            exk_2 exk_25 = this.k.a(false);
            if (exk_25 == null) {
                return null;
            }
            int n = this.a(exk_25);
            if (n == -1) {
                return null;
            }
            try {
                return String.format(azs_0.a().a("dimensionalBagSecondaryGemPath"), n);
            }
            catch (gm_0 gm_03) {
                j.warn((Object)"Impossible de trouver la propri\u00e9t\u00e9 dimensionalBagSecondaryGemPath");
                return null;
            }
        }
        if (string.equals(d)) {
            return new bss_1(this.k.a(true), this.k.b());
        }
        if (string.equals(i)) {
            return new bss_1(this.k.a(false), this.k.b());
        }
        if (string.equals(f)) {
            return this.k.i();
        }
        return null;
    }

    private int a(exk_2 exk_22) {
        int n = exk_22.aT_();
        ffk ffk2 = ffk.a(n);
        if (ffk2 == null) {
            return -1;
        }
        return ffk2.b();
    }

    public void a() {
        fis_1.a().a((ajf_1)this, a, b, e, g, h, d, i);
    }
}

