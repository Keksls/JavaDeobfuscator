/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from QV
 */
public abstract class qv_0
extends fl_1 {
    protected final int a;
    protected final int b;
    protected final short c;
    protected final short d;
    protected final short e;
    protected final boolean f;
    protected final boolean g;
    protected final boolean h;
    protected final boolean i;
    protected final byte j;
    protected final short k;
    protected final ArrayList<aff_1> l = new ArrayList();
    protected final String m;
    protected final int n;
    protected final int[] o;
    private final fo_1 p = this.b();
    private final fo_1 q = new qw_0(this);
    private final fo_1 r = fo_1.c;
    private final fo_1 s = fo_1.c;
    private final fo_1[] t = new fo_1[]{this.p, this.q, this.r, this.s};

    protected abstract fo_1 b();

    @Override
    public fo_1[] b_() {
        return this.t;
    }

    public byte[] d() {
        return this.a(this.p, this.q);
    }

    public qv_0(short s2, int n, int n2, short s3, short s4, boolean bl, boolean bl2, boolean bl3, boolean bl4, byte by, short s5, ArrayList<aff_1> arrayList, String string, int[] nArray, int n3) {
        this.d = s2;
        this.a = n;
        this.b = n2;
        this.c = s3;
        this.e = s4;
        this.f = bl;
        this.g = bl2;
        this.h = bl3;
        this.i = bl4;
        this.j = by;
        this.k = s5;
        this.l.addAll(arrayList);
        this.m = string;
        this.o = nArray;
        this.n = n3;
    }
}

