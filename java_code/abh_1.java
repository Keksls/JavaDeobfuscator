/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBh
 */
public abstract class abh_1
extends abp_1 {
    private abj_1 a;

    public static int a(Class clazz) {
        return abh_1.d(clazz.getName());
    }

    public static int d(String string) {
        return Hw.a(string);
    }

    @Override
    protected void l_() {
        super.l_();
        if (this.a != null) {
            this.a.a(this);
        }
    }

    @Override
    protected final void j_() {
        super.j_();
        this.m();
    }

    protected abstract void n_();

    protected abstract void m();

    final void a(abj_1 abj_12) {
        this.a = abj_12;
    }
}

