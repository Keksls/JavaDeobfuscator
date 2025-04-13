/*
 * Decompiled with CFR 0.152.
 */
public final class aac
extends ZZ {
    public short b;

    @Override
    public float a() {
        return this.b;
    }

    @Override
    public String b() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c() {
        this.b = 0;
    }

    @Override
    public void a(float f2) {
        this.b = (short)f2;
    }

    @Override
    public void a(ZY zY) {
        this.b = (short)zY.f();
    }
}

