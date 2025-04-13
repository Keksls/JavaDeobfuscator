/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eXx
 */
public abstract class exx_2
implements ts_0,
UF,
exs_1,
gq_1<wf_2> {
    protected static final Logger c = Logger.getLogger(exx_2.class);
    protected exk_2 l;
    protected long m;
    protected fev_0 n = fev_0.a;

    @Override
    public exk_2 h() {
        return this.l;
    }

    public void a(exk_2 exk_22) {
        this.l = exk_22;
    }

    public long p() {
        return this.m;
    }

    public void a(long l) {
        this.m = l;
    }

    public fev_0 q() {
        return this.n;
    }

    public void a(fev_0 fev_02) {
        if (fev_02 == null) {
            c.error((Object)("set de packtype invalide sur merchantitem=" + this), (Throwable)new Exception());
            this.n = fev_0.a;
            return;
        }
        this.n = fev_02;
    }

    @Override
    public void release() {
    }

    @Override
    public long a() {
        if (this.l == null) {
            return -1L;
        }
        return this.l.a();
    }

    @Override
    public int aT_() {
        return this.l.aT_();
    }

    @Override
    public short e() {
        return this.l.e();
    }

    @Override
    public void a(short s2) {
        this.l.a(s2);
    }

    @Override
    public void b(short s2) {
        this.l.b(s2);
    }

    @Override
    public boolean a(ts_0 ts_02) {
        return this.l.a(ts_02);
    }

    @Override
    public short aR_() {
        return this.l.aR_();
    }

    @Override
    public ts_0 aP_() {
        return null;
    }

    @Override
    public ts_0 i() {
        return null;
    }

    @Override
    public String g() {
        return this.l.g() + "p" + this.n.f + "k" + this.m;
    }

    public String r() {
        return "AbstractMerchantInventoryItem{m_item=" + (this.l == null || this.l.T() == null ? "null" : this.l.T().e()) + ", m_price=" + this.m + ", m_packType=" + this.n + "}";
    }

    public String toString() {
        return this.g();
    }
}

