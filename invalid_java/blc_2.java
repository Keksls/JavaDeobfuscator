/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from blC
 */
public class blc_2
implements bly_2 {
    private final TIntObjectHashMap<blt_2> a = new TIntObjectHashMap();
    private final TIntObjectHashMap<bls_2> b = new TIntObjectHashMap();
    private static final Logger c = Logger.getLogger(blc_2.class);
    private static final bs_0 d = new bs_0();
    private static final blc_2 e = new blc_2();

    public bls_2 a(int n) {
        return this.a(n, wt_0.b());
    }

    private bls_2 b(int n, wu_0 wu_02) {
        blt_2 blt_22 = this.c(n);
        if (blt_22 == null) {
            c.error((Object)("Le challenge " + n + " n'existe pas, impossible de le lancer."));
            return null;
        }
        bls_2 bls_22 = bls_2.a(blt_22);
        this.b.put(n, (Object)bls_22);
        bls_22.b(wu_02);
        bls_22.a((short)-1);
        return bls_22;
    }

    public bls_2 a(int n, wu_0 wu_02) {
        return this.b(n, wu_02);
    }

    private blc_2() {
    }

    public static blc_2 a() {
        return e;
    }

    public bls_2 b(int n) {
        return (bls_2)this.b.get(n);
    }

    public void a(int n, blt_2 blt_22) {
        this.a.put(n, (Object)blt_22);
    }

    public blt_2 c(int n) {
        blt_2 blt_22 = (blt_2)this.a.get(n);
        if (blt_22 == null) {
            ars_1 ars_12 = asa_1.i().a(n, d);
            if (ars_12 != null) {
                this.a((bs_0)ars_12);
            }
            blt_22 = (blt_2)this.a.get(n);
        }
        return blt_22;
    }

    public bla_2 d(int n) {
        blt_2 blt_22 = this.c(n);
        bls_2 bls_22 = this.b(n);
        if (bls_22 == null) {
            return null;
        }
        ArrayList<bla_2> arrayList = blt_22.r();
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            bla_2 bla_22 = arrayList.get(k);
            if (bls_22.a(bla_22) != 1) continue;
            return bla_22;
        }
        return null;
    }

    public bla_2 e(int n) {
        blt_2 blt_22 = this.c(n);
        bls_2 bls_22 = this.b(n);
        if (bls_22 == null) {
            return null;
        }
        ArrayList<bla_2> arrayList = blt_22.r();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            bla_2 bla_22 = arrayList.get(k);
            if (bls_22.a(bla_22) != 2) continue;
            return bla_22;
        }
        return null;
    }

    public boolean f(int n) {
        bls_2 bls_22 = (bls_2)this.b.remove(n);
        if (bls_22 != null) {
            bls_22.a((aff_1)null);
            blj_2.a.b(n);
            this.a(bls_22);
            return true;
        }
        return false;
    }

    public void b() {
        blo_1.e().f();
        blo_1.e().j();
        this.b.clear();
    }

    @Override
    public void a(TIntArrayList tIntArrayList, int n) {
        bls_2 bls_22 = this.b(n);
        if (bls_22 == null && (bls_22 = this.a(n)) == null) {
            c.error((Object)("eRreur lors du chargemetn du challenge " + n));
            return;
        }
        bls_22.a(tIntArrayList);
        this.a(bls_22);
    }

    @Override
    public boolean a(byte by, long l, int n) {
        bls_2 bls_22 = this.b(n);
        if (bls_22 == null && (bls_22 = this.a(n)) == null) {
            c.error((Object)("eRreur lors du chargemetn du challenge " + n));
            return false;
        }
        boolean bl = bls_22.a(by, l);
        this.a(bls_22);
        return bl;
    }

    @Override
    public void a(bls_2 bls_22) {
        bll_2 bll_22 = blj_2.a.a(bls_22.c());
        if (bll_22 != null) {
            bll_22.b();
        }
    }

    @Override
    public void b(bls_2 bls_22) {
        bll_2 bll_22 = blj_2.a.a(bls_22.c());
        if (bll_22 != null) {
            bll_22.b();
        }
    }

    public void a(int n, int n2) {
        bls_2 bls_22 = this.b(n);
        if (bls_22 != null && !bls_22.i()) {
            bls_22.a(n2);
        } else {
            c.error((Object)"On essaie de terminer un but sur un challenge pas charg\u00e9 dans le client");
        }
        this.a(bls_22);
    }

    public void a(int n, TIntArrayList tIntArrayList) {
        bls_2 bls_22 = (bls_2)this.b.get(n);
        bls_22.b(tIntArrayList);
        bls_22.a((aff_1)null);
        bls_22.e(true);
        if (!bls_22.i()) {
            bls_22.c(true);
        }
        fis_1.a().a("challengeDetailsVisible", false);
        this.a(bls_22);
    }

    public void g(int n) {
        bls_2 bls_22 = this.b(n);
        if (bls_22 == null) {
            bls_22 = this.a(n);
        }
        if (bls_22 == null) {
            return;
        }
        bls_22.a(true);
        this.a(bls_22);
    }

    public boolean a(yz_1 yz_12) {
        if (yz_12.a != null) {
            c.error((Object)"Le client ne devrait pas recevoir les infos compl\u00e8tes de scenarii.");
            return false;
        }
        if (yz_12.b == null) {
            c.error((Object)"Pas d'infos de challenges \u00e0 d\u00e9s\u00e9rialiser");
            return false;
        }
        boolean bl = true;
        for (yb_1 yb_12 : yz_12.b.a) {
            try {
                tp_1 tp_12 = yb_12.a;
                int n = tp_12.a;
                wt_0 wt_02 = tp_12.f != null ? wt_0.b(tp_12.f.a) : wt_0.b();
                bls_2 bls_22 = this.b(n, wt_02);
                TIntArrayList tIntArrayList = new TIntArrayList(tp_12.b.size());
                for (tq_2 tq_22 : tp_12.b) {
                    tIntArrayList.add(tq_22.a);
                }
                bls_22.a(tIntArrayList);
                for (tr_1 tr_12 : tp_12.c) {
                    bls_22.a(tr_12.a);
                }
                for (ts_1 ts_12 : tp_12.d) {
                    bls_22.a(ts_12.a, ts_12.b);
                }
            }
            catch (Exception exception) {
                c.error((Object)("Exception lors de la d\u00e9s\u00e9rialisation du sc\u00e9narion id=" + yb_12.a.a), (Throwable)exception);
                bl = false;
            }
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public void a(bs_0 bs_02) {
        aff_1 aff_12;
        int n;
        if (!bs_02.q()) {
            return;
        }
        int n2 = bs_02.i();
        byte by = bs_02.k();
        byte by2 = bs_02.l();
        boolean bl = bs_02.r();
        short s2 = bs_02.r() ? (short)0 : bs_02.g();
        wu_0 wu_02 = bs_02.h();
        boolean bl2 = bs_02.p();
        short s3 = bs_02.s();
        short s4 = bs_02.t();
        String string = bs_02.n();
        String string2 = bs_02.o();
        String string3 = bs_02.u();
        blt_2 blt_22 = new blt_2(n2, by, by2, s2, bl2, wu_02, s3, s4, string, string2, bl, string3);
        String[] stringArray = bs_02.m();
        for (int k = 0; k < stringArray.length; ++k) {
            void object;
            String string4 = stringArray[k];
            if (string4.startsWith("'")) {
                String string5 = string4.substring(1, string4.length() - 1);
            }
            blt_22.a((byte)k, (String)object);
        }
        for (bt_0 bt_02 : bs_02.d()) {
            Object object;
            if (!bt_02.e()) continue;
            n = bt_02.a();
            String string6 = bt_02.d();
            aff_12 = null;
            if (!string6.equalsIgnoreCase("null")) {
                object = null;
                try {
                    object = eyS.b(string6);
                }
                catch (Exception exception) {
                    c.error((Object)("Erreur lors de la compilation des crit\u00e8res d'un sc\u00e9nario (sc\u00e9nario " + n2 + " actionGroupId : " + n + ")"), (Throwable)exception);
                }
                if (object != null) {
                    aff_12 = apb_2.a(((aoq_1)object).a(null, null, null, null));
                }
            }
            object = new bla_2(n, n2, aff_12, bt_02.c(), bt_02.b(), bt_02.f());
            blt_22.a((bla_2)object);
        }
        for (bu_0 bu_02 : bs_02.j()) {
            n = bu_02.c();
            int n3 = bu_02.b();
            aff_12 = null;
            boolean bl3 = bu_02.e();
            int n4 = bu_02.f();
            short s5 = bu_02.g();
            int n5 = bu_02.h();
            int n6 = bu_02.i();
            byte by3 = bu_02.d();
            if (bl3) {
                blt_22.a(n, n3, n4, s5, n5, n6, (String)((Object)aff_12), by3);
                continue;
            }
            blt_22.b(n, n3, n4, s5, n5, n6, (String)((Object)aff_12), by3);
        }
        this.a(n2, blt_22);
    }
}

