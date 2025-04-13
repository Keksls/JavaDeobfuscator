/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bEl
 */
public class bel_0
extends bap_2 {
    static final Logger s = Logger.getLogger(bel_0.class);
    public static final short t = 1;
    private int u;
    private long v;
    private short w;
    private boolean J;

    protected bel_0() {
    }

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.v = byteBuffer.getLong();
        this.u = byteBuffer.getInt();
        this.w = byteBuffer.getShort();
        this.J = byteBuffer.get() == 1;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i(true);
        this.a((short)1);
        this.f(true);
        this.g(true);
        this.b(true);
        this.u = 0;
        this.v = 0L;
        this.w = 0;
        this.J = false;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean n() {
        return this.ao();
    }

    public boolean ao() {
        return this.w == 0;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        switch (tv) {
            case E: 
            case o: 
            case p: {
                this.b(tv);
                return true;
            }
        }
        return super.b(tv, tF);
    }

    @Override
    public Tv ap_() {
        return Tv.i;
    }

    @Override
    protected Tv[] s() {
        return new Tv[]{Tv.o, Tv.p};
    }

    @Override
    protected cSS[] u() {
        return new cSS[]{cSY.n.a(), cSY.s.a()};
    }

    @Override
    public String al_() {
        Object r2 = eyo_1.g().d(this.u);
        return r2 != null ? ((ezr_0)r2).e() : "<UNKNOWN>";
    }

    public long ap() {
        return this.v;
    }

    @Override
    protected void a(oq_0 oq_02) {
        if (oq_02.a() == 1) {
            xd_1 xd_12 = (xd_1)oq_02;
            this.v = xd_12.a.a;
        }
    }

    public boolean aq() {
        return this.J;
    }

    public int ar() {
        Object r2 = eyo_1.g().d(this.u);
        return r2 != null ? ((ezr_0)r2).C() : -1;
    }

    @Override
    public ffs at_() {
        return ffs.d;
    }

    static /* synthetic */ void a(bel_0 bel_02, abm_1 abm_12) {
        bel_02.a(abm_12);
    }
}

