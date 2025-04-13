/*
 * Decompiled with CFR 0.152.
 */
public class aOz
extends afr_0 {
    private static final aOz b = new aOz();

    public static aOz g() {
        return b;
    }

    private aOz() {
    }

    @Override
    public void a(afj_0 afj_02, int n) {
        if (afj_02.k("AnimCourse02")) {
            afj_02.e("AnimCourse02");
        } else if (afj_02.k("AnimCourse")) {
            afj_02.e("AnimCourse");
        } else {
            afj_02.e("AnimMarche");
        }
    }

    @Override
    public afm_0 a() {
        return afm_0.k;
    }
}

