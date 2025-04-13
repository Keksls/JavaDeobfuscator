/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TIntProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from ezB
 */
public class ezb_2 {
    private static final Logger a = Logger.getLogger(ezb_2.class);
    private final int b;
    private final short c;
    private final long d;
    private final boolean e;
    private final short f;
    private final TLongArrayList g = new TLongArrayList();
    private final String h;
    private final ezc_2 i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final TIntArrayList m = new TIntArrayList();
    private long n;

    public ezb_2(int n, short s2, short s3, long l, long[] lArray, int[] nArray, boolean bl, boolean bl2, boolean bl3, String string, short s4, int n2) {
        this.b = n;
        this.c = s2;
        this.h = string;
        this.i = ezc_2.a(s4);
        if (s3 < 1 || s3 > 10) {
            a.error((Object)("The minimal stasis for the dungeon with the id: " + l + " is outside the authorized bounds: " + s3 + ". Check the data validity."));
        }
        this.f = Hw.a(s3, (short)1, (short)10);
        this.d = l;
        this.g.add(lArray);
        this.m.add(nArray);
        this.k = bl;
        this.l = bl2;
        this.e = bl3;
        this.j = n2;
    }

    public int a() {
        return this.b;
    }

    public long b() {
        return this.d;
    }

    public short c() {
        return this.c;
    }

    public boolean a(TIntProcedure tIntProcedure) {
        return this.m.forEach(tIntProcedure);
    }

    public short d() {
        return this.f;
    }

    public void a(long l) {
        this.n = l;
    }

    public long e() {
        return this.n;
    }

    public TLongArrayList f() {
        return this.g;
    }

    public boolean g() {
        return this.k;
    }

    public boolean h() {
        return this.l;
    }

    public boolean i() {
        return this.e;
    }

    public String j() {
        return this.h;
    }

    public ezc_2 k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }
}

