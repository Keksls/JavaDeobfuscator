/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class bWg
implements bWi {
    private static final Logger b = Logger.getLogger(bWg.class);
    private static final String c = "name";
    protected String a;

    @Override
    public void a(aqx_2 aqx_22) {
        aqx_2 aqx_23 = aqx_22.f(c);
        if (aqx_23 != null) {
            this.a = aqx_23.c();
        }
    }

    @Override
    public void a(agk_0 agk_02, ajb_1 ajb_12) {
        agp_0 agp_02 = agk_02.a(this.a);
        if (agp_02 == null) {
            this.a(this.a, ajb_12);
        } else {
            this.a(agp_02, agk_02);
        }
    }

    protected abstract void a(agp_0 var1, agk_0 var2);

    protected abstract void a(String var1, ajb_1 var2);
}

