/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

public abstract class OT {
    private final long a;
    private long b;
    private OT c;
    private final short d;
    private final TLongArrayList e = new TLongArrayList();
    private final ArrayList<OT> f = new ArrayList();
    private final ArrayList<ou_0> g = new ArrayList();

    protected OT(short s2, long l) {
        this.d = s2;
        this.a = l;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    protected void a(ou_0 ou_02) {
        this.g.add(ou_02);
    }

    public int c() {
        return this.g.size();
    }

    public ou_0 a(int n) {
        return this.g.get(n);
    }

    public abstract String d();

    public abstract int e();

    public abstract void f();
}

