/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxo
 */
public class bxo_2
extends eof_2<blx_1>
implements ajh_1,
csd_1 {
    public static final String k = "currentFighter";
    public static final String l = "currentFighterPosition";
    public static final String m = "fighters";
    public static final String n = "secondTimelineFighters";
    public static final String o = "currentTableTurn";
    public static final String p = "availableBonuses";
    public static final String[] q = new String[]{"currentFighter", "currentFighterPosition", "fighters", "secondTimelineFighters", "currentTableTurn", "availableBonuses"};
    private ckf_2 u;
    private ckw_2 v;

    public bxo_2(@NotNull bvx_2 bvx_22, @NotNull eoh_1 eoh_12, @NotNull eoo_2 eoo_22, @NotNull vd_0 vd_02, @NotNull vg_0 vg_02) {
        super(bvx_22, eoh_12, eoo_22, vd_02, vg_02);
    }

    @Override
    public int k(long l) {
        bvx_2 bvx_22 = (bvx_2)this.aj_();
        if (bvx_22.e() == elp_0.d || bvx_22.e() == elp_0.b) {
            return this.a(this.S(), l);
        }
        return this.a(this.o(), l);
    }

    private int a(TLongArrayList tLongArrayList, long l) {
        int n = 0;
        long l2 = 0L;
        int n2 = tLongArrayList.size();
        for (int k = 0; k < n2; ++k) {
            if (l == tLongArrayList.get(k)) {
                return n;
            }
            if (tLongArrayList.get(k) == l2) {
                --n;
            }
            l2 = tLongArrayList.get(k);
            ++n;
        }
        return -1;
    }

    @Override
    public int r() {
        byte by = this.c.a();
        TLongArrayList tLongArrayList = this.c.i();
        if (by == -1 || by >= tLongArrayList.size()) {
            return -1;
        }
        return this.a(tLongArrayList, tLongArrayList.get((int)by)) + (this.j ? 1 : 0);
    }

    public blx_1 x(long l) {
        return (blx_1)this.s.i(l);
    }

    @Override
    public Object b(String string) {
        if (string.equals(k)) {
            return this.H();
        }
        if (string.equals(l)) {
            return this.U();
        }
        if (string.equals(m)) {
            return this.L();
        }
        if (string.equals(n)) {
            return this.M();
        }
        if (string.equals(o)) {
            return bae.h().a("fight.turn", this.u());
        }
        if (string.equals(p)) {
            long l = azu_0.j().k().a_();
            return this.y(l);
        }
        return null;
    }

    public bxn_2[] y(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.cP();
        blx_1 blx_12 = (blx_1)bvx_22.n(l);
        byte by = bvx_22.y(blx_12);
        List<efh_0> list = this.a().b(by);
        List<efh_0> list2 = this.a().a(l, by);
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (efh_0 efh_02 : list) {
            if (tIntObjectHashMap.containsKey(efh_02.i())) continue;
            tIntObjectHashMap.put(efh_02.i(), (Object)new bxn_2(efh_02));
        }
        for (efh_0 efh_02 : list2) {
            bxn_2 bxn_22 = (bxn_2)tIntObjectHashMap.get(efh_02.i());
            if (bxn_22 == null) continue;
            bxn_22.b();
        }
        bxn_2[] bxn_2Array = (bxn_2[])tIntObjectHashMap.values((Object[])new bxn_2[tIntObjectHashMap.size()]);
        int n = bxn_2Array.length;
        for (int k = 0; k < n; ++k) {
            if (k == n - 1) {
                bxn_2Array[k].a(48, 48);
                continue;
            }
            if (k == n - 2) {
                bxn_2Array[k].a(40, 40);
                continue;
            }
            bxn_2Array[k].a(32, 32);
        }
        return bxn_2Array;
    }

    private Object U() {
        int n = this.r();
        if (n == 0) {
            return n;
        }
        TLongArrayList tLongArrayList = this.o();
        if (tLongArrayList.get(n - 1) == tLongArrayList.get(n)) {
            return n - 1;
        }
        return n;
    }

    @Override
    public String[] d() {
        return q;
    }

    @Override
    public void a(ckf_2 ckf_22) {
        this.u = ckf_22;
        if (this.h) {
            this.u.setFightStarted();
        }
    }

    @Override
    public void a(ckw_2 ckw_22) {
        this.v = ckw_22;
    }

    public blx_1 H() {
        return this.p() ? this.x(this.q()) : null;
    }

    public boolean I() {
        TLongArrayList tLongArrayList = this.o();
        TLongArrayList tLongArrayList2 = this.S();
        if (tLongArrayList2.size() != tLongArrayList.size()) {
            return true;
        }
        int n = tLongArrayList2.size();
        for (int k = 0; k < n; ++k) {
            if (tLongArrayList.getQuick(k) == tLongArrayList2.getQuick(k)) continue;
            return true;
        }
        return false;
    }

    @Override
    public int J() {
        return this.a().a();
    }

    public int z(long l) {
        return this.a().a(l);
    }

    @Override
    public void K() {
        if (this.v != null) {
            this.v.b();
        }
    }

    @Override
    public List<csa_1> L() {
        return this.a(this.o());
    }

    @Override
    public List<csa_1> M() {
        return this.a(this.S());
    }

    private List<csa_1> a(TLongArrayList tLongArrayList) {
        ArrayList<csa_1> arrayList = new ArrayList<csa_1>();
        for (int k = 0; k < tLongArrayList.size(); ++k) {
            long l = tLongArrayList.get(k);
            blx_1 blx_12 = this.x(l);
            if (blx_12 == null) continue;
            bwm_2 bwm_22 = blx_12.ao();
            if (bwm_22 == null && !blx_12.t() && blx_12.o()) {
                blx_12.a(new bwm_2(blx_12, this));
            } else if (bwm_22 != null && bwm_22.c() != this) {
                a.warn((Object)("(" + blx_12.dp() + " - " + l + ") a un lien vers une autre timeline que la sienne"));
                bwm_22.a(this);
            }
            if (arrayList.contains(blx_12)) continue;
            arrayList.add(blx_12);
        }
        return arrayList;
    }

    public void N() {
        fis_1.a().a((ajf_1)this, m);
    }

    @Override
    protected void E() {
        if (this.V()) {
            if (this.u != null) {
                this.u.a();
            }
            if (this.v != null) {
                this.v.a();
            }
            this.O();
            fis_1.a().a((ajf_1)this, k, l, m);
        }
    }

    @Override
    public void O() {
        blx_1 blx_12 = this.P();
        if (blx_12 == null || !blx_12.f(eoz_1.bh)) {
            fis_1.a().a("selectedFighter", blx_12);
        }
    }

    public void a(blx_1 blx_12) {
        if (blx_12 == null || !blx_12.f(eoz_1.bh)) {
            fis_1.a().a("selectedFighter", blx_12);
        }
    }

    public blx_1 P() {
        TLongArrayList tLongArrayList;
        blx_1 blx_12 = this.H();
        if (blx_12 == null && (tLongArrayList = this.S()).size() > 0) {
            blx_12 = this.x(tLongArrayList.get(0));
        }
        return blx_12;
    }

    private static void b(blx_1 blx_12, boolean bl) {
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 != null && bvx_22.z()) {
            return;
        }
        dfp dfp2 = new dfp();
        dfp2.a_(18668);
        dfp2.a(bl);
        dfp2.a(blx_12);
        add_2.b().a(dfp2);
    }

    void b(blx_1 blx_12) {
        if (blx_12.ao() == null) {
            blx_12.a(new bwm_2(blx_12, this));
        } else {
            a.warn((Object)("Le fighter ajout\u00e9 n'a pas \u00e9t\u00e9 bien nettoy\u00e9 \u00e0 la fin du combat pr\u00e9c\u00e9dent ! (" + blx_12.dp() + " - " + blx_12.a_() + ")"));
            if (blx_12.ao().c() != this) {
                blx_12.ao().a(this);
            }
        }
        if (this.u != null) {
            this.u.c(blx_12);
            bxo_2.b(blx_12, true);
        }
        if (this.v != null) {
            this.v.b(blx_12);
        }
        fis_1.a().a((ajf_1)this, m, n);
        fis_1.a().a("selectedFighter", blx_12);
    }

    void c(blx_1 blx_12) {
        if (this.u != null) {
            this.u.d(blx_12);
        }
        if (this.v != null) {
            this.v.c(blx_12);
        }
        biM.b(blx_12.bv());
        fis_1.a().a((ajf_1)this, m, n);
        bxo_2.b(blx_12, false);
        ddy_0.a().c(blx_12);
        fit_1 fit_12 = fis_1.a().f("fight.describedFighter");
        if (fit_12 != null && fit_12.f() == blx_12) {
            cJU.unhighlightFighterInTimeline(null, blx_12);
        }
        blx_12.a((bwm_2)null);
    }

    @Override
    protected void Q() {
        List<csa_1> list = this.L();
        for (int k = list.size() - 1; k >= 0; --k) {
            csb_1 csb_12 = list.get(k).cn();
            if (csb_12 == null) continue;
            csb_12.i();
        }
    }

    @Override
    protected void D() {
        super.D();
        if (this.V()) {
            if (this.u != null) {
                this.u.c();
            }
            if (this.v != null) {
                this.v.c();
            }
            fis_1.a().a((ajf_1)this, o, n);
        }
    }

    @Override
    protected void s(long l) {
        super.s(l);
        if (this.V()) {
            bwm_2 bwm_22;
            blx_1 blx_12 = this.x(l);
            if (blx_12 == null) {
                return;
            }
            if (this.u != null) {
                this.u.e(blx_12);
            }
            if (this.v != null) {
                this.v.d(blx_12);
            }
            if ((bwm_22 = blx_12.ao()) != null) {
                bwm_22.g();
            }
            if (this.g.containsKey(l)) {
                long l2 = (Long)this.g.get(l);
                aUh.c("fight.remaining.time.reported", l2 / 1000L);
            }
        }
    }

    @Override
    protected void t(long l) {
        if (this.V()) {
            blx_1 blx_12 = this.x(l);
            if (this.u != null) {
                this.u.f(blx_12);
            }
            if (this.v != null) {
                this.v.e(blx_12);
            }
            blx_12.ao().f();
        }
        den.a.d();
    }

    @Override
    public void b() {
        super.b();
        acb_0 acb_02 = ajI.e().d();
        acb_02.b().c(false);
    }

    private boolean V() {
        bvx_2 bvx_22;
        bmr_1 bmr_12;
        if (this.aj_() != null && (bmr_12 = azu_0.j().k()) != null && (bvx_22 = bmr_12.cP()) != null) {
            return bvx_22.equals(this.aj_());
        }
        return false;
    }

    @Override
    public void t() {
        super.t();
        if (this.V()) {
            fis_1.a().a((ajf_1)this, n);
        }
    }

    public void b(int n) {
        this.a().a(n);
    }

    public void a(blx_1 blx_12, boolean bl) {
        bwm_2 bwm_22 = blx_12.ao();
        if (bwm_22 != null) {
            bwm_22.a(bl);
        }
    }

    @Nullable
    public blx_1 A(long l) {
        int n;
        TLongArrayList tLongArrayList = this.c.i();
        for (n = this.c.a() + 1; n < tLongArrayList.size(); ++n) {
            boolean bl;
            long l2 = tLongArrayList.get(n);
            blx_1 blx_12 = this.x(l2);
            long l3 = blx_12.B_();
            blx_1 blx_13 = this.x(l3);
            boolean bl2 = blx_12.U_() == l || blx_13 != null && blx_13.U_() == l;
            boolean bl3 = bl = blx_13 != null && blx_13.U_() == l;
            if (!bl2 && !bl || blx_12.gk()) continue;
            return blx_12;
        }
        TLongArrayList tLongArrayList2 = this.c.j();
        for (n = 0; n < tLongArrayList2.size(); ++n) {
            long l4 = tLongArrayList.get(n);
            blx_1 blx_14 = this.x(l4);
            if (blx_14.U_() != l || blx_14.gk()) continue;
            return blx_14;
        }
        return null;
    }

    @Override
    public /* synthetic */ csa_1 R() {
        return this.P();
    }
}

