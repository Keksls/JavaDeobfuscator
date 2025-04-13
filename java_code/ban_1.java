/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAN
 */
public class ban_1
extends bak_1 {
    static final Logger s = Logger.getLogger(ban_1.class);
    ckt_2 t;
    private int u;
    boolean v;
    wt_0 w;
    wt_0 J;
    private final fo_1 K = new bao_1(this, 15);
    Runnable L;

    @Override
    protected fo_1 ad() {
        return this.K;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.t = null;
        this.w = null;
        this.J = null;
        if (this.L != null) {
            ado_1.a().b(this.L);
            this.L = null;
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.u = 0;
        this.v = false;
        assert (this.t == null);
        assert (this.w == null);
        assert (this.J == null);
        assert (this.L == null);
    }

    protected void u() {
        String string = "interactiveBubbleDialog" + zd_0.a().b();
        this.t = (ckt_2)fpm_0.b().a(string, cfi_0.a("interactiveBubbleDialog2"), 256L, (short)30000);
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setAlign(frk_0.i);
        this.t.add(fid_12);
        this.t.setVisible(false);
        this.t.setForcedDisplaySpark(false);
        this.t.setUseTargetPositionning(false);
        this.t.addEventListener(frd_0.C, new bap_1(this, string), false);
        this.L = new baq_1(this);
        ado_1.a().b(this.L, 1000L);
        this.t.c();
    }

    @Override
    public String al_() {
        return bae.h().a("ie.boatBoard.small." + this.d, new Object[0]);
    }

    String ao() {
        String string;
        String string2;
        wu_0 wu_02 = wc_0.p().a();
        ww_0 ww_02 = wu_02.g(this.w);
        ww_0 ww_03 = wu_02.g(this.J);
        String string3 = bae.h().a("boatBoard.nextArrival", this.a(this.w), this.c(ww_02));
        String string4 = bae.h().a("boatBoard.nextDeparture", this.a(this.J), this.c(ww_03));
        String string5 = bae.h().a(this.v ? "boatBoard.boatDocked" : "boatBoard.boatLeaved", new Object[0]);
        if (this.v) {
            string2 = string4;
            string = string3;
        } else {
            string2 = string3;
            string = string4;
        }
        return bae.h().a("ie.boatBoard.large." + this.d, this.a(wu_02), string5, string2, string);
    }

    private String c(wx_0 wx_02) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (wx_02.c() != 0) {
            stringBuilder.append(wx_02.c()).append("H");
        }
        if (wx_02.b() != 0) {
            stringBuilder.append(wx_02.b()).append("m");
        }
        return stringBuilder.append(wx_02.a()).append("s").toString();
    }

    private String a(wu_0 wu_02) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (wu_02.k() != 0) {
            stringBuilder.append(wu_02.k()).append("H");
        }
        if (wu_02.l() != 0) {
            stringBuilder.append(wu_02.l()).append("m");
        }
        return stringBuilder.append(wu_02.n()).append("s").toString();
    }

    public int Z() {
        return this.u;
    }

    @Override
    public void ar_() {
        super.ar_();
        String[] stringArray = this.l.split(";");
        this.u = Integer.valueOf(stringArray[1]);
    }

    public void a(wx_0 wx_02) {
        this.w.a(wx_02);
    }

    public void b(wx_0 wx_02) {
        this.J.a(wx_02);
    }

    public wu_0 aa() {
        return this.w;
    }

    public wu_0 ab() {
        return this.J;
    }

    public void a(boolean bl) {
        this.v = bl;
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    static /* synthetic */ void a(ban_1 ban_12, abm_1 abm_12) {
        ban_12.a(abm_12);
    }
}

