/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import java.util.List;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/*
 * Renamed from cCQ
 */
final class ccq_0
implements ccp_0 {
    private final List<cco_0> a;
    private final Logger b = Logger.getLogger(ccq_0.class);

    @Inject
    ccq_0(List<cco_0> list) {
        this.a = list;
    }

    @Override
    public void a() {
        for (cco_0 cco_02 : this.a) {
            this.b.info((Object)("Starting " + cco_02 + "..."));
            cco_02.a();
        }
    }

    @Override
    public void b() {
        for (cco_0 cco_02 : this.a) {
            this.b.info((Object)("Stopping " + cco_02 + "..."));
            cco_02.b();
        }
    }
}

