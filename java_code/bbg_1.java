/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBg
 */
public class bbg_1
extends bFZ
implements bgm_1 {
    static final Logger r = Logger.getLogger(bbg_1.class);
    private bgn_1 s;

    @Override
    protected fo_1 ad() {
        return this.s != null ? this.s.f() : fo_1.c;
    }

    public void u() {
        this.T();
        this.aI_();
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
    public short aL() {
        return 60;
    }

    @Override
    public String al_() {
        eaa_0 eaa_02 = this.aa();
        return eaa_02 == null ? "" : eaa_02.f();
    }

    @Override
    public void ar_() {
        String[] stringArray = this.l.split(";");
        int n = stringArray.length;
        if (n != 2 && n != 4) {
            r.error((Object)("[LevelDesign] La CharacterStatue " + this.d + " n'a pas le bon nombre de param\u00e8tres"));
            return;
        }
        if (n == 2) {
            String string = stringArray[0];
            int n2 = Integer.parseInt(stringArray[1]);
            this.s = new bgt_1(this, string);
            super.ar_();
        } else {
            short s2 = Short.parseShort(stringArray[0]);
            byte by = Byte.parseByte(stringArray[1]);
            String string = stringArray[2];
            int n3 = Integer.parseInt(stringArray[3]);
            this.s = new bgr_1(this, string, n3);
            super.ar_();
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        this.b(true);
        this.g(true);
        this.B = true;
        this.A = false;
        assert (this.s == null);
    }

    @Override
    public bgn_1 Z() {
        return this.s;
    }

    @Override
    public eaa_0 aa() {
        return this.s.e();
    }

    static /* synthetic */ void a(bbg_1 bbg_12, abm_1 abm_12) {
        bbg_12.a(abm_12);
    }
}

