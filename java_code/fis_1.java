/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fIS
 */
public class fis_1
implements ajj_1 {
    private static final Logger a = Logger.getLogger(fis_1.class);
    private static final fis_1 b = new fis_1();
    private final Map<String, fit_1> c = new HashMap<String, fit_1>();
    private final List<fit_1> d = new ArrayList<fit_1>();
    private final List<fit_1> e = new ArrayList<fit_1>();
    private final Collection<fit_1> f = new ArrayList<fit_1>();
    private final List<fjc_1> g = new ArrayList<fjc_1>();

    private fis_1() {
    }

    public static fis_1 a() {
        return b;
    }

    public void a(fjc_1 fjc_12) {
        if (fjc_12 != null) {
            this.g.add(fjc_12);
        }
    }

    public void b(fjc_1 fjc_12) {
        if (fjc_12 != null) {
            this.g.remove(fjc_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(fit_1 fit_12) {
        if (!fit_12.c()) {
            this.c.put(fit_12.a(), fit_12);
        }
        List<fit_1> list = this.d;
        synchronized (list) {
            this.d.add(fit_12);
        }
        this.a(fjb_1.a, fit_12);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b() {
        int n = this.f.size();
        if (n == 0) {
            return false;
        }
        Collection<fit_1> collection = this.f;
        synchronized (collection) {
            this.e.addAll(this.f);
            this.f.clear();
        }
        for (int k = 0; k < n; ++k) {
            this.e.get(k).p();
        }
        this.e.clear();
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(fit_1 fit_12) {
        Collection<fit_1> collection = this.f;
        synchronized (collection) {
            if (fit_12 != null && !this.f.contains(fit_12)) {
                this.f.add(fit_12);
            }
        }
    }

    public void a(String string) {
        this.c(this.c.get(string));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(fit_1 fit_12) {
        if (fit_12 == null) {
            return;
        }
        if (!fit_12.c()) {
            this.c.remove(fit_12.a());
        }
        List<fit_1> list = this.d;
        synchronized (list) {
            this.d.remove(fit_12);
        }
        this.a(fjb_1.b, fit_12);
    }

    @Override
    public void a(String string, Object object) {
        this.a(string, object, false);
    }

    public void a(String string, Object object, boolean bl) {
        fit_1 fit_12 = this.c.get(string);
        if (fit_12 == null) {
            fit_12 = new fit_1(string, null);
            this.a(fit_12);
        }
        fit_12.a(object, bl);
    }

    public void a(String string, Object object, String string2) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string2);
        if (fyy_02 != null) {
            this.a(string, object, fyy_02);
        }
    }

    public void a(String string, Object object, fyy_0 fyy_02) {
        this.a(string, object, fyy_02, false);
    }

    public void a(String string, Object object, fyy_0 fyy_02, boolean bl) {
        if (fyy_02 == null) {
            this.a(string, object);
        } else {
            fit_1 fit_12 = fyy_02.e(string);
            if (fit_12 == null) {
                fit_12 = new fit_1(string, fyy_02);
                this.a(fit_12);
                fyy_02.a(fit_12);
            }
            fit_12.a(object, bl);
        }
    }

    public void a(String string, String string2, Object object) {
        fit_1 fit_12 = this.c.get(string);
        if (fit_12 != null) {
            fit_12.a(string2, object);
        } else {
            a.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
        }
    }

    public void a(String string, String string2, Object object, String string3) {
        this.a(string, string2, object, fpm_0.b().h().d(string3));
    }

    public void a(String string, String string2, Object object, fyy_0 fyy_02) {
        if (fyy_02 == null) {
            this.a(string, string2, object);
        } else {
            fit_1 fit_12 = fyy_02.e(string);
            if (fit_12 != null) {
                fit_12.a(string2, object);
            } else {
                a.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
            }
        }
    }

    public void b(String string, String string2, Object object) {
        fit_1 fit_12 = this.c.get(string);
        if (fit_12 != null) {
            fit_12.c(string2, object);
        } else {
            a.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(ajf_1 ajf_12, String ... stringArray) {
        acy_2<Object> acy_22 = new acy_2<Object>();
        List<fit_1> list = this.d;
        synchronized (list) {
            int n = this.d.size();
            for (int k = 0; k < n; ++k) {
                fit_1 fit_12 = this.d.get(k);
                Object object = fit_12.f();
                if (object == null || !object.equals(ajf_12)) continue;
                fit_12.a(stringArray, acy_22);
            }
        }
    }

    public void a(String string, String string2) {
        fit_1 fit_12 = this.c.get(string);
        if (fit_12 != null) {
            fit_12.f(string2);
        } else {
            a.warn((Object)("La d\u00e9finition d'une valeur de champ " + string2 + " est impossible sur la propri\u00e9t\u00e9 " + string));
        }
    }

    public void a(String string, String string2, fyy_0 fyy_02) {
        if (fyy_02 == null) {
            this.a(string, string2);
        } else {
            fit_1 fit_12 = fyy_02.e(string);
            if (fit_12 != null) {
                fit_12.f(string2);
            } else {
                a.warn((Object)("La d\u00e9finition d'une valeur de champ est impossible sur la propri\u00e9t\u00e9 " + string));
            }
        }
    }

    public String b(String string) {
        fit_1 fit_12 = this.c.get(string);
        if (fit_12 != null) {
            return fit_12.g();
        }
        return null;
    }

    public boolean c(String string) {
        fit_1 fit_12 = this.c.get(string);
        return fit_12 != null && fit_12.h();
    }

    public boolean b(String string, String string2) {
        return this.a(string, fpm_0.b().h().d(string2));
    }

    public boolean a(String string, fyy_0 fyy_02) {
        fit_1 fit_12 = fyy_02 == null ? this.c.get(string) : fyy_02.e(string);
        return fit_12 != null && fit_12.h();
    }

    public int d(String string) {
        fit_1 fit_12 = this.c.get(string);
        return fit_12 != null ? fit_12.i() : 0;
    }

    public int c(String string, String string2) {
        return this.b(string, fpm_0.b().h().d(string2));
    }

    public int b(String string, fyy_0 fyy_02) {
        fit_1 fit_12 = fyy_02 == null ? this.c.get(string) : fyy_02.e(string);
        return fit_12 != null ? fit_12.i() : 0;
    }

    public float c(String string, fyy_0 fyy_02) {
        fit_1 fit_12 = fyy_02 == null ? this.c.get(string) : fyy_02.e(string);
        return fit_12 != null ? fit_12.l() : 0.0f;
    }

    public Object e(String string) {
        fit_1 fit_12 = this.c.get(string);
        if (fit_12 != null) {
            return fit_12.f();
        }
        return null;
    }

    public Object d(String string, String string2) {
        return this.d(string, fpm_0.b().h().d(string2));
    }

    public Object d(String string, fyy_0 fyy_02) {
        fit_1 fit_12;
        fit_1 fit_13 = fit_12 = fyy_02 == null ? this.c.get(string) : fyy_02.e(string);
        if (fit_12 != null) {
            return fit_12.f();
        }
        return null;
    }

    public fit_1 f(String string) {
        return this.c.get(string);
    }

    public fit_1 e(String string, String string2) {
        return this.e(string, fpm_0.b().h().d(string2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fit_1 a(ajf_1 ajf_12, fyy_0 fyy_02) {
        List<fit_1> list = this.d;
        synchronized (list) {
            int n = this.d.size();
            for (int k = 0; k < n; ++k) {
                fit_1 fit_12 = this.d.get(k);
                if (fit_12.f() != ajf_12 || fit_12.e() != fyy_02) continue;
                return fit_12;
            }
        }
        return null;
    }

    public fit_1 e(String string, fyy_0 fyy_02) {
        if (fyy_02 == null) {
            return this.f(string);
        }
        return fyy_02.e(string);
    }

    public void a(fjb_1 fjb_12, fit_1 fit_12) {
        if (this.g.isEmpty()) {
            return;
        }
        fja_1 fja_12 = new fja_1(fjb_12, fit_12);
        for (int k = this.g.size() - 1; k >= 0; --k) {
            this.g.get(k).a(fja_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(TObjectProcedure<fit_1> tObjectProcedure) {
        List<fit_1> list = this.d;
        synchronized (list) {
            int n = this.d.size();
            for (int k = 0; k < n; ++k) {
                tObjectProcedure.execute((Object)this.d.get(k));
            }
        }
    }
}

