/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class ffv {
    private final ffz b;
    protected epq_2 a;

    public ffv(ffz ffz2, epq_2 epq_22) {
        this.b = ffz2;
        this.a = epq_22;
    }

    public ffv(ffz ffz2) {
        this.b = ffz2;
    }

    public final void a(String string) {
        boolean bl;
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        if (string.equals(ffa_02.b())) {
            throw new fgm("Le changement de nom demand\u00e9 est identique \u00e0 l'ancien");
        }
        boolean bl2 = bl = !xu_0.a().a(string);
        if (bl) {
            throw new fgm("Nom de familier " + string + " invalid\u00e9 par le " + xu_0.class.getSimpleName());
        }
        ffa_02.a(string);
    }

    public final void a(int n) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        ffa_02.d(n);
    }

    public final void a(wu_0 wu_02) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        ffa_02.a(wu_02);
    }

    public final void a() {
        this.b(wc_0.p().a());
    }

    public final void b(wu_0 wu_02) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        ffa_02.b(this.d(wu_02));
    }

    private wu_0 d(wu_0 wu_02) {
        wt_0 wt_02 = new wt_0(wu_02);
        wt_02.f(23);
        wt_02.e(59);
        wt_02.d(59);
        return wt_02;
    }

    public final void b(int n) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        if (n > 0 && !ffv.a(n, ffa_02)) {
            throw new fgm("We cannot equip the pet  " + ffa_02.a().b() + " with item " + n);
        }
        ffa_02.c(n);
    }

    private static boolean a(int n, ffa_0 ffa_02) {
        boolean bl = ffa_02.a().k();
        if (bl && fgd.a.b(n) != null) {
            return true;
        }
        if (!bl && fgl.a.b((Integer)n) != null) {
            return true;
        }
        return fgh.a.d(n);
    }

    public final void b() {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        if (ffa_02.e() <= 0) {
            throw new fgm("Le Familier n'a pas d'\u00e9quipement");
        }
        ffa_02.c(0);
    }

    public boolean c(int n) {
        emg_0 emg_02;
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        int n2 = ffa_02.f();
        if (this.a != null && n2 > n && (emg_02 = ((emh_0)((Object)this.a)).N_()).a(enw_0.r)) {
            return false;
        }
        ffa_02.a(n);
        return true;
    }

    public void d(int n) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ((ffa_0)this.b.f()).b(n);
    }

    public boolean e(int n) {
        ffu_0 ffu_02 = this.f().f();
        int n2 = ffu_02.e();
        if (n2 <= 0) {
            return ffu_02.a().e(n);
        }
        if (fgh.a.d(n2)) {
            Optional<fge> optional = fgh.a.e(n2);
            return optional.map(fge2 -> fge2.e(n)).orElse(false);
        }
        fgj fgj2 = fgl.a.b((Integer)n2);
        if (fgj2 == null) {
            return false;
        }
        int n3 = fgj2.d();
        fge fge3 = fgh.a.b(n3);
        if (fge3 == null) {
            return false;
        }
        return fge3.e(n);
    }

    public int c() {
        ffu_0 ffu_02 = this.f().f();
        if (ffu_02.e() <= 0) {
            return ffu_02.a().n();
        }
        if (fgl.a.b(ffu_02.e())) {
            int n = fgl.a.b((Integer)ffu_02.e()).d();
            fge fge2 = fgh.a.b(n);
            if (fge2 == null) {
                return 0;
            }
            return fge2.n();
        }
        Optional<fge> optional = fgh.a.e(ffu_02.e());
        return optional.map(fge::n).orElse(0);
    }

    public final void f(int n) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        if (ffa_02.o()) {
            throw new fgm("Le familier est d\u00e9j\u00e0 endormi");
        }
        if (ffa_02.m() > 0) {
            throw new fgm("Le familier est d\u00e9j\u00e0 endormi par l'item " + ffa_02.m());
        }
        if (!ffa_02.a().f(n)) {
            throw new fgm("On ne peut pas endormir le familier avec l'item " + n);
        }
        ffa_02.e(n);
    }

    public final void c(wu_0 wu_02) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        if (ffa_02.o()) {
            throw new fgm("Le familier est d\u00e9j\u00e0 endormi");
        }
        if (!ffa_02.n().c()) {
            throw new fgm("Le familier est d\u00e9j\u00e0 endormi depuis " + ffa_02.n());
        }
        wu_0 wu_03 = wc_0.p().a();
        wx_0 wx_02 = ffa_02.a().g(ffa_02.m());
        wt_0 wt_02 = new wt_0(wu_02);
        wt_02.a(wx_02);
        if (wt_02.b(wu_03)) {
            throw new fgm("Impossible de red\u00e9finir une date se terminant dans le pass\u00e9");
        }
        ffa_02.c(wu_02);
    }

    public final void d() {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        ffa_02.e(0);
    }

    public final void e() {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        ffa_0 ffa_02 = (ffa_0)this.b.f();
        ffa_02.c(wt_0.c);
    }

    protected void a(ffb_0 ffb_02) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        this.b.f().a(ffb_02);
    }

    protected void b(ffb_0 ffb_02) {
        if (!this.b.aQ_()) {
            throw new fgn("Il n'y a aucun pet avec lequel interagir");
        }
        this.b.f().b(ffb_02);
    }

    public ffz f() {
        return this.b;
    }

    public String toString() {
        return "PetController{m_petHolder=" + this.b + "}";
    }
}

