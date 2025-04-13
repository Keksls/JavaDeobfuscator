/*
 * Decompiled with CFR 0.152.
 */
public class eoj {
    public final int a;
    public final int b;
    public final short c;
    public final long d;

    public eoj(int n, int n2, int n3, long l) {
        this.a = n;
        this.b = n2;
        this.c = (short)n3;
        this.d = l;
    }

    public String toString() {
        return this.a + ":" + this.b + ":" + this.c + " @ " + this.d;
    }
}

