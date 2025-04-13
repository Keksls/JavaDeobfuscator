/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNS
 */
class ens_1
extends enw_2 {
    final /* synthetic */ byte b;

    ens_1(byte by) {
        this.b = by;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        return enr_02.e() == this.b;
    }

    @Override
    protected String a() {
        return "inTeam";
    }
}

