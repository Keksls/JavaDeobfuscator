/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAv
 */
public abstract class aav_1
extends Enum<aav_1> {
    public static final /* enum */ aav_1 a = new aaw_1();
    public static final /* enum */ aav_1 b = new aax_1();
    public static final /* enum */ aav_1 c = new aay_1();
    public static final /* enum */ aav_1 d = new aaz_1();
    public static final /* enum */ aav_1 e = new aaa_1();
    protected aaq_1 f;
    protected int g;
    protected int h;
    protected float i;
    protected float j;
    protected aas_1 k;
    protected aas_1 l;
    protected int m = -1;
    protected int n;
    private static final /* synthetic */ aav_1[] o;

    public static aav_1[] values() {
        return (aav_1[])o.clone();
    }

    public static aav_1 valueOf(String string) {
        return Enum.valueOf(aav_1.class, string);
    }

    public aaq_1 a(int n, int n2, aaq_1 aaq_12) {
        return this.a(n, n2, aaq_12, aas_1.b, aas_1.b);
    }

    public abstract aaq_1 a(int var1, int var2, aaq_1 var3, aas_1 var4, aas_1 var5);

    protected final void b(int n, int n2, aaq_1 aaq_12, aas_1 aas_12, aas_1 aas_13) {
        this.m = -1;
        this.f = aaq_12;
        this.g = n;
        this.h = n2;
        this.i = (float)this.f.c / (float)this.g;
        this.j = (float)this.f.d / (float)this.h;
        this.k = aas_12;
        this.l = aas_13;
    }

    protected final boolean a(int n, int n2) {
        if (n == this.m) {
            n = this.n;
        } else {
            this.m = n;
            switch (this.k) {
                case a: {
                    if (n < this.f.c) break;
                    n = -1;
                    break;
                }
                case b: {
                    if (n < this.f.c) break;
                    n %= this.f.c;
                    break;
                }
                case c: {
                    if (n < this.f.c) break;
                    if ((n /= this.f.c) % 2 == 0) {
                        n %= this.f.c;
                        break;
                    }
                    n %= this.f.c;
                    n = this.f.c - n - 1;
                    break;
                }
                case d: {
                    n = (int)(this.i * (float)n);
                }
            }
            this.n = n;
        }
        if (n < 0) {
            return false;
        }
        switch (this.l) {
            case a: {
                if (n2 < this.f.d) break;
                n2 = -1;
                break;
            }
            case b: {
                if (n2 < this.f.d) break;
                n2 %= this.f.d;
                break;
            }
            case c: {
                if (n2 < this.f.d) break;
                if ((n2 /= this.f.d) % 2 == 0) {
                    n2 %= this.f.d;
                    break;
                }
                n2 %= this.f.d;
                n2 = this.f.d - n2 - 1;
                break;
            }
            case d: {
                n2 = (int)(this.j * (float)n2);
            }
        }
        if (n2 < 0) {
            return false;
        }
        return this.f.b[n][n2];
    }

    static {
        o = new aav_1[]{a, b, c, d, e};
    }
}

