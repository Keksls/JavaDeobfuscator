/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCx
 */
public class bcx_2
extends bFZ {
    static final Logger t = Logger.getLogger(bcx_2.class);
    public static final short q = 0;
    public static final short r = 1;
    public static final short s = 2;
    private bcy_2 u;
    private boolean v;
    private boolean w;

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.z = true;
        this.a((short)1);
        this.c((short)1);
        this.b(true);
        this.g(true);
        this.u = bcy_2.a;
        this.v = false;
        this.w = false;
    }

    @Override
    public cSS[] az_() {
        String string;
        int n;
        bmr_1 bmr_12 = azu_0.j().k();
        if (!this.u.a(this, bmr_12)) {
            return cSS.k;
        }
        cto_0 cto_02 = (cto_0)cSY.v.a();
        switch (this.g) {
            case 0: {
                n = cUL.n.aH;
                string = "close";
                break;
            }
            case 1: 
            case 2: {
                n = cUL.ak.aH;
                string = "containerOpen";
                break;
            }
            default: {
                n = cUL.ak.aH;
                string = "containerOpen";
            }
        }
        cto_02.a(n);
        cto_02.d("desc.mru." + string);
        return new cSS[]{cto_02};
    }

    @Override
    public short aL() {
        return 60;
    }

    @Override
    public void c(ph_0 ph_02) {
        t.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        t.info((Object)("Action performed on interactive element : " + tv.toString()));
        if (!this.N()) {
            return false;
        }
        if (!this.u.a(this, tF)) {
            return false;
        }
        this.a(tv);
        this.b(tv);
        return true;
    }

    @Override
    public void d(boolean bl) {
        super.d(bl);
        this.j(bl);
    }

    @Override
    public boolean aF_() {
        return true;
    }

    @Override
    public void ar_() {
        super.ar_();
        String[] stringArray = this.l.split(";");
        if (stringArray.length < 0 || stringArray.length > 3) {
            t.error((Object)("[LD] La porte " + this.d + " doit avoir 0, 1, 2 ou 3 param\u00e8tre(s)"));
            return;
        }
        if (stringArray.length == 0) {
            this.u = bcy_2.a;
            this.v = false;
            this.w = false;
            return;
        }
        if (stringArray.length == 1) {
            try {
                this.u = bcy_2.valueOf(stringArray[0].toUpperCase());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.u = bcy_2.a;
            }
            this.v = false;
            this.w = false;
        }
        if (stringArray.length == 2) {
            this.u = bcy_2.a;
            this.v = Boolean.parseBoolean(stringArray[0]);
            this.w = Boolean.parseBoolean(stringArray[1]);
        }
        if (stringArray.length == 3) {
            this.u = bcy_2.valueOf(stringArray[0].toUpperCase());
            this.v = Boolean.parseBoolean(stringArray[1]);
            this.w = Boolean.parseBoolean(stringArray[2]);
        }
    }

    @Override
    public Tv ap_() {
        return this.g == 1 || this.g == 2 ? Tv.r : Tv.s;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.r, Tv.s, Tv.t, Tv.u};
    }

    @Override
    protected void ao_() {
        super.ao_();
        switch (this.g) {
            case 0: {
                this.b(false);
                this.g(false);
                this.a(this.v);
                break;
            }
            case 1: 
            case 2: {
                this.b(true);
                this.g(true);
                this.a(this.w);
            }
        }
    }

    private void a(boolean bl) {
        for (ph_0 ph_02 : this.av_()) {
            ph_02.a(bl);
        }
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgy_1(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    static /* synthetic */ void a(bcx_2 bcx_22, abm_1 abm_12) {
        bcx_22.a(abm_12);
    }
}

