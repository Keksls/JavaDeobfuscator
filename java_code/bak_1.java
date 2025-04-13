/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAK
 */
public class bak_1
extends bFZ {
    static final Logger r = Logger.getLogger(bak_1.class);
    private euu_1 s;

    @Override
    public boolean b(Tv tv, TF tF) {
        return false;
    }

    @Override
    public Tv ap_() {
        return null;
    }

    @Override
    public Tv[] r() {
        return Tv.O;
    }

    @Override
    public cSS[] az_() {
        return cSS.k;
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
        this.g(true);
        this.i(true);
        assert (this.s == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s = null;
    }

    @Override
    public String al_() {
        if (this.s != null) {
            return bae.h().a(78, (long)this.s.m(), new Object[0]);
        }
        return "#ERROR#";
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
            r.error((Object)("[LD] Le panneau " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        try {
            n = Integer.valueOf(stringArray[0]);
        }
        catch (NumberFormatException numberFormatException) {
            r.error((Object)("[LD] Le panneau " + this.d + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui n'est pas du bon type (id attendu)"));
            return;
        }
        euu_1 euu_12 = (euu_1)evl_1.a.a(evg_1.e, n);
        if (euu_12 == null) {
            r.error((Object)("[LD] Le panneau " + this.d + " a un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.s = euu_12;
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

    static /* synthetic */ void a(bak_1 bak_12, abm_1 abm_12) {
        bak_12.a(abm_12);
    }
}

