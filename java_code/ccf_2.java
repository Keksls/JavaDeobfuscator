/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ccf
 */
public class ccf_2
extends avc_1 {
    private static final Logger e = Logger.getLogger(ccf_2.class);
    private abY f;

    private static String f() {
        try {
            return azs_0.a().a("shadersPath");
        }
        catch (gm_0 gm_02) {
            e.error((Object)"", (Throwable)gm_02);
            return "";
        }
    }

    public ccf_2() {
        super(ccf_2.f() + "rain.cgfx", "rain0", new ava_1(new aut_1("gStrength", auu_1.a), new aut_1("threshold", auu_1.a), new aut_1("camera", auu_1.c), new aut_1("high", auu_1.b), new aut_1("low", auu_1.b), new aut_1("highlight", auu_1.a)));
    }

    public void a(float f2) {
        this.d.a("highlight", f2);
    }

    public void a(abY abY2) {
        this.f = abY2;
    }

    public void b(float f2) {
        this.d.a("gStrength", f2);
    }

    public void c(float f2) {
        this.d.a("threshold", f2);
    }

    @Override
    public void a(int n) {
        float f2 = (float)this.c / 1000.0f;
        float f3 = 0.1f;
        float f4 = 0.01f;
        float f5 = this.f.e_();
        float f6 = this.f.f_();
        float f7 = (float)Math.sin(f2 * 0.1f);
        float f8 = (float)Math.cos(f2 * 0.1f);
        float f9 = (float)Math.sin(f2 * 0.01f);
        float f10 = (float)Math.cos(f2 * 0.01f);
        this.d.a("low", f9, f10);
        this.d.a("high", f7, f8);
        this.d.a("camera", f5, f6, this.f.f());
        super.a(n);
    }
}

