/*
 * Decompiled with CFR 0.152.
 */
public class dhc
extends dfc {
    private final String a;
    private final String b;
    private final int c;
    private final blr_1 d;
    private final ajf_1 e;

    public dhc(String string, String string2, blr_1 blr_12) {
        this(string, string2, blr_12, -1);
    }

    public dhc(String string, String string2, blr_1 blr_12, int n) {
        this(string, string2, blr_12, n, null);
    }

    public dhc(String string, String string2, blr_1 blr_12, int n, ajf_1 ajf_12) {
        this.a = string;
        this.b = string2;
        this.d = blr_12;
        this.c = n;
        this.e = ajf_12;
    }

    public String k() {
        return this.a;
    }

    public String o() {
        return this.b;
    }

    public blr_1 p() {
        return this.d;
    }

    public int q() {
        return this.c;
    }

    public ajf_1 r() {
        return this.e;
    }

    @Override
    public int a() {
        return 16489;
    }
}

