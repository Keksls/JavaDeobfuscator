/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bal
 */
public abstract class bal_0
extends bam_0 {
    private static final int o = 999;
    private static final float p = 1.4f;
    protected static final bwi_0 m = new bwi_0();
    private ahh_0 q;
    private double r;
    private final boolean s;
    private final boolean t;
    private int u;
    private int v;
    private short w;

    public bal_0(int n, int n2, int n3, int n4, boolean bl, boolean bl2, long l, int n5, int n6, short s2) {
        super(n, n2, n3, n4);
        this.a(new bZt(this));
        this.b(l);
        this.s = bl;
        this.t = bl2;
        this.u = n5;
        this.v = n6;
        this.w = s2;
    }

    @Override
    public long o() {
        if (this.t) {
            this.e(999);
        }
        return super.o();
    }

    public boolean r() {
        return this.s;
    }

    public boolean s() {
        return this.t;
    }

    public int t() {
        return this.u;
    }

    public void f(int n) {
        this.u = n;
    }

    public int u() {
        return this.v;
    }

    public void g(int n) {
        this.v = n;
    }

    public short v() {
        return this.w;
    }

    public void a(short s2) {
        this.w = s2;
    }

    public abstract short w();

    public boolean x() {
        return false;
    }

    @Nullable
    public sr_0 y() {
        return null;
    }

    @Nullable
    public sr_0 z() {
        return null;
    }
}

