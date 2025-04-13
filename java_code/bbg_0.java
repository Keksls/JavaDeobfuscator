/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bbG
 */
public final class bbg_0
extends alc_1 {
    private static final Logger e = Logger.getLogger(bbg_0.class);
    private final blx_1 f;
    private final long g;

    public bbg_0(int n, int n2, int n3, blx_1 blx_12, long l) {
        super(n, n2, n3);
        this.f = blx_12;
        this.g = l;
    }

    @Override
    protected long o() {
        ddv_0.a().a(this.f);
        ddv_0.a().b(this.g > 0L ? this.g : 30000L);
        azu_0.j().a(ddv_0.a());
        return 500L;
    }

    @Override
    protected void l() {
    }
}

