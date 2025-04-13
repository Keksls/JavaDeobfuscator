/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHZ
 */
public class bhz_0
implements ajh_1 {
    public static final String a = "item";
    public static final String b = "damageNbElements";
    public static final String d = "resNbElements";
    public static final String e = "checkedDamageNbElements";
    public static final String f = "checkedResNbElements";
    public static final String g = "damageElements";
    public static final String h = "resElements";
    public static final String i = "damageNbElementsText";
    public static final String j = "resNbElementsText";
    public static final String k = "canValid";
    public static final bhz_0 l = new bhz_0();
    public static final int m = efc_0.p.a();
    public static final int n = efc_0.q.a();
    private exk_2 o;
    private final TIntIntHashMap p = new TIntIntHashMap();
    private final TIntObjectHashMap<ArrayList<bHq>> q = new TIntObjectHashMap();

    private bhz_0() {
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.o;
        }
        if (b.equals(string)) {
            return this.b(m);
        }
        if (d.equals(string)) {
            return this.b(n);
        }
        if (i.equals(string)) {
            return bae.h().a("damage.bonusElementsReset", this.b(m));
        }
        if (j.equals(string)) {
            return bae.h().a("resist.bonusElementsReset", this.b(n));
        }
        if (k.equals(string)) {
            return this.b(m) == this.c(m) && this.b(n) == this.c(n);
        }
        if (e.equals(string)) {
            return this.c(m);
        }
        if (f.equals(string)) {
            return this.c(n);
        }
        if (g.equals(string)) {
            return this.q.get(m);
        }
        if (h.equals(string)) {
            return this.q.get(n);
        }
        return null;
    }

    public boolean a(int n) {
        return this.b(n) < this.c(n);
    }

    public int b(int n) {
        return this.p.get(n);
    }

    public int c(int n) {
        int n2 = 0;
        for (bHq bHq2 : (ArrayList)this.q.get(n)) {
            if (!bHq2.b()) continue;
            ++n2;
        }
        return n2;
    }

    public exk_2 a() {
        return this.o;
    }

    public void a(exk_2 exk_22) {
        this.o = exk_22;
        this.b(exk_22);
    }

    public void b(exk_2 exk_22) {
        Object object2;
        this.p.clear();
        this.q.clear();
        for (Object object2 : exk_22) {
            int n = object2.j();
            if (n != m && n != bhz_0.n) continue;
            int n2 = (int)object2.a(1);
            this.p.put(n, n2);
        }
        ArrayList arrayList = new ArrayList();
        object2 = new ArrayList();
        for (efa_0 efa_02 : eyj_1.a) {
            arrayList.add(new bHq(box_0.a(efa_02)));
            ((ArrayList)object2).add(new bHq(box_0.a(efa_02)));
        }
        this.q.put(m, (Object)arrayList);
        this.q.put(n, object2);
    }

    public byte d(int n) {
        HashSet<efa_0> hashSet = new HashSet<efa_0>();
        for (bHq bHq2 : (ArrayList)this.q.get(n)) {
            if (!bHq2.b()) continue;
            hashSet.add(bHq2.a().b());
        }
        return eyj_1.a(hashSet);
    }
}

