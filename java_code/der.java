/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.HashSet;
import org.apache.log4j.Logger;

public class der {
    private static final Logger b = Logger.getLogger(der.class);
    private static final TLongObjectHashMap<fuq_0> c = new TLongObjectHashMap();
    private static final int d = 2000;

    private der() {
    }

    public static void a() {
        TLongObjectIterator tLongObjectIterator = c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fuq_0 fuq_02 = (fuq_0)tLongObjectIterator.value();
            if (fuq_02 == null || fuq_02.getElementMap() == null) continue;
            fuq_02.c();
        }
        c.clear();
    }

    public static void a(long l) {
        fuq_0 fuq_02 = (fuq_0)c.remove(l);
        if (fuq_02 != null) {
            fuq_02.c();
        }
    }

    public static boolean a(int n, blx_1 blx_12) {
        String string = xg_0.a(n).d();
        fuq_0 fuq_02 = der.a(blx_12, string);
        if (fuq_02 == null) {
            return false;
        }
        der.a(blx_12, fuq_02);
        return true;
    }

    private static fuq_0 a(blx_1 blx_12, String string) {
        long l = blx_12.a_();
        fuq_0 fuq_02 = (fuq_0)c.get(l);
        if (fuq_02 != null) {
            assert (l == ((afv)fuq_02.getTarget()).a()) : "Le mobile de " + blx_12.dp() + " ne correspond pas \u00e0 l'ancien";
            try {
                fuq_02.b();
                fuq_02.setAnimation(string);
            }
            catch (Exception exception) {
                fuq_02.c();
                c.remove(l);
                b.warn((Object)exception);
                return null;
            }
        }
        try {
            String string2 = aNK.a();
            fuq_02 = aNK.a(string2);
            fuq_02.a(string2, string, false);
            c.put(l, (Object)fuq_02);
        }
        catch (Exception exception) {
            b.warn((Object)exception);
            return null;
        }
        return fuq_02;
    }

    private static void a(blx_1 blx_12, fuq_0 fuq_02) {
        aby_0 aby_02 = blx_12.bs();
        assert (blx_12.Z_() instanceof bpb_1);
        der.a(blx_12, aby_02.an());
        fuq_02.setDuration(2000);
        fuq_02.setTarget(blx_12.bv());
        fuq_02.e();
        fuq_02.setYOffset((int)((float)blx_12.bv().ag() * 10.0f) + 10);
        fuq_02.setSmileyIsVisible(true);
        fuq_02.e();
        frO frO2 = fuq_02.getAnimatedElementViewer();
        frO2.setAnimatedElement(aby_02);
        frO2.getAnimatedElement().a(new des(blx_12));
    }

    public static boolean a(int n, long l, int n2, blx_1 blx_12) {
        String string;
        assert (blx_12 != null);
        epq_1 epq_12 = blx_12.Z_();
        try {
            int n3 = der.b(n2, blx_12);
            string = azs_0.a().q(xg_0.a(n, epq_12.s()));
            if (string == null) {
                string = der.a(n, n3);
            }
        }
        catch (Exception exception) {
            b.error((Object)"Exception during displayEmoteIconOnMonster", (Throwable)exception);
            return false;
        }
        if (string == null) {
            return false;
        }
        return der.a(l, epq_12, string);
    }

    public static boolean a(int n, long l, int n2) {
        if (n2 == 1) {
            b.error((Object)("character inconnu " + l));
            return false;
        }
        String string = der.a(n, n2);
        return der.a(l, null, string);
    }

    private static boolean a(long l, epq_1 epq_12, String string) {
        afv afv2 = afz_0.d().b(l);
        if (afv2 == null || !afv2.at()) {
            return false;
        }
        HashSet<za_0> hashSet = zd_0.a().a(afv2);
        byte by = epq_12 == null ? (byte)afv2.af() : epq_12.d();
        zo_0 zo_02 = new zo_0(string, 32, 32, (zt_0)new zs_0(), 2000);
        zo_02.a(afv2);
        zo_02.b((int)((float)by * 10.0f + (float)zo_02.c() + 10.0f));
        zo_02.g(Math.max(1, hashSet != null ? hashSet.size() * 2000 / 2 : 0));
        zd_0.a().a(zo_02);
        return true;
    }

    private static int b(int n, blx_1 blx_12) {
        if (n != -1) {
            return n;
        }
        epw_1 epw_12 = epx_1.b().a(blx_12.Z_().t());
        return blx_12.a(erl_2.z) ? 0 : epw_12.e();
    }

    public static String a(int n, int n2) {
        return azs_0.a().p(xg_0.a(n, n2));
    }

    public static void a(blx_1 blx_12, atd_2 atd_22) {
        biI biI2 = blx_12.bv();
        der.a(atd_22, biI2, atm_1.b.b());
        der.a(atd_22, biI2, atm_1.c.b());
        der.a(atd_22, biI2, atm_1.i.b());
        atd_22.y();
    }

    private static void a(atd_2 atd_22, biI biI2, int n) {
        float[] fArray = biI2.j(n);
        atd_22.a(n, fArray);
    }
}

