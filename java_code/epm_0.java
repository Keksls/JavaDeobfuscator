/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ePM
 */
public final class epm_0
implements epl_0 {
    private String a;
    private long b;
    private long c;
    private long d;
    private aff_1 e;
    private int f;
    private int g;
    private int h;
    private long i;
    private short j;
    private short k = (short)-1;
    private boolean l;
    private boolean m;
    private boolean n;
    private short o;
    private byte p;
    private String q;
    private final List<ePO> r = new ArrayList<ePO>();
    private boolean s;
    private int t;

    @Override
    public boolean e() {
        return this.a != null;
    }

    @Override
    public long f() {
        return this.c;
    }

    @Override
    public void a(long l) {
        this.i = l;
    }

    @Override
    public short c() {
        return this.o;
    }

    @Override
    public void a(int n) {
        this.t = n;
    }

    @Override
    public int d() {
        return this.t;
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public aff_1 g() {
        return this.e;
    }

    @Override
    public long h() {
        return this.d;
    }

    @Override
    public void a(byte by) {
        this.i = 0L;
    }

    @Override
    public long i() {
        return this.i;
    }

    @Override
    public long j() {
        return this.i;
    }

    @Override
    public void a(boolean bl) {
        this.l = bl;
    }

    @Override
    public short k() {
        return this.j;
    }

    @Override
    public short l() {
        return this.k;
    }

    @Override
    public void a(short s2) {
        this.k = s2;
        this.A();
    }

    @Override
    public boolean m() {
        return this.k != this.j && this.k != -1;
    }

    @Override
    public boolean n() {
        return this.l;
    }

    @Override
    public long o() {
        return this.b;
    }

    @Override
    public int p() {
        return this.f;
    }

    @Override
    public int q() {
        return this.g;
    }

    @Override
    public void b(int n) {
        this.f = n;
        this.D();
    }

    @Override
    public void c(int n) {
        this.g = n;
        this.E();
    }

    @Override
    public boolean r() {
        return this.m;
    }

    @Override
    public boolean s() {
        return this.n;
    }

    @Override
    public boolean y() {
        return false;
    }

    @Override
    public void b(long l) {
        this.b = l;
    }

    @Override
    public void c(long l) {
        this.c = l;
    }

    @Override
    public void a(String string) {
        this.a = string;
    }

    @Override
    public void b(short s2) {
        this.o = s2;
    }

    @Override
    public void b(boolean bl) {
        this.n = bl;
        this.C();
    }

    @Override
    public void c(boolean bl) {
        this.m = bl;
        this.B();
    }

    @Override
    public void c(short s2) {
        this.j = s2;
        this.b();
    }

    @Override
    public void d(long l) {
        this.d = l;
    }

    @Override
    public void a(aff_1 aff_12) {
        this.e = aff_12;
    }

    @Override
    public int t() {
        return this.h;
    }

    @Override
    public void d(int n) {
        this.h = n;
    }

    @Override
    public String u() {
        return this.q;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean w() {
        return this.s;
    }

    @Override
    public void d(boolean bl) {
        this.s = bl;
    }

    @Override
    public int x() {
        return 1;
    }

    @Override
    public byte z() {
        return this.p;
    }

    @Override
    public void b(byte by) {
        this.p = by;
    }

    @Override
    public void a(ePO ePO2) {
        if (this.r.contains(ePO2)) {
            return;
        }
        this.r.add(ePO2);
    }

    public boolean b(ePO ePO2) {
        return this.r.remove(ePO2);
    }

    private void b() {
        for (ePO ePO2 : this.r) {
            ePO2.a(this);
        }
    }

    private void A() {
        this.r.forEach(ePO2 -> ePO2.b(this));
    }

    private void B() {
        for (ePO ePO2 : this.r) {
            ePO2.c(this);
        }
    }

    private void C() {
        for (ePO ePO2 : this.r) {
            ePO2.d(this);
        }
    }

    private void D() {
        for (ePO ePO2 : this.r) {
            ePO2.e(this);
        }
    }

    private void E() {
        for (ePO ePO2 : this.r) {
            ePO2.f(this);
        }
    }
}

