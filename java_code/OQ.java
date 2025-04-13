/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public class OQ {
    public static final OQ a = new OQ();
    private final TIntObjectHashMap<op_0> b = new TIntObjectHashMap();
    private final TIntObjectHashMap<op_0> c = new TIntObjectHashMap();

    private OQ() {
    }

    public void a(op_0 op_02) {
        this.b.put(op_02.a(), (Object)op_02);
        int n = op_02.b();
        for (int k = 0; k < n; ++k) {
            this.c.put(op_02.a(k), (Object)op_02);
        }
    }

    public op_0 a(int n) {
        return (op_0)this.b.get(n);
    }

    public op_0 b(int n) {
        return (op_0)this.c.get(n);
    }

    public String toString() {
        return "AchievementListManager{m_listsById=" + this.b + ", m_listsByAchievementId=" + this.c + "}";
    }
}

