/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFq
 */
public class bfq_0
extends bEA {
    static final Logger q = Logger.getLogger(bfq_0.class);

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        switch (tv) {
            case f: {
                if (this.g != 1) {
                    return true;
                }
                if (tF instanceof bnh_1) {
                    ((bnh_1)tF).bv().aW();
                }
                this.a(tv);
                this.b(tv);
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ void a(bfq_0 bfq_02, abm_1 abm_12) {
        bfq_02.a(abm_12);
    }
}

