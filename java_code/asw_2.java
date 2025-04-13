/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from asw
 */
public class asw_2 {
    public static final String a = "id";
    private static final Logger c = Logger.getLogger(asw_2.class);
    private String d = "";
    private static final asw_2 e = new asw_2();
    private final THashMap<String, asv_2> f = new THashMap();

    public static asw_2 a() {
        return e;
    }

    private asw_2() {
    }

    public void a(String string) {
        this.d = string;
    }

    public static String a(int n) {
        return n + ".bin";
    }

    private asv_2 b(asu_2 asu_22) {
        return new asv_2(this.c(asu_22), asu_22.a());
    }

    private String c(asu_2 asu_22) {
        int n = asu_22.a();
        return String.format(this.d, n, n);
    }

    public asv_2 a(asu_2 asu_22) {
        String string = this.c(asu_22);
        asv_2 asv_22 = (asv_2)this.f.get((Object)string);
        if (asv_22 == null) {
            asv_22 = this.b(asu_22);
            this.f.put((Object)asv_22.a(), (Object)asv_22);
            assert (asv_22.a().equals(string));
        }
        return asv_22;
    }

    public void a(asv_2 asv_22) {
        this.f.remove((Object)asv_22.a());
    }

    public void b() {
        this.f.clear();
    }

    public <T extends asu_2> void a(T t, asb_2<T> asb_22) {
        asv_2 asv_22 = this.a(t);
        c.trace((Object)(t.getClass().getSimpleName() + ": " + asv_22.b() + " entr\u00e9es"));
        asv_22.a(t, asb_22);
        this.a(asv_22);
    }

    public <T extends asu_2> boolean a(int n, T t) {
        asv_2 asv_22 = this.a(t);
        return asv_22.a(n, t);
    }

    public <T extends asu_2> boolean a(int n, T t, asb_2<T> asb_22) {
        if (this.a(n, t)) {
            asb_22.load(t);
            return true;
        }
        c.error((Object)("Object inconnu d'id=" + n));
        return false;
    }

    public <T extends asu_2> void a(T t, String string, int n, asb_2<T> asb_22) {
        asv_2 asv_22 = this.a(t);
        asv_22.a(t, string, n, asb_22);
        this.a(asv_22);
    }
}

