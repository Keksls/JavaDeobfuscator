/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import java.util.BitSet;
import org.apache.log4j.Logger;

/*
 * Renamed from bgU
 */
final class bgu_2 {
    private static final Logger b = Logger.getLogger(bgu_2.class);
    public static final bgu_2 a = new bgu_2();
    private final THashMap<String, bgv_2> c = new THashMap();

    private bgu_2() {
        this.a();
    }

    private void a() {
        try {
            this.c.put((Object)ele_0.d.e(), (Object)new bgv_2(bhf_2.class));
            this.c.put((Object)"OTHER", (Object)new bgv_2(bhf_2.class));
            this.c.put((Object)ele_0.b.e(), (Object)new bgv_2(bhb_2.class));
            this.c.put((Object)ele_0.c.e(), (Object)new bgv_2(bgo_2.class));
            this.c.put((Object)ele_0.e.e(), (Object)new bgv_2(bgk_2.class));
            this.c.put((Object)ele_0.a.e(), (Object)new bgv_2(bha_2.class));
            this.c.put((Object)ele_0.h.e(), (Object)new bgv_2(bhg_2.class));
            this.c.put((Object)ele_0.f.e(), (Object)new bgv_2(bgn_2.class));
            this.c.put((Object)ele_0.i.e(), (Object)new bgv_2(bhj_2.class));
            this.c.put((Object)ele_0.j.e(), (Object)new bgv_2(bgq_2.class));
            this.c.put((Object)ele_0.o.e(), (Object)new bgv_2(bgl_2.class));
            this.c.put((Object)ele_0.g.e(), (Object)new bgv_2(bhd_2.class));
            this.c.put((Object)ele_0.k.e(), (Object)new bgv_2(bgr_2.class));
            this.c.put((Object)ele_0.l.e(), (Object)new bgv_2(bhc_2.class));
            this.c.put((Object)ele_0.m.e(), (Object)new bgv_2(bhk_2.class));
            this.c.put((Object)ele_0.n.e(), (Object)new bgv_2(bgx_2.class));
            this.c.put((Object)ele_0.p.e(), (Object)new bgv_2(bgp_2.class));
            this.c.put((Object)ele_0.q.e(), (Object)new bgv_2(bgz_2.class));
            this.c.put((Object)ele_0.r.e(), (Object)new bgv_2(bgj_2.class));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            b.error((Object)"", (Throwable)noSuchMethodException);
        }
    }

    ekk_0 a(aqw_0 aqw_02) {
        bgv_2 bgv_22 = (bgv_2)this.c.get((Object)aqw_02.m());
        if (bgv_22 == null) {
            b.error((Object)("Type d'effet inconnu : " + aqw_02.m()));
            return null;
        }
        try {
            ekk_0 ekk_02 = bgv_22.a(aqw_02);
            ekk_02.a(bgu_2.a(aqw_02.q()));
            ekk_02.g(aqw_02.j());
            ekk_02.a(aqw_02.t());
            return ekk_02;
        }
        catch (Exception exception) {
            b.error((Object)"", (Throwable)exception);
            return null;
        }
    }

    static aqd_1 b(aqw_0 aqw_02) {
        aqd_1 aqd_12 = null;
        try {
            aqd_12 = aqe_1.a(aqw_02.e(), aqw_02.n(), (short)0);
            if (aqd_12 == null) {
                throw new NullPointerException("AOE incorrecte");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            b.error((Object)"erreur au chargement des effets statiques : zone d'effet incorrecte");
        }
        return aqd_12;
    }

    static BitSet a(int[] nArray) {
        BitSet bitSet = new BitSet();
        if (nArray != null) {
            for (int n : nArray) {
                bitSet.set(n);
            }
        }
        return bitSet;
    }

    static String a(String string) {
        if (string == null) {
            return "";
        }
        if (string.endsWith("\n")) {
            return string.substring(0, string.length() - 1);
        }
        return string;
    }
}

