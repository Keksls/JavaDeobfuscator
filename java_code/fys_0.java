/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fys
 */
public final class fys_0 {
    public static final fys_0 a = new fys_0();
    private final Map<String, azj_2> b = new HashMap<String, azj_2>();
    private final Map<String, azj_2> c = new HashMap<String, azj_2>();

    private fys_0() {
    }

    public void a(fzb fzb2, azj_2 azj_22) {
        if (fzb2 == null) {
            return;
        }
        this.a(fzb2.a(), azj_22);
    }

    public void a(String string, azj_2 azj_22) {
        if (Cz.f(string) || azj_22 == null) {
            return;
        }
        this.c.put(string, azj_22);
    }

    public azj_2 a(@NotNull String string) {
        return this.b.get(string);
    }

    public azj_2 a(@NotNull String string, float f2) {
        azj_2 azj_22 = this.b.get(string);
        if (azj_22 == null) {
            return null;
        }
        azf_2 azf_22 = new azf_2(azj_22);
        azf_22.b(f2);
        return azf_22;
    }

    public azj_2 a(@NotNull fzb fzb2) {
        return this.a(fzb2.a());
    }

    public azj_2 a(@NotNull fzb fzb2, float f2) {
        return this.a(fzb2.a(), f2);
    }

    public boolean b(String string) {
        return this.b.containsKey(string);
    }

    public List<String> a() {
        return new ArrayList<String>(this.b.keySet());
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public Map<String, azj_2> c() {
        HashMap<String, azj_2> hashMap = new HashMap<String, azj_2>();
        for (Map.Entry<String, azj_2> entry : this.c.entrySet()) {
            azj_2 azj_22;
            String string = entry.getKey();
            if (this.b(string, azj_22 = entry.getValue())) continue;
            fyw_0.a.warn("Following color {} not updated because isn't valid (Cf previous log for cause)", (Object)string);
            hashMap.put(string, azj_22);
        }
        hashMap.forEach(this.c::remove);
        this.b.putAll(this.c);
        this.c.clear();
        return hashMap;
    }

    private boolean b(String string, azj_2 azj_22) {
        if (!azj_22.f()) {
            return true;
        }
        String string2 = azj_22.g();
        if (!this.c.containsKey(string2) && !this.b(string2)) {
            fyw_0.a.error("[THEME] Following color {} try to reference following unknown color {}", (Object)string, (Object)string2);
            return false;
        }
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(string2);
        HashMap<String, azj_2> hashMap = new HashMap<String, azj_2>();
        hashMap.put(string2, this.c.containsKey(string2) ? this.c.get(string2) : this.a(string2));
        boolean bl = true;
        while (bl) {
            bl = false;
            for (Map.Entry entry : new HashMap(hashMap).entrySet()) {
                azj_2 azj_23 = (azj_2)entry.getValue();
                String string3 = (String)entry.getKey();
                if (!azj_23.f()) continue;
                String string4 = azj_23.g();
                if (hashSet.contains(string4)) {
                    fyw_0.a.error("[THEME] Following color {} try to reference following color {} but he need itself (Cyclic dependency) [Colors used : {}]", new Object[]{string3, string4, hashSet, string});
                    return false;
                }
                if (!this.c.containsKey(string4) && !this.b(string4)) {
                    fyw_0.a.error("[THEME] Following color {} try to reference following unknown color {}", new Object[]{string3, string4, string});
                    return false;
                }
                if (!bl) {
                    hashMap.clear();
                    bl = true;
                }
                hashSet.add(string4);
                hashMap.put(string4, this.c.containsKey(string4) ? this.c.get(string4) : this.a(string4));
            }
        }
        return true;
    }
}

