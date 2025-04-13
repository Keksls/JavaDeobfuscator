/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckB
 */
public class ckb_1
extends Pw {
    private String a;
    private String b = "";

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        byte[] byArray2 = Cz.a(this.b);
        abx_22.a(byArray2.length);
        abx_22.b(byArray2);
        return this.a((byte)1, abx_22.c());
    }

    @Override
    public int a() {
        return 483;
    }

    public void a(String string) {
        this.a = string;
    }

    public void b(String string) {
        this.b = string;
    }
}

