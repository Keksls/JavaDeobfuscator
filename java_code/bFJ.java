/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bFJ
extends bFZ {
    static final Logger r = Logger.getLogger(bFJ.class);
    private int s;
    private String t = "";
    private int u;
    private ww_0 v;
    boolean w;
    private final fo_1 J = new bfk_0(this, 1);

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        if (tv == Tv.a) {
            this.aI_();
            bmr_1 bmr_12 = azu_0.j().k();
            exk_2 exk_22 = (exk_2)bmr_12.da().d(this.s);
            if (exk_22 == null) {
                aUh.a("inventory.error.lackItem", new Object[0]);
                return false;
            }
            if (this.w) {
                aUh.a("boat.cantTravel", new Object[0]);
                return false;
            }
            this.b(tv);
        }
        return true;
    }

    @Override
    protected fo_1 ad() {
        return this.J;
    }

    public int ao() {
        return this.s;
    }

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    public cSS[] az_() {
        cSS[] cSSArray = new cSS[1];
        cto_0 cto_02 = (cto_0)cSY.v.a();
        cto_02.a(this.u);
        cSSArray[0] = cto_02;
        return cSSArray;
    }

    @Override
    public short aL() {
        return 60;
    }

    @Override
    public String al_() {
        return bae.h().a(this.t, new Object[0]);
    }

    @Override
    public void ar_() {
        super.ar_();
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 9) {
            r.error((Object)("[LevelDesign] La controlleuse de ticket " + this.d + " doit avoir 3 param\u00e8tres : itemId, id translator, et id mruGfx"));
            return;
        }
        this.s = Integer.valueOf(stringArray[0]);
        this.t = stringArray[1];
        this.u = Integer.valueOf(stringArray[2]);
        short s2 = Short.valueOf(stringArray[3]);
        this.v = new ww_0(0, Integer.valueOf(stringArray[4]), 0, 0);
        ww_0 ww_02 = new ww_0(0, Integer.valueOf(stringArray[5]), 0, 0);
        int n = Integer.valueOf(stringArray[6]);
        short s3 = Short.valueOf(stringArray[7]);
        int n2 = Integer.valueOf(stringArray[8]);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.v = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        this.b(false);
        this.g(true);
        this.B = true;
        this.A = true;
        this.s = 0;
        this.t = "";
        this.u = 0;
        assert (this.v == null);
        this.w = false;
    }

    public wx_0 ap() {
        return this.v;
    }

    public void a(boolean bl) {
        this.w = bl;
    }

    static /* synthetic */ void a(bFJ bFJ2, abm_1 abm_12) {
        bFJ2.a(abm_12);
    }
}

