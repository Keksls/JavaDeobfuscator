/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBv
 */
public final class cbv_0
extends Pw {
    private final String a;

    public cbv_0(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.a);
        abx_2 abx_22 = new abx_2();
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)2, abx_22.c());
    }

    @Override
    public int a() {
        return 22913;
    }
}

