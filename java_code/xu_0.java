/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from XU
 */
public class xu_0 {
    public static boolean a = true;
    private static final Logger b = Logger.getLogger(xu_0.class);
    private static final xu_0 c = new xu_0();
    private final ArrayList<xr_0> d = new ArrayList();
    private final TIntObjectHashMap<xs_0> e = new TIntObjectHashMap();
    private xp_0 f;
    private static final String g = "(<\\D[^/]+>)|(<.*/\\D>)";
    private static final String h = "[\\xB2]";
    private final ArrayList<Pattern> i = new ArrayList();
    private final ArrayList<Pattern> j = new ArrayList();
    private final ArrayList<Pattern> k = new ArrayList();
    private final ArrayList<Pattern> l = new ArrayList();
    private final ArrayList<Pattern> m = new ArrayList();
    private boolean n = false;

    public static xu_0 a() {
        return c;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    public void a(xs_0 xs_02) {
        this.e.put(xs_02.a(), (Object)xs_02);
    }

    public void a(List<xr_0> list) {
        this.d.clear();
        this.d.addAll(list);
        this.b();
    }

    public void a(xr_0 ... xr_0Array) {
        this.a(Arrays.asList(xr_0Array));
    }

    public void a(xp_0 xp_02) {
        this.k.clear();
        this.j.clear();
        this.l.clear();
        this.m.clear();
        this.i.clear();
        xp_02.a(this);
        if (this.f == null) {
            this.f = xp_02;
        }
    }

    public void b() {
        if (this.f != null) {
            this.a(this.f);
        }
    }

    public void a(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.k.addAll(xt_0.a(tShortObjectHashMap));
    }

    public void b(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.k.addAll(xt_0.b(tShortObjectHashMap));
    }

    public void c(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.i.addAll(xt_0.a(tShortObjectHashMap));
    }

    public void d(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        this.i.addAll(xt_0.b(tShortObjectHashMap));
    }

    public void e(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = xt_0.a(tShortObjectHashMap);
        this.l.addAll(arrayList);
        this.j.addAll(arrayList);
    }

    public void f(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = xt_0.b(tShortObjectHashMap);
        this.m.addAll(arrayList);
        this.j.addAll(arrayList);
    }

    public boolean a(String string) {
        if (!a) {
            return true;
        }
        if (string == null || string.length() == 0) {
            return true;
        }
        String string2 = Cz.e(string);
        return !this.a(string2, this.i) && !this.a(string2, this.j) && !this.a(string2, this.k);
    }

    private boolean a(String string, ArrayList<Pattern> arrayList) {
        return this.b(string, arrayList) != null;
    }

    private Matcher b(String string, ArrayList<Pattern> arrayList) {
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            Pattern pattern = arrayList.get(k);
            Matcher matcher = pattern.matcher(string);
            if (!matcher.find()) continue;
            matcher.reset();
            return matcher;
        }
        return null;
    }

    public String a(String string, boolean bl) {
        if (string == null || string.trim().isEmpty()) {
            return "";
        }
        if (!a) {
            return string;
        }
        String string2 = string.replaceAll(h, "");
        if (this.a(string2, this.k)) {
            return "";
        }
        if (!bl && !this.n) {
            return string2;
        }
        ArrayList<abo_2<Integer, String>> arrayList = new ArrayList<abo_2<Integer, String>>();
        Pattern pattern = Pattern.compile(g);
        Object object = "";
        Matcher matcher = pattern.matcher(string2);
        int n = 0;
        while (matcher.find()) {
            int n2 = matcher.start();
            int n3 = matcher.end();
            String string3 = string2.substring(n2, n3);
            object = (String)object + string2.substring(n, n2);
            arrayList.add(new abo_2<Integer, String>(n2, string3));
            n = n3;
        }
        if (((String)(object = (String)object + string2.substring(n))).isEmpty()) {
            object = string2;
        }
        String string4 = null;
        if (!this.j.isEmpty()) {
            string4 = xt_0.a((String)object, this.j);
        } else if (!this.l.isEmpty() && !this.m.isEmpty()) {
            String string5 = xt_0.b((String)object, this.l);
            string4 = xt_0.b(string5, this.m);
        }
        if (string4 == null) {
            b.error((Object)("[TRANSLATION] No censor pattern matched for languages " + this.d));
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!arrayList.isEmpty()) {
            int n4 = 0;
            for (abo_2 abo_22 : arrayList) {
                int n5 = (Integer)abo_22.a();
                String string6 = (String)abo_22.b();
                int n6 = n5 + string6.length();
                stringBuilder.append(string2.substring(n4, n5)).append(string6);
                n4 = n6;
            }
            stringBuilder.append(string2.substring(n4));
        } else {
            stringBuilder.append(string4);
        }
        return stringBuilder.toString();
    }

    public ArrayList<xr_0> c() {
        return this.d;
    }

    public TIntObjectHashMap<xs_0> d() {
        return this.e;
    }
}

