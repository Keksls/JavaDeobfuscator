/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fzZ
 */
public class fzz_0 {
    private static final Logger a = Logger.getLogger(fzz_0.class);
    private final ArrayList<fyb_0> b;
    private final int c;
    private final String d;
    private final URL e;
    private final fyq f;
    private static int g = 0;

    protected fzz_0(String string, int n) {
        fpt_0 fpt_02 = fpm_0.b().g(string);
        if (fpt_02 == null) {
            throw new Exception("Ressource invalide : " + string);
        }
        if (fpt_02.a != null) {
            fyq fyq2 = null;
            try {
                fyq2 = fpt_02.a.newInstance();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.e = null;
            this.f = fyq2;
        } else {
            this.f = null;
            this.e = fpt_02.b;
        }
        this.c = n;
        this.d = string;
        this.b = new ArrayList(n);
    }

    private boolean a(fyb_0 fyb_02) {
        if (this.b.size() < this.c) {
            this.b.add(fyb_02);
            return true;
        }
        return false;
    }

    public fyb_0 a() {
        if (this.b.size() > 0) {
            return this.b.remove(0);
        }
        return null;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public boolean d() {
        return this.c > this.b.size();
    }

    public void e() {
        fya_0 fya_02 = fpm_0.b().h();
        while (this.d()) {
            fyb_0 fyb_02 = null;
            fyy_0 fyy_02 = fya_02.a(this.d + g++);
            if (this.f != null) {
                fyb_02 = (fyb_0)this.f.a(fya_02, fyy_02);
            } else if (this.e != null) {
                try {
                    fyb_02 = fpm_0.b().a(this.e, fya_02, fyy_02, false, null, null, null);
                }
                catch (Exception exception) {
                    a.error((Object)("Probl\u00e8me lors du changement d'un xml : " + this.e), (Throwable)exception);
                }
            }
            if (fyb_02 == null) continue;
            if (!this.a(fyb_02)) {
                fyb_02.release();
                continue;
            }
            a.info((Object)("Chargement d'une ressource " + this.d));
        }
    }

    public void f() {
        for (int k = this.b.size() - 1; k >= 0; --k) {
            this.b.get(k).release();
        }
        this.b.clear();
    }
}

