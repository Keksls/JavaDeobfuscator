/*
 * Decompiled with CFR 0.152.
 */
public class cUv
extends cSS {
    private static final int a = 5;
    private final String m;
    private final Runnable n;

    public cUv() {
        this.m = "ielt.use";
        this.n = null;
    }

    public cUv(String string, Runnable runnable) {
        this.m = string;
        this.n = runnable;
    }

    @Override
    public cSY n() {
        return cSY.au;
    }

    @Override
    public void o() {
        if (this.n == null) {
            return;
        }
        this.n.run();
    }

    @Override
    public boolean c() {
        return this.n != null;
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a().a(this.d() ? f : h);
        ani_22.a((CharSequence)bae.h().a(this.r(), new Object[0]));
        ani_22.b();
        return ani_22.r();
    }

    @Override
    protected int t() {
        return 5;
    }

    @Override
    public String r() {
        return this.m;
    }

    @Override
    public cSS v() {
        return new cUv(this.m, this.n);
    }
}

