/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from chd
 */
public abstract class chd_1<M extends adt_1, F extends bwh_0>
implements chc_1<M, F> {
    protected F a;
    private int b = 0;

    @Override
    public void a(F f2) {
        this.a = f2;
    }

    @Override
    public abstract boolean a(M var1);

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final void a(int n) {
        this.b = n;
    }
}

