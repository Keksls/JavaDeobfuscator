/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TShortArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TShortArrayList;

/*
 * Renamed from cbw
 */
public abstract class cbw_2 {
    private final TIntArrayList a = new TIntArrayList();
    private final TShortArrayList b = new TShortArrayList();
    private int c = -1;
    private short d = 0;

    protected abstract void a();

    protected final void a(int n) {
        int n2 = this.a.indexOf(n);
        if (n2 == -1) {
            n2 = this.a.size();
            this.a.add(n);
            this.b.add((short)0);
        }
        this.b.setQuick(n2, (short)(this.b.getQuick(n2) + 1));
    }

    int b() {
        return this.c;
    }

    short c() {
        return this.d;
    }

    private void d() {
        this.d = 0;
        this.c = -1;
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            short s2 = this.b.getQuick(k);
            if (s2 <= this.d) continue;
            this.d = s2;
            this.c = this.a.getQuick(k);
        }
    }

    void e() {
        int n;
        this.d = 0;
        this.c = -1;
        int n2 = 0;
        int n3 = this.b.size();
        for (n = 0; n < n3; ++n) {
            n2 += this.b.getQuick(n);
        }
        n = Hw.a(n2);
        for (int k = 0; k < n3; ++k) {
            if ((n -= this.b.getQuick(k)) >= 0) continue;
            this.c = this.a.getQuick(k);
            this.d = this.b.getQuick(k);
            return;
        }
    }
}

