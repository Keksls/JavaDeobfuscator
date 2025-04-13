/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bQw
 */
public class bqw_1
implements ajh_1 {
    protected static final Logger a = Logger.getLogger(bqw_1.class);
    public static final String b = "actorDescriptorLibrary";
    public static final String d = "actorAnimationName";
    public static final String e = "headEquipment";
    public static final String f = "hairEquipment";
    public static final String g = "faceEquipment";
    public static final String h = "shoulderEquipment";
    public static final String i = "neckEquipment";
    public static final String j = "chestEquipment";
    public static final String k = "armsEquipment";
    public static final String l = "leftHandEquipment";
    public static final String m = "rightHandEquipment";
    public static final String n = "beltEquipment";
    public static final String o = "skirtEquipment";
    public static final String p = "trousersEquipment";
    public static final String q = "legsEquipment";
    public static final String r = "petEquipment";
    public static final String s = "mountEquipment";
    public static final String t = "costumeEquipment";
    public static final String u = "backEquipment";
    public static final String v = "wingEquipment";
    public static final String w = "firstWeaponEquipment";
    public static final String x = "secondWeaponEquipment";
    public static final String y = "accessoryEquipment";
    public static final String z = "direction";
    public static final String A = "AnimStatique";
    public static final String B = "AnimMarche";
    public static final String C = "AnimCourse";
    public static final String D = "breedName";
    public static final int E = 511;
    private int H = 0;
    private boolean I;
    private final TByteObjectHashMap<exk_2> J = new TByteObjectHashMap();
    protected biI F;
    private final TShortObjectHashMap<Anm> K = new TShortObjectHashMap(biK.values().length);
    protected bnh_1 G;
    private static final String[] L = new String[]{"actorAnimationName", "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "costumeEquipment", "actorDescriptorLibrary", "breedName", "direction"};

    public void a(bmr_1 bmr_12, byte by, epn_2 epn_22) {
        bnh_1 bnh_12 = new bnh_1();
        bnh_12.g(by);
        bnh_12.c(epn_22);
        bnh_12.eA();
        bnh_12.eD();
        bnh_12.ex();
        bnh_12.a((byte)0, false);
        bnh_12.b((byte)0, false);
        bnh_12.a(aej_2.d);
        bnh_12.g(false);
        this.H = bmr_12.en();
        this.I = bmr_12.W_();
        this.G = bnh_12;
        this.F = bnh_12.bv();
        this.F.b(false);
        this.F.c(false);
        this.F.e(this.c(A));
        Map<exh_2, Long> map = bmr_12.cG().a();
        for (Map.Entry<exh_2, Long> entry : map.entrySet()) {
            Optional<exk_2> optional = eZi.a(bmr_12, bmr_12.cG(), entry.getKey());
            optional.ifPresent(exk_22 -> this.b((exk_2)exk_22, ((exh_2)entry.getKey()).a()));
        }
        this.a();
    }

    @Override
    public String[] d() {
        return L;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.F;
        }
        if (string.equals(d)) {
            return this.F.F();
        }
        if (string.equals(e)) {
            return this.J.get(exh_2.a.A);
        }
        if (string.equals(f)) {
            return this.J.get(exh_2.b.A);
        }
        if (string.equals(g)) {
            return this.J.get(exh_2.c.A);
        }
        if (string.equals(h)) {
            return this.J.get(exh_2.d.A);
        }
        if (string.equals(i)) {
            return this.J.get(exh_2.e.A);
        }
        if (string.equals(j)) {
            return this.J.get(exh_2.f.A);
        }
        if (string.equals(k)) {
            return this.J.get(exh_2.g.A);
        }
        if (string.equals(l)) {
            return this.J.get(exh_2.h.A);
        }
        if (string.equals(m)) {
            return this.J.get(exh_2.i.A);
        }
        if (string.equals(n)) {
            return this.J.get(exh_2.k.A);
        }
        if (string.equals(o)) {
            return this.J.get(exh_2.j.A);
        }
        if (string.equals(p)) {
            return this.J.get(exh_2.l.A);
        }
        if (string.equals(q)) {
            return this.J.get(exh_2.m.A);
        }
        if (string.equals(u)) {
            return this.J.get(exh_2.n.A);
        }
        if (string.equals(v)) {
            return this.J.get(exh_2.o.A);
        }
        if (string.equals(w)) {
            return this.J.get(exh_2.p.A);
        }
        if (string.equals(x)) {
            return this.J.get(exh_2.q.A);
        }
        if (string.equals(y)) {
            return this.J.get(exh_2.r.A);
        }
        if (string.equals(r)) {
            return this.J.get(exh_2.w.A);
        }
        if (string.equals(s)) {
            return this.J.get(exh_2.y.A);
        }
        if (string.equals(z)) {
            return this.F.aC().a();
        }
        if (string.equals(D)) {
            return this.G.bb().b() + " " + (this.G.gX() == 0 ? (char)'M' : 'F');
        }
        return null;
    }

    public void a(exk_2 exk_22, byte by) {
        exq_1<?> exq_12 = exk_22.T().F();
        if (!exq_12.a(exh_2.a(by))) {
            return;
        }
        this.b(exk_22, by);
        this.a();
    }

    public void b(exk_2 exk_22, byte by) {
        exq_1<?> exq_12 = exk_22.T().F();
        if (this.J.get(by) != null) {
            this.a(by);
        }
        this.J.put(by, (Object)exk_22);
        this.c(exk_22, by);
        for (exh_2 exh_22 : exq_12.j()) {
            this.J.put(exh_22.a(), (Object)exk_22.b(exk_22.a()));
        }
        if (by == exh_2.p.a()) {
            this.F.e(this.c(this.F.F()));
        }
    }

    private void c(exk_2 exk_22, byte by) {
        exq_1<?> exq_12 = exk_22.T().F();
        this.a((short)by);
        if (!this.I && exh_2.a.A == by) {
            return;
        }
        if (!exq_12.l()) {
            return;
        }
        int n = this.G.gX() == 0 ? exk_22.I() : exk_22.K();
        biK biK2 = biK.a(by);
        if (biK2 == null) {
            return;
        }
        try {
            String string = azs_0.a().a("ANMEquipmentPath");
            Anm anm = abu.c(String.format(string, n));
            this.F.a(anm, biK2.m);
            this.K.put((short)by, (Object)anm);
        }
        catch (Exception exception) {
            a.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    private void a(short s2) {
        biK biK2;
        Anm anm = (Anm)this.K.remove(s2);
        if (anm != null && (biK2 = biK.a(s2)) != null) {
            this.F.b(anm, biK2.m);
        }
    }

    public void a(byte by) {
        exh_2 exh_22 = exh_2.a(by);
        exk_2 exk_22 = (exk_2)this.J.get(by);
        if (exh_22 == exh_2.r) {
            this.a(exk_22.T(), false);
        }
        this.J.remove(by);
        for (exh_2 exh_23 : exk_22.T().F().j()) {
            if (exh_23 == exh_22) {
                for (exh_2 exh_24 : exk_22.T().F().h()) {
                    exk_2 exk_23 = (exk_2)this.J.get(exh_24.a());
                    if (exk_23 == null || exk_23.aT_() != exk_22.aT_()) continue;
                    this.J.remove(exh_24.a());
                }
                continue;
            }
            this.J.remove(exh_23.a());
        }
        if (by == exh_2.p.a()) {
            this.F.e(this.c(this.F.F()));
        }
        this.a();
    }

    public void a() {
        this.F.bE();
        this.F.an().I();
        this.F.m(Integer.toString(this.G.X_()));
        blx_1 blx_12 = this.F.bI();
        if (blx_12 instanceof bnh_1) {
            ((bnh_1)blx_12).s(azu_0.j().k().W_());
        }
        this.c();
        TByteObjectIterator tByteObjectIterator = this.J.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            this.c((exk_2)tByteObjectIterator.value(), tByteObjectIterator.key());
        }
        this.e();
        fis_1.a().a((ajf_1)this, L);
    }

    private void c() {
        String string = this.G.bX();
        String string2 = this.G.bW();
        this.a(string, string2);
    }

    private void a(String string, String string2) {
        if (string != null || string2 != null) {
            String string3;
            String string4;
            try {
                string4 = azs_0.a().a("ANMEquipmentPath");
            }
            catch (gm_0 gm_02) {
                a.error((Object)"Erreur au chargement d'une propri\u00e9t\u00e9", (Throwable)gm_02);
                return;
            }
            if (string != null) {
                string3 = String.format(string4, string);
                this.F.a(string3, atn_2.a("VETEMENTCUSTOM"));
            }
            if (string2 != null) {
                string3 = String.format(string4, string2);
                this.F.a(string3, atn_2.a("CHEVEUXCUSTOM"));
            }
        }
    }

    public exk_2 b(byte by) {
        return (exk_2)this.J.get(by);
    }

    private void e() {
        if (this.H != 0) {
            this.a((ezr_0)eyo_1.g().d(this.H), true);
            return;
        }
        byte by = exh_2.r.a();
        exk_2 exk_22 = this.b(by);
        if (exk_22 != null) {
            this.a(exk_22.T(), true);
        }
    }

    private boolean a(ezr_0 ezr_02, boolean bl) {
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
            byte by = this.G.gX();
            apc_2 apc_22 = efh_02.Q();
            if (apc_22 != null && !apc_22.b(this.G, this.G, this.G, null)) continue;
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

    private void a(efh_0 efh_02, boolean bl) {
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
            bjy_02.a(this.F, false);
            return true;
        }
        if (rg_02.a() == ri_0.j) {
            RG rG = (RG)rg_02;
            bke_0 bke_02 = new bke_0(efh_02, rG.e(), rG.f());
            bke_02.a(this.F);
            return true;
        }
        if (rg_02.a() == ri_0.r) {
            Rw rw = (Rw)rg_02;
            bjd_0 bjd_02 = new bjd_0(efh_02, rw.e(), rw.f(), rw.g());
            bjd_02.a((abz_0)this.F, false);
            return true;
        }
        return false;
    }

    private boolean b(efh_0 efh_02, rg_0 rg_02) {
        if (rg_02.a() == ri_0.j) {
            RG rG = (RG)rg_02;
            bke_0 bke_02 = new bke_0(efh_02, !rG.e(), rG.f());
            bke_02.a(this.F);
            return true;
        }
        return false;
    }

    public bnh_1 b() {
        return this.G;
    }

    public void a(int n) {
        this.F.a(this.F.aC().b(n));
        this.a();
    }

    public void a(String string) {
        this.F.e(this.c(string));
        fis_1.a().a((ajf_1)this, d);
    }

    public String c(String string) {
        if (string.startsWith(A)) {
            exk_2 exk_22 = (exk_2)this.J.get(exh_2.p.A);
            if (exk_22 != null) {
                return "AnimStatique03-Boucle-" + bwd_0.a(exk_22.U());
            }
            return A;
        }
        if (string.startsWith(B)) {
            int n;
            exk_2 exk_23 = (exk_2)this.J.get(exh_2.p.A);
            if (exk_23 != null && (n = bwd_0.a(exk_23.U())) != 511) {
                return "AnimMarche-" + n;
            }
            return B;
        }
        return string;
    }

    public void b(int n) {
        this.H = n;
    }

    public void a(boolean bl) {
        this.I = bl;
    }
}

