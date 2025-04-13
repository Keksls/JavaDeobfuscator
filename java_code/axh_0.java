/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXH
 */
public final class axh_0
extends aXj {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    private final byte d;
    private short e;
    private boolean f;

    public axh_0() {
        this.d = 0;
    }

    public axh_0(boolean bl) {
        this.d = 1;
        this.f = bl;
    }

    public axh_0(short s2) {
        this.d = (byte)2;
        this.e = s2;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        Pt pt = new Pt();
        pt.a((byte)1);
        pt.a((short)129);
        pt.b(this.d);
        if (this.d == 2) {
            pt.b(this.e);
        } else if (this.d == 1) {
            pt.a(this.f);
        }
        aaw_2 aaw_22 = azu_0.j().K();
        aaw_22.c(pt);
    }
}

