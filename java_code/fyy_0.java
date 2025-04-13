/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.THashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fyy
 */
public class fyy_0
implements Iterable<fyb_0> {
    private static final Logger d = Logger.getLogger(fyy_0.class);
    public static final char a = '.';
    public static final String b = "~";
    private static final String e = "\\\\.";
    public static final String c = "#";
    private String f;
    private HashMap<String, fyb_0> g;
    private final HashMap<String, fit_1> h = new HashMap();
    private fya_0 i;
    private HashMap<String, fim_1> j = null;
    private fyy_0 k = null;
    private ArrayList<fyy_0> l = null;
    private THashMap<String, String> m = new THashMap();

    public fyy_0(String string, fya_0 fya_02) {
        this.f = string;
        this.i = fya_02;
    }

    public void a(String string, fyb_0 fyb_02) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        if (fyb_02 != null && string != null && this.g.get(string) != fyb_02) {
            fyb_02.setId(string);
            this.g.put(string, fyb_02);
        }
    }

    public fyb_0 a(String string) {
        return this.a(string, true);
    }

    public fyb_0 a(String string, boolean bl) {
        fyy_0 fyy_02;
        fyb_0 fyb_02;
        String[] stringArray = StringUtils.split((String)string, (String)e, (int)2);
        String string2 = string;
        String string3 = null;
        String string4 = null;
        int n = -1;
        if (stringArray.length >= 1) {
            string2 = stringArray[0];
        }
        if (stringArray.length >= 2) {
            string4 = stringArray[1];
        }
        if ((stringArray = StringUtils.split((String)string2, (String)c, (int)2)).length >= 1) {
            string2 = stringArray[0];
        }
        if (stringArray.length >= 2) {
            n = Co.a((Object)stringArray[1], -1);
        }
        if ((stringArray = StringUtils.split((String)string2, (String)b, (int)2)).length >= 1) {
            string2 = stringArray[0];
        }
        if (stringArray.length >= 2) {
            string3 = stringArray[1];
        }
        fyb_0 fyb_03 = fyb_02 = this.g != null ? this.g.get(string2) : null;
        if (fyb_02 == null && this.k != null && bl) {
            fyb_02 = this.k.a(string2);
        }
        if (fyb_02 instanceof fai_2 && n != -1) {
            fyb_02 = ((fai_2)((Object)fyb_02)).getWidget(string3, n);
        }
        if (string4 != null && fyb_02 instanceof ftj_0 && (fyy_02 = ((ftj_0)fyb_02).getInnerElementMap()) != null) {
            fyb_02 = fyy_02.a(string4);
        }
        return fyb_02;
    }

    @Nullable
    public <T extends fyb_0> T a(String string, Predicate<fyb_0> predicate) {
        LinkedList<fyy_0> linkedList = new LinkedList<fyy_0>();
        linkedList.add(this);
        while (!linkedList.isEmpty()) {
            fyy_0 fyy_02 = (fyy_0)linkedList.remove(0);
            fyb_0 fyb_02 = fyy_02.a(string);
            if (fyb_02 != null && predicate.test(fyb_02)) {
                return (T)fyb_02;
            }
            if (fyy_02.l == null) continue;
            linkedList.addAll(fyy_02.l);
        }
        return null;
    }

    public fya_0 a() {
        return this.i;
    }

    public void a(fya_0 fya_02) {
        if (fya_02 != this.i) {
            this.i = fya_02;
            for (int k = this.l.size() - 1; k >= 0; --k) {
                this.l.get(k).a(this.i);
            }
        }
    }

    public String b() {
        if (this.k != null) {
            return this.k.b();
        }
        return this.f;
    }

    public String c() {
        return this.f;
    }

    public boolean b(String string) {
        if (string == null) {
            return false;
        }
        if (string.equalsIgnoreCase(this.f) || fpm_0.b().b(this.f, string)) {
            this.i(string);
            return true;
        }
        return false;
    }

    private void i(String string) {
        String string2 = this.f;
        this.i.a(this.f, string);
        this.f = string;
        if (this.l != null) {
            for (int k = this.l.size() - 1; k >= 0; --k) {
                fyy_0 fyy_02 = this.l.get(k);
                if (fyy_02.c() == null) continue;
                String string3 = this.f + fyy_02.c().substring(string2.length());
                fyy_02.i(string3);
            }
        }
    }

    public boolean c(String string) {
        if (string == null) {
            return false;
        }
        return this.a(string) != null;
    }

    public boolean a(String string, String string2) {
        if (string == null && string2 == null || string != null && string.equalsIgnoreCase(string2)) {
            return true;
        }
        if (this.g == null || this.g.containsKey(string2) || !this.g.containsKey(string)) {
            return false;
        }
        fyb_0 fyb_02 = this.g.remove(string);
        if (string2 != null) {
            this.g.put(string2, fyb_02);
        }
        return true;
    }

    @Override
    @NotNull
    public Iterator<fyb_0> iterator() {
        return this.g.values().iterator();
    }

    public void d(String string) {
        if (this.g != null) {
            this.g.remove(string);
        }
    }

    public void a(fyb_0 fyb_02) {
        if (fyb_02 == null || this.g == null) {
            return;
        }
        String string = fyb_02.getId();
        if (string == null) {
            for (Map.Entry<String, fyb_0> entry : this.g.entrySet()) {
                if (entry.getValue() != fyb_02) continue;
                string = entry.getKey();
                break;
            }
        }
        if (string != null) {
            this.g.remove(string);
        }
    }

    private void b(fyy_0 fyy_02) {
        if (this.l == null) {
            this.l = new ArrayList(5);
        }
        this.l.add(fyy_02);
    }

    private void c(fyy_0 fyy_02) {
        if (this.l == null) {
            return;
        }
        this.l.remove(fyy_02);
    }

    public ArrayList<fyy_0> d() {
        return this.l;
    }

    public void a(fyy_0 fyy_02) {
        if (this.k != null) {
            this.k.c(this);
        }
        this.k = fyy_02;
        if (this.k != null) {
            this.k.b(this);
        }
    }

    public fyy_0 e() {
        return this.k;
    }

    public void a(fit_1 fit_12) {
        this.h.put(fit_12.a(), fit_12);
    }

    public fit_1 e(String string) {
        fit_1 fit_12 = this.h.get(string);
        if (fit_12 == null && this.k != null) {
            fit_12 = this.k.e(string);
        }
        return fit_12;
    }

    public Collection<fit_1> f() {
        return this.h.values();
    }

    public void g() {
        if (this.g != null) {
            this.g.clear();
            this.g = null;
        }
        if (this.j != null) {
            this.j.clear();
        }
        for (fit_1 fit_12 : this.h.values()) {
            fis_1.a().c(fit_12);
        }
        if (this.l != null) {
            for (int k = this.l.size() - 1; k >= 0; --k) {
                this.l.get(k).g();
            }
            this.l.clear();
            this.l = null;
        }
        this.h.clear();
        this.f = null;
        this.k = null;
    }

    public void a(String string, fim_1 fim_12) {
        if (this.j == null) {
            this.j = new HashMap();
        }
        this.j.put(string, fim_12);
    }

    public fim_1 f(String string) {
        fim_1 fim_12 = null;
        if (this.j != null) {
            fim_12 = this.j.get(string);
        }
        if (fim_12 == null && this.k != null) {
            fim_12 = this.k.f(string);
        }
        return fim_12;
    }

    public boolean g(String string) {
        boolean bl = false;
        if (this.j != null) {
            bl = this.j.containsKey(string);
        }
        if (!bl && this.k != null) {
            bl = this.k.g(string);
        }
        return bl;
    }

    public void h(String string) {
        fim_1 fim_12 = null;
        if (this.j != null) {
            fim_12 = this.j.remove(string);
        }
        if (this.k != null && fim_12 == null) {
            this.k.h(string);
        }
    }

    public void b(String string, String string2) {
        if (this.m == null) {
            this.m = new THashMap();
        }
        this.m.put((Object)string, (Object)string2);
    }

    public String c(String string, String string2) {
        String string3 = (String)this.m.get((Object)string);
        fyy_0 fyy_02 = this.k;
        while (string3 == null && fyy_02 != null) {
            string3 = fyy_02.c(string, string2);
            fyy_02 = fyy_02.k;
        }
        return string3 == null ? string2 : string3;
    }
}

