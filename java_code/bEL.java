/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bEL
extends bFZ {
    static final Logger s = Logger.getLogger(bEL.class);
    protected evm_1 q;

    bEL() {
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.A;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.A};
    }

    @Override
    public cSS[] az_() {
        cSS[] cSSArray = new cSS[1];
        return cSSArray;
    }

    @Override
    public short aL() {
        return 60;
    }

    @Override
    public String al_() {
        return bae.h().a(110, (long)this.q.m(), new Object[0]);
    }

    @Override
    public void ar_() {
        if (Cz.f(this.l)) {
            this.q = null;
            return;
        }
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            s.error((Object)("[LD] L'IE de Stool " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        evm_1 evm_12 = (evm_1)evl_1.a.a(evg_1.r, Integer.valueOf(stringArray[0]));
        if (evm_12 == null) {
            s.error((Object)("[LD] L'IE de Recycle " + this.d + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.q = evm_12;
    }

    protected int Z() {
        return 1;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.q = null;
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
        assert (this.q == null);
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgi_1(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    static /* synthetic */ void a(bEL bEL2, abm_1 abm_12) {
        bEL2.a(abm_12);
    }
}

