/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bQv
 */
public class bqv_1
implements ajh_1 {
    protected static final Logger b = Logger.getLogger(bqv_1.class);
    public static final String d = "animName";
    public static final String e = "actorDescriptorLibrary";
    public static final String f = "equipmentBonuses";
    public static final String g = "actorAnimationName";
    public static final String h = "headEquipment";
    public static final String i = "hairEquipment";
    public static final String j = "faceEquipment";
    public static final String k = "shoulderEquipment";
    public static final String l = "neckEquipment";
    public static final String m = "chestEquipment";
    public static final String n = "armsEquipment";
    public static final String o = "leftHandEquipment";
    public static final String p = "rightHandEquipment";
    public static final String q = "beltEquipment";
    public static final String r = "skirtEquipment";
    public static final String s = "trousersEquipment";
    public static final String t = "legsEquipment";
    public static final String u = "petEquipment";
    public static final String v = "mountEquipment";
    public static final String w = "backEquipment";
    public static final String x = "wingEquipment";
    public static final String y = "firstWeaponEquipment";
    public static final String z = "secondWeaponEquipment";
    public static final String A = "accessoryEquipment";
    protected final Map<Byte, exk_2> B = new HashMap<Byte, exk_2>();
    protected biI C;
    private final Map<Byte, Anm> a = new HashMap<Byte, Anm>(biK.values().length);
    protected bmr_1 D;
    protected List<exh_2> E;
    private String G = null;
    protected static final String[] F = new String[]{"actorAnimationName", "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "actorDescriptorLibrary", "equipmentBonuses"};

    public bqv_1() {
    }

    public bqv_1(bmr_1 bmr_12) {
        this.a(bmr_12, bmr_12.cG(), new exh_2[0]);
    }

    @Override
    public String[] d() {
        return F;
    }

    @Override
    public Object b(String string) {
        if (string.equals(d)) {
            return null;
        }
        if (string.equals(e)) {
            return this.C;
        }
        exh_2 exh_22 = exh_2.p;
        if (string.equals(g)) {
            if (!Cz.f(this.G)) {
                return this.G;
            }
            exk_2 exk_22 = this.B.get(exh_22.A);
            if (exk_22 != null && !this.E.contains(exh_22)) {
                return "AnimStatique03-Boucle-" + bwd_0.a(exk_22.U());
            }
            return "AnimStatique";
        }
        if (string.equals(h)) {
            return this.B.get(exh_2.a.A);
        }
        if (string.equals(i)) {
            return this.B.get(exh_2.b.A);
        }
        if (string.equals(j)) {
            return this.B.get(exh_2.c.A);
        }
        if (string.equals(k)) {
            return this.B.get(exh_2.d.A);
        }
        if (string.equals(l)) {
            return this.B.get(exh_2.e.A);
        }
        if (string.equals(m)) {
            return this.B.get(exh_2.f.A);
        }
        if (string.equals(n)) {
            return this.B.get(exh_2.g.A);
        }
        if (string.equals(o)) {
            return this.B.get(exh_2.h.A);
        }
        if (string.equals(p)) {
            return this.B.get(exh_2.i.A);
        }
        if (string.equals(q)) {
            return this.B.get(exh_2.k.A);
        }
        if (string.equals(r)) {
            return this.B.get(exh_2.j.A);
        }
        if (string.equals(s)) {
            return this.B.get(exh_2.l.A);
        }
        if (string.equals(t)) {
            return this.B.get(exh_2.m.A);
        }
        if (string.equals(w)) {
            return this.B.get(exh_2.n.A);
        }
        if (string.equals(x)) {
            return this.B.get(exh_2.o.A);
        }
        if (string.equals(y)) {
            return this.B.get(exh_22.A);
        }
        if (string.equals(z)) {
            return this.B.get(exh_2.q.A);
        }
        if (string.equals(A)) {
            return this.B.get(exh_2.r.A);
        }
        if (string.equals(u)) {
            return this.B.get(exh_2.w.A);
        }
        if (string.equals(v)) {
            return this.B.get(exh_2.y.A);
        }
        if (string.equals(f)) {
            ArrayList<exk_2> arrayList = new ArrayList<exk_2>(this.B.values());
            return bnh_1.a(this.D, arrayList);
        }
        return null;
    }

    public void a(exk_2 exk_22, byte by) {
        exq_1<?> exq_12 = exk_22.T().F();
        exh_2 exh_22 = exh_2.a(by);
        if (exh_22 == null || !exq_12.a(exh_22)) {
            return;
        }
        this.a(exk_22, by, exh_22);
        cdw_0.n().a(exh_22);
    }

    protected void a(exk_2 exk_22, byte by, exh_2 exh_22) {
        this.b(exk_22, by);
        this.a(exh_22);
    }

    public void b(exk_2 exk_22, byte by) {
        if (this.E != null && this.E.contains(exh_2.a(by))) {
            return;
        }
        exq_1<?> exq_12 = exk_22.T().F();
        if (this.B.get(by) != null) {
            this.b(by);
        }
        this.B.put(by, exk_22);
        this.d(exk_22, by);
        for (exh_2 exh_22 : exq_12.j()) {
            this.B.put(exh_22.a(), exk_22.t());
        }
    }

    public void a(byte by) {
        biK biK2 = biK.a(by);
        if (biK2 == null) {
            return;
        }
        this.e(by);
        if (exh_2.a.A == by && this.D.en() != 0 && !this.D.W_()) {
            return;
        }
        Optional<exk_2> optional = this.d(by).map(this::a);
        optional.filter(exk_22 -> exk_22.U().l()).ifPresent(exk_22 -> this.b((exk_2)exk_22, by));
    }

    public void c(@NotNull exk_2 exk_22, byte by) {
        biK biK2 = biK.a(by);
        if (biK2 == null) {
            return;
        }
        exq_1<?> exq_12 = exk_22.T().F();
        if (exq_12 == null) {
            return;
        }
        this.e(by);
        if (exh_2.a.A == by && this.D.en() != 0 && !this.D.W_()) {
            return;
        }
        if (!exq_12.l()) {
            return;
        }
        exk_2 exk_23 = this.d(by).map(this::a).orElse(exk_22);
        this.b(exk_23, by);
    }

    private void d(exk_2 exk_22, byte by) {
        exq_1<?> exq_12 = exk_22.T().F();
        this.e(by);
        if (exh_2.a.A == by && this.D.en() != 0 && !this.D.W_()) {
            return;
        }
        if (!exq_12.l()) {
            return;
        }
        biK biK2 = biK.a(by);
        if (biK2 == null) {
            return;
        }
        int n = bol_1.b(exk_22);
        bjw_1 bjw_12 = bhb_0.d().a(n);
        int n2 = this.a(bjw_12);
        this.a(by, n2, biK2);
    }

    private void a(byte by, int n, biK biK2) {
        try {
            String string = azs_0.a().a("ANMEquipmentPath");
            Anm anm = abu.c(String.format(string, n));
            this.C.a(anm, biK2.m);
            this.a.put(by, anm);
        }
        catch (Exception exception) {
            b.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    private Optional<fk_2> d(byte by) {
        exh_2 exh_22 = exh_2.a(by);
        Optional<ft_1> optional = bol_1.a(exh_22);
        return optional.map(ft_12 -> bol_1.a(this.D.R(), this.D.a_(), (ft_1)((Object)((Object)optional.get()))));
    }

    private exk_2 a(fk_2 fk_22) {
        bjw_1 bjw_12 = bhb_0.d().a(fk_22.c());
        if (bjw_12 == null) {
            return null;
        }
        return exk_2.a(bjw_12);
    }

    private int a(bjw_1 bjw_12) {
        return this.D.gX() == 0 ? bjw_12.C() : bjw_12.D();
    }

    private void e(byte by) {
        biK biK2;
        Anm anm = this.a.remove(by);
        if (anm != null && (biK2 = biK.a(by)) != null) {
            this.C.b(anm, biK2.m);
        }
    }

    public void b(byte by) {
        exh_2 exh_22 = exh_2.a(by);
        if (exh_22 == null) {
            return;
        }
        exk_2 exk_22 = this.B.get(by);
        if (exk_22 == null) {
            return;
        }
        this.a(by, exh_22, exk_22);
    }

    protected void a(byte by, exh_2 exh_22, exk_2 exk_22) {
        if (exh_22 == exh_2.r) {
            this.a(exk_22.T(), false);
        }
        this.B.remove(by);
        for (exh_2 exh_23 : exk_22.T().F().j()) {
            if (exh_23 == exh_22) {
                for (exh_2 exh_24 : exk_22.T().F().h()) {
                    exk_2 exk_23 = this.B.get(exh_24.a());
                    if (exk_23 == null || exk_23.aT_() != exk_22.aT_()) continue;
                    this.B.remove(exh_24.a());
                }
                continue;
            }
            this.B.remove(exh_23.a());
        }
        this.a(exh_22);
    }

    public void a() {
        this.C.bE();
        this.C.an().I();
        this.C.m(Integer.toString(this.D.X_()));
        blx_1 blx_12 = this.C.bI();
        if (blx_12 instanceof bnh_1) {
            ((bnh_1)blx_12).s(this.D.W_());
        }
        this.f();
        for (exh_2 exh_22 : exh_2.values()) {
            byte by;
            exk_2 exk_22;
            if (this.E.contains(exh_22) || (exk_22 = this.B.get(by = exh_22.a())) == null) continue;
            this.d(exk_22, by);
        }
        this.b();
        fis_1.a().a((ajf_1)this, F);
    }

    public void a(exh_2 exh_22) {
        byte by = exh_22.a();
        this.e(by);
        this.f();
        exk_2 exk_22 = this.B.get(by);
        if (exk_22 != null) {
            this.d(exk_22, by);
            this.b();
        }
        fis_1.a().a((ajf_1)this, F);
    }

    public void a(String string) {
        this.G = string;
    }

    private void f() {
        String string = this.D.bX();
        String string2 = this.D.bW();
        if (string != null || string2 != null) {
            String string3;
            String string4;
            try {
                string4 = azs_0.a().a("ANMEquipmentPath");
            }
            catch (gm_0 gm_02) {
                b.error((Object)"Erreur au chargement d'une propri\u00e9t\u00e9", (Throwable)gm_02);
                return;
            }
            if (string != null) {
                string3 = String.format(string4, string);
                this.C.a(string3, atn_2.a("VETEMENTCUSTOM"));
            }
            if (string2 != null) {
                string3 = String.format(string4, string2);
                this.C.a(string3, atn_2.a("CHEVEUXCUSTOM"));
            }
        }
    }

    public exk_2 c(byte by) {
        return this.B.get(by);
    }

    protected void b() {
        byte by = exh_2.r.a();
        exk_2 exk_22 = this.c(by);
        if (exk_22 != null) {
            this.a(exk_22.T(), true);
        }
    }

    public boolean a(ezr_0 ezr_02, boolean bl) {
        abc_2<efh_0> abc_22 = ezr_02.q();
        for (efh_0 efh_02 : abc_22) {
            if (efh_02.j() != efc_0.eq.a()) continue;
            int n = efh_02.a(0, (short)0, eFb.a);
            fie_0 fie_02 = fih_0.a().a(n);
            if (fie_02 == null) continue;
            this.a(fie_02, bl);
        }
        return false;
    }

    private void a(fie_0 fie_02, boolean bl) {
        ArrayList<efh_0> arrayList = fie_02.e((short)0);
        for (efh_0 efh_02 : arrayList) {
            byte by = this.D.gX();
            apc_2 apc_22 = efh_02.Q();
            if (apc_22 != null && !apc_22.b(this.D, this.D, this.D, null)) continue;
            apc_2 apc_23 = this.a(apc_22);
            if (apc_23 == null) {
                this.a(efh_02, bl);
                continue;
            }
            if (!(apc_23 instanceof exS) || ((exS)apc_23).d() != by) continue;
            this.a(efh_02, bl);
        }
    }

    private apc_2 a(apc_2 apc_22) {
        apc_2 apc_23;
        aot_1 aot_12;
        if (apc_22 == null) {
            return null;
        }
        if (apc_22 instanceof exS) {
            return apc_22;
        }
        if (apc_22 instanceof aos_1) {
            aot_12 = (aos_1)apc_22;
            apc_23 = this.a(((aos_1)aot_12).b());
            if (apc_23 != null) {
                return apc_23;
            }
            apc_23 = this.a(((aos_1)aot_12).d());
            if (apc_23 != null) {
                return apc_23;
            }
        }
        if (apc_22 instanceof aor_1) {
            aot_12 = (aor_1)apc_22;
            apc_23 = this.a(((aor_1)aot_12).b());
            if (apc_23 != null) {
                return apc_23;
            }
            apc_23 = this.a(((aor_1)aot_12).d());
            if (apc_23 != null) {
                return apc_23;
            }
        }
        return null;
    }

    public void a(efh_0 efh_02, boolean bl) {
        List<rg_0> list = efh_02.X();
        if (list == null) {
            return;
        }
        for (rg_0 rg_02 : list) {
            if (bl) {
                this.a(efh_02, rg_02);
                continue;
            }
            this.b(efh_02, rg_02);
        }
    }

    private boolean a(efh_0 efh_02, rg_0 rg_02) {
        if (rg_02.a() == ri_0.f) {
            Rv rv = (Rv)rg_02;
            bjy_0 bjy_02 = new bjy_0(efh_02, rv.e(), rv.g(), rv.f());
            bjy_02.a(this.C, false);
            return true;
        }
        if (rg_02.a() == ri_0.j) {
            RG rG = (RG)rg_02;
            bke_0 bke_02 = new bke_0(efh_02, rG.e(), rG.f());
            bke_02.a(this.C);
            return true;
        }
        if (rg_02.a() == ri_0.r) {
            Rw rw = (Rw)rg_02;
            bjd_0 bjd_02 = new bjd_0(efh_02, rw.e(), rw.f(), rw.g());
            bjd_02.a((abz_0)this.C, false);
            return true;
        }
        if (rg_02.a() == ri_0.s) {
            Rm rm = (Rm)rg_02;
            this.a(rm.e());
            return true;
        }
        return rg_02.a() == ri_0.b;
    }

    private boolean b(efh_0 efh_02, rg_0 rg_02) {
        if (rg_02.a() == ri_0.j) {
            RG rG = (RG)rg_02;
            bke_0 bke_02 = new bke_0(efh_02, !rG.e(), rG.f());
            bke_02.a(this.C);
            return true;
        }
        if (rg_02.a() == ri_0.s) {
            this.a("AnimStatique");
            return true;
        }
        return false;
    }

    public bmr_1 c() {
        return this.D;
    }

    public void a(bmr_1 bmr_12, eyz_0 eyz_02, exh_2 ... exh_2Array) {
        this.E = Arrays.asList(exh_2Array);
        this.B.clear();
        this.D = bmr_12;
        bnh_1 bnh_12 = new bnh_1();
        bnh_12.g(false);
        this.C = new biI(bnh_12);
        this.C.a((abu)this.D.bv());
        Map<exh_2, Long> map = eyz_02.a();
        for (Map.Entry<exh_2, Long> entry : map.entrySet()) {
            if (this.E.contains(entry.getKey())) continue;
            Optional<exk_2> optional = eZi.a(bmr_12, eyz_02, entry.getKey());
            optional.ifPresent(exk_22 -> this.b((exk_2)exk_22, ((exh_2)entry.getKey()).a()));
        }
        this.a();
    }

    public biI e() {
        return this.C;
    }

    public void a(List<exh_2> list) {
        this.E = list;
    }
}

