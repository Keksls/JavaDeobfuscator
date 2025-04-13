/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bdC
 */
class bdc_2
implements asb_2<aQD> {
    final /* synthetic */ bdb_2 a;

    bdc_2(bdb_2 bdb_22) {
        this.a = bdb_22;
    }

    public void a(aQD aQD2) {
        ArrayList<bkd_2> arrayList = new ArrayList<bkd_2>();
        for (aQE aQE2 : aQD2.e()) {
            arrayList.add(new bkd_2(aQE2.a(), aQE2.b(), aQE2.c(), aQE2.d()));
        }
        bka_2 bka_22 = bka_2.a(aQD2.d());
        if (bka_22.b() && aQD2.e().length % 2 != 0) {
            arrayList.add(new bkd_2(-1, (short)arrayList.size(), 0, -1));
        }
        bky_2 bky_22 = new bky_2(bka_22, aQD2.c(), arrayList);
        bkz_2.a.a(bky_22);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aQD)asu_22);
    }
}

