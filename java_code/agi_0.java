/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
 * Renamed from agI
 */
public class agi_0
extends ajv_1
implements aje_1 {
    protected static final Map<List<ags_0>, agi_0> a = new LinkedHashMap<List<ags_0>, agi_0>();
    protected final List<ags_0> b;
    protected final Map<ags_0, ajb_1> c = new EnumMap<ags_0, ajb_1>(ags_0.class);
    protected final Map<String, String> d = new HashMap<String, String>();
    protected final Map<String, String> e = Collections.synchronizedMap(new HashMap());
    protected final Map<String, String> f = Collections.synchronizedMap(new HashMap());
    protected final ajy_1 g = ajx_12 -> {
        String string = ajx_12.b();
        this.a(string, this.a(string));
    };
    protected final Map<ags_0, ajc_1> h = new HashMap<ags_0, ajc_1>();
    protected final agr_0 i = new agj_0(this);

    public static agi_0 a(agk_0<?, ?> agk_02, List<ags_0> list) {
        int n = list.size();
        for (List<ags_0> list2 : a.keySet()) {
            if (list2.size() != n) continue;
            boolean bl = true;
            for (int k = 0; k < n && bl; ++k) {
                bl = list.get(k).equals((Object)list2.get(k));
            }
            if (!bl) continue;
            return a.get(list2);
        }
        agi_0 agi_02 = new agi_0(agk_02, list);
        a.put(list, agi_02);
        return agi_02;
    }

    protected final List<ajb_1> a() {
        ArrayList<ajb_1> arrayList = new ArrayList<ajb_1>();
        for (ags_0 ags_02 : this.b) {
            ajb_1 ajb_12 = this.c.get((Object)ags_02);
            if (ajb_12 == null) continue;
            arrayList.add(ajb_12);
        }
        return arrayList;
    }

    protected ajc_1 a(ags_0 ags_02) {
        if (!this.h.containsKey((Object)ags_02)) {
            ajc_1 ajc_12 = ajb_12 -> {
                if (this.c.get((Object)ags_02) == ajb_12) {
                    return;
                }
                this.a(ags_02, ajb_12);
            };
            this.h.put(ags_02, ajc_12);
            return ajc_12;
        }
        return this.h.get((Object)ags_02);
    }

    protected void a(String string, String string2) {
        this.a(string, this.d.get(string), string2);
    }

    @Override
    protected void a(String string, String string2, String string3) {
        if (string2 != null && string2.equals(string3)) {
            return;
        }
        if (Objects.equals(this.d.get(string), string3)) {
            return;
        }
        this.d.put(string, string3);
        super.a(string, string2, string3);
    }

    protected agi_0(agk_0<?, ?> agk_02, List<ags_0> list) {
        this.b = list;
        for (ags_0 object : list) {
            ajb_1 ajb_12 = agk_02.a(object);
            if (ajb_12 == null) continue;
            if (ajb_12.g()) {
                this.a(object, ajb_12);
                continue;
            }
            ajb_12.a(this.a(object));
        }
        agk_02.a(this.i);
        for (ajb_1 ajb_13 : this.c.values()) {
            ajb_13.a(this.g);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(ags_0 ags_02, ajb_1 ajb_12) {
        Map<String, String> map = this.c();
        this.c.put(ags_02, ajb_12);
        Map<String, String> map2 = this.e;
        synchronized (map2) {
            for (Map.Entry<String, String> entry : this.e.entrySet()) {
                ajb_12.b(entry.getKey(), entry.getValue());
            }
            this.e.clear();
        }
        map2 = this.f;
        synchronized (map2) {
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                ajb_12.c(entry.getKey(), entry.getValue());
            }
            this.f.clear();
        }
        map2 = this.c();
        this.a(map, map2);
    }

    protected void b(ags_0 ags_02, ajb_1 ajb_12) {
        Map<String, String> map = this.c();
        this.c.remove((Object)ags_02, ajb_12);
        Map<String, String> map2 = this.c();
        this.a(map, map2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String a(String string) {
        for (ajb_1 ajb_12 : this.a()) {
            if (!ajb_12.a(string, true)) continue;
            return ajb_12.a(string);
        }
        Map<String, String> map = this.e;
        synchronized (map) {
            return this.e.getOrDefault(string, this.c(string));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<String> b() {
        HashSet<String> hashSet = new HashSet<String>();
        for (ajb_1 ajb_12 : this.a()) {
            hashSet.addAll(ajb_12.b());
        }
        Map<String, String> map = this.e;
        synchronized (map) {
            hashSet.addAll(this.e.keySet());
        }
        map = this.f;
        synchronized (map) {
            hashSet.addAll(this.f.keySet());
        }
        return hashSet;
    }

    @Override
    public Map<String, String> c() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : this.b()) {
            hashMap.put(string, this.a(string));
        }
        return hashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(String string, boolean bl) {
        for (ajb_1 ajb_12 : this.a()) {
            if (!ajb_12.a(string, bl)) continue;
            return true;
        }
        Map<String, String> map = this.e;
        synchronized (map) {
            if (this.e.containsKey(string)) {
                return true;
            }
        }
        if (bl) {
            return false;
        }
        map = this.f;
        synchronized (map) {
            return this.f.containsKey(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(String string) {
        for (ajb_1 ajb_12 : this.a()) {
            if (!ajb_12.b(string)) continue;
            return true;
        }
        Map<String, String> map = this.f;
        synchronized (map) {
            return this.f.containsKey(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String c(String string) {
        for (ajb_1 ajb_12 : this.a()) {
            if (!ajb_12.b(string)) continue;
            return ajb_12.c(string);
        }
        Map<String, String> map = this.f;
        synchronized (map) {
            return this.f.getOrDefault(string, "");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void d(String string) {
        String string2 = this.a(string);
        for (ajb_1 ajb_12 : this.a()) {
            ajb_12.d(string);
        }
        Map<String, String> map = this.e;
        synchronized (map) {
            this.e.remove(string);
        }
        this.a(string, string2, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(String string, String string2) {
        String string3 = this.a(string);
        if (string3 != null && string3.equals(string2)) {
            return;
        }
        List<ajb_1> list = this.a();
        if (list.isEmpty()) {
            Map<String, String> map = this.e;
            synchronized (map) {
                this.e.put(string, string2);
            }
            return;
        }
        list.get(0).b(string, string2);
        this.a(string, string3, string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c(String string, String string2) {
        String string3 = this.c(string);
        if (string3 != null && string3.equals(string2)) {
            return;
        }
        List<ajb_1> list = this.a();
        if (list.isEmpty()) {
            Map<String, String> map = this.f;
            synchronized (map) {
                this.f.put(string, string2);
            }
            return;
        }
        list.get(0).c(string, string2);
        if (this.m(string)) {
            this.a(string, string3, string2);
        }
    }
}

