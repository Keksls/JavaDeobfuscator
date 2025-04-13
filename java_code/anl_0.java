/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from anL
 */
public final class anl_0 {
    protected static final Logger a = Logger.getLogger(anl_0.class);
    private static final anl_0 b = new anl_0();
    private ann_1 c;
    private final HashMap<anm_0, ant_1> d = new HashMap();
    private final HashMap<String, anr_1> e = new HashMap();
    private final HashMap<String, ans_1> f = new HashMap();

    private anl_0() {
    }

    public static anl_0 a() {
        return b;
    }

    public void a(ann_1 ann_12) {
        this.c = ann_12;
    }

    public final void a(akx_2 akx_22, String string, String string2, String string3, String string4, ant_1 ant_12) {
        anm_0 anm_02 = new anm_0(this, akx_22, string, string2, string3, string4);
        this.d.put(anm_02, ant_12);
    }

    public final ant_1 a(akx_2 akx_22, String string, String string2, String string3, String string4) {
        anm_0 anm_02 = new anm_0(this, akx_22, string, string2, string3, string4);
        return this.d.get(anm_02);
    }

    public final ant_1 b(akx_2 akx_22, String string, String string2, String string3, String string4) {
        anm_0 anm_02 = new anm_0(this, akx_22, string, string2, string3, string4);
        return this.d.remove(anm_02);
    }

    public final void a(String string, ans_1 ans_12) {
        this.f.put(string, ans_12);
        this.c.a(ans_12);
    }

    public final void a(String string) {
        ans_1 ans_12 = this.f.remove(string);
        if (ans_12 != null) {
            this.c.b(ans_12);
        } else {
            a.error((Object)("Aucun DialogUnloadListener n'est enregistr\u00e9 pour " + string));
        }
    }

    public final void a(String string, anr_1 anr_12) {
        this.e.put(string, anr_12);
        this.c.a(anr_12);
    }

    public final void b(String string) {
        anr_1 anr_12 = this.e.remove(string);
        if (anr_12 != null) {
            this.c.b(anr_12);
        } else {
            a.error((Object)("Aucun DialogLoadListener n'est enregistr\u00e9 pour " + string));
        }
    }

    public void a(akx_2 akx_22) {
        Set<Map.Entry<anm_0, ant_1>> set = this.d.entrySet();
        ArrayList<anm_0> arrayList = new ArrayList<anm_0>();
        for (Map.Entry<anm_0, ant_1> entry : set) {
            if (entry.getKey().e() != akx_22) continue;
            arrayList.add(entry.getKey());
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            this.d.remove(arrayList.get(k));
        }
    }

    public void c(String string) {
        Set<Map.Entry<anm_0, ant_1>> set = this.d.entrySet();
        ArrayList<anm_0> arrayList = new ArrayList<anm_0>();
        for (Map.Entry<anm_0, ant_1> entry : set) {
            if (!entry.getKey().b().equals(string)) continue;
            arrayList.add(entry.getKey());
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            this.d.remove(arrayList.get(k));
        }
    }

    public void b() {
        this.d.clear();
    }
}

