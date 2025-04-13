/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNT
 */
class ent_0
extends enw_2 {
    final /* synthetic */ byte b;

    ent_0(byte by) {
        this.b = by;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        return enr_02.f() == this.b;
    }

    @Override
    protected String a() {
        return "inTeam";
    }
}

