/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from FX
 */
public class fx_0
implements gc_0 {
    private short b;
    private String c;
    private int d;
    private int e;
    private byte f;
    private boolean g;
    private int h = -1;
    private fy_0 i;
    private Ft j;
    private short[] k;
    private short l;

    @Override
    public short a() {
        return this.b;
    }

    public void a(short s2) {
        this.b = s2;
    }

    @Override
    public String b() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public int c() {
        return this.d;
    }

    public void a(int n) {
        this.d = n;
    }

    @Override
    public int d() {
        return this.e;
    }

    public void b(int n) {
        this.e = n;
    }

    @Override
    public byte e() {
        return this.f;
    }

    public void a(byte by) {
        this.f = by;
    }

    @Override
    public boolean f() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    @Override
    public int g() {
        return this.h;
    }

    public void c(int n) {
        this.h = n;
    }

    @Override
    public fy_0 h() {
        return this.i;
    }

    @Override
    public void a(fy_0 fy_02) {
        this.i = fy_02;
    }

    @Override
    public int i() {
        return 1;
    }

    @Override
    public List<Fz> d(int n) {
        short[] sArray;
        ArrayList<Fz> arrayList = new ArrayList<Fz>();
        for (short s2 : sArray = this.k) {
            Fz fz = this.i.d()[s2];
            fz.a(n);
            arrayList.add(fz);
        }
        return arrayList;
    }

    @Override
    public Ft k() {
        return this.j;
    }

    public void a(Ft ft) {
        this.j = ft;
    }

    public short[] j() {
        return this.k;
    }

    public void a(short[] sArray) {
        this.k = sArray;
    }

    @Override
    public short u() {
        return this.l;
    }

    public void b(short s2) {
        this.l = s2;
    }

    @Override
    public gd_1 o() {
        return gd_1.a;
    }

    @Override
    public final int p() {
        return 1;
    }

    @Override
    public final int q() {
        return 1;
    }

    @Override
    public final List<Fz> a(int n, ArrayList<Fz> arrayList) {
        short[] sArray = this.j();
        if (sArray == null) {
            return arrayList;
        }
        assert (n == 0);
        Fz[] fzArray = this.i.d();
        for (int k = 0; k < sArray.length; ++k) {
            Fz fz = fzArray[sArray[k]];
            fz.a(n);
            arrayList.add(fz);
        }
        return arrayList;
    }

    @Override
    public final short[] f(int n) {
        return new short[]{this.l};
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final short s() {
        return this.l;
    }

    @Override
    public final void t() {
    }

    @Override
    public final int g(int n) {
        this.j.a(0);
        return 1;
    }

    @Override
    public final short a(Fx fx, Fx fx2) {
        int n = this.j.a();
        co_0.a(n).a(this.j, this.i, fx, fx2);
        return this.l;
    }
}

