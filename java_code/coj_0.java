/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from coj
 */
public class coj_0
extends Pw {
    private final String a;
    private final long b;
    private final long c;

    public coj_0(String string, long l, long l2) {
        this.a = string;
        this.b = l;
        this.c = l2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13625;
    }
}

