/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YG
 */
public abstract class yg_0
extends yv_0 {
    private final byte[] h = new byte[aby_2.b(324)];

    @Override
    public boolean a(int n, int n2) {
        return aby_2.a(this.h, (n2 - this.e) * 18 + n - this.d);
    }

    @Override
    public void a(arf_1 arf_12) {
        super.a(arf_12);
        arf_12.b(this.h);
    }

    protected final void a(int n, int n2, boolean bl) {
        aby_2.a(this.h, (n2 - this.e) * 18 + n - this.d, bl);
    }
}

