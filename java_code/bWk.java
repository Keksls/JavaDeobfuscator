/*
 * Decompiled with CFR 0.152.
 */
public class bWk
extends bWg {
    @Override
    public bWi a() {
        return new bWk();
    }

    @Override
    protected void a(agp_0 agp_02, agk_0 agk_02) {
        Object w = agp_02.c(agk_02);
        if (w == null) {
            return;
        }
        w.d(agp_02.b());
    }

    @Override
    protected void a(String string, ajb_1 ajb_12) {
        ajb_12.d(string);
    }

    public String toString() {
        return "RemovePropertyAction{m_name='" + this.a + "'}";
    }
}

