/*
 * Decompiled with CFR 0.152.
 */
public class eCB
extends ecv_0 {
    private short b;
    private short c;

    public eCB(int n) {
        super(n);
    }

    public eCB(int n, byte by) {
        super(n, by);
    }

    public void a(short s2) {
        this.b = s2;
    }

    public void b(short s2) {
        this.c = s2;
    }

    @Override
    public short c() {
        return (short)(this.e() + this.d());
    }

    @Override
    public short d() {
        return this.b;
    }

    @Override
    public short e() {
        return this.c;
    }
}

