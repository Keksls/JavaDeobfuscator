/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from bFz
 */
public class bfz_0
extends bFZ
implements ezz_1 {
    static final Logger r = Logger.getLogger(bfz_0.class);
    private evr_1 s;
    private int t;
    private int u;

    @Override
    public boolean b(Tv tv, TF tF) {
        r.info((Object)("Action performed on interactive element : " + tv.toString()));
        this.a(tv);
        this.b(tv);
        return true;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    public Tv ap_() {
        boolean bl = this.g == 1 && this.s.j() >= 0;
        boolean bl2 = this.g == 0 && this.s.g() >= 0;
        return bl || bl2 ? Tv.a : Tv.i;
    }

    @Override
    public cSS[] az_() {
        fii fii2 = this.ap();
        if (fii2 == null) {
            return cSS.k;
        }
        cSX cSX2 = (cSX)cSY.ad.a();
        cSX2.a(fii2.c());
        boolean bl = this.ao();
        cSX2.d("desc.mru." + fii2.d());
        if (this.ap().g()) {
            cSX2.a(bDZ.b(this.ap().h()[0], 1, 0, false));
        }
        cSX2.a(true);
        cSX2.c(fii2.e() && bl);
        return new cSS[]{cSX2};
    }

    private boolean ao() {
        return this.ap().a(azu_0.j().k());
    }

    private fii ap() {
        fii fii2;
        switch (this.g) {
            case 1: {
                fii2 = fij.a().a(this.s.j());
                break;
            }
            case 0: {
                fii2 = fij.a().a(this.s.g());
                break;
            }
            default: {
                throw new IllegalStateException("State " + this.g + " inconnu pour un Lampadaire");
            }
        }
        return fii2;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
        this.t = 0;
        this.u = 0;
        assert (this.s == null);
    }

    @Override
    protected void ao_() {
        super.ao_();
        switch (this.g) {
            case 1: {
                this.ar();
                break;
            }
            case 0: {
                this.aq();
            }
        }
    }

    private void aq() {
        aed.a.a(this.t, 1000);
        IsoParticleSystem isoParticleSystem = aik_0.a().a(this.u);
        if (isoParticleSystem != null) {
            isoParticleSystem.i(500);
        }
        this.t = -1;
        this.u = -1;
    }

    private void ar() {
        this.aq();
        try {
            avk_2 avk_22 = avo_2.a.a();
            this.t = avk_22.d();
            azf_2 azf_22 = new azf_2(this.s.a());
            avk_22.b(0.0f, 0.0f, 0.0f);
            avk_22.c(0.0f, 0.0f, 0.0f);
            avk_22.b(azf_22.q(), azf_22.r(), azf_22.s(), 1000);
            avk_22.a(new afr_2(this.G(), this.H(), this.I()));
            avk_22.a(this.s.d());
            avk_22.b(true);
            avk_22.a(this.s.f());
            aed.a.a(avk_22);
            int n = this.s.e();
            if (n > 0) {
                CellParticleSystem cellParticleSystem = aij_0.a().b(n);
                if (cellParticleSystem != null) {
                    cellParticleSystem.a(this.G(), (float)this.H(), (float)(this.I() + this.W()));
                    aik_0.a().b(cellParticleSystem);
                    this.u = cellParticleSystem.ac();
                } else {
                    r.error((Object)("Particule non trouv\u00e9e " + n));
                }
            }
        }
        catch (Exception exception) {
            r.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public boolean am_() {
        return true;
    }

    @Override
    public void c(ph_0 ph_02) {
        r.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public void ar_() {
        super.ar_();
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            r.error((Object)("[LD] Le lampadaire " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        evr_1 evr_12 = (evr_1)evl_1.a.a(evg_1.d, Integer.valueOf(stringArray[0]));
        if (evr_12 == null) {
            r.error((Object)("[LD] Le lampadaire " + this.d + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.s = evr_12;
        this.i(false);
    }

    @Override
    public ezx_1 ay_() {
        return this.s;
    }

    @Override
    public void aE_() {
        aed.a.d(this.t);
        aik_0.a().b(this.u);
        super.aE_();
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    static /* synthetic */ void a(bfz_0 bfz_02, abm_1 abm_12) {
        bfz_02.a(abm_12);
    }
}

