/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class cYT
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cYT.class);
    private static final cYT b = new cYT();
    private final app_0 c = app_0.b();
    private boolean d = true;
    private boolean e = true;
    private int f = 0;
    private int g = -1;
    private boolean h = false;
    private bah_2 i;
    private final afk_0<afe_0> j = new cYU(this);
    private eod_2 k = new eod_2();

    public static cYT a() {
        return b;
    }

    public final void c() {
        this.d = true;
    }

    public final void d() {
        this.d = false;
        this.i();
    }

    public void e() {
        this.e = false;
        this.i();
    }

    public void f() {
        this.e = true;
    }

    public void g() {
        this.f = 0;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (!this.h) {
            a.warn((Object)"Traitement d'un message alors que la frame n'est plus active");
            this.i();
        }
        if (azu_0.j().c(ddv_0.a())) {
            return true;
        }
        if (!this.d || !this.e) {
            return true;
        }
        switch (adt_12.a()) {
            case 18724: {
                this.h();
                return true;
            }
            case 16119: {
                dhL dhL2 = (dhL)adt_12;
                fzd_0.a().d();
                if (!dhL2.o()) {
                    this.i();
                    cyp_0.g().h().c(0, 0, (short)Short.MAX_VALUE);
                    return true;
                }
                if (!cyp_0.g().i()) {
                    return true;
                }
                this.f = 0;
                if (cyp_0.g().h() == null) {
                    return false;
                }
                blx_1 blx_12 = cYT.k();
                if (blx_12 == null) {
                    return false;
                }
                if (this.i != null && this.i.d() > 0) {
                    apl_1 apl_12 = this.i.a();
                    if (this.i.d() == 1 && blx_12.P_().b(apl_12.c()[0], apl_12.c()[1])) {
                        return false;
                    }
                    if (!this.a(blx_12, this.i)) {
                        return false;
                    }
                    this.f = this.i.d();
                    this.a(blx_12, apl_12);
                    this.e();
                    this.i();
                }
                return cYT.b(dhL2.r(), dhL2.s());
            }
        }
        return true;
    }

    private static boolean b(int n, int n2) {
        ArrayList<afv> arrayList = ans_0.D().c().b(n, n2);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        for (afv afv2 : arrayList) {
            if (!(afv2 instanceof biI)) continue;
            return true;
        }
        return false;
    }

    private boolean a(blx_1 blx_12, bah_2 bah_22) {
        eoc_2 eoc_22 = this.b(blx_12, bah_22.a());
        int n = eoc_22.a();
        int n2 = eoc_22.b() + this.a(bah_22);
        int n3 = this.b(bah_22);
        return n <= blx_12.c(eps_0.c) && n2 <= blx_12.c(eps_0.d) && n3 <= blx_12.c(eps_0.e);
    }

    public void h() {
        if (!this.d || !this.e) {
            return;
        }
        if (cyp_0.g().i()) {
            if (!cyp_0.g().l()) {
                this.j();
            } else {
                this.i();
            }
        }
    }

    private static blx_1 k() {
        blx_1 blx_12 = null;
        try {
            blx_12 = cyp_0.g().n().A().H();
            if (!blx_12.bp()) {
                a.warn((Object)"WORLD_SCENE_MOUSE_RELEASED demand\u00e9 pour un fighter qui n'est pas \u00e0 soi");
            }
        }
        catch (NullPointerException nullPointerException) {
            a.error((Object)"WORLD_SCENE_MOUSE_RELEASED dans une frame de combat, sans combat ou combattant");
        }
        return blx_12;
    }

    private void a(blx_1 blx_12, apl_1 apl_12) {
        cnb cnb2 = new cnb();
        cnb2.a(apl_12);
        cnb2.a(blx_12.a_());
        azu_0.j().K().c(cnb2);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        this.h = true;
        this.e = true;
        this.l();
        ((afv)azu_0.j().k().bv()).a(this.j);
        cyp_0.g().l();
        this.j();
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        this.h = false;
        this.l();
        azu_0.j().k().bv().c(this.j);
    }

    public void i() {
        this.c.a();
        this.i = null;
    }

    private void l() {
        this.f = 0;
        this.g = -1;
        cyp_0.g().m();
        this.i();
    }

    public void a(int n, int n2) {
    }

    public void j() {
        bvx_2 bvx_22 = cyp_0.g().n();
        if (bvx_22 == null) {
            this.i();
            return;
        }
        bxo_2 bxo_22 = bvx_22.A();
        if (bxo_22 == null) {
            this.i();
            return;
        }
        blx_1 blx_12 = bxo_22.H();
        if (blx_12 == null) {
            this.i();
            return;
        }
        if (!blx_12.bp()) {
            this.i();
            a.warn((Object)"refreshPath demand\u00e9 pour un fighter qui n'est pas \u00e0 soi");
            return;
        }
        if (cyp_0.g().h() == null || blx_12.a(eoz_1.d) || blx_12.a(eoz_1.aI)) {
            this.i();
            return;
        }
        int n = blx_12.c(eps_0.d);
        if (blx_12.a(eoz_1.J)) {
            n *= 2;
        }
        if (blx_12.a(eoz_1.I)) {
            n /= 2;
        }
        if (this.g != n) {
            this.g = n;
            this.f = 0;
        } else {
            n -= this.f;
        }
        if (n <= 0 && !this.a(blx_12)) {
            this.i();
            fzd_0.a().d();
            return;
        }
        biI biI2 = blx_12.bv();
        bah_2 bah_22 = blx_12.bR().a(blx_12, biI2, n);
        eoc_2 eoc_22 = this.b(blx_12, bah_22.a());
        if (bah_22.d() <= 0 || n <= 0 && !bah_22.c()) {
            this.i();
            fzd_0.a().d();
            return;
        }
        this.c.a(bah_22.a());
        int n2 = blx_12.c(eps_0.c);
        if (eoc_22.b() + this.a(bah_22) > n || n2 < eoc_22.a() || blx_12.c(eps_0.e) < this.b(bah_22)) {
            this.c.a(anr_0.I);
        } else {
            this.c.a(anr_0.H);
        }
        this.i = bah_22;
        String string = this.m();
        if (string != null) {
            if (fzd_0.a().h()) {
                fzd_0.a().a(null, string, 30, 0, frs_0.d);
            } else {
                fzd_0.a().a(string);
            }
        } else {
            fzd_0.a().d();
        }
    }

    private boolean a(blx_1 blx_12) {
        if (blx_12.Z_() != epn_2.g) {
            return false;
        }
        if (blx_12.c(eps_0.e) <= 0) {
            return false;
        }
        return bab_2.a(blx_12, blx_12.P_());
    }

    private eoc_2 b(blx_1 blx_12, apl_1 apl_12) {
        List<eoc_2> list = eob_2.a(apl_12, blx_12);
        return this.a(list);
    }

    private eoc_2 a(List<eoc_2> list) {
        eoc_2 eoc_22 = new eoc_2();
        for (eoc_2 eoc_23 : list) {
            eoc_22.a(eoc_22.a() + eoc_23.a());
            eoc_22.b(eoc_22.b() + eoc_23.b());
        }
        return eoc_22;
    }

    private String m() {
        return this.n();
    }

    private int a(bah_2 bah_22) {
        int n = bah_22.d();
        blx_1 blx_12 = cYT.k();
        if (blx_12 == null) {
            return n;
        }
        if (bah_22.b()) {
            if (blx_12.f(eoz_1.aR)) {
                return 1;
            }
            return (n + 3 - 1) / 3;
        }
        if (bah_22.c()) {
            return 0;
        }
        return n;
    }

    private int b(bah_2 bah_22) {
        return bah_22.c() ? bah_22.d() : 0;
    }

    @Nullable
    private String n() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return null;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return null;
        }
        blx_1 blx_12 = bvx_22.A().H();
        if (blx_12 == null || blx_12.a(eoz_1.ap)) {
            return null;
        }
        return this.b(blx_12);
    }

    private String b(blx_1 blx_12) {
        boolean bl;
        eoc_2 eoc_22 = this.b(blx_12, this.i.a());
        int n = eoc_22.a();
        int n2 = eoc_22.b();
        if (n2 == 0 && n == 0) {
            return null;
        }
        ani_2 ani_22 = new ani_2().a();
        if (n != 0) {
            bl = blx_12.c(eps_0.c) < n;
            ani_22.i();
            if (bl) {
                ani_22.a(azf_2.h.w());
            }
            ani_22.a((CharSequence)bae.h().a("tackle.apLoss", n)).j();
        }
        if (n2 != 0) {
            if (n != 0) {
                ani_22.m();
            }
            bl = blx_12.c(eps_0.d) < n2 + this.a(this.i);
            ani_22.i();
            if (bl) {
                ani_22.a(azf_2.h.w());
            }
            ani_22.a((CharSequence)bae.h().a("tackle.mpLoss", n2 + this.a(this.i))).j();
        }
        ani_22.b();
        String string = ani_22.r();
        if (string.isEmpty()) {
            return null;
        }
        return string;
    }
}

