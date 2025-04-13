/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aOy
implements afp_0 {
    protected static final Logger a = Logger.getLogger(aOy.class);
    private static final aOy b = new aOy();
    private final agb_0 c = new agc_0(0.0f, 0.5f, 0.5f, 1.0f);
    private final agb_0 d = new age_0(0.0f, 0.5f, 0.5f, 1.0f);

    public static aOy f() {
        return b;
    }

    protected aOy() {
    }

    @Override
    public final int a(afj_0 afj_02) {
        return UL.a.b() / 2;
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
        afj_02.e("AnimRail-Fin");
    }

    @Override
    public void a(afj_0 afj_02, aej_2 aej_22) {
        afj_02.a(aej_22);
    }

    @Override
    public int d() {
        return 560;
    }

    @Override
    public void c(afj_0 afj_02) {
    }

    @Override
    public void d(afj_0 afj_02) {
    }

    @Override
    public void e(afj_0 afj_02) {
    }

    @Override
    public void f(afj_0 afj_02) {
    }

    @Override
    public void a(afj_0 afj_02, int n, agg_0 agg_02, boolean bl, boolean bl2) {
    }

    @Override
    public void a(afj_0 afj_02, int n) {
        String string = afj_02.F();
        if (!string.startsWith("AnimRail")) {
            afj_02.e("AnimRail-Debut");
        }
    }

    @Override
    public void b(afj_0 afj_02, aej_2 aej_22) {
        afj_02.a(aej_22);
    }

    @Override
    public boolean g(afj_0 afj_02) {
        return false;
    }

    @Override
    public boolean b(afj_0 afj_02, int n) {
        return false;
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

