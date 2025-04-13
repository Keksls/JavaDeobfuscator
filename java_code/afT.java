/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class afT
implements afp_0 {
    protected static final Logger a = Logger.getLogger(afT.class);
    private static final afT b = new afT();

    public static afT f() {
        return b;
    }

    @Override
    public int a(afj_0 afj_02) {
        return afj_02.bo();
    }

    @Override
    public agb_0 b() {
        return afY.a;
    }

    @Override
    public agb_0 c() {
        return afY.a;
    }

    @Override
    public void b(afj_0 afj_02) {
        boolean bl = afj_02.br();
        afj_02.p(false);
        if (bl) {
            afj_02.e("AnimArtefact-Nager-Statique");
        } else {
            afj_02.e("AnimArtefact-Nager-Marche-Fin");
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
    public void a(afj_0 afj_02, int n, agg_0 agg_02, boolean bl, boolean bl2) {
    }

    @Override
    public void a(afj_0 afj_02, int n) {
        String string = afj_02.F();
        if (!string.startsWith("AnimArtefact-Nager-Marche")) {
            afj_02.e("AnimArtefact-Nager-Marche");
        }
    }

    @Override
    public void c(afj_0 afj_02) {
    }

    @Override
    public void d(afj_0 afj_02) {
    }

    @Override
    public void e(afj_0 afj_02) {
        afj_02.p(true);
        afj_02.e("AnimArtefact-Nager-Debut");
    }

    @Override
    public void f(afj_0 afj_02) {
        afj_02.p(false);
        afj_02.a(agm.a());
        afj_02.e("AnimArtefact-Nager-Fin");
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
        return afm_0.d;
    }
}

