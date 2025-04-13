/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eDP
 */
public class edp_0
implements efh_0 {
    private final sd_0<efh_0, efi_0> j;

    public edp_0(sd_0<efh_0, efi_0> sd_02) {
        this.j = sd_02;
    }

    @Override
    public byte D() {
        return this.j.f().D();
    }

    @Override
    public float[] E() {
        return this.j.f().E();
    }

    @Override
    public int F() {
        return this.j.f().F();
    }

    @Override
    public int a(int n, short s2, eFb eFb2) {
        int n2;
        if (this.j instanceof ege_0 && n == 0 ? (n2 = this.j.f().a(0, s2, eFb.a)) == -1 || n2 == -2 : this.j instanceof eGH && this.F() == 4 && n == 0) {
            return this.j.n();
        }
        return this.j.f().a(n, s2, eFb2);
    }

    @Override
    public float a(int n, short s2) {
        float f2;
        if (this.j instanceof ege_0 && n == 0 ? (f2 = this.j.f().a(0, s2)) == -1.0f || f2 == -2.0f : this.j instanceof eGH && this.F() == 4 && n == 0) {
            return this.j.n();
        }
        return this.j.f().a(n, s2);
    }

    @Override
    public float a(int n) {
        float f2;
        if (this.j instanceof ege_0 && n == 0 ? (f2 = this.j.f().a(0)) == -1.0f || f2 == -2.0f : this.j instanceof eGH && this.F() == 4 && n == 0) {
            return this.j.n();
        }
        return this.j.f().a(n);
    }

    @Override
    public boolean G() {
        return this.j.f().G();
    }

    @Override
    public boolean H() {
        return this.j.f().H();
    }

    @Override
    public boolean I() {
        return this.j.f().I();
    }

    @Override
    public boolean J() {
        return this.j.f().J();
    }

    @Override
    public efh_0 K() {
        return this.j.f().K();
    }

    @Override
    public boolean L() {
        return this.j.f().L();
    }

    @Override
    public boolean M() {
        return this.j.f().M();
    }

    @Override
    public boolean N() {
        return this.j.f().N();
    }

    @Override
    public int O() {
        return this.j.f().O();
    }

    @Override
    public int P() {
        return this.j.f().P();
    }

    @Override
    public apc_2 Q() {
        return this.j.f().Q();
    }

    @Override
    public float b(short s2) {
        return this.j.f().b(s2);
    }

    @Override
    public float R() {
        return this.j.f().R();
    }

    @Override
    public void a(rg_0 rg_02) {
    }

    @Override
    public void b(rg_0 rg_02) {
    }

    @Override
    public void c(rg_0 rg_02) {
    }

    @Override
    public void d(rg_0 rg_02) {
    }

    @Override
    public void e(rg_0 rg_02) {
    }

    @Override
    public Iterator<rg_0> S() {
        return null;
    }

    @Override
    public Iterator<rg_0> T() {
        return null;
    }

    @Override
    public aqd_1 U() {
        return null;
    }

    @Override
    public float V() {
        return 0.0f;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public void b(int n) {
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public List<rg_0> X() {
        return null;
    }

    @Override
    public boolean f(rg_0 rg_02) {
        return false;
    }

    @Override
    public boolean g(rg_0 rg_02) {
        return false;
    }

    @Override
    public boolean h(rg_0 rg_02) {
        return false;
    }

    @Override
    public boolean i(rg_0 rg_02) {
        return false;
    }

    @Override
    public boolean j(rg_0 rg_02) {
        return false;
    }

    @Override
    public void a(SB sB) {
    }

    @Override
    public void a(sc_0 sc_02) {
    }

    @Override
    public void a(SA sA) {
    }

    @Override
    public void b(boolean bl) {
    }

    @Override
    public boolean Y() {
        return this.j.f().Y();
    }

    @Override
    public boolean Z() {
        return this.j.f().Z();
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public int r() {
        return 0;
    }

    @Override
    public boolean a() {
        return this.j.f().a();
    }

    @Override
    public boolean b() {
        return this.j.f().b();
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public byte h() {
        return this.j.f().h();
    }

    @Override
    public int i() {
        return this.j.f().i();
    }

    @Override
    public int j() {
        return this.j.f().j();
    }

    @Override
    public boolean a(long l) {
        return this.j.f().a(l);
    }

    @Override
    public apt_2<Su> k() {
        return this.j.f().k();
    }

    @Override
    public BitSet l() {
        return null;
    }

    @Override
    public BitSet m() {
        return null;
    }

    @Override
    public BitSet n() {
        return null;
    }

    @Override
    public BitSet o() {
        return null;
    }

    @Override
    public BitSet p() {
        return null;
    }

    @Override
    public BitSet q() {
        return null;
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public BitSet t() {
        return null;
    }

    @Override
    public Ss a(Sm sm, Su su, So so, xb_0<? extends si_0> xb_02, int n, int n2, short s2, Su su2, Sr sr, boolean bl) {
        return null;
    }

    @Override
    public aqd_1 u() {
        return this.j.f().u();
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public long w() {
        return this.j.f().w();
    }

    @Override
    public short x() {
        return this.j.f().x();
    }

    @Override
    public void b_(short s2) {
    }

    @Override
    public boolean y() {
        return this.j.f().y();
    }

    @Override
    public boolean z() {
        return this.j.f().z();
    }

    @Override
    public sc_0 A() {
        return this.j.f().A();
    }

    @Override
    public SA B() {
        return this.j.f().B();
    }

    @Override
    public boolean C() {
        return this.j.f().C();
    }

    @Override
    public boolean aa() {
        return this.j.f().aa();
    }

    @Override
    public boolean ab() {
        return this.j.f().ab();
    }

    @Override
    public boolean ac() {
        return this.j.f().ac();
    }

    @Override
    public boolean a(eff_0 eff_02) {
        return false;
    }

    public /* synthetic */ Object clone() {
        return this.K();
    }
}

