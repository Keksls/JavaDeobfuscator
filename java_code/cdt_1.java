/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cdt
 */
public class cdt_1
implements alo_1 {
    private final cdu_1 a;

    public cdt_1(cdu_1 cdu_12) {
        this.a = cdu_12;
    }

    @Override
    public float o() {
        return cdr_1.a.a(this.a) - cdr_1.a.b(this.a);
    }

    @Override
    public float p() {
        return -(cdr_1.a.a(this.a) + cdr_1.a.b(this.a));
    }

    @Override
    public float q() {
        return cdr_1.a.c(this.a);
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public int s() {
        return 0;
    }
}

