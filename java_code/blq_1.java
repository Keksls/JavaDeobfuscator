/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from blQ
 */
public class blq_1
extends ezv_1
implements bqI {
    private static final Logger e = Logger.getLogger(blq_1.class);
    private final euw_1 f;
    private final bqM g;

    public blq_1(ezz_1 ezz_12) {
        super(ezz_12);
        int n = ezz_12.ay_().c();
        this.f = (euw_1)evl_1.a.a(evg_1.i, n);
        this.g = new bqM(this.f);
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case m: {
                try {
                    bpf_2 bpf_22 = new bpf_2(this, new blr_0(this));
                    if (!bpf_22.g()) {
                        e.error((Object)"[IE] Impossible de d\u00e9marrer le browsing");
                        return false;
                    }
                    bpf_22.a();
                    this.b(tv);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    e.error((Object)"[IE] Impossible de d\u00e9marrer le browsing", (Throwable)unsupportedOperationException);
                    return false;
                }
                return true;
            }
            case n: {
                azu_0.j().b(bqJ.a);
                this.b(tv);
                azu_0.j().k().dN();
                return true;
            }
        }
        e.error((Object)("Action non trait\u00e9e sur une Collector : " + tv));
        return false;
    }

    @Override
    public Tv v() {
        return Tv.m;
    }

    @Override
    public euw_1 a() {
        return this.f;
    }

    @Override
    public bFZ b() {
        return (bFZ)((Object)this.d);
    }

    @Override
    public eAZ c() {
        return this.g;
    }

    @Override
    public int d() {
        throw new UnsupportedOperationException("Aucune serialisation dans le client");
    }

    @Override
    public byte[] e() {
        throw new UnsupportedOperationException("Aucune serialisation dans le client");
    }

    @Override
    public void a(byte[] byArray) {
        this.g.a(byArray);
    }

    @Override
    public Tv[] w() {
        return new Tv[]{Tv.m, Tv.n};
    }

    public cSS[] f() {
        fii fii2 = fij.a().a(this.f.n());
        cto_0 cto_02 = (cto_0)cSY.v.a();
        cto_02.a(fii2.c());
        cto_02.d("desc.mru." + fii2.d());
        return new cSS[]{cto_02};
    }

    @Override
    public void a(short s2) {
        super.a(s2);
    }

    @Override
    public void b(Tv tv) {
        ((Tw)((Object)this.d)).b(tv);
    }

    public String toString() {
        return "ChaosInteractiveElementHandler{m_collectorParam=" + this.f + ", m_collectorInventory=" + this.g + "}";
    }
}

