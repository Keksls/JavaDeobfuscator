/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhX
 */
public final class bhx_2
implements rr_0 {
    private final int a;
    private final bhj_1 b;
    private final String c;
    private final String d;
    private final bic_1[] e;
    private final boolean f;
    private apc_2 g = aov_2.a;
    private boolean h;
    private final aqe_0[] i;
    private apc_2 j;

    bhx_2(int n, bhj_1 bhj_12, bic_1[] bic_1Array, String string, String string2, boolean bl, aqe_0[] aqe_0Array) {
        this.a = n;
        this.b = bhj_12;
        this.i = aqe_0Array;
        this.c = string != null ? string.intern() : null;
        this.d = string2 != null ? string2.intern() : null;
        this.e = bic_1Array;
        this.f = bl;
    }

    bhx_2(bhx_2 bhx_22, bhj_1 bhj_12, bic_1[] bic_1Array) {
        this.a = bhx_22.a;
        this.b = bhj_12;
        this.c = bhx_22.c;
        this.d = bhx_22.d;
        this.f = bhx_22.f;
        this.i = bhx_22.i;
        this.e = bic_1Array;
    }

    @Override
    public rk_0 a() {
        return bhp_1.a.a(this.b.a());
    }

    public boolean b() {
        return this.h;
    }

    void a(boolean bl) {
        this.h = bl;
    }

    public int c() {
        return this.a;
    }

    public bhj_1 d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public bic_1[] g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    public void i() {
        this.h = false;
    }

    public boolean j() {
        return this.i.length > 0;
    }

    public boolean a(long l) {
        for (aqe_0 aqe_02 : this.i) {
            if (aqe_02.d() != l) continue;
            return true;
        }
        return false;
    }

    public aqe_0 b(long l) {
        for (aqe_0 aqe_02 : this.i) {
            if (aqe_02.d() != l) continue;
            return aqe_02;
        }
        return null;
    }

    public apc_2 k() {
        return this.g;
    }

    public apc_2 l() {
        return this.j;
    }

    public void a(apc_2 apc_22) {
        this.g = apc_22;
    }

    public void b(apc_2 apc_22) {
        this.j = apc_22;
    }
}

