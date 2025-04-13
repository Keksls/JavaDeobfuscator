/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cER
 */
public abstract class cer_0 {
    private final cel_0 a;
    private final alo_1 b;

    protected cer_0(cel_0 cel_02) {
        this.a = cel_02;
        this.b = null;
    }

    public cer_0(cel_0 cel_02, alo_1 alo_12) {
        this.a = cel_02;
        this.b = alo_12;
    }

    public cel_0 g() {
        return this.a;
    }

    public byte h() {
        return this.a.b();
    }

    public boolean i() {
        return this.b != null;
    }

    public alo_1 j() {
        return this.b;
    }

    public abstract byte c();

    public abstract int d();

    public abstract String e();

    public abstract String f();

    public String toString() {
        return this.e() + " : " + this.f();
    }
}

