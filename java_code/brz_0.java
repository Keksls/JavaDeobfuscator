/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brZ
 */
public class brz_0
extends brt_1 {
    private final boolean m;
    private final boolean n;

    public brz_0(int n, ece_0 ece_02) {
        super(n, ece_02);
        this.n = brP.a.a(n);
        this.m = ecn_0.a.a(this.l).i() != 0;
    }

    @Override
    public short h() {
        return 0;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public boolean j() {
        return this.m;
    }

    @Override
    public boolean k() {
        return this.n;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public String[] d() {
        return b_;
    }
}

