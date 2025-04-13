/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBf
 */
public abstract class abf_1 {
    protected abe_1 a;
    protected int b;

    protected abf_1() {
        this.a();
    }

    public void a(abe_1 abe_12) {
        this.a = abe_12;
        this.b = abe_12 != null ? abe_12.a() : 0;
    }

    public final void a() {
        this.a = null;
        this.b = 0;
    }

    public boolean b() {
        if (this.a == null) {
            return false;
        }
        return this.b != 0 && this.a.a() == this.b;
    }

    public abe_1 c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}

