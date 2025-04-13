/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from coi
 */
public class coi_0
extends Pw {
    private final String a;
    private final String b;

    public coi_0(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        byte[] byArray2 = Cz.a(this.b);
        abx_22.a(byArray2.length);
        abx_22.b(byArray2);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13448;
    }
}

