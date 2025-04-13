/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from cXq
 */
public class cxq_0
implements Uo,
ahr_1,
bSN,
eBs,
eBu,
eQg {
    public static final cxq_0 a = new cxq_0();
    protected static final Logger b = Logger.getLogger(cxq_0.class);
    private static final String c = "heroesPartyManagementInnerContainer";
    private static final String d = "companionsManagementInnerContainer";
    private static final String e = "companionsManagementDialog";
    private bqZ f;
    private final TIntObjectHashMap<bqU> g = new TIntObjectHashMap();
    private TLongObjectHashMap<bmk_1> h;
    private ans_1 i;

    private cxq_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        int n = adt_12.a();
        if (n == 16306) {
            return false;
        }
        if (n == 16162) {
            cYF.a((dgj_0)adt_12, -1L, 150, azu_0.j().k());
            return false;
        }
        if (n == 12707) {
            this.i();
            return false;
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        if (!euu_2.b() && !euu_2.b()) {
            return;
        }
        this.i = string -> {
            if (string.equals(e)) {
                azu_0.j().b(a);
            }
        };
        this.f = new bqZ();
        bWe bWe2 = bWe.an;
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        String string2 = bvx_02.f(bWe2);
        this.f.a(string2);
        boolean bl2 = euu_2.a();
        int n = !bl2 || bvx_02.a(bWe.aq) ? 0 : 1;
        fis_1.a().a("companionsListSavedSearch", this.f);
        if (bl2) {
            bvx_02.a((agp_0)bWe.aq, false);
        }
        eBo.a.b(this);
        this.g();
        this.l();
        fpm_0.b().a(this.i);
        fpm_0.b().a(e, cfi_0.a(e), 32768L, (short)10000);
        fyy_0 fyy_02 = fpm_0.b().h().d(e);
        fvE fvE2 = (fvE)fyy_02.a(c);
        fvE2.addChildrenAddedListener(this::f);
        fvE fvE3 = (fvE)fyy_02.a(d);
        fvE3.addChildrenAddedListener(this::i);
        fis_1.a().a("overHero", (Object)null);
        fis_1.a().a("heroesDisplayer", brd_0.k);
        fis_1.a().a("companionManagementPage", 0);
        fis_1.a().a("mainCharacterSheet", (Object)false, e);
        fis_1.a().a("companionCurrentPageIndex", n);
        byn_1 byn_12 = azu_0.j().k().dE();
        if (byn_12.d()) {
            byn_12.a().a(this);
        }
        fpm_0.b().a("wakfu.companionsManagement", cGm.class);
        fpm_0.b().a("wakfu.companionsEmbedded", cGj.class);
        if (!fpm_0.b().d("wakfu.exchangeMachine")) {
            fpm_0.b().a("wakfu.exchangeMachine", cGU.class);
        }
        brd_0.k.k();
    }

    public void f() {
        this.h = new TLongObjectHashMap();
        ArrayList arrayList = new ArrayList();
        euw_2.a.a(azu_0.j().n().u(), epq_22 -> {
            blx_1 blx_12 = (blx_1)epq_22;
            bmk_1 bmk_12 = new bmk_1(blx_12, null);
            if (euv_2.a.a(blx_12)) {
                return true;
            }
            this.h.put(bmk_12.l().a_(), (Object)bmk_12);
            arrayList.add(bmk_12);
            return true;
        });
        this.g.forEachValue(bqU2 -> {
            if (!bqU2.r() && !bqU2.p()) {
                return true;
            }
            this.h.put((long)(-bqU2.l().gO()), bqU2);
            arrayList.add(bqU2);
            return true;
        });
        arrayList.sort((bmk_12, bmk_13) -> {
            if (!bmk_12.k() && !bmk_13.k()) {
                return Short.compare(bmk_12.o(), bmk_13.o());
            }
            if (!bmk_12.k() && bmk_13.k()) {
                return -1;
            }
            if (bmk_12.k() && !bmk_13.k()) {
                return 1;
            }
            bqU bqU2 = (bqU)bmk_12;
            bqU bqU3 = (bqU)bmk_13;
            String string = bqU2.x();
            String string2 = bqU3.x();
            if (string == null || string2 == null) {
                return 0;
            }
            return string.compareTo(string2);
        });
        fis_1.a().a("heroesList", arrayList);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && bmr_12.dE().d()) {
            bmr_12.dE().a().b(this);
        }
        this.k();
        eBo.a.a(this);
        bWe bWe2 = bWe.an;
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, this.f.e());
        fpm_0.b().b(this.i);
        fpm_0.b().o(e);
        fpm_0.b().o("companyRewardsDialog");
        fpm_0.b().e("wakfu.companionsManagement");
        if (!(azu_0.j().c(cYF.a()) || azu_0.j().c(dct.a()) || fpm_0.b().q("ladderRewardsDialog"))) {
            fpm_0.b().e("wakfu.exchangeMachine");
        }
        fis_1.a().a("companionsList");
    }

    public void a(TLongObjectProcedure<bmk_1> tLongObjectProcedure) {
        this.h.forEachEntry(tLongObjectProcedure);
    }

    public bmk_1 b(long l) {
        return (bmk_1)this.h.get(l);
    }

    private void k() {
        long l = azu_0.j().n().u();
        for (eBt eBt2 : eBo.a.a(l)) {
            eBt2.a(this);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void g() {
        this.k();
        for (short s2 : brP.a.b()) {
            int[] nArray;
            bpb_1 bpb_12 = bpc_1.a().a(s2);
            if (bpb_12 == null || !enp_2.a.d(ens_2.al) && Arrays.stream(nArray = bpb_12.r()).noneMatch(n -> n == erl_2.ar.b())) continue;
            this.a(s2);
        }
    }

    public bqZ h() {
        return this.f;
    }

    public void i() {
        Object object;
        Object object2;
        this.l();
        bqU bqU4 = (bqU)fis_1.a().d("characterSheet", e);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        long l = azu_0.j().n().u();
        byte by = 0;
        Object object3 = null;
        TIntObjectIterator tIntObjectIterator = this.g.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            object2 = (bqU)tIntObjectIterator.value();
            short s2 = ((bqU)object2).l().gO();
            object = eBo.a.a(l, s2);
            if (object == null || !((eBt)object).i()) {
                if (this.f.a() == bra_0.b) {
                    continue;
                }
            } else {
                by = (byte)(by + 1);
                if (this.f.a() == bra_0.c) continue;
            }
            arrayList.add(object2);
            if (bqU4 == null || bqU4.l().gO() != s2) continue;
            object3 = object2;
        }
        if (this.f.b()) {
            arrayList.sort((bqU2, bqU3) -> {
                String string = bqU2.x();
                String string2 = bqU3.x();
                if (string == null || string2 == null) {
                    return 0;
                }
                return string.compareTo(string2);
            });
        }
        if (this.f.c()) {
            arrayList.sort((bqU2, bqU3) -> bqU3.t() - bqU2.t());
        }
        int n = -1;
        for (bqU bqU5 : arrayList) {
            if (!bqU5.r()) continue;
            n = arrayList.indexOf(bqU5);
            break;
        }
        if (n != -1) {
            object2 = (bqU)arrayList.remove(n);
            arrayList.add(0, object2);
        }
        fis_1.a().a("companionsList", arrayList);
        if (!arrayList.isEmpty()) {
            fis_1.a().a("characterSheet", object3 == null ? (Object)arrayList.get(0) : object3, e);
        }
        object2 = new ani_2();
        ((ani_2)object2).a().a(new azf_2(0.01f, 0.51f, 0.81f, 1.0f)).a(by).b();
        ani_2 ani_22 = new ani_2();
        ani_22.a().d(this.g.size()).b();
        object = bae.h().a("companionsOwnedCount", ((ani_2)object2).r(), ani_22.r());
        fis_1.a().a("companionsOwnedCount", object);
    }

    @Override
    public void a() {
        this.l();
    }

    private void l() {
        this.a(this.g);
    }

    private void a(TIntObjectHashMap<bqU> tIntObjectHashMap) {
        bru_2.a(new cXr(this, tIntObjectHashMap), 450, 1, 50);
    }

    @Override
    public void a(eBt eBt2, long l) {
        fyy_0 fyy_02 = fpm_0.b().h().d(e);
        fis_1.a().a("characterSheet", "xpRatio", fyy_02);
        fis_1.a().a("characterSheet", "currentLevelPercentage", fyy_02);
        fis_1.a().a("characterSheet", "currentLevelPercentageInText", fyy_02);
    }

    @Override
    public void c(eBt eBt2) {
        fyy_0 fyy_02 = fpm_0.b().h().d(e);
        bqU bqU2 = (bqU)fis_1.a().d("characterSheet", fyy_02);
        brn brn2 = bqU2.n();
        brn2.a(eBt2.e());
        fis_1.a().a((ajf_1)brn2, "name");
        this.f();
    }

    @Override
    public void d(eBt eBt2) {
    }

    @Override
    public void e(eBt eBt2) {
    }

    @Override
    public void f(eBt eBt2) {
    }

    @Override
    public void g(eBt eBt2) {
        fyy_0 fyy_02 = fpm_0.b().h().d(e);
        bqU bqU2 = (bqU)fis_1.a().d("characterSheet", fyy_02);
        fis_1.a().a((ajf_1)bqU2, "isOwned");
    }

    public int j() {
        fyy_0 fyy_02 = fpm_0.b().h().d(e);
        bqU bqU2 = (bqU)fis_1.a().d("characterSheet", e);
        if (bqU2 == null) {
            return 0;
        }
        fsQ fsQ2 = (fsQ)fyy_02.a("companionsList");
        return fsQ2.getItemIndex(bqU2);
    }

    @Override
    public void a(eQf eQf2, epl_0 epl_02) {
        if (!epl_02.v() || epl_02.o() != azu_0.j().n().u()) {
            return;
        }
        this.i();
        cxo_0.m();
    }

    @Override
    public void a(eQf eQf2, epl_0 epl_02, boolean bl) {
        if (!epl_02.v() && !epl_02.w() || epl_02.o() != azu_0.j().n().u()) {
            return;
        }
        if (epl_02.w()) {
            euw_2.a.b(epl_02.o(), epl_02.f());
        } else {
            this.i();
            cxo_0.a(epl_02.c());
            cxo_0.m();
        }
    }

    @Override
    public void a(eQf eQf2, long l, long l2) {
    }

    @Override
    public void a(eBt eBt2) {
    }

    @Override
    public void b(eBt eBt2) {
        this.a(eBt2.a());
    }

    private void a(int n) {
        long l = azu_0.j().n().u();
        eBt eBt2 = eBo.a.a(l, n);
        if (eBt2 == null) {
            eBt2 = new eBt((short)n);
        } else {
            eBt2.b(this);
            eBt2.h().a(this);
        }
        bmv_1 bmv_12 = cxo_0.a(eBt2, false);
        this.g.put(n, (Object)new bqU(bmv_12, new bqY(eBt2), eBt2));
    }

    @Override
    public void a(Uk uk) {
        TIntObjectIterator tIntObjectIterator = this.g.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bqU bqU2 = (bqU)tIntObjectIterator.value();
            if (!bqU2.m().e((exk_2)((um_0)uk).c())) continue;
            fis_1.a().a((ajf_1)bqU2, "removeDisabledText");
            blx_1 blx_12 = bqU2.l();
            if (blx_12 == null) continue;
            this.a(uk, blx_12);
        }
    }

    public void h(eBt eBt2) {
        bqU bqU2 = (bqU)this.g.get((int)eBt2.a());
        if (bqU2 == null) {
            return;
        }
        blx_1 blx_12 = bqU2.l();
        if (blx_12 == null) {
            return;
        }
        blx_12.bJ();
    }

    public void a(Uk uk, blx_1 blx_12) {
        exk_2 exk_22;
        if ((uk.b() == ul_0.c || uk.b() == ul_0.d) && (exk_22 = (exk_2)((um_0)uk).c()) != null) {
            if (exk_22.T().x() != 0) {
                bhd_1 bhd_12 = bhe_0.a().a(exk_22.T().x());
                blx_12.a(exk_22, bhd_12);
            } else {
                blx_12.d(exk_22);
            }
        }
        blx_12.bJ();
    }
}

