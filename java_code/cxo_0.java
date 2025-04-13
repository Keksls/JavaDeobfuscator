/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cXo
 */
public abstract class cxo_0
implements ahr_1 {
    protected static final TIntObjectHashMap<bmk_1> b = new TIntObjectHashMap();
    protected static final TLongObjectHashMap<bmk_1> c = new TLongObjectHashMap();
    public static final List<cxo_0> d = new ArrayList<cxo_0>();
    protected final List<String> e = new ArrayList<String>();
    protected final TIntObjectHashMap<brn> f = new TIntObjectHashMap();
    private ans_1 a;
    byte g = 0;
    bmr_1 h;

    public bmk_1 j() {
        return (bmk_1)fis_1.a().d("characterSheet", this.f());
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.a = string -> {
            if (this.q() && string.startsWith(this.f())) {
                this.e.remove(string);
                if (!string.equals(this.f())) {
                    int n = Integer.parseInt(string.substring(this.f().length()));
                    this.a((bmk_1)b.get(n), true);
                }
                if (this.e.isEmpty()) {
                    azu_0.j().b(this);
                }
            }
        };
        fpm_0.b().a(this.a);
        bmr_1 bmr_12 = this.h != null ? this.h : azu_0.j().k();
        ArrayList<brn> arrayList = new ArrayList<brn>();
        ArrayList<brm> arrayList2 = new ArrayList<brm>();
        for (ajh_1 ajh_12 : bmr_12.cU()) {
            if (ajh_12 == null || ajh_12.c()) continue;
            brn brn2 = ajh_12.b();
            this.f.put(ajh_12.f(), (Object)brn2);
            arrayList.add(brn2);
        }
        TLongIterator tLongIterator = euw_2.a.e(bmr_12.U_()).iterator();
        while (tLongIterator.hasNext()) {
            ajh_1 ajh_12;
            bnh_1 bnh_12 = (bnh_1)euw_2.a.d(tLongIterator.next());
            brm brm2 = new brm(bnh_12);
            ajh_12 = bzg_1.a.a(brm2);
            bnh_12.cd().a();
            c.put(bnh_12.a_(), (Object)ajh_12);
            arrayList2.add(brm2);
        }
        arrayList.sort(Comparator.comparingInt(brn::f));
        cxo_0.i();
        this.c((bmk_1)c.get(bmr_12.a_()));
        fis_1.a().a("companionPartyList", arrayList, this.f());
        cxo_0.m();
        fis_1.a().a("companionPartyListFull", !eBy.a.b(bmr_12.R()) && !bzf_1.a((byte)5));
        fpm_0.b().a("wakfu.companionsEmbedded", cGj.class);
        d.add(this);
    }

    public static void k() {
        for (cxo_0 cxo_02 : d) {
            fis_1.a().a("companionPartyList", cxo_02.l(), cxo_02.f());
            cxo_02.h();
        }
        cxo_0.m();
        cxo_0.i();
        bmr_1 bmr_12 = azu_0.j().k();
        fis_1.a().a("companionPartyListFull", !eBy.a.b(bmr_12.R()) && !bzf_1.a((byte)5));
    }

    private void h() {
        bmr_1 bmr_12 = azu_0.j().k();
        for (String string : this.e) {
            bmk_1 bmk_12;
            if (!string.equals(this.f()) || c.get((bmk_12 = bzg_1.a.a(new brm(bmr_12))).l().a_()) != null) continue;
            fis_1.a().a("characterSheet", c.get(bmr_12.a_()), string);
        }
    }

    public static void a(bmk_1 bmk_12) {
        bmk_12.l().cd().a();
        c.put(bmk_12.l().a_(), (Object)bmk_12);
    }

    public static void b(long l) {
        c.remove(l);
    }

    public static void b(bmk_1 bmk_12) {
        b.put(bmk_12.n().f(), (Object)bmk_12);
    }

    public static void a(int n) {
        b.remove(n);
    }

    public static boolean b(int n) {
        return b.containsKey(n);
    }

    public List<brn> l() {
        this.f.clear();
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<brn> arrayList = new ArrayList<brn>();
        for (brn brn2 : bmr_12.cU()) {
            if (brn2 == null) continue;
            int n = brn2.f();
            brn brn3 = (brn)this.f.get(n);
            if (brn3 != null) {
                arrayList.add(brn3);
                continue;
            }
            brn brn4 = brn2.b();
            this.f.put(n, (Object)brn4);
            arrayList.add(brn4);
        }
        arrayList.sort(Comparator.comparingInt(brn::f));
        return arrayList;
    }

    public static void m() {
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<brn> arrayList = new ArrayList<brn>();
        for (brn brn2 : bmr_12.cU()) {
            if (brn2 == null || brn2.c() && euu_2.a()) continue;
            brn brn3 = brn2.b();
            arrayList.add(brn3);
            eBt eBt2 = eBo.a.a(bmr_12.U_(), (long)brn2.f());
            if (eBt2 == null) continue;
            bmv_1 bmv_12 = cxo_0.a(eBt2);
            bqU bqU2 = new bqU(bmv_12, new bqY(eBt2));
            cxo_0.b(bqU2);
        }
        arrayList.sort(Comparator.comparingInt(brn::f));
        fis_1.a().a("companionParty", arrayList);
        fis_1.a().a("companionPartyExists", !arrayList.isEmpty());
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().b(this.a);
        for (String string : this.e) {
            fpm_0.b().o(string);
        }
        this.e.clear();
        d.remove(this);
        this.f.clear();
        this.h = null;
    }

    public static void n() {
        b.clear();
        c.clear();
        d.clear();
        fis_1.a().a("companionPartyListFull", false);
    }

    public static bmk_1 c(int n) {
        return (bmk_1)b.get(n);
    }

    public static TLongObjectHashMap<bmk_1> o() {
        return c;
    }

    private static void i() {
        b.clear();
        bmr_1 bmr_12 = azu_0.j().k();
        for (brn brn2 : bmr_12.cU()) {
            bmk_1 bmk_12;
            if (brn2 == null) continue;
            if (brn2.c()) {
                bmk_12 = new bmk_1(bmr_12, brn2);
            } else {
                long l = brn2.a();
                eBt eBt2 = eBo.a.c(-l);
                bmv_1 bmv_12 = cxo_0.a(eBt2);
                bmk_12 = new bqU(bmv_12, brn2, eBt2);
                bmv_12.cd().a();
            }
            b.put(brn2.f(), (Object)bmk_12);
        }
    }

    public static bmv_1 a(eBt eBt2) {
        return cxo_0.a(eBt2, true);
    }

    public static bmv_1 a(eBt eBt2, boolean bl) {
        bmv_1 bmv_12 = bmv_1.cy();
        bmv_12.h(eBt2.b());
        bmv_12.a(new eaz_0<bmv_1>(bmv_12));
        bmv_12.h((byte)5);
        bmv_12.c(bpc_1.a().a(eBt2.a()));
        bmv_12.o(eBt2.f());
        bmv_12.a_(bl ? eBx.b(eBt2) : eBt2.d());
        bmv_12.g(false);
        bmv_12.cw();
        bmv_12.b(bmv_12.Q_());
        bmv_12.bJ();
        return bmv_12;
    }

    public static void b(eBt eBt2) {
        cxo_0.a(eBt2, List.of());
    }

    public static void a(eBt eBt2, exk_2 exk_22) {
        cxo_0.a(eBt2, List.of(exk_22));
    }

    public static void a(eBt eBt2, @NotNull List<exk_2> list) {
        if (eBt2 == null) {
            return;
        }
        bmk_1 bmk_12 = (bmk_1)b.get((int)eBt2.a());
        if (bmk_12 == null) {
            return;
        }
        blx_1 blx_12 = bmk_12.l();
        for (exk_2 exk_22 : list) {
            if (exk_22.T().x() != 0) {
                bhd_1 bhd_12 = bhe_0.a().a(exk_22.T().x());
                blx_12.a(exk_22, bhd_12);
                continue;
            }
            blx_12.d(exk_22);
        }
        blx_12.bJ();
        blx_12.a_(eps_0.b).n();
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return adt_12.a() != 18293;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public abstract String f();

    public String c(bmk_1 bmk_12) {
        String string = this.f();
        this.a(bmk_12, string);
        fis_1.a().a("mainCharacterSheet", (Object)true, string);
        return string;
    }

    public String a(bmk_1 bmk_12, String string, int n, int n2) {
        String string2 = this.f() + bmk_12.l().gO();
        if (fpm_0.b().q(string2)) {
            return null;
        }
        this.a(bmk_12, string2);
        fyy_0 fyy_02 = fpm_0.b().h().d(string2);
        fvk_0 fvk_02 = (fvk_0)fyy_02.a(string);
        fvk_02.a(new cXp(this, fvk_02, n, n2));
        fis_1.a().a("mainCharacterSheet", (Object)false, string2);
        this.a(bmk_12, false);
        return string2;
    }

    public String a(bmk_1 bmk_12, String string, String string2, int n, int n2, fvk_0 fvk_02) {
        String string3 = string + bmk_12.l().a_();
        if (fpm_0.b().q(string3)) {
            return null;
        }
        this.b(bmk_12, string3);
        String string4 = Oy.d().a("inventory.of", bmk_12.l().dp());
        fis_1.a().a("mainCharacterSheet", (Object)false, string3);
        fis_1.a().a("inventoryWindow", (Object)fvk_02, string3);
        fis_1.a().a("inventoryOf", (Object)string4, string3);
        return string3;
    }

    private void a(bmk_1 bmk_12, boolean bl) {
        if (bmk_12 == null) {
            return;
        }
        brn brn2 = (brn)this.f.get((int)bmk_12.l().gO());
        if (brn2 == null) {
            return;
        }
        brn2.a(bl);
    }

    private void a(bmk_1 bmk_12, String string) {
        fpm_0.b().a(string, cfi_0.a(this.f()), 32769L, (short)10000);
        this.e.add(string);
        fis_1.a().a("characterSheet", (Object)bmk_12, string);
    }

    private void b(bmk_1 bmk_12, String string) {
        fpm_0.b().a(string, cfi_0.a("newInventoryOnlyDialog"), 32769L, (short)10000);
        this.e.add(string);
        fis_1.a().a("characterSheet", (Object)bmk_12, string);
    }

    public List<String> p() {
        return this.e;
    }

    void a(byte by) {
        this.g = by;
    }

    public void b(bmr_1 bmr_12) {
        this.h = bmr_12;
    }

    protected boolean q() {
        return true;
    }
}

