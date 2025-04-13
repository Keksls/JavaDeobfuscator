/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bDS
 */
public class bds_0
extends bFZ {
    static final Logger r = Logger.getLogger(bds_0.class);
    private evh_1 s;

    @Override
    public boolean b(Tv tv, TF tF) {
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    public Tv[] r() {
        return Tv.O;
    }

    @Override
    public cSS[] az_() {
        return super.az_();
    }

    @Override
    public byte W() {
        return 4;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.b(true);
        this.i(true);
        assert (this.s == null);
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s = null;
    }

    @Override
    public int as_() {
        return 0;
    }

    @Override
    public void ar_() {
        int n;
        super.ar_();
        this.g = 1;
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            r.error((Object)("[LD] La borne de krosmoz " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        try {
            n = Integer.valueOf(stringArray[0]);
        }
        catch (NumberFormatException numberFormatException) {
            r.error((Object)("[LD] La borne de krosmoz " + this.d + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui n'est pas du bon type (id attendu)"));
            return;
        }
        evh_1 evh_12 = (evh_1)evl_1.a.a(evg_1.z, n);
        if (evh_12 == null) {
            r.error((Object)("[LD] La borne de krosmoz " + this.d + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.s = evh_12;
    }

    @Override
    public void c(ph_0 ph_02) {
        r.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public void aq_() {
        super.aq_();
        this.D = false;
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgg_1(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public boolean N() {
        return true;
    }

    static /* synthetic */ void a(bds_0 bds_02, abm_1 abm_12) {
        bds_02.a(abm_12);
    }
}

