/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

/*
 * Renamed from aAX
 */
public abstract class aax_2
implements afm_2 {
    protected static final Logger a = Logger.getLogger(aax_2.class);
    protected final DataSource b;
    protected final ArrayList<agg_1> c;
    protected int d;
    protected String e;
    protected final int f;
    protected final String g;
    protected final String h;
    protected final int i;
    protected final String j;
    protected final String k;
    private HashMap<String, Class<?>> l = new HashMap();

    protected aax_2(String string, String string2, String string3, String string4, int n, int n2) {
        this.g = string;
        this.h = string2;
        this.i = n2;
        this.j = string3;
        this.k = string4;
        this.c = new ArrayList();
        this.f = n;
        this.b = this.a(string, string2, string3, string4, n2);
    }

    protected abstract DataSource a(String var1, String var2, String var3, String var4, int var5);

    public DataSource a() {
        return this.b;
    }

    public void b() {
        for (int k = 0; k < this.f; ++k) {
            agg_1 agg_12 = new agg_1(this.b);
            agg_12.a(this.e + "_" + k);
            agg_12.a(this.l);
            this.c.add(agg_12);
            agg_12.start();
        }
    }

    public void c() {
        for (agg_1 agg_12 : this.c) {
            agg_12.d(false);
            try {
                agg_12.join();
            }
            catch (InterruptedException interruptedException) {
                a.error((Object)"Thread interrupted : ", (Throwable)interruptedException);
            }
        }
    }

    public boolean d() {
        for (agg_1 agg_12 : this.c) {
            boolean bl = agg_12.b();
            int n = agg_12.c();
            if (!bl && n <= 0) continue;
            return false;
        }
        return true;
    }

    public boolean a(agf_1 agf_12) {
        agg_1 agg_12 = null;
        if (ot_2.a.b("dispatch")) {
            int n = Integer.MAX_VALUE;
            for (agg_1 agg_13 : this.c) {
                if (agg_13.c() > n) continue;
                agg_12 = agg_13;
                n = agg_13.c();
            }
        } else {
            agg_12 = (agg_1)Iterables.getFirst(this.c, null);
        }
        if (agg_12 == null) {
            a.error((Object)"Pas de cannal disponible pour poster la requ\u00eate");
            return false;
        }
        agg_12.a(agf_12);
        return true;
    }

    public boolean a(agf_1 agf_12, int n) {
        try {
            agg_1 agg_12 = this.c.get(n);
            agg_12.a(agf_12);
            return true;
        }
        catch (Exception exception) {
            a.error((Object)aho_2.a(exception));
            return false;
        }
    }

    public adt_1 b(agf_1 agf_12) {
        agg_1 agg_12 = null;
        if (ot_2.a.b("dispatch")) {
            int n = Integer.MAX_VALUE;
            for (agg_1 agg_13 : this.c) {
                if (agg_13.c() > n) continue;
                agg_12 = agg_13;
                n = agg_13.c();
            }
        } else {
            agg_12 = (agg_1)Iterables.getFirst(this.c, null);
        }
        if (agg_12 == null) {
            a.error((Object)"Pas de cannal disponible pour poster la requ\u00eate");
            return null;
        }
        return agg_12.b(agf_12);
    }

    public adt_1 b(agf_1 agf_12, int n) {
        try {
            agg_1 agg_12 = this.c.get(n);
            return agg_12.b(agf_12);
        }
        catch (Exception exception) {
            a.error((Object)"Exception during executeRequest", (Throwable)exception);
            return null;
        }
    }

    public int e() {
        return this.c.size();
    }

    @Override
    public String f() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    @Override
    public int g() {
        return this.d;
    }

    @Override
    public void a(int n) {
        this.d = n;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public String j() {
        return this.j;
    }

    public void a(HashMap<String, Class<?>> hashMap) {
        this.l = hashMap;
    }

    @Deprecated
    public int[] k() {
        int n = this.c.size();
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            nArray[k] = this.c.get(k).c();
            for (int n2 : nArray) {
                a.trace((Object)(n2 + " - "));
            }
            a.trace((Object)"");
        }
        return nArray;
    }

    @Deprecated
    public agg_1 b(int n) {
        if (n >= 0 && n < this.c.size()) {
            return this.c.get(n);
        }
        return null;
    }
}

