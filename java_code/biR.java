/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

public class biR
implements YT {
    private static final Logger b = Logger.getLogger(biR.class);
    private FreeParticleSystem c;
    private FreeParticleSystem d;
    private FreeParticleSystem e;
    private FreeParticleSystem f;
    private FreeParticleSystem g;
    private FreeParticleSystem h;
    private final biI i;

    public biR(biI biI2) {
        assert (biI2 != null);
        this.i = biI2;
        this.i.a(this);
    }

    @Override
    public void a(boolean bl, YU yU) {
        if (this.i == null) {
            return;
        }
        if (bl) {
            this.i.bN();
        } else {
            this.i.bO();
        }
    }

    public void a() {
        this.d();
        this.k();
        this.p();
        this.r();
        this.e();
        this.l();
    }

    public void b() {
        if (this.c != null) {
            this.c.b(true);
        }
    }

    public void c() {
        if (this.c != null) {
            this.c.b(false);
        }
    }

    public void d() {
        if (this.c != null) {
            aik_0.a().b(this.c.ac());
            this.c = null;
        }
    }

    public void e() {
        if (this.d != null) {
            aik_0.a().b(this.d.ac());
            this.d = null;
        }
    }

    public void f() {
        if (this.e != null) {
            this.e.b(true);
        }
    }

    public void g() {
        if (this.e != null) {
            this.e.b(false);
        }
    }

    public void h() {
        if (this.f != null) {
            this.f.b(true);
        }
    }

    public void i() {
        if (this.f != null) {
            this.f.b(false);
        }
    }

    public void j() {
        if (this.d != null) {
            this.d.b(false);
        }
    }

    public void a(byte by) {
        this.k();
        this.a(by, anr_0.ag);
    }

    public void b(byte by) {
        this.k();
        this.a(by, anr_0.af);
    }

    private void a(byte by, int[][] nArray) {
        blx_1 blx_12 = this.i.bI();
        if (blx_12 == null || this.e != null) {
            b.error((Object)String.format("Cercle d'\u00e9quipe d\u00e9j\u00e0 pr\u00e9sent sur #%d %s - %s", this.i.a(), blx_12, aho_2.a(6)));
            return;
        }
        int n = blx_12.bA();
        byte by2 = blx_12.X();
        if (by2 < 0 || by2 >= nArray.length) {
            by2 = 0;
        }
        if (by < 0 || by >= nArray[by2].length) {
            b.error((Object)String.format("Id de team invalide pour afficher le cercle d'\u00e9quipe sur #%d %s %s", this.i.a(), blx_12, aho_2.a(6)));
            return;
        }
        assert (this.e == null);
        this.k();
        this.e = aij_0.a().a(nArray[by2][by]);
        if (this.e != null) {
            this.e.a(this.i);
            this.e.a(n);
            this.e.b(this.i.at());
            aik_0.a().b(this.e);
        } else {
            b.error((Object)("Impossible d'afficher le cercle d'\u00e9quipe sur l'acteur id=" + this.i.a() + " : APS invalide (" + nArray[by2][by] + ")"));
        }
    }

    public void k() {
        if (this.e == null) {
            return;
        }
        aik_0.a().b(this.e.ac());
        this.e = null;
    }

    public void a(aej_2 aej_22) {
        int n;
        blx_1 blx_12 = this.i.bI();
        int n2 = blx_12.bA();
        byte by = blx_12.Y();
        if (by < 0 || by >= anr_0.ac.length) {
            return;
        }
        int[] nArray = anr_0.ac[by];
        int n3 = aej_22.l;
        switch (n3) {
            case 1: {
                n = nArray[0];
                break;
            }
            case 3: {
                n = nArray[1];
                break;
            }
            case 5: {
                n = nArray[2];
                break;
            }
            case 7: {
                n = nArray[3];
                break;
            }
            default: {
                n = nArray[0];
            }
        }
        byte by2 = blx_12.X();
        aff_1 aff_12 = null;
        if (by2 == 1) {
            aff_12 = blx_12.P_();
            aff_12.a(aej_22);
        }
        this.l();
        this.f = aij_0.a().a(n);
        if (this.f != null) {
            if (aff_12 != null) {
                this.f.b(aff_12.d(), aff_12.e(), aff_12.f());
            } else {
                this.f.a(this.i);
            }
            this.f.a(n2);
            this.f.b(this.i.at());
            aik_0.a().b(this.f);
        }
    }

    public void l() {
        if (this.f == null) {
            return;
        }
        aik_0.a().b(this.f.ac());
        this.f = null;
    }

    public void m() {
        blx_1 blx_12 = this.i.bI();
        if (blx_12 == null) {
            return;
        }
        if (!blx_12.ca()) {
            return;
        }
        int n = blx_12.bA();
        byte by = blx_12.Y();
        if (by < 0 || by >= anr_0.ab.length) {
            return;
        }
        this.c = aij_0.a().a(anr_0.ab[by]);
        if (this.c != null) {
            this.c.a(this.i);
            this.c.a(n);
            aik_0.a().b(this.c);
        }
    }

    public void n() {
        blx_1 blx_12 = this.i.bI();
        if (blx_12 == null) {
            return;
        }
        if (!blx_12.ca()) {
            return;
        }
        int n = blx_12.bA();
        byte by = blx_12.Y();
        if (by < 0 || by >= anr_0.ad.length) {
            return;
        }
        this.d = aij_0.a().a(anr_0.ad[by]);
        if (this.d != null) {
            this.d.a(this.i);
            this.d.a(n);
            aik_0.a().b(this.d);
        }
    }

    public void c(byte by) {
        blx_1 blx_12 = this.i.bI();
        if (blx_12 == null) {
            return;
        }
        int n = blx_12.bA();
        if (this.g != null) {
            aik_0.a().b(this.g.ac());
            this.g = null;
        }
        this.g = by >= 0 ? aij_0.a().a(anr_0.ai[by]) : (blx_12.gY() == 0 || blx_12.gY() == 5 ? aij_0.a().a(anr_0.aj[0]) : aij_0.a().a(anr_0.aj[1]));
        if (this.g != null) {
            this.g.a(this.i);
            this.g.a(n);
            aik_0.a().b(this.g);
        }
    }

    public void o() {
        blx_1 blx_12 = this.i.bI();
        if (blx_12 == null) {
            return;
        }
        int n = blx_12.bA();
        if (this.g != null) {
            aik_0.a().b(this.g.ac());
            this.g = null;
        }
        this.g = aij_0.a().a(anr_0.aj[1]);
        if (this.g != null) {
            this.g.a(this.i);
            this.g.a(n);
            aik_0.a().b(this.g);
        }
    }

    public void p() {
        if (this.g != null) {
            aik_0.a().b(this.g.ac());
            this.g = null;
        }
    }

    public void q() {
        blx_1 blx_12 = this.i.bI();
        if (blx_12 == null) {
            return;
        }
        int n = blx_12.bA();
        byte by = blx_12.Y();
        if (this.h != null) {
            aik_0.a().b(this.h.ac());
            this.h = null;
        }
        if (by >= 0 && by < anr_0.ae.length) {
            this.h = aij_0.a().a(anr_0.ae[by]);
        }
        if (this.h != null) {
            this.h.a(this.i);
            this.h.a(n);
            aik_0.a().b(this.h);
        }
    }

    public void r() {
        if (this.h != null) {
            aik_0.a().b(this.h.ac());
            this.h = null;
        }
    }
}

