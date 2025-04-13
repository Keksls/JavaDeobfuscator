/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNE
 */
class ene_2
extends enw_2 {
    final /* synthetic */ long b;

    ene_2(long l) {
        this.b = l;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        return epq_22.U_() == this.b;
    }

    @Override
    protected String a() {
        return "withOwnerId";
    }
}

