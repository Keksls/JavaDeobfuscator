/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from ezw
 */
public final class ezw_2 {
    private final int a;
    private final Set<ezv_2> b = new HashSet<ezv_2>();
    private final TIntArrayList c;

    public ezw_2(int n, TIntArrayList tIntArrayList) {
        this.a = n;
        this.c = tIntArrayList;
        this.c.sort();
    }

    public void a(ezv_2 ezv_22) {
        if (ezv_22 == null) {
            return;
        }
        this.b.add(ezv_22);
    }

    public int a() {
        return this.a;
    }

    public <T extends ezv_2> Set<T> b() {
        return new HashSet<ezv_2>(this.b);
    }

    public boolean a(short s2) {
        return this.c.contains((int)s2);
    }

    public int b(short s2) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            if (s2 >= this.c.get(k)) continue;
            return k;
        }
        return n;
    }

    public int c(short s2) {
        for (int n : this.c.toArray()) {
            if (n <= s2) continue;
            return n;
        }
        return -1;
    }

    public int a(int n) {
        if (n <= 0) {
            return 0;
        }
        int n2 = this.c.size();
        if (n > n2) {
            return this.c.get(n2 - 1);
        }
        return this.c.get(n - 1);
    }

    public int c() {
        if (this.c.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return this.c.get(0);
    }

    public String toString() {
        return "AptitudeCategoryModel{m_id=" + this.a + ", m_bonusSet=" + this.b + ", m_activationLevels=" + this.c + "}";
    }
}

