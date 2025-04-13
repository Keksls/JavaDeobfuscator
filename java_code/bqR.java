/*
 * Decompiled with CFR 0.152.
 */
public class bqR
extends bqO {
    private final int n;
    final /* synthetic */ bqQ m;

    bqR(bqQ bqQ2, int n) {
        this.m = bqQ2;
        this.n = n;
    }

    @Override
    public Object b(String string) {
        Object object = super.b(string);
        if (object != null) {
            return object;
        }
        return ((bjw_1)eyo_1.g().d(this.n)).b(string);
    }

    @Override
    public long a() {
        return Math.min(this.c(), this.b());
    }

    @Override
    public long b() {
        return azu_0.j().k().da().a(this.n);
    }

    @Override
    public long e() {
        euw_1 euw_12 = this.m.a().a();
        return euw_12 == null ? 0L : (long)euw_12.a(this.n);
    }

    @Override
    public long f() {
        bqM bqM2 = (bqM)this.m.a().c();
        return bqM2 == null ? 0L : (long)bqM2.a(this.n);
    }

    public int i() {
        return this.n;
    }
}

