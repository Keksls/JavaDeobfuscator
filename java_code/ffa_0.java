/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ffA
 */
public class ffa_0
implements ffu_0 {
    public static final int a = 3;
    private final List<ffb_0> b = new ArrayList<ffb_0>();
    private fge c;
    @Nullable
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final wt_0 i = new wt_0(null);
    private final wt_0 j = new wt_0(null);
    private int k;
    private final wt_0 l = new wt_0(null);

    public void a(fge fge2) {
        this.c = fge2;
        this.e = fge2.n();
        this.f = fge2.d();
        wu_0 wu_02 = wc_0.p().a();
        this.i.a(wu_02);
        this.j.a(wu_02);
    }

    @Override
    public fge a() {
        return this.c;
    }

    @Override
    @Nullable
    public String b() {
        return this.d;
    }

    @Override
    public int f() {
        return this.f;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public fgf d() {
        if (fgh.a.d(this.h)) {
            Optional<fge> optional = fgh.a.e(this.h);
            return optional.map(fge2 -> fge2.e(this.e) ? fge2.h(this.e) : fge2.h(fge2.n())).orElse(null);
        }
        if (fgl.a.b(this.h)) {
            fgj fgj2 = fgl.a.b((Integer)this.h);
            if (fgj2 == null) {
                return null;
            }
            int n = fgj2.d();
            fge fge3 = fgh.a.b(n);
            if (fge3 == null) {
                return null;
            }
            if (fge3.e(this.e)) {
                return fge3.h(this.e);
            }
            return fge3.h(fge3.n());
        }
        if (this.c.e(this.e)) {
            return this.c.h(this.e);
        }
        return this.c.h(this.c.n());
    }

    @Override
    public int e() {
        return this.h;
    }

    @Override
    public int h() {
        return this.g;
    }

    @Override
    public short i() {
        return Hw.c((long)(this.g / this.c.h()));
    }

    @Override
    public short j() {
        return this.c.i();
    }

    @Override
    public wu_0 k() {
        return this.i;
    }

    public wt_0 q() {
        return this.j;
    }

    @Override
    public int m() {
        return this.k;
    }

    @Override
    public wu_0 n() {
        return this.l;
    }

    @Override
    public boolean o() {
        return !this.l.c() && this.k > 0;
    }

    @Override
    public boolean p() {
        return this.f > 0 && !this.o();
    }

    public void a(@Nullable String string) {
        this.d = string;
        this.r();
    }

    public void a(int n) {
        this.f = Hw.a(n, 0, this.c.d());
        this.u();
    }

    public void b(int n) {
        if (n == this.e) {
            return;
        }
        this.e = n;
        this.s();
    }

    public void c(int n) {
        if (n == this.h) {
            return;
        }
        this.h = n;
        this.t();
    }

    public void d(int n) {
        this.g = Math.min(Math.max(0, n), this.c.h() * this.c.i());
        this.v();
    }

    public void a(wu_0 wu_02) {
        this.i.a(wu_02);
        this.w();
    }

    public void b(wu_0 wu_02) {
        this.j.a(wu_02);
        this.x();
    }

    public void c(wu_0 wu_02) {
        this.l.a(wu_02);
        this.y();
    }

    public void e(int n) {
        this.k = n;
        this.z();
    }

    private void r() {
        this.b.forEach(ffb_02 -> ffb_02.a(this.d));
    }

    private void s() {
        this.b.forEach(ffb_02 -> ffb_02.a(this.e));
    }

    private void t() {
        this.b.forEach(ffb_02 -> ffb_02.b(this.h));
    }

    private void u() {
        this.b.forEach(ffb_02 -> ffb_02.c(this.f));
    }

    private void v() {
        this.b.forEach(ffb_02 -> ffb_02.d(this.g));
    }

    private void w() {
        this.b.forEach(ffb_02 -> ffb_02.a(this.i));
    }

    private void x() {
        this.b.forEach(ffb_02 -> ffb_02.b(this.j));
    }

    private void y() {
        this.b.forEach(ffb_02 -> ffb_02.c(this.l));
    }

    private void z() {
        this.b.forEach(ffb_02 -> ffb_02.e(this.k));
    }

    @Override
    public final boolean a(ffb_0 ffb_02) {
        return !this.b.contains(ffb_02) && this.b.add(ffb_02);
    }

    @Override
    public final boolean b(ffb_0 ffb_02) {
        return this.b.remove(ffb_02);
    }

    @Override
    public boolean a(xn_1 xn_12) {
        xn_12.a = this.c.b();
        xn_12.c = this.e;
        xn_12.d = this.h;
        xn_12.e = this.f;
        xn_12.g = this.i.h();
        xn_12.h = this.j.h();
        xn_12.i = this.k;
        xn_12.j = this.l.h();
        xn_12.b = this.d;
        xn_12.f = this.g;
        return true;
    }

    @Override
    public boolean b(xn_1 xn_12) {
        this.c = fgh.a.a(xn_12.a);
        this.b(xn_12.c);
        this.c(xn_12.d);
        this.a(xn_12.e);
        this.a(wt_0.b(xn_12.g));
        this.b(wt_0.b(xn_12.h));
        this.e(xn_12.i);
        this.c(wt_0.b(xn_12.j));
        this.a(xn_12.b);
        this.d(xn_12.f);
        return true;
    }

    public String toString() {
        return "pet(m_listeners=" + this.b.size() + ", m_definition=" + this.c + ", m_name='" + this.d + "', m_colorItemRefId=" + this.e + ", m_health=" + this.f + ", m_xp=" + this.g + ", m_equippedRefItemId=" + this.h + ", m_lastMealDate=" + this.i + ", m_lastHungryDate=" + this.j + ", m_sleepRefItemId=" + this.k + ", m_sleepDate=" + this.l + ")";
    }

    @Override
    public String g() {
        return "pet(m_name='" + this.d + "', m_colorItemRefId=" + this.e + ", m_health=" + this.f + ", m_xp=" + this.g + ", m_equippedRefItemId=" + this.h + ")";
    }

    @Override
    public /* synthetic */ wu_0 l() {
        return this.q();
    }
}

