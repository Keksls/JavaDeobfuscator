/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public enum eZh {
    a(ezi_1.a, (Map<exh_2, Integer>)ImmutableMap.builder().build()),
    b(ezi_1.b, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20696).build()),
    c(ezi_1.c, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20697).build()),
    d(ezi_1.d, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20698).build()),
    e(ezi_1.e, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20699).build()),
    f(ezi_1.f, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20700).build()),
    g(ezi_1.g, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20701).build()),
    h(ezi_1.h, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20702).build()),
    i(ezi_1.i, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20703).build()),
    j(ezi_1.j, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20704).build()),
    k(ezi_1.k, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20705).build()),
    l(ezi_1.l, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20706).build()),
    m(ezi_1.m, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)20707).build()),
    n(ezi_1.n, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)22126).build()),
    o(ezi_1.o, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)29391).build()),
    p(ezi_1.p, (Map<exh_2, Integer>)ImmutableMap.builder().put((Object)exh_2.r, (Object)32312).build());

    private final ezi_1 q;
    private final Map<exh_2, Integer> r;

    private eZh(ezi_1 ezi_12, Map<exh_2, Integer> map) {
        this.q = ezi_12;
        this.r = map;
    }

    public Map<exh_2, Integer> a() {
        return this.r;
    }

    public Map<exh_2, Long> b() {
        HashMap<exh_2, Long> hashMap = new HashMap<exh_2, Long>();
        for (Map.Entry<exh_2, Integer> entry : this.r.entrySet()) {
            hashMap.put(entry.getKey(), (long)entry.getValue());
        }
        return hashMap;
    }

    public short c() {
        return this.q.a();
    }

    public static eZh a(short s2) {
        eZh eZh2 = null;
        for (eZh eZh3 : eZh.values()) {
            if (eZh3.q.a() == s2) {
                return eZh3;
            }
            int n = s2 - eZh3.q.a();
            if (eZh2 == null) {
                eZh2 = eZh3;
                continue;
            }
            if (n <= 0 || n >= s2 - eZh2.q.a()) continue;
            eZh2 = eZh3;
        }
        return eZh2;
    }
}

