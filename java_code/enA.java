/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

class enA {
    private final Map<abn_2, eny_0> a = new HashMap<abn_2, eny_0>();

    enA() {
    }

    public eny_0 a(long l, int n) {
        abn_2 abn_22 = new abn_2(l, n);
        eny_0 eny_02 = this.a.get(abn_22);
        return eny_02 != null ? eny_02 : eny_0.b;
    }

    public void a(long l, int n, eny_0 eny_02) {
        this.a.put(new abn_2(l, n), eny_02);
    }

    public String toString() {
        return "InstanceInteractionLevelsDictionary{m_map=" + this.a + "}";
    }
}

