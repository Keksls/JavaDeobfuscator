/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bbF
 */
public class bbf_0
extends alc_1 {
    private static final Logger e = Logger.getLogger(bbf_0.class);
    private bvx_2 f;
    private final long g;
    private final int h;

    public bbf_0(int n, int n2, int n3, bvx_2 bvx_22, long l, int n4) {
        super(n, n2, n3);
        this.f = bvx_22;
        this.g = l;
        this.h = n4;
    }

    @Override
    protected long o() {
        eoh_1 eoh_12 = this.f.A().a();
        eoh_12.h(this.g);
        blx_1 blx_12 = (blx_1)this.f.n(this.g);
        if (this.h == -1) {
            eoh_12.c(this.g);
        } else {
            eoh_12.a(this.g, this.h, this.f.y(blx_12), this.a(blx_12));
        }
        eoh_12.i(this.g);
        ddv_0.a().a(this.h, false);
        if (azu_0.j().k().a_() == this.g) {
            return 0L;
        }
        return 1500L;
    }

    private boolean a(blx_1 blx_12) {
        return !(blx_12.Z_() instanceof epj_2) || !blx_12.gk();
    }

    @Override
    protected void l() {
    }

    public bvx_2 n() {
        return this.f;
    }

    public void a(bvx_2 bvx_22) {
        this.f = bvx_22;
    }
}

