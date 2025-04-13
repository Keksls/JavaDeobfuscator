/*
 * Decompiled with CFR 0.152.
 */
public class dlw {
    private static final int a = 300;
    private final dly b;
    private final String c;
    private int d = 300;
    private int e = Integer.MAX_VALUE;

    public dlw(dly dly2, String string) {
        this.b = dly2;
        this.c = string;
    }

    public dlw(dly dly2, String string, int n) {
        this.b = dly2;
        this.c = string;
        this.e = n;
    }

    public dlw(dly dly2, String string, int n, int n2) {
        this.b = dly2;
        this.c = string;
        this.d = n;
        this.e = n2;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public dly f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public void a(int n) {
        this.d = n;
    }

    public void b(int n) {
        this.e = n;
    }
}

