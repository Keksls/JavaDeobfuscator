/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from brV
 */
public abstract class brv_0 {
    protected final brg_1 a;
    protected int b;

    protected brv_0(brg_1 brg_12) {
        this.a = brg_12;
    }

    public void a(int n) {
        this.b = n;
    }

    public int e() {
        return this.b;
    }

    public abstract String a();

    public abstract int b();

    public abstract int c();

    public abstract Collection<brw_0> d();
}

