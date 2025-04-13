/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNF
 */
class enf_2
extends enw_2 {
    final /* synthetic */ byte b;

    enf_2(byte by) {
        this.b = by;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        return epq_22.hn() == this.b;
    }

    @Override
    protected String a() {
        return "controllerInTeam";
    }
}

