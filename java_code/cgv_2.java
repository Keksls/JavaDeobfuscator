/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgv
 */
class cgv_2
implements adv_1 {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ cgu_2 b;

    cgv_2(cgu_2 cgu_22, bmr_1 bmr_12) {
        this.b = cgu_22;
        this.a = bmr_12;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (!(adt_12 instanceof adh_2)) {
            return true;
        }
        if (this.a != null) {
            this.a.cg().p();
        }
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

