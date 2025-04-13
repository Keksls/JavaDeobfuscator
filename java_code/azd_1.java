/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azD
 */
public class azd_1 {
    public static final int a = 18;
    public int b;
    public int c;
    public final byte[] d = new byte[18];

    public void a(byte[] byArray, abt_1<Integer> abt_12) {
        this.b = aba_1.c(byArray, abt_12);
        this.c = aba_1.c(byArray, abt_12);
        System.arraycopy(byArray, abt_12.a(), this.d, 0, 18);
        abt_12.a(abt_12.a() + 18);
    }

    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c);
        gk_02.a(this.d);
    }
}

