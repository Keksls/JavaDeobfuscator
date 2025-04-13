/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eCd
 */
public class ecd_0
implements ece_0 {
    @NotNull
    protected ece_0 a;
    @NotNull
    private final Set<ebv_0> b = new HashSet<ebv_0>();
    @NotNull
    private final ebv_0 c = new ech_0(this.b);

    public ecd_0(@NotNull ece_0 ece_02) {
        this.a = ece_02;
        this.a.a(this.c);
    }

    public void a(@NotNull ece_0 ece_02) {
        this.a.b(this.c);
        this.a = ece_02;
        this.a.a(this.c);
    }

    @Override
    public void a(@NotNull ebv_0 ebv_02) {
        this.b.add(ebv_02);
    }

    @Override
    public void b(@NotNull ebv_0 ebv_02) {
        this.b.remove(ebv_02);
    }

    @Override
    public ebw_0 a(ect_0 ect_02) {
        return this.a.a(ect_02);
    }

    @Override
    public ebw_0 c(ect_0 ect_02) {
        return this.a.c(ect_02);
    }

    @Override
    public ebw_0 a(int n, int n2) {
        return this.a.a(n, n2);
    }

    @Override
    public Set<Integer> a(int n) {
        return this.a.a(n);
    }

    @Override
    public Set<eco_0> e_(int n) {
        return this.a.e_(n);
    }

    @Override
    public Set<eco_0> bk_() {
        return this.a.bk_();
    }

    @Override
    public long a(int n, long l, long l2) {
        return this.a.a(n, l, l2);
    }

    @Override
    public long a(int n, long l) {
        return this.a.a(n, l);
    }

    @Override
    public void b(int n) {
        this.a.b(n);
    }

    @Override
    public void a(int n, boolean bl) {
        this.a.a(n, bl);
    }

    @Override
    public void c(int n) {
        this.a.c(n);
    }

    @Override
    public void d(int n) {
        this.a.d(n);
    }

    @Override
    public boolean e(int n) {
        return this.a.e(n);
    }

    @Override
    public short f(int n) {
        return this.a.f(n);
    }

    @Override
    public double c(int n, long l) {
        return this.a.c(n, l);
    }

    @Override
    public double g(int n) {
        return this.a.g(n);
    }

    @Override
    public long h(int n) {
        return this.a.h(n);
    }

    @Override
    public long i(int n) {
        return this.a.i(n);
    }

    @Override
    public int j(int n) {
        return this.a.j(n);
    }

    @Override
    public int k(int n) {
        return this.a.k(n);
    }

    @Override
    public int l(int n) {
        return this.a.l(n);
    }

    @Override
    public int m(int n) {
        return this.a.m(n);
    }

    @Override
    public short n(int n) {
        return this.a.n(n);
    }

    @Override
    public boolean o(int n) {
        return this.a.o(n);
    }

    @Override
    public boolean a() {
        return this.a.a();
    }

    @Override
    public void a(boolean bl) {
        this.a.a(bl);
    }

    @Override
    public void b(int n, boolean bl) {
        this.a.b(n, bl);
    }

    @Override
    public void c(int n, int n2) {
        this.a.c(n, n2);
    }

    @Override
    public Set<Integer> b() {
        return this.a.b();
    }

    @Override
    public boolean d(int n, int n2) {
        return this.a.d(n, n2);
    }

    @Override
    public boolean a(eco_0 eco_02) {
        return this.a.a(eco_02);
    }

    @Override
    public Map<ebx_0, ebz_0> c() {
        return this.a.c();
    }

    @Override
    public boolean a(ebx_0 ebx_02, ebz_0 ebz_02) {
        return this.a.a(ebx_02, ebz_02);
    }

    @Override
    public void a(Map<ebx_0, ebz_0> map) {
        this.a.a(map);
    }

    @Override
    public Map<Integer, Integer> d() {
        return this.a.d();
    }

    @Override
    public boolean a(int n, Integer n2) {
        return this.a.a(n, n2);
    }

    @Override
    public void b(Map<Integer, Integer> map) {
        this.a.b(map);
    }

    @Override
    public boolean e() {
        return this.a.e();
    }

    @Override
    public boolean b(boolean bl) {
        return this.a.b(bl);
    }

    @Override
    public boolean f() {
        return this.a.f();
    }

    @Override
    public boolean c(boolean bl) {
        return this.a.c(bl);
    }

    @Override
    public int a(eco_0 eco_02, boolean bl) {
        return this.a.a(eco_02, bl);
    }

    @Override
    public void a(dc_1 dc_12) {
        this.a.a(dc_12);
    }

    @Override
    public void a(dc_1 dc_12, boolean bl) {
        this.a.a(dc_12, bl);
    }

    @Override
    public void a(gj_2 gj_22) {
        this.a.a(gj_22);
    }

    @Override
    public void a(gj_2 gj_22, boolean bl) {
        this.a.a(gj_22, bl);
    }

    @Override
    public void a(dw_1 dw_12) {
        this.a.a(dw_12);
    }

    @Override
    public void a(dw_1 dw_12, boolean bl) {
        this.a.a(dw_12, bl);
    }

    @Override
    public dc_1 g() {
        return this.a.g();
    }

    @Override
    public di_1 h() {
        return this.a.h();
    }

    @Override
    public fz_2 i() {
        return this.a.i();
    }

    @Override
    public gj_2 j() {
        return this.a.j();
    }

    @Override
    public dw_1 k() {
        return this.a.k();
    }

    @Override
    public Map<Integer, Short> l() {
        return this.a.l();
    }
}

