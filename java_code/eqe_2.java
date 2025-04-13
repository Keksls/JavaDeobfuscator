/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 */
import gnu.trove.map.hash.TByteLongHashMap;
import java.util.LinkedList;

/*
 * Renamed from eqE
 */
public abstract class eqe_2
extends WV {
    protected long g;
    protected int h;
    protected int i;
    protected short j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected boolean o = false;
    protected boolean p = false;
    private boolean w;
    short x;
    protected final TByteLongHashMap q = new TByteLongHashMap();
    public final WY r = new eqf_2(this, this, 12);
    public final WY s = new eqg_2(this, this, 12);
    public final WY t = new eqh_2(this, this, 2);
    public final WY u = new eqi_1(this, this, 1);
    public final WY v = new eqj_1(this, this, 1);
    private final fo_1[] y = new fo_1[]{this.u, this.v, this.t, this.s, this.r};

    public long a(byte by) {
        return this.q.get(by);
    }

    public void a(byte by, long l) {
        this.q.put(by, l);
    }

    public void b(byte by) {
        this.q.remove(by);
    }

    @Override
    public fo_1[] b_() {
        fo_1[] fo_1Array = new fo_1[super.b_().length + this.y.length];
        System.arraycopy(super.b_(), 0, fo_1Array, 0, super.b_().length);
        System.arraycopy(this.y, 0, fo_1Array, super.b_().length, this.y.length);
        return fo_1Array;
    }

    @Override
    public void b() {
        super.b();
        this.g = 0L;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.p = false;
        this.o = false;
        this.w = false;
        this.q.clear();
    }

    public short i() {
        return this.x;
    }

    public long j() {
        return this.g;
    }

    public int k() {
        return this.h;
    }

    public int l() {
        return this.i;
    }

    public short m() {
        return this.j;
    }

    public void c(long l) {
        this.g = l;
    }

    public void a(int n) {
        this.h = n;
    }

    public void b(int n) {
        this.i = n;
    }

    public void a(short s2) {
        this.j = s2;
    }

    public void b(short s2) {
        this.x = s2;
    }

    public int n() {
        return this.k;
    }

    public void c(int n) {
        this.k = n;
    }

    public int o() {
        return this.l;
    }

    public void d(int n) {
        this.l = n;
    }

    public int p() {
        return this.m;
    }

    public void e(int n) {
        this.m = n;
    }

    public int q() {
        return this.n;
    }

    public void f(int n) {
        this.n = n;
    }

    public void b(boolean bl) {
        this.o = bl;
    }

    public void c(boolean bl) {
        this.p = bl;
    }

    public boolean r() {
        return this.o;
    }

    public boolean s() {
        return this.p;
    }

    public void d(boolean bl) {
        this.w = bl;
    }

    public boolean t() {
        return this.w;
    }

    static /* synthetic */ LinkedList a(eqe_2 eqe_22) {
        return eqe_22.b;
    }

    static /* synthetic */ LinkedList b(eqe_2 eqe_22) {
        return eqe_22.b;
    }

    static /* synthetic */ LinkedList c(eqe_2 eqe_22) {
        return eqe_22.b;
    }

    static /* synthetic */ LinkedList d(eqe_2 eqe_22) {
        return eqe_22.b;
    }

    static /* synthetic */ LinkedList e(eqe_2 eqe_22) {
        return eqe_22.b;
    }
}

