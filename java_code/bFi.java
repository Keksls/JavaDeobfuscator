/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bFi
extends bFZ
implements ezz_1 {
    static final Logger s = Logger.getLogger(bFi.class);
    long t;
    protected evo_1 q;
    private final fo_1 u = new bfj_0(this, 8);

    @Override
    public void c(ph_0 ph_02) {
        s.info((Object)("[ON VIEW UPDATED] Stool : " + ph_02));
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a(TI.c);
        this.b(false);
        this.g(false);
        this.i(false);
        this.t = 0L;
        assert (this.q == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.q = null;
    }

    @Override
    public void ar_() {
        if (Cz.f(this.l)) {
            this.q = null;
            return;
        }
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            s.error((Object)("[LD] L'IE de Stool " + this.d + " doit avoir 0 ou 1 param\u00e8tre"));
            return;
        }
        evo_1 evo_12 = (evo_1)evl_1.a.a(evg_1.k, Integer.valueOf(stringArray[0]));
        if (evo_12 == null) {
            s.error((Object)("[LD] L'IE de Stool " + this.d + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.q = evo_12;
    }

    @Override
    protected fo_1 ad() {
        return this.u;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        bnh_1 bnh_12 = (bnh_1)tF;
        if (!this.a(bnh_12)) {
            return true;
        }
        this.a(tv);
        switch (tv) {
            case g: 
            case h: {
                this.b(tv);
                return true;
            }
        }
        return false;
    }

    @Override
    public Tv ap_() {
        if (this.aq() == 0L) {
            return Tv.g;
        }
        return Tv.i;
    }

    @Override
    public Tv[] r() {
        if (this.aq() == 0L) {
            return new Tv[]{Tv.g};
        }
        return Tv.O;
    }

    private long aq() {
        if (this.t == 0L) {
            return 0L;
        }
        blx_1 blx_12 = bmf_2.a().c(this.t);
        if (blx_12 == null) {
            this.t = 0L;
        }
        return this.t;
    }

    public void Z() {
        this.t = 0L;
    }

    @Override
    public cSS[] az_() {
        if (this.aq() != 0L) {
            return cSS.k;
        }
        cto_0 cto_02 = (cto_0)cSY.v.a();
        fii fii2 = this.aD();
        if (fii2 != null) {
            cto_02.a(fii2.c());
            cto_02.d("desc.mru." + fii2.d());
        } else {
            cto_02.a(cUL.ag.aH);
            cto_02.d("desc.mru.sit");
        }
        return new cSS[]{cto_02};
    }

    @Override
    public boolean aB_() {
        return this.aq() == 0L && this.D;
    }

    @Override
    public byte W() {
        return 2;
    }

    @Override
    public boolean N() {
        return super.N() && this.a(azu_0.j().k());
    }

    private boolean a(bnh_1 bnh_12) {
        boolean bl = this.ay().h();
        boolean bl2 = this.b(bnh_12);
        if (!bl2) {
            s.error((Object)("Le perso doit poss\u00e9der l'anim " + this.ar()));
        }
        boolean bl3 = this.q == null || this.q.a().b(bnh_12, this, null, bnh_12.Q_());
        return bl || bl2 && bl3;
    }

    private boolean b(bnh_1 bnh_12) {
        atd_2 atd_22 = bnh_12.bv().an();
        if (atd_22 == null) {
            return false;
        }
        return atd_22.c(this.ar());
    }

    private String ar() {
        return aby_0.a(aej_2.b.l, this.ao(), "-Assis");
    }

    public String ao() {
        fii fii2 = this.aD();
        if (fii2 == null || Cz.f(fii2.b())) {
            s.error((Object)("Visuel sans anim pour le stool " + this.a_()));
            return "";
        }
        return fii2.b();
    }

    private fii aD() {
        if (this.q == null) {
            s.error((Object)("Pas de visuel pour le stool " + this.a_()));
            return null;
        }
        return fij.a().a(this.q.n());
    }

    @Override
    public ezx_1 ay_() {
        return this.q;
    }

    public boolean ap() {
        return this.j == Tx.b.a();
    }

    @Override
    public void a(aej_2 aej_22) {
        if (this.ap() && aej_22 != aej_2.b && aej_22 != aej_2.d) {
            aej_22 = aej_2.b;
        }
        super.a(aej_22);
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgk_0(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public boolean au_() {
        bjw_1 bjw_12 = this.aE();
        return bjw_12 != null;
    }

    @Nullable
    private bjw_1 aE() {
        Optional<Integer> optional = eum_1.a().a(this.aC());
        return optional.map(n -> bhb_0.d().a((int)n)).orElse(null);
    }

    @Override
    public String al_() {
        bjw_1 bjw_12 = this.aE();
        if (bjw_12 == null) {
            return super.al_();
        }
        return bjw_12.e();
    }

    static /* synthetic */ void a(bFi bFi2, abm_1 abm_12) {
        bFi2.a(abm_12);
    }
}

