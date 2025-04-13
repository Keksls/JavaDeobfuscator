/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfs
 */
class bfs_2
implements asb_2<asy_0> {
    final /* synthetic */ bfr_1 a;

    bfs_2(bfr_1 bfr_12) {
        this.a = bfr_12;
    }

    public void a(asy_0 asy_02) {
        fcu_0 fcu_02 = fcu_0.a(asy_02.c());
        if (fcu_02 == null) {
            bfr_1.a.error((Object)("NationRank inconnu lors du chargement des binary storage : " + asy_02.c()));
            return;
        }
        float f2 = asy_02.d();
        String string = asy_02.e();
        int n = asy_02.f();
        fcu_02.a(f2);
        fcu_02.a(n);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((asy_0)asu_22);
    }
}

