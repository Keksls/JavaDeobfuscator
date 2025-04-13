/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bEx
 */
public class bex_0
extends bap_2
implements bgq_1 {
    static final Logger u = Logger.getLogger(bex_0.class);
    public static final short s = 1;
    private bgl_1 v;
    private static final cSS[] w = cSS.k;

    protected bex_0() {
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.v = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.f(true);
        this.b(false);
        this.g(true);
        this.i(true);
        this.j(true);
        assert (this.v == null);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (!super.b(tv, tF)) {
            this.a(tv);
        }
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    protected Tv[] s() {
        return new Tv[]{Tv.a};
    }

    @Override
    protected cSS[] u() {
        if (this.v == null) {
            u.error((Object)("Pas de m_info pour craftTableId=" + this.d));
            return w;
        }
        fii fii2 = fij.a().a(this.v.n());
        if (fii2 == null) {
            u.error((Object)("Pas de visual id=" + this.v.n()));
            return w;
        }
        cTn cTn2 = (cTn)cSY.o.a();
        cTn2.a(fii2);
        cUx cUx2 = (cUx)cSY.ai.a();
        cUx2.a(fii2);
        return new cSS[]{cTn2, cUx2};
    }

    @Override
    public short aL() {
        return 60;
    }

    @Override
    public String al_() {
        if (this.v == null) {
            u.error((Object)("Pas de param\u00e9trage valide pour craftTableId=" + this.d));
            return "#ERROR#";
        }
        return bae.h().a(59, (long)this.v.m(), new Object[0]);
    }

    @Override
    public void ar_() {
        super.ar_();
        bgl_1 bgl_12 = (bgl_1)evl_1.a.a(evg_1.a, Integer.valueOf(this.l));
        if (bgl_12 == null) {
            u.error((Object)("[LD] La Machine de Craft " + this.d + " \u00e0 un param\u00e8tre [" + Integer.valueOf(this.l) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.v = bgl_12;
        this.i(true);
    }

    @Override
    public int Z() {
        return this.v.d();
    }

    @Override
    public boolean a(int n) {
        return this.v.e().contains(n);
    }

    @Override
    protected void a(oq_0 oq_02) {
    }

    @Override
    public boolean a(int n, byte by) {
        return this.v != null ? this.v.e().contains(n) : false;
    }

    @Override
    public int aL_() {
        return this.v != null ? this.v.n() : 0;
    }

    @Override
    public ffs at_() {
        return ffs.e;
    }

    @Override
    public bgl_1 aa() {
        return this.v;
    }

    static /* synthetic */ void a(bex_0 bex_02, abm_1 abm_12) {
        bex_02.a(abm_12);
    }
}

