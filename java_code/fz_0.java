/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from FZ
 */
public class fz_0
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
    private short k;

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
        return Lists.newArrayList();
    }

    @Override
    public Ft k() {
        return this.j;
    }

    public void a(Ft ft) {
        this.j = ft;
    }

    @Override
    public short u() {
        return this.k;
    }

    public void b(short s2) {
        this.k = s2;
    }

    @Override
    public gd_1 o() {
        return gd_1.b;
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
        assert (n == 0);
        return arrayList;
    }

    @Override
    public final short[] f(int n) {
        return new short[]{this.k};
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final short s() {
        return this.k;
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
        return this.k;
    }
}

