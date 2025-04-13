/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bWl
extends bWg {
    private static final Logger b = Logger.getLogger(bWl.class);
    private static final String c = "value";
    private String d;

    @Override
    public void a(aqx_2 aqx_22) {
        super.a(aqx_22);
        aqx_2 aqx_23 = aqx_22.f(c);
        if (aqx_23 != null) {
            this.d = aqx_23.c();
        }
    }

    @Override
    public bWi a() {
        return new bWl();
    }

    @Override
    protected void a(agp_0 agp_02, agk_0 agk_02) {
        agk_02.a(agp_02, this.d);
    }

    @Override
    protected void a(String string, ajb_1 ajb_12) {
        b.error((Object)String.format("Unable to set property without KeyInterface associated (Key provided : %s)", string));
    }

    public String toString() {
        return "SetPropertyAction{m_name='" + this.a + "'{m_value='" + this.d + "'}";
    }
}

