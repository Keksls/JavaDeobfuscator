/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePK
 */
public class epk_0
implements epl_0 {
    private eBt a;
    private long b;
    private long c;
    private boolean d;
    private int e;

    public epk_0() {
    }

    public epk_0(eBt eBt2) {
        this.a = eBt2;
    }

    public eBt b() {
        return this.a;
    }

    public void a(eBt eBt2) {
        this.a = eBt2;
    }

    @Override
    public short c() {
        return this.a.a();
    }

    @Override
    public void a(int n) {
        this.e = n;
    }

    @Override
    public int d() {
        return this.e;
    }

    @Override
    public boolean e() {
        return this.a != null;
    }

    @Override
    public long f() {
        return -this.a.b();
    }

    @Override
    public void a(long l) {
        this.b = l;
    }

    @Override
    public String a() {
        return this.a.e();
    }

    @Override
    public aff_1 g() {
        throw new UnsupportedOperationException("Ne devrait pas etre utilis\u00e9");
    }

    @Override
    public long h() {
        return 0L;
    }

    @Override
    public void a(byte by) {
    }

    @Override
    public long i() {
        return this.j();
    }

    @Override
    public long j() {
        return this.b;
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public short k() {
        if (this.a == null) {
            return 0;
        }
        return this.a.d();
    }

    @Override
    public short l() {
        return this.k();
    }

    @Override
    public void a(short s2) {
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public long o() {
        return this.c;
    }

    @Override
    public int p() {
        return this.a.k();
    }

    @Override
    public int q() {
        return this.a.j();
    }

    @Override
    public void b(int n) {
        this.a.b(n);
    }

    @Override
    public void c(int n) {
        this.a.a(n);
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    public boolean s() {
        return this.d;
    }

    @Override
    public void b(long l) {
        this.c = l;
    }

    @Override
    public void c(long l) {
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void b(short s2) {
    }

    @Override
    public void b(boolean bl) {
        this.d = bl;
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void c(short s2) {
    }

    @Override
    public void d(long l) {
    }

    @Override
    public void a(aff_1 aff_12) {
    }

    @Override
    public int t() {
        return 0;
    }

    @Override
    public void d(int n) {
    }

    @Override
    public void a(ePO ePO2) {
    }

    @Override
    public String u() {
        return null;
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public boolean w() {
        return false;
    }

    @Override
    public void d(boolean bl) {
    }

    @Override
    public int x() {
        return 2;
    }

    @Override
    public boolean y() {
        return false;
    }

    @Override
    public byte z() {
        return 0;
    }

    @Override
    public void b(byte by) {
    }
}

