/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import org.apache.log4j.Logger;

/*
 * Renamed from bBH
 */
public class bbh_2
extends bFZ
implements Su,
ti_0,
app_2,
eqq_1,
ezz_1 {
    static final Logger t = Logger.getLogger(bbh_2.class);
    protected euy_1 q;
    protected eAA r;
    private byte u;
    private static final ru_0[] v = new ru_0[]{eps_0.b, eps_0.v, eps_0.w, eps_0.x, eps_0.y};
    private final fo_1 w = new bbi_1(this, 7);

    @Override
    public boolean E() {
        return true;
    }

    void a(tg_0 tg_02) {
        if (tg_02 != null) {
            tg_02.g(this);
        }
    }

    void a(ByteBuffer byteBuffer) {
        this.H = byteBuffer.getInt();
        this.u = byteBuffer.get();
        if (this.H <= 0) {
            return;
        }
        bwh_0 bwh_02 = bwj_1.a().a(this.H);
        if (this.a(bwh_02)) {
            return;
        }
        baa_0.a().a(this.H, (aku_1)new bbk_2(this, alc_1.q(), 0, 0));
    }

    boolean a(bwh_0 bwh_02) {
        return bwh_02 != null && bwh_02.g() != null && bwh_02.g().a(this.u) == this;
    }

    void aD() {
        bwh_0 bwh_02 = bwj_1.a().a(this.H);
        if (bwh_02 == null) {
            t.error((Object)("Impossible d'ajouter l'obstacle a un combat inconnu " + this.H));
        }
        this.b(bwh_02);
    }

    private void b(bwh_0 bwh_02) {
        tg_0 tg_02 = bwh_02.g();
        if (tg_02 == null) {
            t.error((Object)"Le combat n'a pas de FightMap, impossible d'ajouter l'obstacle");
            return;
        }
        ti_0 ti_02 = tg_02.a(this.u);
        if (ti_02 == null) {
            t.info((Object)("Ajout de l'obstacle = " + this));
            tg_02.h(this);
        } else if (ti_02 != this) {
            t.error((Object)"Un autre obstacle diff\u00e9rent a le meme ID, ce n'est pas normal");
        }
    }

    @Override
    public boolean an() {
        return true;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.i;
    }

    @Override
    public Tv[] r() {
        return Tv.O;
    }

    @Override
    public String al_() {
        return bae.h().a(81, (long)this.q.m(), new Object[0]);
    }

    @Override
    public String am() {
        int n = this.r.c(eps_0.b);
        int n2 = this.r.d(eps_0.b);
        return this.H != -1 ? " (" + n + " / " + n2 + ")" : "";
    }

    @Override
    public boolean au_() {
        return this.g != 2 && super.au_();
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean a(ph_0 ph_02) {
        if (ph_02 instanceof abu) {
            ((abu)((Object)ph_02)).g(ahi_0.j.a());
        }
        return super.a(ph_02);
    }

    @Override
    protected fo_1 ad() {
        return this.w;
    }

    @Override
    public void ar_() {
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            t.error((Object)("[LD] La Machine Destructible " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        euy_1 euy_12 = (euy_1)evl_1.a.a(evg_1.g, Integer.valueOf(stringArray[0]));
        if (euy_12 == null) {
            t.error((Object)("[LD] La Machine Destructible " + this.d + " \u00e0 un param\u00e8tre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.q = euy_12;
        this.aE();
    }

    private void aE() {
        this.r.a();
        this.r.b(eps_0.b).g(this.q.a());
        this.r.b(eps_0.b).n();
        this.r.b(eps_0.w).b(this.q.f());
        this.r.b(eps_0.v).b(this.q.g());
        this.r.b(eps_0.x).b(this.q.h());
        this.r.b(eps_0.y).b(this.q.i());
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.H = -1;
        this.u = (byte)-1;
        assert (this.r == null);
        this.r = new eAA(v);
        this.f(true);
        this.k(true);
        this.a(TI.b);
        this.a((short)0);
        this.i(true);
        this.b(true);
        this.g(true);
        this.a(aej_2.b);
        this.j(true);
        assert (this.q == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f(false);
        this.a((short)2);
        this.r = null;
        this.q = null;
    }

    @Override
    public byte X() {
        return 0;
    }

    @Override
    public void a(byte by) {
        this.u = by;
    }

    @Override
    public byte Z() {
        return this.u;
    }

    @Override
    public boolean aa() {
        return true;
    }

    @Override
    public boolean ab() {
        return this.M();
    }

    @Override
    public boolean ac() {
        return this.D();
    }

    @Override
    public byte J_() {
        return 10;
    }

    @Override
    public se_0 x_() {
        return null;
    }

    @Override
    public boolean F_() {
        return true;
    }

    @Override
    public byte[] i() {
        return new byte[0];
    }

    @Override
    public void a(byte[] byArray) {
    }

    @Override
    public void a(int n, int n2, short s2) {
    }

    @Override
    public void b(int n, int n2, short s2) {
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return this.r.a(ru_02);
    }

    @Override
    public boolean f(rx_0 rx_02) {
        return false;
    }

    @Override
    public boolean d_(long l) {
        return false;
    }

    @Override
    public int e_(long l) {
        return -1;
    }

    @Override
    public boolean a_(long l, long l2) {
        return false;
    }

    @Override
    public boolean a(long l, eqq_1 eqq_12) {
        return false;
    }

    @Override
    public boolean a(long l, long l2, eqq_1 eqq_12) {
        return false;
    }

    @Override
    public boolean b(long l, eqq_1 eqq_12) {
        return false;
    }

    @Override
    public boolean b(long l, long l2, eqq_1 eqq_12) {
        return false;
    }

    @Override
    public boolean b(long l, long l2) {
        return false;
    }

    @Override
    public boolean a(eqr_1 eqr_12) {
        return eqr_1.f == eqr_12;
    }

    @Override
    public int D_() {
        return 0;
    }

    @Override
    public int c_(int n) {
        return 0;
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    public rs_0 b(ru_0 ru_02) {
        return this.r.b(ru_02);
    }

    @Override
    public epq_1 Z_() {
        return null;
    }

    @Override
    public byte Y() {
        return -1;
    }

    @Override
    public void b(byte by) {
    }

    @Override
    public long B_() {
        return 0L;
    }

    @Override
    public boolean C_() {
        return false;
    }

    @Override
    public int c(ru_0 ru_02) {
        return this.r.c(ru_02);
    }

    @Override
    public int d(ru_0 ru_02) {
        return this.r.d(ru_02);
    }

    @Override
    public boolean a(rx_0 rx_02) {
        return false;
    }

    @Override
    public byte b(rx_0 rx_02) {
        return 0;
    }

    @Override
    public void a(rx_0 rx_02, byte by) {
    }

    @Override
    public void c(rx_0 rx_02) {
    }

    @Override
    public void d(rx_0 rx_02) {
    }

    @Override
    public void e(rx_0 rx_02) {
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
    }

    @Override
    public aej_2 j() {
        return null;
    }

    @Override
    public void b(aej_2 aej_22) {
    }

    @Override
    public uo_0 k() {
        return null;
    }

    @Override
    public void a(Su su) {
    }

    @Override
    public void b(Su su) {
    }

    @Override
    public void c(Su su) {
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n() {
    }

    @Override
    public boolean ak() {
        return true;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public void q() {
    }

    @Override
    public boolean ax_() {
        return false;
    }

    @Override
    public void s() {
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public boolean u() {
        return true;
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public boolean a(BitSet bitSet, sd_0 sd_02, byte by) {
        return false;
    }

    @Override
    public ezx_1 ay_() {
        return this.q;
    }

    static /* synthetic */ short a(bbh_2 bbh_22) {
        return bbh_22.g;
    }

    static /* synthetic */ void a(bbh_2 bbh_22, abm_1 abm_12) {
        bbh_22.a(abm_12);
    }
}

