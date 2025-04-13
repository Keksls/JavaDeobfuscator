/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bov
 */
public class bov_1
extends boq_2 {
    public static final String B = "resMaxed";
    public static final String[] C = new String[]{"resMaxed"};
    public static final String[] D = new String[C.length + x.length];
    private final blx_1 E;
    private final epa_1 F;
    private final boolean G;

    public bov_1(epa_1 epa_12, bor_1 bor_12, blx_1 blx_12, epa_1 epa_13, boolean bl) {
        super(epa_12, bor_12);
        this.E = blx_12;
        this.F = epa_13;
        this.G = bl;
    }

    @Override
    public String[] d() {
        return D;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "resMaxed": {
                return this.v() >= 90;
            }
        }
        return super.b(string);
    }

    @Override
    protected Object p() {
        return this.a(false, false);
    }

    @Override
    protected Object s() {
        return this.a(false, true);
    }

    @Override
    protected Object r() {
        return this.a(false, true, false);
    }

    @Override
    protected int a() {
        return this.b(this.w());
    }

    @Override
    protected Object q() {
        return this.a(true, true);
    }

    private int v() {
        return this.c(this.b(this.w()));
    }

    private int w() {
        return this.G ? this.E.c(eps_0.p) : this.E.c(eps_0.u);
    }

    private int a(int n) {
        return this.y.c() + n;
    }

    private int b(int n) {
        return this.y.a() + n;
    }

    private int c(int n) {
        boolean bl = this.E.a(eoz_1.i);
        return (int)Math.round(100.0 - eKj.a(n, bl) * 100.0);
    }

    private String a(boolean bl, boolean bl2) {
        int n = this.w();
        int n2 = this.b(n);
        if (!this.G) {
            int n3 = this.c(n2);
            if (bl2) {
                return bot_1.a(n3, n2);
            }
            return bot_1.a(n3, bl, true, elw_1.dF);
        }
        return bot_1.a(n2, bl, false, elw_1.dF);
    }

    private String a(boolean bl, boolean bl2, boolean bl3) {
        int n = this.w();
        int n2 = this.b(n);
        int n3 = this.a(n);
        if (!this.G) {
            int n4 = this.c(n2);
            if (bl2) {
                return bot_1.a(n4, n2, bl3);
            }
            return bot_1.a(n4, bl, true, bl3);
        }
        return bot_1.a(n2, bl, false, bl3);
    }

    @Override
    protected azj_2 e() {
        if (this.G) {
            return super.e();
        }
        int n = this.w();
        int n2 = this.b(n);
        int n3 = this.c(n2);
        int n4 = this.E.U() + n;
        int n5 = this.c(n4);
        int n6 = this.E.V() + n;
        int n7 = this.c(n6);
        if (n3 == n5 && n3 > n7) {
            return fys_0.a.a(elw_1.cf);
        }
        if (n3 == n7 && n3 < n5) {
            return fys_0.a.a(elw_1.ce);
        }
        return fys_0.a.a(elw_1.cd);
    }

    static {
        System.arraycopy(C, 0, D, 0, C.length);
        System.arraycopy(x, 0, D, C.length, x.length);
    }
}

