/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fIQ
 */
public class fiq_1 {
    private static Logger a = Logger.getLogger(fiq_1.class);
    private Object b;
    private fit_1 c;

    private fiq_1(Object object) {
        this.b = object;
    }

    public static fiq_1 a(Object object, String string, fyy_0 fyy_02, ftj_0 ftj_02) {
        if (object instanceof ajf_1) {
            fit_1 fit_12 = null;
            if (fyy_02 == null) {
                fit_12 = fis_1.a().f(string);
            }
            if (fit_12 == null) {
                fit_12 = new fit_1(string, fyy_02, true);
                fis_1.a().a(fit_12);
            }
            fit_12.a(object, false);
            fiq_1 fiq_12 = new fiq_1(object);
            fiq_12.a(fit_12);
            fit_12.a(fiq_12);
            return fiq_12;
        }
        return new fiq_1(object);
    }

    public static void a(fiq_1 fiq_12) {
        if (fiq_12 == null || fiq_12.b() == null) {
            return;
        }
        fiq_12.b().b(fiq_12);
    }

    public void a(Object object) {
        this.b = object;
    }

    public Object a() {
        return this.b;
    }

    public void a(fit_1 fit_12) {
        this.c = fit_12;
    }

    public fit_1 b() {
        return this.c;
    }

    public Object a(String string) {
        if (this.b != null && this.b instanceof ajf_1 && string != null) {
            return fit_1.a(this.b, string);
        }
        return null;
    }
}

