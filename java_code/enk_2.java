/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNK
 */
class enk_2
extends enw_2 {
    final /* synthetic */ enw_2 b;

    enk_2(enw_2 enw_22) {
        this.b = enw_22;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        return !this.b.a(epq_22, enr_02);
    }

    @Override
    protected String a() {
        return "not(" + this.b.a() + ")";
    }
}

