/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fyA
 */
public class fya_0 {
    private static Logger a = Logger.getLogger(fya_0.class);
    private final HashMap<String, fyy_0> b = new HashMap();
    private fyy_0 c = null;
    private HashMap<String, fzz> d = null;
    private ArrayList<fzz> e = null;

    @Deprecated
    public fis_1 a() {
        return fis_1.a();
    }

    public void a(fyy_0 fyy_02, String string) {
        this.b.put(string, fyy_02);
    }

    public fyy_0 a(String string) {
        fyy_0 fyy_02 = new fyy_0(string, this);
        this.a(fyy_02, string);
        return fyy_02;
    }

    public void a(String string, String string2) {
        if (string != null && string2 != null) {
            fyy_0 fyy_02 = this.b.remove(string);
            this.b.put(string2, fyy_02);
        }
    }

    public fyb_0 b(String string) {
        if (string == null) {
            return null;
        }
        int n = string.indexOf(46);
        String string2 = n < 0 ? string : string.substring(0, n);
        fyy_0 fyy_02 = this.b.get(string2);
        if (fyy_02 != null) {
            return fyy_02.a(string.substring(n + 1));
        }
        return null;
    }

    public void c(String string) {
        if (this.b != null) {
            fyy_0 fyy_02 = this.b.remove(string);
            if (fyy_02 == this.c) {
                this.c = null;
            }
            if (fyy_02 != null) {
                fyy_02.g();
            }
        }
    }

    public fyy_0 d(String string) {
        return this.b.get(string);
    }

    public fyy_0 b() {
        return this.c;
    }

    public void a(fyy_0 fyy_02) {
        this.c = fyy_02;
    }

    public fzz[] c() {
        if (this.e == null) {
            return null;
        }
        fzz[] fzzArray = new fzz[this.e.size()];
        return this.e.toArray(fzzArray);
    }

    public fzz d() {
        if (this.e != null) {
            return this.e.get(this.e.size() - 1);
        }
        return null;
    }

    public fzz e(String string) {
        if (this.d == null) {
            return null;
        }
        return this.d.get(string);
    }

    public Collection<fzz> e() {
        if (this.d == null) {
            return null;
        }
        return this.d.values();
    }

    public void a(String string, fzz fzz2) {
        if (this.d == null) {
            this.d = new HashMap();
            this.e = new ArrayList();
        }
        this.d.put(string, fzz2);
        this.e.add(fzz2);
    }

    public void f(String string) {
        if (this.d == null) {
            return;
        }
        fzz fzz2 = this.d.get(string);
        this.e.remove(fzz2);
    }

    public void g(String string) {
        fzz fzz2 = this.d.remove(string);
        this.e.remove(fzz2);
    }

    public void a(fzz fzz2) {
        String string = null;
        for (Map.Entry<String, fzz> entry : this.d.entrySet()) {
            if (entry.getValue() != fzz2) continue;
            string = entry.getKey();
            break;
        }
        this.d.remove(string);
        this.e.remove(fzz2);
    }
}

