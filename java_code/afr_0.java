/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from afR
 */
public class afr_0
implements afp_0 {
    protected static final Logger a = Logger.getLogger(afr_0.class);
    private static final afr_0 b = new afr_0();
    private final agb_0 c = new agc_0(0.0f, 0.5f, 0.5f, 1.0f);
    private final agb_0 d = new age_0(0.0f, 0.5f, 0.5f, 1.0f);

    public static afr_0 f() {
        return b;
    }

    protected afr_0() {
    }

    @Override
    public final int a(afj_0 afj_02) {
        return afj_02.bm();
    }

    @Override
    public agb_0 b() {
        return this.c;
    }

    @Override
    public agb_0 c() {
        return this.d;
    }

    @Override
    public void b(afj_0 afj_02) {
        String string = afj_02.F();
        if (string.equals("AnimSaut-Marche") || string.equals("AnimSaut-Marche") || string.equals("AnimSaut-Marche") || string.equals("AnimSaut-Marche")) {
            afj_02.e(afj_02.ab());
        } else {
            afj_02.e(afj_02.bh());
        }
    }

    @Override
    public void a(afj_0 afj_02, aej_2 aej_22) {
    }

    @Override
    public int d() {
        return -1;
    }

    @Override
    public void c(afj_0 afj_02) {
        afj_02.a(true);
        if (!afj_02.aC().c()) {
            return;
        }
        afj_02.e("AnimRelique-Saut");
    }

    @Override
    public void d(afj_0 afj_02) {
        afj_02.o(true);
        if (!afj_02.aC().c()) {
            return;
        }
        afj_02.e("AnimArtefact-Papatte");
    }

    @Override
    public void e(afj_0 afj_02) {
        afj_02.p(true);
        afj_02.a(agn.a());
        afj_02.e("AnimArtefact-Nager-Debut");
    }

    @Override
    public void f(afj_0 afj_02) {
        String string = afj_02.F();
        afj_02.e("AnimArtefact-Nager-Fin");
    }

    @Override
    public void a(afj_0 afj_02, int n, agg_0 agg_02, boolean bl, boolean bl2) {
        afj_02.a(false);
        afj_02.o(false);
        afj_02.p(false);
        String string = afj_02.F();
        afY.a(afj_02, agg_02, bl, bl2);
    }

    @Override
    public void a(afj_0 afj_02, int n) {
        afj_02.a(false);
        afj_02.o(false);
        afj_02.p(false);
        String string = afj_02.F();
        if (string.contains("AnimCourse") && string.contains("-Fin") || !string.startsWith("AnimCourse")) {
            afj_02.e(afj_02.k(afj_02.ac()) ? afj_02.ac() : "AnimMarche");
        }
    }

    @Override
    public void b(afj_0 afj_02, aej_2 aej_22) {
        if (afj_02.bp() && aej_22.c()) {
            afj_02.e("AnimRelique-Saut");
        }
        if (afj_02.bq() && aej_22.c()) {
            afj_02.e("AnimArtefact-Papatte");
        }
        afj_02.a(aej_22);
    }

    @Override
    public boolean g(afj_0 afj_02) {
        return false;
    }

    @Override
    public boolean b(afj_0 afj_02, int n) {
        return Math.abs(n) > 2;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public afm_0 a() {
        return afm_0.b;
    }
}

