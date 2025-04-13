/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;

/*
 * Renamed from eON
 */
public class eon_1
implements eok_1 {
    private final int c;
    private final short d;
    private final apc_2 e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final TIntHashSet k = new TIntHashSet();
    private final TIntHashSet l = new TIntHashSet();
    private final ArrayList<eor_1> m = new ArrayList();

    public eon_1(int n, short s2, apc_2 apc_22, int n2, int n3, int n4, int n5, boolean bl) {
        this.c = n;
        this.d = s2;
        this.e = apc_22;
        this.f = n2;
        this.g = n3;
        this.h = n4;
        this.i = n5;
        this.j = bl;
    }

    @Override
    public int a() {
        return this.c;
    }

    @Override
    public int b() {
        return this.i;
    }

    @Override
    public short c() {
        return this.d;
    }

    @Override
    public apc_2 d() {
        return this.e;
    }

    @Override
    public int e() {
        return this.f;
    }

    @Override
    public int f() {
        return this.g;
    }

    @Override
    public int g() {
        return this.h;
    }

    public void a(int ... nArray) {
        this.k.addAll(nArray);
    }

    public void b(int ... nArray) {
        this.l.addAll(nArray);
    }

    public void a(int n, apc_2 apc_22, short s2, short s3) {
        eor_1 eor_12 = new eor_1(n, apc_22, s2, s3);
        this.m.add(eor_12);
    }

    @Override
    public ArrayList<eor_1> h() {
        return this.m;
    }

    @Override
    public boolean a(int n) {
        return this.k.contains(n);
    }

    @Override
    public boolean b(int n) {
        return this.l.contains(n);
    }

    @Override
    public boolean i() {
        return this.j;
    }
}

