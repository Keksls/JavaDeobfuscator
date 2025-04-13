/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from cfI
 */
class cfi_2
implements adx_1<cuw_2> {
    cfi_2() {
    }

    @Override
    public boolean a(cuw_2 cuw_22) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(cuw_22.b());
        exb_2 exb_22 = (exb_2)bmr_12.a(ewl_1.b);
        bhn_0 bhn_02 = new bhn_0(exb_22);
        Iterator<ewk_2> iterator = cuw_22.c();
        while (iterator.hasNext()) {
            iterator.next().a(bhn_02);
        }
        cyt_0.a().i();
        return false;
    }

    @Override
    public int a() {
        return 13801;
    }
}

