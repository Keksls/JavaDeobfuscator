/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bBU
 */
public class bbu_1
extends bap_2 {
    static final Logger v = Logger.getLogger(bbu_1.class);
    public static final short s = 1;
    private int w;
    protected euz_2 t;

    protected bbu_1() {
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.w = byteBuffer.getInt();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.f(true);
        this.g(true);
        this.b(true);
        this.w = -1;
        assert (this.t == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.t = null;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv == Tv.a) {
            cWa cWa2 = cWa.a();
            cWa2.a(this.t.a());
            azu_0.j().a(cWa2);
            return true;
        }
        return super.b(tv, tF);
    }

    @Override
    public void ar_() {
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            v.error((Object)("[LD] L'IE de DimensionalBagBackgroundDisplay " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        euz_2 euz_22 = (euz_2)evl_1.a.a(evg_1.c, Integer.valueOf(stringArray[0]));
        if (euz_22 == null) {
            v.error((Object)("[LD] L'IE de DimensionalBagBackgroundDisplay " + this.d + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.t = euz_22;
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
        cto_0 cto_02 = (cto_0)cSY.v.a();
        cto_02.a(cUL.d.aH);
        cto_02.d("desc.mru.lookAt");
        return new cSS[]{cto_02};
    }

    @Override
    public boolean au_() {
        Object r2 = eyo_1.g().d(this.w);
        return r2 != null;
    }

    @Override
    public String al_() {
        Object r2 = eyo_1.g().d(this.w);
        if (r2 != null) {
            return ((ezr_0)r2).e();
        }
        return "<UNKNOWN>";
    }

    @Override
    protected void a(oq_0 oq_02) {
    }

    @Override
    public ffs at_() {
        return ffs.c;
    }

    static /* synthetic */ void a(bbu_1 bbu_12, abm_1 abm_12) {
        bbu_12.a(abm_12);
    }
}

