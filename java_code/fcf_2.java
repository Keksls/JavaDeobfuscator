/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCF
 */
public class fcf_2
extends fzs {
    private ftj_0 i = null;
    private Object j = null;
    private boolean k;

    public fcf_2(fyb_0 fyb_02, ftj_0 ftj_02, Object object, boolean bl) {
        this.e = fyb_02;
        this.i = ftj_02;
        this.j = object;
        this.k = bl;
    }

    public fcf_2(fyb_0 fyb_02) {
        this.e = fyb_02;
    }

    public void a(ftj_0 ftj_02) {
        this.i = ftj_02;
    }

    public ftj_0 j() {
        return this.i;
    }

    public void c(boolean bl) {
        this.k = bl;
    }

    public boolean k() {
        return this.k;
    }

    public void a(Object object) {
        this.j = object;
    }

    public Object l() {
        return this.j;
    }

    @Override
    public frd_0 f() {
        return frd_0.q;
    }
}

