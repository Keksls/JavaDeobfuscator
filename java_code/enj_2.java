/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNJ
 */
class enj_2
extends enw_2 {
    final /* synthetic */ enw_2[] b;

    enj_2(enw_2[] enw_2Array) {
        this.b = enw_2Array;
    }

    @Override
    public boolean a(epq_2 epq_22, enr_0 enr_02) {
        for (enw_2 enw_22 : this.b) {
            if (enw_22.a(epq_22, enr_02)) continue;
            return false;
        }
        return true;
    }

    @Override
    protected String a() {
        StringBuilder stringBuilder = new StringBuilder("and(");
        for (int k = 0; k < this.b.length; ++k) {
            enw_2 enw_22 = this.b[k];
            stringBuilder.append(enw_22.a()).append(", ");
        }
        if (this.b.length > 0) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        return stringBuilder.append(")").toString();
    }
}

