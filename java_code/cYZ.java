/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class cYZ
extends cux_0 {
    private static final cYZ f = new cYZ();
    private bpl_0 g = null;

    private cYZ() {
        this.b = apt_0.a();
        ((aNF)ans_0.D().c()).a((apt_0)this.b);
    }

    public static cYZ o() {
        return f;
    }

    public void a(bpl_0 bpl_02) {
        this.g = bpl_02;
    }

    public bpl_0 p() {
        return this.g;
    }

    @Override
    protected Sm a() {
        return this.g;
    }

    @Override
    protected void a(int n, int n2, short s2) {
        cnn_0 cnn_02 = new cnn_0();
        cnn_02.a(this.a.a_());
        cnn_02.b(this.g.a());
        cnn_02.a(n, n2, s2);
        azu_0.j().K().c(cnn_02);
    }

    @Override
    protected void c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.a == bmr_12) {
            bmr_12.a(this.g);
        }
    }

    @Override
    @Nullable
    protected String f() {
        if (this.a == null) {
            return "";
        }
        bvx_2 bvx_22 = this.a.bz();
        if (bvx_22 == null) {
            return "";
        }
        blx_1 blx_12 = (blx_1)bvx_22.d(cyp_0.g().h());
        if (blx_12 == null) {
            return "";
        }
        if (this.g == null) {
            return "";
        }
        if (!bPg.a(this.g)) {
            return "";
        }
        float f2 = blx_12.hp();
        if (f2 >= 1.0f) {
            return bae.h().a("desc.healRes", (int)f2);
        }
        return "";
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
        return 1;
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
            ((apt_0)this.b).a(this.g, this.a);
        }
    }

    @Override
    public boolean n() {
        return bPg.b(this.g);
    }
}

