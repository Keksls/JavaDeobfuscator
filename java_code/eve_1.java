/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntShortProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TIntShortProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from eVe
 */
public class eve_1 {
    private final int a;
    private final int b;
    private final acz_2 c = new acz_2(1);
    private final int d;
    private final int e;
    private final acy_2<evf_1> f = new acy_2(1);
    private final int g;
    private final apc_2 h;

    public eve_1(int n, int n2, int n3, apc_2 apc_22, int n4, int n5) {
        this.a = n;
        this.d = n2;
        this.g = n3;
        this.h = apc_22;
        this.e = n4;
        this.b = n5;
    }

    public void a(int n, short s2) {
        if (this.c.d(n)) {
            throw new IllegalArgumentException("Une d\u00e9finition de l'item " + n + " existe d\u00e9j\u00e0");
        }
        this.c.a(n, s2);
    }

    public void a(int n, short s2, eyh_1 eyh_12, boolean bl) {
        if (this.f.d(n)) {
            throw new IllegalArgumentException("Une d\u00e9finition de l'item " + n + " existe d\u00e9j\u00e0");
        }
        this.f.a(n, new evf_1(n, s2, eyh_12, bl));
    }

    public boolean a(TIntShortProcedure tIntShortProcedure) {
        for (int k = 0; k < this.c.d(); ++k) {
            if (tIntShortProcedure.execute(this.c.e(k), this.c.h(k))) continue;
            return false;
        }
        return true;
    }

    public Map<Integer, Short> a() {
        HashMap<Integer, Short> hashMap = new HashMap<Integer, Short>();
        for (int k = 0; k < this.c.d(); ++k) {
            hashMap.put(this.c.e(k), this.c.h(k));
        }
        return hashMap;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public boolean a(TObjectProcedure<evf_1> tObjectProcedure) {
        for (int k = 0; k < this.f.d(); ++k) {
            if (tObjectProcedure.execute((Object)this.f.h(k))) continue;
            return false;
        }
        return true;
    }

    public evf_1 d() {
        return this.f.iterator().next();
    }

    public int e() {
        return this.g;
    }

    public apc_2 f() {
        return this.h;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public String toString() {
        return "Exchange{m_id=" + this.a + "}";
    }
}

