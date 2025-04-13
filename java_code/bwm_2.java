/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bwm
 */
public class bwm_2
implements byl_1,
csb_1 {
    private static final Logger p = Logger.getLogger(bwm_2.class);
    public static final String a = "extraTurnScorePercentage";
    public static final String b = "extraTurnScorePercentageNext";
    public static final String c = "extraTurnScoreDescription";
    public static final String d = "extraTurnScoreValue";
    public static final String e = "team";
    public static final String f = "timelineIllustrationUrl";
    public static final String g = "timelineSmallIllustrationUrl";
    public static final String h = "isMonster";
    public static final String i = "selectedBonus";
    public static final String j = "actorStandardScale";
    public static final String k = "timelineIndex";
    public static final String l = "colorPoint";
    public static final String m = "hpPercentage";
    private final blx_1 q;
    private bxo_2 r;
    private boolean s;
    private float t;
    private bxn_2 u;
    private long v = -1L;
    final String n = "#777777";
    final String[] o = new String[]{"#fc0097", "#ff0000", "#ff7f00", "#fec700", "#e2fc00", "#6fff00", "#00ff88", "#00e3fc", "#006cef", "#0008fe", "#7b00ff", "#b300ff", "#ed00fe", "#400000", "#cfcfcf", "#fefefe", "#777777"};

    public bwm_2(blx_1 blx_12, bxo_2 bxo_22) {
        this.q = blx_12;
        this.r = bxo_22;
        if (this.q.gO() == 1550) {
            blx_1 blx_13 = this.q.aq();
            this.v = blx_13.a_();
        } else if (!(this.q.Z_() instanceof bpb_1) || !biG.c(this.q.X_()) || box_2.a(this.q)) {
            this.v = this.q.a_();
        }
        if (this.v != -1L) {
            byj_1.a().a(this.v, this);
        }
    }

    public void a() {
        if (this.v != -1L) {
            byj_1.a().b(this.v, this);
        }
    }

    public blx_1 b() {
        return this.q;
    }

    public bxo_2 c() {
        return this.r;
    }

    public void a(bxo_2 bxo_22) {
        this.r = bxo_22;
    }

    private float n() {
        int n = this.r.J();
        float f2 = this.r.z(this.q.a_()) % n;
        return f2 / (float)n;
    }

    private float o() {
        epa_1 epa_12 = this.q.a_(eps_0.b);
        int n = epa_12.c();
        int n2 = epa_12.a();
        return (float)n2 / (float)n;
    }

    private float p() {
        int n = this.r.J();
        float f2 = this.r.z(this.q.a_()) % n;
        f2 = Math.min((float)n, f2 + 100.0f + (float)this.q.c(eps_0.B));
        return f2 / (float)n;
    }

    public String[] d() {
        return null;
    }

    @Override
    public void a(ays_2 ays_22, String string) {
        if (ays_22 != null) {
            fis_1.a().a((ajf_1)this.q, g);
        } else {
            p.warn((Object)string);
        }
    }

    public Object a(String string) {
        if (string.equals("timelineElementType")) {
            return 1;
        }
        if (string.equals(c)) {
            int n = this.r.J();
            int n2 = this.r.z(this.q.a_()) % n;
            return bae.h().a("fight.extraTurn.score", n2, n);
        }
        if (string.equals(a)) {
            return Float.valueOf(this.n());
        }
        if (string.equals(b)) {
            return Float.valueOf(this.p());
        }
        if (string.equals(d)) {
            int n = this.r.J();
            return this.r.z(this.q.a_()) % n;
        }
        if (string.equals(j)) {
            biI biI2 = this.q.bv();
            short s2 = biI2.af();
            float f2 = biI2.an().p();
            return Float.valueOf(6.0f / Math.max((float)s2, 6.0f) * 1.4f * f2);
        }
        if (string.equals(e)) {
            return (byte)(!this.q() ? 1 : 0);
        }
        if (string.equals(f)) {
            return this.e();
        }
        if (string.equals(g)) {
            if (this.v != -1L) {
                return byj_1.a().a(this.v);
            }
            return this.e();
        }
        if (string.equals(h)) {
            return this.q.gO() != 1550 && this.q.Z_() instanceof bpb_1 && biG.c(this.q.X_()) && !box_2.a(this.q);
        }
        if (string.equals(i)) {
            return this.u;
        }
        if (string.equals(k)) {
            return this.r.k(this.q.a_()) + 1;
        }
        if (string.equals(l)) {
            int n = this.r.k(this.q.a_());
            if (n >= this.o.length) {
                return "#777777";
            }
            return this.o[n];
        }
        if (string.equals(m)) {
            return Float.valueOf(this.o());
        }
        return null;
    }

    public String e() {
        if (this.q.gO() == 1550) {
            blx_1 blx_12 = this.q.aq();
            try {
                return String.format(azs_0.a().a("breedContactListIllustrationPath"), blx_12.gO(), blx_12.gX());
            }
            catch (gm_0 gm_02) {
                p.error((Object)"PropertyException during getTimelineIllustrationUrl for SRAM_DOUBLE_BREED_ID", (Throwable)gm_02);
            }
        } else if (this.q instanceof bnh_1) {
            try {
                return String.format(azs_0.a().a("breedContactListIllustrationPath"), this.q.gO(), this.q.gX());
            }
            catch (gm_0 gm_03) {
                p.error((Object)"PropertyException during getTimelineIllustrationUrl for PlayerCharacter", (Throwable)gm_03);
            }
        } else if (this.q.gY() == 5) {
            int n;
            bpb_1 bpb_12 = (bpb_1)this.q.Z_();
            int n2 = n = bpb_12.c() == -1 ? this.q.X_() : bpb_12.c();
            if (biG.c(n)) {
                return azs_0.a().b(n);
            }
            try {
                return String.format(azs_0.a().a("companionCharacterSheetIllustrationPath"), bpb_12.s());
            }
            catch (gm_0 gm_04) {
                p.error((Object)"PropertyException during getTimelineIllustrationUrl for Companion", (Throwable)gm_04);
            }
        } else if (this.q.Z_() instanceof bpb_1) {
            int n;
            bpb_1 bpb_13 = (bpb_1)this.q.Z_();
            int n3 = n = bpb_13.c() == -1 ? this.q.X_() : bpb_13.c();
            if (biG.c(n) || bOH.a(n)) {
                return azs_0.a().b(n);
            }
            try {
                return String.format(azs_0.a().a("breedContactListIllustrationPath"), biG.b(n), biG.a(n));
            }
            catch (gm_0 gm_05) {
                p.error((Object)"PropertyException during getTimelineIllustrationUrl for Monster", (Throwable)gm_05);
            }
        }
        return null;
    }

    private boolean q() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = this.q.bA() == bmr_12.cQ() ? this.q.Y() == 0 : this.q.Y() == -1;
        return bl;
    }

    public void f() {
        this.i();
    }

    public void g() {
        this.h();
    }

    public void h() {
        int n = this.r.J();
        float f2 = this.r.z(this.q.a_()) % n;
        if (f2 < this.t) {
            this.a(new bxn_2(true));
        } else if (f2 > this.t && this.u != null) {
            this.a((bxn_2)null);
        }
        this.t = f2;
        if (this.q.bo()) {
            fis_1.a().a((ajf_1)this.q, c, a, d);
            ddy_0.a().a((int)f2 + 1);
        }
    }

    public void a(bxn_2 bxn_22) {
        this.u = bxn_22;
        fis_1.a().a((ajf_1)this.q, i);
    }

    @Override
    public void i() {
        if (this.q.bz() != null && !this.q.bz().af_().y()) {
            return;
        }
        ddy_0.a().b((int)Hw.b(this.n() * 100.0f, 1.0f, 100.0f));
    }

    public void a(boolean bl) {
        biI biI2 = this.q.bv();
        if (!biI2.at()) {
            bl = false;
        }
        if (!this.q.ca()) {
            bl = false;
        }
        if (this.s == bl) {
            return;
        }
        this.s = bl;
        if (this.s) {
            biI2.bL();
            biI2.bX();
            fis_1.a().a("highlightedFighterId", this.q.a_());
        } else {
            if (((Long)fis_1.a().f("highlightedFighterId").f()).longValue() == this.q.a_()) {
                fis_1.a().a("highlightedFighterId", 0L);
            }
            biI2.bM();
            biI2.ca();
        }
    }

    @Override
    public int j() {
        int n = this.r.J();
        return this.r.z(this.q.a_()) % (n == 0 ? 1 : n);
    }

    @Override
    public int k() {
        int n = this.r.J();
        return this.r.z(this.q.a_()) / (n == 0 ? 1 : n);
    }

    public void l() {
        fis_1.a().a((ajf_1)this.q, e);
    }

    @Override
    public /* synthetic */ csa_1 m() {
        return this.b();
    }
}

