/*
 * Decompiled with CFR 0.152.
 */
public class cYS
extends cux_0 {
    private static final cYS f = new cYS();
    private exk_2 g = null;
    private byte h;

    private cYS() {
        this.b = apm_0.a();
        ((aNF)ans_0.D().c()).a((apm_0)this.b);
    }

    public static cYS o() {
        return f;
    }

    public void a(exk_2 exk_22, byte by) {
        this.g = exk_22;
        this.h = by;
    }

    public exk_2 p() {
        return this.g;
    }

    @Override
    protected Sm a() {
        return this.g;
    }

    @Override
    protected void a(int n, int n2, short s2) {
        cnf cnf2 = new cnf();
        cnf2.a(this.a.a_());
        cnf2.b(this.g.a());
        cnf2.a(this.h);
        cnf2.a(n, n2, s2);
        azu_0.j().K().c(cnf2);
    }

    @Override
    protected void c() {
        if (this.a == azu_0.j().k()) {
            azu_0.j().k().a(this.g);
        }
    }

    @Override
    protected String g() {
        if (this.g != null) {
            return (String)this.g.b("iconUrl");
        }
        return null;
    }

    @Override
    protected byte d() {
        return 0;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void e() {
        super.e();
        if (this.g != null && this.a != null) {
            ((apm_0)this.b).a(this.g, this.a);
        }
    }

    @Override
    protected String f() {
        return "";
    }

    @Override
    public boolean n() {
        return bPg.b(this.g);
    }
}

