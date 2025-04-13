/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from bLF
 */
public class blf_1 {
    private static final Logger b = Logger.getLogger(blf_1.class);

    public static void a() {
        URL uRL;
        try {
            uRL = new URL(azs_0.z("mapDefinitionPath"));
        }
        catch (gm_0 gm_02) {
            return;
        }
        catch (MalformedURLException malformedURLException) {
            return;
        }
        ath_2 ath_22 = blf_1.a(uRL);
        if (ath_22 == null) {
            return;
        }
        ati_2 ati_22 = ath_22.a();
        aqx_2 aqx_22 = ati_22.f("id");
        int n = aqx_22.g();
        bLq bLq2 = new bLq(n, bae.h().a("map.root.text.description", new Object[0]));
        blg_1.a().a(blh_1.e, n, bLq2);
    }

    private static ath_2 a(URL uRL) {
        atg_2 atg_22 = new atg_2();
        ath_2 ath_22 = new ath_2();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
            atg_22.a(bufferedInputStream);
            atg_22.a(ath_22, new aqy_2[0]);
            atg_22.l();
            bufferedInputStream.close();
        }
        catch (Exception exception) {
            b.error((Object)("Probl\u00e8me lors de la lecture du fichier de map d'url : " + uRL));
            return null;
        }
        return ath_22;
    }

    public static void b() {
        blf_1.a(true);
    }

    public static void a(boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.T_();
        bLP bLP2 = blf_1.a(l, true);
        if (!bl) {
            blf_1.a(bLP2);
            return;
        }
        cct_1 cct_12 = (cct_1)((fjw_0)fjw_0.e()).c(l);
        if (!cct_12.u) {
            blf_1.a(bLP2);
            return;
        }
        bmf_0 bmf_02 = bmr_12.dI();
        if (bmf_02 == null) {
            blf_1.a(bLP2);
            return;
        }
        bLP bLP3 = blf_1.a(bmf_02.e(), l);
        if (bLP3 == null) {
            blf_1.a(bLP2);
            return;
        }
        blf_1.a(bLP3);
    }

    private static void a(bLP bLP2) {
        ble_1.E().a(bLP2);
        blj_1.D().a(bLP2);
    }

    public static bLP a(long l, boolean bl) {
        blb_1 blb_12 = (blb_1)blg_1.a().b(blh_1.c, l);
        if (blb_12 == null) {
            try {
                String string = azs_0.b("fullMapPath", l);
                try {
                    string = arl_1.c(string).toString();
                }
                catch (MalformedURLException malformedURLException) {
                    return null;
                }
                if (!cd_0.b(string)) {
                    return null;
                }
            }
            catch (gm_0 gm_02) {
                return null;
            }
            blb_12 = new blb_1(l, bl);
            blg_1.a().a(blh_1.c, l, blb_12);
        }
        if (bl && !blb_12.g()) {
            blb_12.h();
        }
        return blb_12;
    }

    public static bLP a(int n, long l) {
        bLP bLP2 = blg_1.a().b(blh_1.b, n);
        if (bLP2 != null) {
            return bLP2;
        }
        try {
            String string = String.format(azs_0.z("fullSubMapPath"), l, n / 100);
            try {
                string = arl_1.c(string).toString();
            }
            catch (MalformedURLException malformedURLException) {
                return null;
            }
            if (!cd_0.b(string)) {
                return null;
            }
        }
        catch (gm_0 gm_02) {
            return null;
        }
        bLP2 = new bLN(n, l);
        blg_1.a().a(blh_1.b, n, bLP2);
        return bLP2;
    }

    public static void a(blx_1 blx_12, blo_0 blo_02) {
        bmr_1 bmr_12;
        assert (blx_12 != null && blo_02 != null);
        float[] fArray = blx_12.gY() == 1 ? anr_0.F : (blx_12.bo() ? anr_0.C : ((bmr_12 = azu_0.j().k()).dE().d() && bmr_12.dE().a().e(blx_12.a_()) != null ? anr_0.E : anr_0.D));
        blf_1.a(blx_12, fArray, blo_02);
    }

    public static void b(blx_1 blx_12, blo_0 blo_02) {
        blf_1.b(blx_12, anr_0.G, blo_02);
    }

    public static void a(blx_1 blx_12, float[] fArray, blo_0 blo_02) {
        blf_1.a(blx_12, true, false, fArray, blo_02);
    }

    public static void b(blx_1 blx_12, float[] fArray, blo_0 blo_02) {
        blf_1.a(blx_12, false, true, fArray, blo_02);
    }

    private static void a(blx_1 blx_12, boolean bl, boolean bl2, float[] fArray, blo_0 blo_02) {
        assert (blx_12 != null && blo_02 != null && fArray != null);
        if (bl) {
            blf_1.b(blx_12.a_(), 0, blx_12.G(), blx_12.H(), blx_12.I(), blx_12.T_(), blx_12, blo_02.l(), blx_12.gd(), fArray, blo_02);
        }
        if (bl2) {
            blf_1.a(blx_12.a_(), 0, blx_12.G(), blx_12.H(), blx_12.I(), blx_12.T_(), blx_12, blo_02.l(), blx_12.gd(), fArray, blo_02);
        }
    }

    public static void a(biE biE2, float[] fArray, blo_0 blo_02) {
        blf_1.a(biE2, fArray, true, false, blo_02);
    }

    public static void b(biE biE2, float[] fArray, blo_0 blo_02) {
        blf_1.a(biE2, fArray, false, true, blo_02);
    }

    private static void a(biE biE2, float[] fArray, boolean bl, boolean bl2, blo_0 blo_02) {
        assert (biE2 != null && blo_02 != null && fArray != null);
        if (bl) {
            blf_1.b(biE2.a(), 0, biE2.J(), biE2.K(), biE2.L(), azu_0.j().k().T_(), biE2, blo_02.l(), null, fArray, blo_02);
        }
        if (bl2) {
            blf_1.a(biE2.a(), 0, biE2.J(), biE2.K(), biE2.L(), azu_0.j().k().T_(), biE2, blo_02.l(), null, fArray, blo_02);
        }
    }

    public static void a(long l, int n, float f2, float f3, float f4, long l2, Object object, fjh_1 fjh_12, String string, float[] fArray, blo_0 blo_02) {
        blo_02.a(l, n, f2, f3, f4, l2, string, object, fjh_12, fArray);
    }

    public static void b(long l, int n, float f2, float f3, float f4, long l2, Object object, fjh_1 fjh_12, String string, float[] fArray, blo_0 blo_02) {
        blf_1.a(l, n, f2, f3, f4, l2, object, fjh_12, null, string, fArray, blo_02);
    }

    public static void a(long l, int n, float f2, float f3, float f4, long l2, Object object, fjh_1 fjh_12, String string, String string2, float[] fArray, blo_0 blo_02) {
        blo_02.a(l, n, f2, f3, f4, l2, string2, object, fjh_12, string, fArray);
    }

    public static void a(int n, long l, blo_0 blo_02) {
        blo_02.a(n, l);
    }

    public static void b(int n, long l, blo_0 blo_02) {
        blo_02.b(n, l);
    }

    public static void c(blx_1 blx_12, blo_0 blo_02) {
        blf_1.a(0, blx_12.a_(), blo_02);
    }

    public static void d(blx_1 blx_12, blo_0 blo_02) {
        blf_1.b(0, blx_12.a_(), blo_02);
    }

    public static void a(biE biE2, blo_0 blo_02) {
        blf_1.a(0, biE2.a(), blo_02);
    }

    public static void b(biE biE2, blo_0 blo_02) {
        blf_1.b(0, biE2.a(), blo_02);
    }

    public static String a(long l) {
        Collection collection = fgT.a.b().valueCollection();
        Set set = collection.stream().filter(fgv_02 -> fgv_02.f() == l).map(fgv_02 -> (bmf_0)fgv_02).collect(Collectors.toSet());
        Optional<bmf_0> optional = set.stream().filter(bmf_02 -> bmf_02.c() > 0).min(Comparator.comparingInt(bmf_0::c));
        if (optional.isEmpty()) {
            return null;
        }
        Optional<bmf_0> optional2 = set.stream().filter(bmf_02 -> bmf_02.d() > 0).max(Comparator.comparingInt(bmf_0::d));
        if (optional2.isEmpty()) {
            return null;
        }
        return bae.h().a("recommended.level", optional.get().c(), optional2.get().d());
    }
}

