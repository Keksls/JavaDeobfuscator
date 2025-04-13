/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from fAX
 */
public abstract class fax_2 {
    private static final Logger d = Logger.getLogger(fax_2.class);
    protected final THashMap<String, fzy<?>> a = new THashMap();
    protected final THashMap<String, String> b = new THashMap();
    protected final THashMap<Class<?>, fzy<?>> c = new THashMap();

    protected fax_2() {
        this.a();
    }

    protected abstract void a();

    public void a(String string, Class<?> clazz) {
        this.a(string, new fzx(clazz));
    }

    public void a(String string, fzy<?> fzy2) {
        String string2 = string.toLowerCase();
        if (this.a.containsKey((Object)string2)) {
            d.error((Object)("le tag (name=" + string + ") est d\u00e9j\u00e0 utilis\u00e9 !"));
            return;
        }
        this.b.put((Object)string2, (Object)string);
        this.a.put((Object)string2, fzy2);
        this.c.put(fzy2.g(), fzy2);
    }

    public boolean a(String string) {
        this.b.remove((Object)string.toLowerCase());
        fzy fzy2 = (fzy)this.a.remove((Object)string.toLowerCase());
        if (fzy2 != null) {
            this.c.remove(fzy2.g());
        }
        return null != fzy2;
    }

    public Map<String, fzy<?>> b() {
        return this.a;
    }

    public fzy<?> b(String string) {
        return (fzy)this.a.get((Object)string.toLowerCase());
    }

    public fzy<?> a(Class<?> clazz) {
        return (fzy)this.c.get(clazz);
    }
}

