/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.List;

public class bht
implements ajh_1 {
    public static final float[] a = new float[]{0.0f, 1.0f, 0.0f, 0.5f};
    public static final float[] b = new float[]{1.0f, 0.0f, 0.0f, 0.5f};
    public static final String d = "emotesWithTarget";
    public static final String e = "emotes";
    public static final String f = "listFilter";
    public static final String g = "smileys";
    public static final String[] h = new String[]{"emotesWithTarget", "emotes", "listFilter", "smileys"};
    private final TIntObjectHashMap<bhx> j = new TIntObjectHashMap();
    private final fwl k = new fwl();
    public static final bht i = new bht();
    private eLh l = new eLh();

    private bht() {
        for (xg_0 xg_02 : xg_0.values()) {
            int n = xg_02.a();
            this.j.put(n, (Object)new bhD(n, xg_02.b()));
        }
        this.b();
        this.k.a((T string) -> fis_1.a().a((ajf_1)this, e, d));
    }

    public void a() {
        this.k.b("");
        this.l = new eLh();
    }

    public void b() {
        bhh_1.a(end_0.j).ifPresent(emy_02 -> {
            this.l = (eLh)emy_02;
        });
        this.k.b("");
        this.l.a().forEach(hJ2 -> {
            int n = hJ2.c();
            bhu bhu2 = bhA.a.c(n);
            if (bhu2 != null) {
                bhu2.a();
            }
        });
    }

    public boolean a(int n) {
        if (this.l.c(n)) {
            return false;
        }
        bhu bhu2 = bhA.a.c(n);
        if (bhu2 == null || !this.l.a(n)) {
            return false;
        }
        bhu2.a();
        return true;
    }

    @Override
    public String[] d() {
        return h;
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            String string2 = this.k.c() != null ? (String)this.k.c() : "";
            List<bhu> list = bhA.a.c(string2);
            for (bhu bhu2 : list) {
                bhu2.a(this.l.c(bhu2.k()));
            }
            return list;
        }
        if (string.equals(e)) {
            String string3 = this.k.c() != null ? (String)this.k.c() : "";
            List<bhu> list = bhA.a.b(string3);
            for (bhu bhu3 : list) {
                bhu3.a(this.l.c(bhu3.k()));
            }
            return list;
        }
        if (string.equals(g)) {
            return this.j.values();
        }
        if (f.equals(string)) {
            return this.k;
        }
        return null;
    }

    public boolean a(int n, bhv bhv2) {
        bhx bhx2 = (bhx)this.j.get(n);
        if (bhx2 != null) {
            return this.d(n);
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bhu bhu2 = bhA.a.c(n);
        if (!bmr_12.a(enw_0.h)) {
            return false;
        }
        if (bhu2.i() != null && !bhu2.i().b(bmr_12, bmr_12.P_(), bhu2, bmr_12.Q_())) {
            aUh.a("emote.error.requirements", new Object[0]);
            return false;
        }
        if (bhu2.b()) {
            bhy.a.a(bhu2, bhv2);
            return true;
        }
        if (this.a(bhu2, bhv2)) {
            bhv2.a(bhu2, -1L);
            return true;
        }
        return false;
    }

    private boolean d(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        xg_0 xg_02 = xg_0.a(n);
        if (xg_02 == null) {
            return false;
        }
        dfv dfv2 = new dfv();
        dfv2.b(xg_02.c());
        add_2.b().a(dfv2);
        return true;
    }

    public boolean b(int n) {
        return this.l.c(n);
    }

    public boolean a(bhu bhu2, bhv bhv2) {
        int n = bhu2.k();
        if (bhv2.a() && !this.l.c(n)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && (!bpc_22.f() || bhu2.c() || bhu2.b())) {
            return false;
        }
        biI biI2 = bmr_12.bv();
        if (biI2.bb() != null) {
            return false;
        }
        if (biI2.bs()) {
            aUh.a("error.action.impossible.swimming", new Object[0]);
            return false;
        }
        return true;
    }

    public bhx c(int n) {
        return bhA.a.a(n);
    }
}

