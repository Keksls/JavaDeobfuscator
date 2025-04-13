/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bbM
 */
public final class bbm_0
extends ban {
    private long f;
    private int g;
    private boolean h;
    private boolean i;
    private yt_2 m;
    private int n;
    private int o;
    private int p;

    public bbm_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    public long o() {
        blx_1 blx_12 = this.d(this.f);
        if (blx_12 == null) {
            return 0L;
        }
        bpl_0 bpl_02 = bbL.a(blx_12, this.m);
        if (bpl_02 == null) {
            return 0L;
        }
        if (this.r()) {
            ani_2 ani_22;
            bvx_2 bvx_22 = blx_12.bz();
            if (bvx_22 != null) {
                blx_12.gh().a((epq_2)blx_12, (fio_0)bpl_02, (int)((els_0)bvx_22).P().u(), bvx_22.a(this.n, this.o, this.p));
            }
            if ((ani_22 = this.u()) != null) {
                e.a(ani_22.r());
            }
            return 0L;
        }
        return 0L;
    }

    @Nullable
    private ani_2 u() {
        blx_1 blx_12 = this.d(this.f);
        bph_0 bph_02 = bpp_0.a().a(this.g);
        if (bph_02 == null) {
            a.error((Object)("Sort inconnu " + this.g));
            return null;
        }
        ani_2 ani_22 = new ani_2().i().a(aug_0.f);
        if (bph_02.g() && blx_12.fW() && !blx_12.bo()) {
            ani_22.a((CharSequence)bae.h().a("fight.spellCast.shadow", new ani_2().a().a((CharSequence)blx_12.gd()).b().r()));
        } else {
            ani_22.a((CharSequence)bae.h().a("fight.spellCast", new ani_2().a().a((CharSequence)blx_12.gd()).b().r(), new ani_2().a().a((CharSequence)bph_02.b()).r()));
        }
        ani_22.j();
        if (this.h) {
            this.b(ani_22);
        } else if (this.i) {
            this.a(ani_22);
        }
        return ani_22;
    }

    private void a(ani_2 ani_22) {
        if (azu_0.j().k().bA() == this.n().c()) {
            ani_22.a().a(aug_0.g);
            ani_22.a((CharSequence)" (").a((CharSequence)bae.h().a("critical.miss", new Object[0])).a((CharSequence)")");
        }
    }

    private void b(ani_2 ani_22) {
        if (azu_0.j().k().bA() == this.n().c()) {
            ani_22.i().a(aug_0.g);
            ani_22.a((CharSequence)" (").a((CharSequence)bae.h().a("critical", new Object[0])).a((CharSequence)")");
            ani_22.j();
        }
    }

    public void e(long l) {
        this.f = l;
    }

    public void e(int n) {
        this.g = n;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public void c(boolean bl) {
        this.i = bl;
    }

    public void a(yt_2 yt_22) {
        this.m = yt_22;
    }

    public void f(int n) {
        this.n = n;
    }

    public void g(int n) {
        this.o = n;
    }

    public void h(int n) {
        this.p = n;
    }
}

