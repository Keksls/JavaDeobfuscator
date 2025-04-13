/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TShortArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eqy
 */
public final class eqy_2 {
    protected static final Logger a = Logger.getLogger(eqy_2.class);
    private long b;
    private long c;
    private String d;
    final TIntArrayList e = new TIntArrayList(1);
    final TShortArrayList f = new TShortArrayList(1);
    private long g;

    public long a() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public long b() {
        return this.c;
    }

    public void b(long l) {
        this.c = l;
    }

    public String c() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public void a(int n, short s2) {
        for (int k = this.e.size() - 1; k >= 0; --k) {
            if (this.e.getQuick(k) != n) continue;
            this.f.setQuick(k, (short)(this.f.getQuick(k) + s2));
            return;
        }
        this.e.add(n);
        this.f.add(s2);
    }

    public Iterator<abo_2<Integer, Short>> d() {
        return new eqz_2(this);
    }

    public int e() {
        return this.e.size();
    }

    public long f() {
        return this.g;
    }

    public void c(long l) {
        this.g = l;
    }

    public boolean a(eqy_2 eqy_22) {
        if (eqy_22.b() != this.c || !eqy_22.c().equals(this.d)) {
            return false;
        }
        Iterator<abo_2<Integer, Short>> iterator = eqy_22.d();
        while (iterator.hasNext()) {
            abo_2<Integer, Short> abo_22 = iterator.next();
            this.a(abo_22.a(), abo_22.b());
        }
        this.g += eqy_22.f();
        return true;
    }
}

