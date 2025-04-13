/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bDg
extends bFZ {
    protected static final Logger q = Logger.getLogger(bDg.class);
    int r;
    int s;
    int t;
    private final fo_1 u = new bDh(this, 22);

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        this.b(tv);
        this.a(tv);
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.w;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.w};
    }

    @Override
    public cSS[] az_() {
        if (this.t == -1) {
            return cSS.k;
        }
        cSS[] cSSArray = new cSS[1];
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.a(this.t);
        cTF2.a("ie.scenario.mru." + this.s);
        cTF2.b(Tv.w);
        cSSArray[0] = cTF2;
        return cSSArray;
    }

    @Override
    public short aL() {
        return (short)((float)this.W() * 10.0f);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
        this.r = 0;
        this.s = -1;
        this.t = -1;
    }

    @Override
    protected fo_1 ad() {
        return this.u;
    }

    @Override
    public String al_() {
        return bae.h().a("ie.scenario.name." + this.s, new Object[0]);
    }

    void Z() {
        if (this.r != -1) {
            if (this.av_().isEmpty()) {
                bft_0 bft_02 = new bft_0();
                ph_0 ph_02 = (ph_0)bft_02.b();
                ph_02.a(1);
                ph_02.b(0);
                ph_02.a((byte)4);
                this.a(ph_02);
            }
            for (ph_0 ph_02 : this.av_()) {
                if (!(ph_02 instanceof bfr_0)) continue;
                ph_02.b(this.r);
            }
        }
    }

    @Override
    public void ar_() {
        super.ar_();
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1 && stringArray.length != 2) {
            q.error((Object)"[LevelDesign] Un \u00e9l\u00e9ment de sc\u00e9nario g\u00e9n\u00e9rique doit avoir 1 ou 2 param\u00e8tres : id dans le translator et id du gfx du MRU (-1 si cet \u00e9l\u00e9ment ne doit pas avoir de MRU");
            return;
        }
        this.s = Integer.valueOf(stringArray[0].trim());
        this.a(aej_2.d);
    }

    @Override
    public void aE_() {
        super.aE_();
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public aej_2 F() {
        return aej_2.d;
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    static /* synthetic */ aff_1 a(bDg bDg2) {
        return bDg2.e;
    }

    static /* synthetic */ void a(bDg bDg2, abm_1 abm_12) {
        bDg2.a(abm_12);
    }
}

