/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asE
 */
public abstract class ase_2 {
    protected byte b;
    private final int a;
    private final int c;

    protected ase_2(int n, int n2) {
        this.c = n;
        this.a = n2;
        this.b = (byte)(this.c ^ n2);
    }

    protected final void p() {
        this.b = (byte)((long)this.b + ((long)this.c * this.a() + (long)this.a));
    }

    protected abstract long a();
}

