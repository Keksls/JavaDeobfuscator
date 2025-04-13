/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYY
 */
public class cyy_0
extends cux_0 {
    private static final cyy_0 f = new cyy_0();
    private exk_2 g = null;
    private byte h;
    private bpl_0 i = null;

    private cyy_0() {
        this.b = apm_0.a();
        ((aNF)ans_0.D().c()).a((apm_0)this.b);
    }

    public static cyy_0 o() {
        return f;
    }

    public void a(bpl_0 bpl_02) {
        this.i = bpl_02;
    }

    public bpl_0 p() {
        return this.i;
    }

    public void a(exk_2 exk_22, byte by) {
        this.g = exk_22;
        this.h = by;
    }

    public exk_2 q() {
        return this.g;
    }

    @Override
    protected Sm a() {
        return this.g;
    }

    @Override
    protected void a(int n, int n2, short s2) {
        cnm_0 cnm_02 = new cnm_0();
        cnm_02.a(this.a.a_());
        cnm_02.c(this.g.a());
        cnm_02.a(this.h);
        cnm_02.b(this.i.a());
        cnm_02.a(n, n2, s2);
        azu_0.j().K().c(cnm_02);
    }

    @Override
    protected void c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.a == bmr_12) {
            bmr_12.a(this.g);
            bmr_12.a(this.i);
        }
    }

    @Override
    protected String g() {
        if (this.g != null) {
            return (String)this.g.b("smallIconUrl");
        }
        return null;
    }

    @Override
    protected byte d() {
        return 2;
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
        return bPg.b(this.i) || bPg.b(this.g);
    }
}

