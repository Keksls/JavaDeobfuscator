/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bQK
 */
public class bqk_0
implements ajh_1 {
    public static final String a = "island";
    public static final String b = "links";
    private final int d;
    private final ArrayList<bqj_0> e = new ArrayList();

    public bqk_0(int n) {
        this.d = n;
    }

    public void a(bqj_0 bqj_02) {
        this.e.add(bqj_02);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            return this.c();
        }
        return null;
    }

    public String a() {
        return bae.h().a(77, (long)this.d, new Object[0]);
    }

    public ArrayList<bqj_0> b() {
        return this.e;
    }

    public ArrayList<bqj_0> c() {
        if (bql_0.g == null || bql_0.g.isEmpty()) {
            return this.e;
        }
        ArrayList<bqj_0> arrayList = new ArrayList<bqj_0>();
        String string = bae.h().a(77, (long)this.d, new Object[0]).toLowerCase();
        String string2 = Cz.o(bql_0.g);
        for (bqj_0 bqj_02 : this.e) {
            String string3 = Cz.o(bqj_02.b().toLowerCase());
            if (!string3.contains(string2) && !string.contains(string2)) continue;
            arrayList.add(bqj_02);
        }
        return arrayList;
    }
}

