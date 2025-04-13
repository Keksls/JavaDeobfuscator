/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNR
 */
class enr_1
extends enw_2 {
    final /* synthetic */ long b;

    enr_1(long l) {
        this.b = l;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        return epq_22.a_() == this.b;
    }

    @Override
    protected String a() {
        return "withId";
    }
}

