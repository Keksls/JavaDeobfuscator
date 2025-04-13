/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bmk
 */
public class bmk_1
implements ajh_1 {
    public static final String a = "isCompanion";
    public static final String b = "isNewPlayer";
    public static final String d = "companionView";
    public static final String e = "addRemovePartyEnabled";
    public static final String f = "isInParty";
    public static final String g = "isHero";
    public static final String h = "guildBlazon";
    public static final String i = "canAddToParty";
    public static final String j = "addToPartyError";
    public static final String k = "isInCompanyGuild";
    public static final String l = "isInCompanyNation";
    public static final String m = "isInSlot";
    public static final String n = "cutName";
    public static final String o = "levelsList";
    public static final String p = "levelsAutoList";
    public static final String q = "selectedLevel";
    public static final String r = "xpToLevelUp";
    public static final String s = "isReachedMaxLvl";
    public static final String t = "id";
    public static final int u = 18;
    protected final blx_1 v;
    protected final brn w;
    private aby_0 x;
    private List<blf_0> y;

    public bmk_1(blx_1 blx_12, brn brn2) {
        this.v = blx_12;
        this.w = brn2;
        this.r();
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string == null) {
            return null;
        }
        if (string.equals(r)) {
            return Float.valueOf(this.p());
        }
        if (string.equals(a)) {
            return this.k();
        }
        if (string.equals(b)) {
            return eag_0.a(this.v.U_());
        }
        if (string.equals(d)) {
            return this.w;
        }
        if (string.equals(e)) {
            return this.j();
        }
        if (string.equals(f)) {
            return this.i();
        }
        if (string.equals(g)) {
            return this.h();
        }
        if (string.equals("actorDescriptorLibrary")) {
            return this.t();
        }
        if (string.equals(h)) {
            if (!(this.l() instanceof bnh_1)) {
                return null;
            }
            bnh_1 bnh_12 = (bnh_1)this.l();
            if (!bnh_12.eZ()) {
                return null;
            }
            long l = bnh_12.fa();
            if (l == 0L) {
                l = bnh_12.eV().b();
            }
            eqd_2 eqd_22 = new eqd_2(l);
            bxo_1 bxo_12 = new bxo_1(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
            ays_2 ays_22 = bxp_1.a().a(bxo_12);
            bxo_12.e();
            return ays_22;
        }
        if (string.equals(t)) {
            return this.f();
        }
        if (string.equals(i)) {
            return this.a();
        }
        if (string.equals(j)) {
            enX enX2 = eul_2.a.a(this.g());
            return bae.h().a("error.cantAddHero" + enX2.a(), new Object[0]);
        }
        if (string.equals(k)) {
            return this.e();
        }
        if (string.equals(l)) {
            return this.c();
        }
        if (string.equals(m)) {
            return brd_0.k.a(this);
        }
        if (string.equals(n)) {
            return this.s();
        }
        if (string.equals(o)) {
            return this.r();
        }
        if (string.equals(p)) {
            return this.a(true);
        }
        if (string.equals(q)) {
            return this.q();
        }
        return this.l().b(string);
    }

    public boolean a() {
        int n = brd_0.k.b();
        if (n >= enp_2.a.b(ens_2.bp)) {
            return false;
        }
        Optional optional = bhh_1.a(end_0.b);
        boolean bl = enp_2.a.d(ens_2.bc);
        if (!bl) {
            return true;
        }
        if (optional.isEmpty() || !((ebe_0)optional.get()).k()) {
            return false;
        }
        euk_2 euk_22 = this.g();
        if (this.k()) {
            bmr_1 bmr_12 = bzf_1.a();
            return eul_2.c.a(euk_22) == enX.a && eul_2.d.a(euk_22) == enX.a && bmr_12 != null && !bmr_12.ak();
        }
        enX enX2 = eul_2.a.a(euk_22);
        return enX2 == enX.a;
    }

    private float p() {
        Optional<blf_0> optional = this.y.stream().max(Comparator.comparingInt(blf_0::a));
        if (optional.isEmpty()) {
            return 0.0f;
        }
        short s2 = optional.get().a();
        long l = this.v.ce();
        return Oz.c.a(s2, l);
    }

    private blf_0 q() {
        for (blf_0 blf_02 : this.y) {
            if (blf_02.a() != this.l().dr()) continue;
            return blf_02;
        }
        return null;
    }

    private List<blf_0> a(boolean bl) {
        blx_1 blx_12 = this.l();
        ezi_1[] ezi_1Array = ezi_1.values();
        this.y = new ArrayList<blf_0>();
        for (ezi_1 ezi_12 : ezi_1Array) {
            if (ezi_12.a() <= 0 || ezi_12.a() >= blx_12.dt() || bl && ezi_12.a() + 1 > blx_12.dt()) continue;
            this.y.add(new blf_0(ezi_12.a(), blx_12));
        }
        this.y.add(new blg_0(blx_12.dt(), blx_12));
        return this.y;
    }

    private List<blf_0> r() {
        return this.a(false);
    }

    public void b() {
        fis_1.a().a((ajf_1)this.q(), q);
    }

    private String s() {
        Object object = this.v.dp();
        if (((String)object).length() > 18) {
            object = ((String)object).substring(0, 15);
            object = (String)object + "...";
        }
        return object;
    }

    protected boolean c() {
        if (!(this.l() instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l();
        int n = bmp_1.a().c(bnh_12);
        Optional<emy_0> optional = ena_0.a().a(bnh_12.R(), end_0.b);
        if (optional.isEmpty()) {
            return false;
        }
        ebe_0 ebe_02 = (ebe_0)optional.get();
        int n2 = ebe_02.b();
        return n == n2;
    }

    protected boolean e() {
        if (!(this.l() instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l();
        if (!bnh_12.eZ()) {
            return true;
        }
        long l = bnh_12.fc();
        Optional<emy_0> optional = ena_0.a().a(bnh_12.R(), end_0.b);
        if (optional.isEmpty()) {
            return false;
        }
        ebe_0 ebe_02 = (ebe_0)optional.get();
        long l2 = ebe_02.c();
        return l == l2;
    }

    public long f() {
        return this.l().a_();
    }

    private aby_0 t() {
        if (this.x != null) {
            return this.x;
        }
        this.x = new aby_0();
        this.x.a(this.v.bv());
        return this.x;
    }

    public euk_2 g() {
        bmr_1 bmr_12 = bzf_1.a();
        blx_1 blx_12 = this.l();
        euk_2 euk_22 = new euk_2();
        int n = brd_0.k.b();
        euk_22.d(n);
        Optional optional = bhh_1.a(end_0.b);
        euk_22.a(optional.isPresent() ? (ebe_0)optional.get() : null);
        if (bmr_12 == null) {
            return euk_22;
        }
        euk_22.a(bmp_1.a().d(bmr_12));
        if (euk_22.c() == 0L) {
            euk_22.a(bmr_12.T_());
        }
        if (!(blx_12 instanceof bmr_1)) {
            euk_22.b(bmr_12.T_());
            return euk_22;
        }
        boolean bl = euu_2.c();
        emg_0 emg_02 = bmr_12.N_();
        boolean bl2 = emg_02.a(enw_0.q);
        int n2 = brd_0.k.c();
        euk_22.a(bl2 || bl);
        euk_22.a(n2);
        euk_22.b(bmp_1.a().d(blx_12));
        if (euk_22.d() == 0L) {
            euk_22.b(blx_12.T_());
        }
        euk_22.b(bmr_12.bM());
        euk_22.c(bmp_1.a().c(blx_12));
        euk_22.c(bmr_12.fc());
        euk_22.d(blx_12.fc());
        euk_22.b(bmr_12.bz() != null && bmr_12.bz().e() != elp_0.b);
        return euk_22;
    }

    protected boolean h() {
        return !euv_2.a.a(this.v);
    }

    protected boolean i() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return false;
        }
        byn_1 byn_12 = bmr_12.dE();
        if (!byn_12.d()) {
            return false;
        }
        return byn_12.a().f(this.v.a_());
    }

    protected boolean j() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return false;
        }
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() == 4) {
            return false;
        }
        if (bmr_12.ak()) {
            return false;
        }
        if (this.i()) {
            return true;
        }
        byn_1 byn_12 = bmr_12.dE();
        if (byn_12.d() && byn_12.a().h()) {
            return false;
        }
        boolean bl = fis_1.a().c("companionPartyListFull");
        if (bl) {
            return false;
        }
        boolean bl2 = fis_1.a().c("isInDungeon");
        if (bl2) {
            return false;
        }
        return this.k() || brd_0.k.h() || euu_2.c();
    }

    public boolean k() {
        return false;
    }

    public blx_1 l() {
        return this.v;
    }

    public exq_2 m() {
        return null;
    }

    public brn n() {
        return this.w;
    }

    public short o() {
        return this.v.cf();
    }

    public boolean equals(Object object) {
        if (!(object instanceof bmk_1)) {
            return false;
        }
        return this.v.a_() == ((bmk_1)object).f();
    }

    public String toString() {
        return "CharacterView{m_characterInfo=" + this.v + ", m_shortCharacterView=" + this.w + "}";
    }
}

