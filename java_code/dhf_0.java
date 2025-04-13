/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dhF
 */
public class dhf_0
extends dfc {
    private int a;
    private String b;
    private String c;
    private String d;
    private int e;

    public dhf_0(String string, String string2, String string3, int n, int n2) {
        this(string, string2, string3, n);
        this.a = n2;
    }

    public dhf_0(String string, String string2, String string3, int n) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = n;
    }

    public String k() {
        return this.b;
    }

    public void b(String string) {
        this.b = string;
    }

    public String o() {
        return this.c;
    }

    public void c(String string) {
        this.c = string;
    }

    public String p() {
        return this.d;
    }

    public void d(String string) {
        this.d = string;
    }

    public int q() {
        return this.e;
    }

    public void c(int n) {
        this.e = n;
    }

    public int r() {
        return this.a;
    }

    @Override
    public int a() {
        return 16551;
    }
}

