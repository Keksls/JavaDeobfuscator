/*
 * Decompiled with CFR 0.152.
 */
public class cTk
extends cSS {
    private final int a;
    private final long m;
    private final byte n;

    @Deprecated
    cTk() {
        this(0, 0L, 0);
    }

    public cTk(int n, long l, byte by) {
        this.a = n;
        this.m = l;
        this.n = by;
    }

    @Override
    public void o() {
        cls_0 cls_02 = new cls_0(this.m, this.n);
        azu_0.j().K().c(cls_02);
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = emp_0.b(bmr_12.N_().a(), emq_0.V);
        if (bl) {
            return true;
        }
        if (bmr_12.bf()) {
            return true;
        }
        return bmr_12.dj() == bmr_12.di();
    }

    @Override
    public String r() {
        return "changeResourceStepAction";
    }

    @Override
    public String q() {
        if (this.n < 0) {
            return bae.h().a("desc.mru." + this.r() + ".destroy", new Object[0]);
        }
        String string = bae.h().a(152, (long)this.a, new Object[0]);
        return bae.h().a("desc.mru." + this.r() + ".change", string);
    }

    @Override
    protected int t() {
        return this.n < 0 ? cUL.ay.aH : cUL.t.aH;
    }

    @Override
    public cSY n() {
        return cSY.aq;
    }

    @Override
    public cSS v() {
        return new cTk(this.a, this.m, this.n);
    }

    public byte a() {
        return this.n;
    }
}

