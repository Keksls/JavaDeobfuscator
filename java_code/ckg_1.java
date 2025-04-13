/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckG
 */
public class ckg_1
extends Pw {
    private String a;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        return this.a((byte)8, abx_22.c());
    }

    @Override
    public int a() {
        return 568;
    }

    public void a(String string) {
        this.a = string;
    }
}

