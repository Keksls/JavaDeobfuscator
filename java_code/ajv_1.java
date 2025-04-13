/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from aJv
 */
public abstract class ajv_1
implements ajd_1,
ajw_1 {
    protected final List<ajy_1> j = new ArrayList<ajy_1>();
    protected final Map<String, List<aja_1>> k = new HashMap<String, List<aja_1>>();

    @Override
    public void a(ajy_1 ajy_12) {
        this.j.add(ajy_12);
    }

    @Override
    public void b(ajy_1 ajy_12) {
        this.j.remove(ajy_12);
    }

    @Override
    public void d() {
        this.j.clear();
    }

    @Override
    public void a(String string, aja_1 aja_12) {
        List<aja_1> list = this.k.containsKey(string) ? this.k.get(string) : new ArrayList<aja_1>();
        list.add(aja_12);
        this.k.put(string, list);
    }

    @Override
    public void b(String string, aja_1 aja_12) {
        if (this.k.containsKey(string)) {
            List<aja_1> list = this.k.get(string);
            list.remove(aja_12);
        }
    }

    @Override
    public void e() {
        this.k.clear();
    }

    protected void a(Map<String, String> map, Map<String, String> map2) {
        Set<String> set = Collections.unmodifiableSet(map.keySet());
        Set<String> set2 = Collections.unmodifiableSet(map2.keySet());
        HashSet<String> hashSet2 = new HashSet<String>(map.keySet());
        hashSet2.removeIf(set2::contains);
        for (String hashSet3 : hashSet2) {
            this.a(hashSet3, map.get(hashSet3), null);
        }
        HashSet<String> hashSet4 = new HashSet<String>(map2.keySet());
        hashSet4.removeIf(set::contains);
        Iterator iterator = hashSet4.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            this.a(string2, null, map2.get(string2));
        }
        HashSet<String> hashSet = new HashSet<String>(map.keySet());
        hashSet.removeIf(string -> !set2.contains(string));
        for (String string3 : hashSet) {
            this.a(string3, map.get(string3), map2.get(string3));
        }
    }

    protected void a(String string, String string2, String string3) {
        Object object;
        if (string2 != null && string2.equals(string3)) {
            return;
        }
        if (this.j.size() > 0) {
            object = new ajx_1(this, string, string2, string3);
            for (ajy_1 object2 : this.j) {
                object2.propertyChange((ajx_1)object);
            }
        }
        if (this.k.containsKey(string) && (object = this.k.get(string)).size() > 0) {
            ajz_1 ajz_12 = new ajz_1(this, string2, string3);
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                aja_1 aja_12 = (aja_1)iterator.next();
                aja_12.onPropertyChange(ajz_12);
            }
        }
    }
}

