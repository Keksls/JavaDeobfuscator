/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Te
 */
public enum te_0 implements td_0
{
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final byte f;

    private te_0(int n2) {
        this.f = (byte)n2;
    }

    @Override
    public byte a() {
        return this.f;
    }

    public tb_0<te_0> a(short s2) {
        return new tb_0<te_0>(this, s2);
    }
}

