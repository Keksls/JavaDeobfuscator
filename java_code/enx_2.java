/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNx
 */
class enx_2
extends enw_2 {
    final /* synthetic */ byte b;

    enx_2(byte by) {
        this.b = by;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        return epq_22.gY() == this.b;
    }

    @Override
    protected String a() {
        return "ofType";
    }
}

