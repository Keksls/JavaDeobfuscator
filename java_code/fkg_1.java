/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;
import java.util.HashMap;

/*
 * Renamed from fKg
 */
public class fkg_1 {
    private long a = 0L;
    private fyb_0 b = null;
    private String c = null;
    private fpt_0 d = null;
    private short e = 0;
    private fyy_0 f = null;
    private fyb_0 g = null;
    private URL h = null;
    private int i = Integer.MAX_VALUE;
    private String j = null;
    private String k = null;
    private String l = null;
    private String m = null;
    private boolean n = false;
    private boolean o = false;
    private int p = 0;
    private int q = 0;
    private HashMap<String, String> r = null;

    public fkg_1 a(String string) {
        this.d = fpt_0.a(string);
        return this;
    }

    public fkg_1 a(fpt_0 fpt_02) {
        this.d = fpt_02;
        return this;
    }

    public fkg_1 a(fyy_0 fyy_02) {
        this.f = fyy_02;
        return this;
    }

    public fkg_1 b(String string) {
        this.c = string;
        return this;
    }

    public fkg_1 a(short s2) {
        this.e = s2;
        return this;
    }

    public fkg_1 a(long l) {
        this.a = l;
        return this;
    }

    public fkg_1 a(fyb_0 fyb_02) {
        this.g = fyb_02;
        return this;
    }

    public fkg_1 a(int n) {
        this.i = n;
        return this;
    }

    public fkg_1 a(URL uRL) {
        this.h = uRL;
        return this;
    }

    public fkg_1 a(boolean bl) {
        this.n = bl;
        return this;
    }

    public fkg_1 c(String string) {
        this.k = string;
        return this;
    }

    public fkg_1 d(String string) {
        this.l = string;
        return this;
    }

    public fkg_1 e(String string) {
        this.j = string;
        return this;
    }

    public fkg_1 f(String string) {
        this.m = string;
        return this;
    }

    public fkg_1 b(boolean bl) {
        this.o = bl;
        return this;
    }

    public fkg_1 b(int n) {
        this.p = n;
        return this;
    }

    public fkg_1 c(int n) {
        this.q = n;
        return this;
    }

    public fkg_1 b(fyb_0 fyb_02) {
        this.b = fyb_02;
        return this;
    }

    public void a(String string, String string2) {
        if (this.r == null) {
            this.r = new HashMap();
        }
        this.r.put(string, string2);
    }

    public fkf_1 a() {
        return new fkf_1(this.d, this.b, this.c, this.f, this.g, this.k, this.l, this.j, this.m, this.n, this.o, this.p, this.q, this.h, this.i, this.a, this.e, this.r);
    }
}

