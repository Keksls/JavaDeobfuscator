/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cdo
 */
final class cdo_1
implements fkU {
    private long a;
    private eet_0 b;
    private fiU c;

    cdo_1() {
    }

    @Override
    public long a() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    @Override
    public int b() {
        return this.b.d();
    }

    @Override
    public int c() {
        return this.b.a();
    }

    @Override
    public int d() {
        return this.b.e();
    }

    @Override
    public boolean e() {
        return this.b.f();
    }

    @Override
    public boolean f() {
        return this.b.g();
    }

    public void b(int n) {
        this.b.b(n);
    }

    @Override
    public void a(int n) {
        this.b.c(n);
    }

    public void b(boolean bl) {
        this.b.a(bl);
    }

    public void c(boolean bl) {
        this.b.b(bl);
    }

    @Override
    public void a(eet_0 eet_02) {
        this.b = eet_02;
    }

    @Override
    public boolean g() {
        return this.b.h();
    }

    @Override
    public void a(boolean bl) {
        this.b.c(bl);
    }

    @Override
    public ArrayList<Long> h() {
        return this.b.c();
    }

    @Override
    public boolean i() {
        return this.b.b();
    }
}

