/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from epW
 */
public class epw_1
implements RI {
    private final int a;
    private final int b;
    private final epy_1 c;
    private final TIntArrayList d;
    private final TIntArrayList e;

    public epw_1(int n, int n2, epy_1 epy_12) {
        this.a = n;
        this.b = n2;
        this.c = epy_12;
        this.d = new TIntArrayList();
        this.e = new TIntArrayList();
    }

    public void a(int n) {
        if (!this.d.contains(n)) {
            this.d.add(n);
        }
    }

    public void b(int n) {
        if (!this.e.contains(n)) {
            this.e.add(n);
        }
    }

    public int b() {
        return this.a;
    }

    public TIntArrayList c() {
        return this.d;
    }

    public TIntArrayList d() {
        return this.e;
    }

    @Override
    public int a() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public epy_1 f() {
        return this.c;
    }
}

