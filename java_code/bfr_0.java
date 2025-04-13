/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bFR
 */
public class bfr_0
extends ahv {
    private static final String al = "part";
    protected boolean af;
    protected boolean ag;
    private byte am = (byte)-1;
    protected boolean ah;
    protected String ai;
    protected int aj;
    protected int ak;
    private static final akr_1[] an = new akr_1[]{akf_0.d(), ake_0.d(), aki_0.h(), byh_0.d(), bZd.a};

    public bfr_0() {
        this.onCheckOut();
    }

    @Override
    public void a(@NotNull pj_0 pj_02) {
        super.a(pj_02);
        this.am = ~pj_02.ae();
        this.e();
    }

    @Override
    public void onInteractiveElementChanges(TG tG) {
        this.e();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.ai = "ANMInteractiveElementPath";
        this.af = true;
        this.a(new bFS(this));
        this.am = (byte)-1;
        this.p = ali_1.a;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        aik_0.a().b(this.ak);
        this.aj = -1;
        this.ak = -1;
        dbm_0.a().a((YP)this);
        this.ai = "ANMInteractiveElementPath";
        this.aF();
        this.R();
    }

    @Override
    public boolean aE() {
        boolean bl = super.aE();
        pj_0 pj_02 = this.d();
        if (fis_1.a().c("isAdmin")) {
            return bl && pj_02.c(true);
        }
        return bl && pj_02.N();
    }

    @Override
    public void e() {
        bFZ bFZ2 = (bFZ)this.ad;
        if (bFZ2 != null) {
            IsoParticleSystem isoParticleSystem;
            bgz_1 bgz_12 = bFZ2.aB();
            if (bgz_12.a()) {
                aff_1 aff_12 = bgz_12.b();
                this.b(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
            } else {
                this.b(bFZ2.G(), (float)bFZ2.H(), (float)bFZ2.I());
            }
            if (this.ae == Short.MIN_VALUE) {
                this.ae = (short)(bFZ2.an_() ? (int)bFZ2.as() : Short.MIN_VALUE);
            }
            byte by = (byte)bFZ2.B();
            if (this.ae == -1 && by == 0 && (isoParticleSystem = aij_0.a().a(800220)) != null) {
                isoParticleSystem.a(this.G(), (float)this.H(), (float)this.I());
                aik_0.a().b(isoParticleSystem);
            }
            this.a(by, bFZ2.am_(), bFZ2.au(), bFZ2.F());
            this.ae = by;
            this.c(bFZ2.P());
            this.q(bFZ2.av());
            this.b(bFZ2.ae());
            isoParticleSystem = aik_0.a().a(this.ak);
            if (isoParticleSystem != null) {
                isoParticleSystem.b(bFZ2.P() && bFZ2.N());
            }
            boolean bl = this.ag;
            this.ag = bFZ2.au_();
            if (bl && !this.ag) {
                dbm_0.a().a((YP)this);
            }
        } else {
            Y.error((Object)"Cet ClientInteractiveElementView n'a pas de mod\u00e8le associ\u00e9.");
        }
    }

    private void b(byte by) {
        if (this.am == by) {
            return;
        }
        for (int k = 0; k < 8; ++k) {
            boolean bl;
            int n = 1 << k;
            boolean bl2 = (by & n) == n;
            boolean bl3 = bl = (this.am & n) == n;
            if (bl == bl2) continue;
            this.b(al + k, bl2);
        }
        this.am = by;
    }

    @Override
    public void b(int n) {
        super.b(n);
        String string = "";
        try {
            string = azs_0.a().a(this.ai);
            string = String.format(string, n);
            this.a(Integer.toString(n));
            if (n != 0) {
                this.a(string, true);
            }
        }
        catch (Exception exception) {
            Y.error((Object)"impossible de r\u00e9cup\u00e9rer le path depuis la config ", (Throwable)exception);
        }
    }

    @Override
    public void a(int n, int n2) {
        this.aj = n;
        if (this.aj > 0) {
            FreeParticleSystem freeParticleSystem = aij_0.a().a(this.aj);
            freeParticleSystem.a(this, 0.0f, n2);
            aik_0.a().b(freeParticleSystem);
            this.ak = freeParticleSystem.ac();
        }
    }

    public boolean aM() {
        return this.ah;
    }

    public void q(boolean bl) {
        this.ah = bl;
    }

    @Override
    public akr_1[] aJ() {
        return an;
    }

    public void m(String string) {
        this.ai = string;
    }

    public String aN() {
        if (this.ad != null && this.ad instanceof bFZ) {
            return ((bFZ)this.ad).am();
        }
        return null;
    }

    protected int aO() {
        if (this.ad != null && this.ad instanceof bFZ) {
            return ((bFZ)this.ad).as_();
        }
        return -1;
    }

    public void aP() {
        ani_2 ani_22;
        fvE fvE2 = fta_0.getInstance().getMouseOver();
        if (fvE2 != null && fvE2 != fta_0.getInstance()) {
            return;
        }
        bFZ bFZ2 = (bFZ)this.d();
        if (bFZ2 == null) {
            return;
        }
        Object object = bFZ2.al_();
        String string = this.aN();
        if (string != null) {
            object = (String)object + string;
        }
        if (bgp_1.a(bFZ2) && bFZ2.aH_() != null && !bFZ2.aH_().aM_() && !bgp_1.b(bFZ2)) {
            ani_22 = new ani_2().m();
            ani_22.a(azf_2.j).a((CharSequence)bae.h().a("item.learnable", new Object[0])).j();
            if (object != null) {
                object = (String)object + ani_22.r();
            }
        }
        if (object == null) {
            object = "ERROR : Text is null";
            Y.error((Object)"The text is null, which certainly means that the initialization of the object has not taken place or has gone wrong.");
        }
        ani_22 = new ani_2();
        ani_22.a((CharSequence)"(").a((CharSequence)String.valueOf(this.a())).a((CharSequence)")");
        if (bFZ2.O()) {
            ani_22.a(azf_2.i).a((CharSequence)" locked").j();
        }
        if (bFZ2 instanceof bap_2) {
            boolean bl = ((bap_2)bFZ2).aM_();
            ani_22.m().a((CharSequence)(" virtual: " + bl));
        }
        ani_22.m().a((CharSequence)(" direction: " + bFZ2.F().name()));
        String string2 = ani_22.r();
        dhg dhg2 = new dhg(this, bFZ2.at(), this.aO());
        if (this.d() instanceof bcf_1) {
            ani_2 ani_23 = new ani_2();
            object = ani_23.a().a((CharSequence)object).b().r();
            dhg2.a((String)object, string2, null, null);
            bcf_1 bcf_12 = (bcf_1)this.d();
            ArrayList<bHN> arrayList = bcf_12.Z().k();
            for (bHN bHN2 : arrayList) {
                ani_23 = new ani_2();
                ani_23.a((CharSequence)bHN2.m()).a((CharSequence)" x").a(bHN2.q().f);
                ani_23.m();
                ani_23.a(bHN2.p()).a((CharSequence)" \u00a7");
                dhg2.a(ani_23.r(), null, bHN2.h().O());
            }
        } else {
            List<String> list = bgp_1.c(bFZ2);
            dhg2.a((String)object, string2, null, list);
        }
        dbm_0.a().a(dhg2);
    }

    @Override
    public void b(float f2, float f3, float f4) {
        if (this.J() != f2 || this.K() != f3 || this.L() != f4) {
            ahs.d().a(this.a(), (int)f2, (int)f3);
            super.b(f2, f3, f4);
        }
    }

    @Override
    public int az() {
        if (this.ad == null) {
            return super.az();
        }
        return ((bFZ)this.ad).aA();
    }

    static /* synthetic */ void a(bfr_0 bfr_02, abm_1 abm_12) {
        bfr_02.a(abm_12);
    }

    static /* synthetic */ Logger aQ() {
        return Y;
    }
}

