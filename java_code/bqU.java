/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bqU
extends bmk_1
implements rv_0 {
    protected static final Logger x = Logger.getLogger(bqU.class);
    public static final String y = "characterSheetIllustrationUrl";
    public static final String z = "spellsIllustrationUrl";
    public static final String A = "listIllustrationUrl";
    public static final String B = "currentLevelPercentage";
    public static final String C = "currentLevelPercentageInText";
    public static final String D = "xpRatio";
    public static final String E = "equipmentBonus";
    public static final String F = "hasEquipment";
    public static final String G = "equipmentPopupText";
    public static final String H = "headEquipment";
    public static final String I = "hairEquipment";
    public static final String J = "faceEquipment";
    public static final String K = "shoulderEquipment";
    public static final String L = "neckEquipment";
    public static final String M = "chestEquipment";
    public static final String N = "armsEquipment";
    public static final String O = "leftHandEquipment";
    public static final String P = "rightHandEquipment";
    public static final String Q = "beltEquipment";
    public static final String R = "skirtEquipment";
    public static final String S = "trousersEquipment";
    public static final String T = "legsEquipment";
    public static final String U = "petEquipment";
    public static final String V = "mountEquipment";
    public static final String W = "backEquipment";
    public static final String X = "wingEquipment";
    public static final String Y = "firstWeaponEquipment";
    public static final String Z = "secondWeaponEquipment";
    public static final String aa = "accessoryEquipment";
    public static final String ab = "backgroundText";
    public static final String ac = "shopCost";
    public static final String ad = "canBuy";
    public static final String ae = "isOwned";
    public static final String af = "isActivated";
    public static final String ag = "isFree";
    public static final String ah = "actorStandardScale";
    public static final String ai = "removeDisabledText";
    public static final String[] aj = new String[]{"headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "actorEquipment"};
    private final eBt ak;
    private bss_0<?, ?> al;
    private final TIntObjectHashMap<bqX> am = new TIntObjectHashMap();

    public bqU(blx_1 blx_12, brn brn2) {
        this(blx_12, brn2, eBo.a.c(-brn2.a()));
    }

    public bqU(blx_1 blx_12, brn brn2, eBt eBt2) {
        super(blx_12, brn2);
        this.ak = eBt2;
        ((ept_0)this.l().gP()).a(this);
        this.z();
    }

    @Override
    @Nullable
    public Object b(String string) {
        Object object;
        if (string.equals("nameAndLevel")) {
            return this.v.a(this.x());
        }
        if (string.equals("breedInfo")) {
            return this.v;
        }
        if (string.equals("companionRealLevel")) {
            return bae.h().a("levelShort.custom", this.ak.d());
        }
        if (string.equals(y)) {
            try {
                return String.format(azs_0.a().a("companionBigCharacterSheetIllustrationPath"), this.v.gO());
            }
            catch (gm_0 gm_02) {
                x.error((Object)"PropertyException during getFieldValue for companionBigCharacterSheetIllustrationPath", (Throwable)gm_02);
            }
        }
        if (string.equals(z)) {
            try {
                return String.format(azs_0.a().a("companionSpellInventoryIllustrationsPath"), this.v.gO());
            }
            catch (gm_0 gm_03) {
                x.error((Object)"PropertyException during getFieldValue for SPELLS_ILLUSTRATION_URL_FIELD", (Throwable)gm_03);
            }
        }
        if (string.equals(A)) {
            try {
                return String.format(azs_0.a().a("companionListIllustrationsPath"), this.v.gO());
            }
            catch (gm_0 gm_04) {
                x.error((Object)"PropertyException during getFieldValue for LIST_ILLUSTRATION_URL_FIELD", (Throwable)gm_04);
            }
        }
        if (string.equals(B)) {
            return Float.valueOf(this.s());
        }
        if (string.equals("currentExperience")) {
            return this.ak.c();
        }
        if (string.equals("xpToNextLevel")) {
            return "/ " + bae.h().a(this.u().b(this.t()));
        }
        if (string.equals("isReachedMaxLvl")) {
            return this.t() >= enp_2.a.b(ens_2.v);
        }
        if (string.equals(C)) {
            return String.format("(%s %%)", Hw.c(this.s() * 100.0f));
        }
        if (string.equals(D)) {
            if (this.t() >= enp_2.a.b(ens_2.v)) {
                return bae.h().a("maxLevel", new Object[0]);
            }
            object = new StringBuilder();
            long l = this.u().b(this.t());
            long l2 = Math.min(this.u().c(this.v()), l);
            ((StringBuilder)object).append(bae.h().a(D, bae.h().a(l2), bae.h().a(l)));
            return ((StringBuilder)object).toString();
        }
        if (string.equals(H)) {
            return this.ak.h().e(exh_2.a.A);
        }
        if (string.equals(I)) {
            return this.ak.h().e(exh_2.b.A);
        }
        if (string.equals(J)) {
            return this.ak.h().e(exh_2.c.A);
        }
        if (string.equals(K)) {
            return this.ak.h().e(exh_2.d.A);
        }
        if (string.equals(L)) {
            return this.ak.h().e(exh_2.e.A);
        }
        if (string.equals(M)) {
            return this.ak.h().e(exh_2.f.A);
        }
        if (string.equals(N)) {
            return this.ak.h().e(exh_2.g.A);
        }
        if (string.equals(O)) {
            return this.ak.h().e(exh_2.h.A);
        }
        if (string.equals(P)) {
            return this.ak.h().e(exh_2.i.A);
        }
        if (string.equals(Q)) {
            return this.ak.h().e(exh_2.k.A);
        }
        if (string.equals(R)) {
            return this.ak.h().e(exh_2.j.A);
        }
        if (string.equals(S)) {
            return this.ak.h().e(exh_2.l.A);
        }
        if (string.equals(T)) {
            return this.ak.h().e(exh_2.m.A);
        }
        if (string.equals(W)) {
            return this.ak.h().e(exh_2.n.A);
        }
        if (string.equals(X)) {
            return this.ak.h().e(exh_2.o.A);
        }
        if (string.equals(Y)) {
            return this.ak.h().e(exh_2.p.A);
        }
        if (string.equals(Z)) {
            return this.ak.h().e(exh_2.q.A);
        }
        if (string.equals(aa)) {
            return this.ak.h().e(exh_2.r.A);
        }
        if (string.equals(U)) {
            return this.ak.h().e(exh_2.w.A);
        }
        if (string.equals(V)) {
            return this.ak.h().e(exh_2.y.A);
        }
        if (string.equals(E)) {
            object = new ArrayList();
            for (exk_2 exk_22 : this.ak.h()) {
                ((ArrayList)object).add(exk_22);
            }
            return bnh_1.a(this.v, object);
        }
        if (string.equals(F)) {
            return !this.ak.h().m();
        }
        if (string.equals(G)) {
            if (this.ak.h().m()) {
                return bae.h().a("companion.no.equipments", new Object[0]);
            }
            object = new StringBuilder();
            this.ak.h().forEach(arg_0 -> bqU.a((StringBuilder)object, arg_0));
            return bae.h().a("companion.retrieve.equipments", ((StringBuilder)object).toString());
        }
        if (string.equals(ab)) {
            return bae.h().a(String.format("companionBackgroundText.%d", this.l().gO()), new Object[0]);
        }
        if (string.equals(ac)) {
            if (this.p()) {
                return null;
            }
            return this.al == null ? null : Double.valueOf(this.al.g());
        }
        if (string.equals(ad)) {
            return this.al != null;
        }
        if (string.equals(ae)) {
            return this.p();
        }
        if (string.equals(ag)) {
            return this.r();
        }
        if (string.equals(af)) {
            return this.q();
        }
        if (string.equals(ah)) {
            object = this.v.bv();
            short s2 = ((biI)object).af();
            float f2 = ((abu)object).an().p();
            return Float.valueOf(6.0f / Math.max((float)s2, 6.0f) * 2.0f * f2);
        }
        if (string.equals(ai)) {
            eQb eQb2;
            boolean bl = false;
            ani_2 ani_22 = new ani_2().a(cSS.h);
            ani_22.a((CharSequence)bae.h().a("desc.removeCompanionDisabled", new Object[0]));
            bmr_1 bmr_12 = azu_0.j().k();
            byn_1 byn_12 = bmr_12.dE();
            if (byn_12.d() && (eQb2 = byn_12.a()).f(-this.w())) {
                ani_22.m().a((CharSequence)bae.h().a("companion.stillInParty", new Object[0]));
                bl = true;
            }
            if (!this.ak.h().m()) {
                bl = true;
                ani_22.m().a((CharSequence)bae.h().a("companion.hasEquipment", new Object[0]));
            }
            if (bmr_12.da().o() == 0) {
                bl = true;
                ani_22.m().a((CharSequence)bae.h().a("bagsFull", new Object[0]));
            }
            return bl ? ani_22.r() : null;
        }
        if (string.equals("name")) {
            object = this.ak.e();
            return object == null || ((String)object).isEmpty() ? this.w.e() : object;
        }
        if (string.equals("rerollXpBonus")) {
            return this.C();
        }
        if (string.equals("addToPartyError")) {
            object = bzf_1.a();
            if (object != null && ((blx_1)object).ak()) {
                return bQG.b(317, new Object[0]);
            }
            euk_2 euk_22 = this.g();
            enX enX2 = eul_2.d.a(euk_22);
            if (enX2 != enX.a) {
                return bae.h().a("error.cantAddHero" + enX2.a(), new Object[0]);
            }
            enX enX3 = eul_2.c.a(euk_22);
            return bae.h().a("error.cantAddHero" + enX3.a(), new Object[0]);
        }
        return super.b(string);
    }

    private String C() {
        return bae.h().a("rerollXp.factor", Float.valueOf(1.5f));
    }

    @Override
    public long f() {
        return -this.ak.b();
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    protected boolean i() {
        for (brn brn2 : azu_0.j().k().cU()) {
            if (brn2 == null || brn2.f() != this.l().gO()) continue;
            return true;
        }
        return false;
    }

    @Override
    protected boolean j() {
        if (!super.j()) {
            return false;
        }
        return this.r() || this.p();
    }

    @Override
    public blx_1 l() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return super.l();
        }
        if (!bmr_12.ak()) {
            return super.l();
        }
        Collection collection = bmr_12.bz().a(enw_2.a((byte)5), enw_2.b(bmr_12));
        for (blx_1 blx_12 : collection) {
            if (blx_12.gO() != this.v.gO()) continue;
            return blx_12;
        }
        return super.l();
    }

    public boolean p() {
        return this.ak.i();
    }

    public boolean q() {
        return this.ak.b() != 0L;
    }

    public boolean r() {
        return eBC.a.a() == this.v.gO();
    }

    @Override
    public boolean k() {
        return true;
    }

    @Override
    public exq_2 m() {
        return this.ak.h();
    }

    public float s() {
        return this.u().a(this.t(), this.v());
    }

    public short t() {
        return this.v.dr();
    }

    public oj_0 u() {
        return Oz.c;
    }

    public long v() {
        return this.ak.c();
    }

    public long w() {
        return this.ak.b();
    }

    public String x() {
        return this.w.e();
    }

    public void a(bss_0<?, ?> bss_02) {
        this.al = bss_02;
        fis_1.a().a((ajf_1)this, ac, ad);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof bqU)) {
            return false;
        }
        return this.v.gO() == ((bqU)object).l().gO();
    }

    public bss_0<?, ?> y() {
        return this.al;
    }

    public bqX a(int n) {
        return (bqX)this.am.get(n);
    }

    public void z() {
    }

    @Override
    public void a(rs_0 rs_02) {
        fis_1.a().a((ajf_1)this, "characteristics");
    }

    public void A() {
        ((ept_0)this.l().gP()).b(this);
        bqz_1.a.b(this.l().bD());
    }

    public void B() {
        ((ept_0)this.l().gP()).a(this);
        bqz_1.a.a(this.l().bD());
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    protected boolean e() {
        return true;
    }

    private static /* synthetic */ void a(StringBuilder stringBuilder, exk_2 exk_22) {
        if (exk_22 != null) {
            stringBuilder.append(" - ").append(exk_22.N()).append(System.lineSeparator());
        }
    }
}

