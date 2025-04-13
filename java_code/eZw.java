/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class eZw
implements UF,
gq_1<yk_1>,
Serializable {
    private static final Logger b = Logger.getLogger(eZw.class);
    public static final eZw a = new eZt();
    private Map<Byte, eze_0> c = new HashMap<Byte, eze_0>();
    private int d;
    private int e;
    private byte f;
    @Deprecated
    private final Map<ext_1, Integer> g = new HashMap<ext_1, Integer>();

    public int b() {
        return this.c.size();
    }

    public long a(tc_0 tc_02) {
        return this.c.values().stream().filter(eze_02 -> eze_02.c() == tc_02).count();
    }

    public Map<Byte, eze_0> c() {
        return this.c;
    }

    public eze_0 b(byte by) {
        if (!this.c.containsKey(by)) {
            return null;
        }
        return this.c.get(by);
    }

    public byte a(eze_0 eze_02) {
        if (!this.c.containsValue(eze_02)) {
            return -1;
        }
        return this.c.entrySet().stream().filter(entry -> entry.getValue() == eze_02).map(Map.Entry::getKey).findFirst().orElse((byte)-1);
    }

    public boolean a(byte by, eze_0 eze_02) {
        if (by < 0) {
            return false;
        }
        this.c.put(by, eze_02);
        return true;
    }

    void a(Map<Byte, eze_0> map) {
        this.c = map;
    }

    public boolean c(byte by) {
        eze_0 eze_02 = this.b(by);
        if (eze_02 == null) {
            return true;
        }
        switch (by) {
            default: 
        }
        byte by2 = tc_0.a.a();
        return by2 == eze_02.c().a();
    }

    public byte d() {
        return this.f;
    }

    public void d(byte by) {
        this.f = by;
    }

    public void e(byte by) {
        this.f = this.f < 0 ? by : (byte)(this.f + by);
    }

    public boolean e() {
        return this.c.values().stream().anyMatch(eze_0::g);
    }

    public boolean f(byte by) {
        return this.c.containsKey(by) && this.c.get(by).g();
    }

    public boolean b(byte by, int n) {
        if (!this.a(by, n)) {
            return false;
        }
        this.c.get(by).a(n);
        return true;
    }

    public boolean a(byte by, int n) {
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return false;
        }
        if (((ezr_0)r2).ab() == null) {
            return false;
        }
        if (!this.c.containsKey(by)) {
            return false;
        }
        return this.c.get(by).c() != tc_0.a;
    }

    public int a(byte by) {
        if (!this.f(by)) {
            throw new eyp_1("We are trying to remove shard from empty or unexisting slot");
        }
        int n = this.c.get(by).a();
        this.c.get(by).a(0);
        return n;
    }

    public int f() {
        Optional optional = this.c.keySet().stream().max(Byte::compareTo);
        return optional.map(this::a).orElse(-1);
    }

    public boolean h() {
        if (this.c.size() < 2) {
            return true;
        }
        for (eze_0 eze_02 : this.c.values()) {
            if (!this.c.values().stream().anyMatch(eze_03 -> eze_03.c() != eze_02.c())) continue;
            return false;
        }
        return true;
    }

    public boolean i() {
        if (this.c.size() <= 0) {
            return false;
        }
        return this.c.values().stream().anyMatch(eze_02 -> eze_02.c() != tc_0.a);
    }

    public int j() {
        return this.c.values().stream().mapToInt(eze_0::d).sum();
    }

    @Override
    public boolean a(ext_1 ext_12) {
        Integer n = this.g.get(ext_12);
        return n != null && n > 0;
    }

    public int a(int n) {
        ext_1 ext_12 = ext_1.a(n);
        return this.g.containsKey(ext_12) ? this.g.get(ext_12) : 0;
    }

    public void a(ext_1 ext_12, int n) {
        this.g.put(ext_12, n);
    }

    public void b(ext_1 ext_12) {
        this.g.remove(ext_12);
    }

    public Map<ext_1, Integer> k() {
        return this.g;
    }

    public int l() {
        return this.d;
    }

    public void b(int n) {
        this.d = n;
    }

    public boolean m() {
        return this.d > 0;
    }

    public int n() {
        return this.e;
    }

    public void c(int n) {
        this.e = n;
    }

    public boolean o() {
        return this.e > 0;
    }

    public boolean a() {
        return true;
    }

    @Override
    public boolean a(yk_1 yk_12) {
        Object object;
        for (Map.Entry<Byte, eze_0> entry : this.c.entrySet()) {
            object = entry.getValue();
            ym_2 ym_22 = new ym_2();
            ym_22.a = entry.getKey();
            ym_22.c = ((eze_0)object).c().a();
            ym_22.d = ((eze_0)object).d();
            ym_22.b = ((eze_0)object).a();
            yk_12.a.add(ym_22);
        }
        for (Map.Entry<Object, Serializable> entry : this.g.entrySet()) {
            object = new yl_1();
            ((yl_1)object).a = Hw.b((long)((ext_1)entry.getKey()).a());
            ((yl_1)object).b = (Integer)entry.getValue();
            yk_12.b.add((yl_1)object);
        }
        yk_12.c = this.d;
        yk_12.d = this.e;
        yk_12.e = this.f;
        return true;
    }

    @Override
    public boolean b(yk_1 yk_12) {
        int n;
        byte by;
        this.c = new HashMap<Byte, eze_0>();
        for (ym_2 gs_02 : yk_12.a) {
            by = gs_02.a;
            if (by < 0) {
                b.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer un eclat sur un slot invalide : " + by), (Throwable)new Exception());
                continue;
            }
            n = gs_02.b;
            if (eyo_1.g().d(n) == null) {
                b.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer un eclat inconnu d'id : " + n), (Throwable)new Exception());
                gs_02.b = 0;
                continue;
            }
            boolean bl = this.a(by, new eze_0(n, gs_02.c, gs_02.d));
            if (bl) continue;
            b.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer une cr\u00e9er un slot \u00e0 une position invalide : " + by), (Throwable)new Exception());
        }
        this.g.clear();
        for (yl_1 yl_12 : yk_12.b) {
            ext_1 ext_12;
            by = yl_12.a;
            n = yl_12.b;
            if (n != 0 && (ext_12 = eyo_1.g().d(n)) == null) {
                b.warn((Object)("Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation, on essaye de placer un eclat inconnu d'id : " + n), (Throwable)new Exception());
                yl_12.b = 0;
                continue;
            }
            ext_12 = ext_1.a(by);
            if (ext_12 == null) {
                b.fatal((Object)("Saved an item with unknown propertyId : " + by));
                yl_12.b = 0;
                yl_12.a = 0;
                continue;
            }
            this.g.put(ext_12, n);
        }
        this.d = yk_12.c;
        this.e = yk_12.d;
        this.f = yk_12.e;
        return true;
    }

    @Override
    public String g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("shards(");
        for (int k = 0; k < this.c.size(); ++k) {
            stringBuilder.append(this.c.get(k));
            if (k >= this.c.size() - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public eZw p() {
        eZw eZw2 = new eZw();
        eZw2.c = new HashMap<Byte, eze_0>();
        for (Map.Entry<Byte, eze_0> entry : this.c.entrySet()) {
            byte by = entry.getKey();
            eze_0 eze_02 = entry.getValue();
            eZw2.a(by, eze_02.h());
        }
        eZw2.g.putAll(this.g);
        eZw2.d = this.d;
        eZw2.e = this.e;
        eZw2.f = this.f;
        return eZw2;
    }

    @Override
    public boolean a(eZw eZw2) {
        if (this.d != eZw2.d) {
            return false;
        }
        if (this.e != eZw2.e) {
            return false;
        }
        if (this.c.size() != eZw2.c.size()) {
            return false;
        }
        for (Map.Entry<Byte, eze_0> entry : this.c.entrySet()) {
            eze_0 eze_02;
            byte by = entry.getKey();
            if (!eZw2.c.containsKey(by)) {
                return false;
            }
            eze_0 eze_03 = entry.getValue();
            if (eze_03.a(eze_02 = eZw2.c.get(by))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append("m_sublimationItemId:").append(this.d).append(',');
        stringBuilder.append("m_specialSublimationItemId:").append(this.e).append(',');
        String string = this.c.entrySet().stream().map(entry -> String.join((CharSequence)":", ((Byte)entry.getKey()).toString(), ((eze_0)entry.getValue()).toString())).collect(Collectors.joining(","));
        stringBuilder.append("m_slots:{").append(string).append("}}");
        return stringBuilder.toString();
    }

    public String q() {
        boolean bl = this.c.isEmpty();
        String string = bl ? "" : this.c.values().stream().map(eze_02 -> String.valueOf(eze_02.c().a())).collect(Collectors.joining(","));
        String string2 = bl ? "" : this.c.values().stream().map(eze_02 -> String.valueOf(eze_02.d())).collect(Collectors.joining(","));
        String string3 = bl ? "" : this.c.values().stream().map(eze_02 -> String.valueOf(eze_02.f())).collect(Collectors.joining(","));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append("colors:[").append(string).append("],");
        stringBuilder.append("shards:[").append(string2).append("],");
        stringBuilder.append("levels:[").append(string3).append("],");
        stringBuilder.append("sub_id:").append(this.d).append(',');
        stringBuilder.append("ep_sub_id:").append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

