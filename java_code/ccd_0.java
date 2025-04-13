/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from cCd
 */
public final class ccd_0
implements adx_1<crb_0> {
    @Override
    public boolean a(crb_0 crb_02) {
        String string;
        TLongArrayList tLongArrayList = crb_02.b();
        if (tLongArrayList.isEmpty()) {
            string = bae.h().a("chat.notify.questSharedWithNobody", new Object[0]);
        } else {
            ani_2 ani_22 = new ani_2();
            bmr_1 bmr_12 = azu_0.j().k();
            eQb eQb2 = bmr_12.dE().a();
            int n = tLongArrayList.size();
            for (int k = 0; k < n; ++k) {
                if (k != 0) {
                    ani_22.a((CharSequence)", ");
                }
                epl_0 epl_02 = eQb2.e(tLongArrayList.get(k));
                ani_22.a((CharSequence)epl_02.a());
            }
            string = bae.h().a("chat.notify.questSharedWith", ani_22.r());
        }
        aul_0.a().c(string);
        return false;
    }

    @Override
    public int a() {
        return 13121;
    }
}

