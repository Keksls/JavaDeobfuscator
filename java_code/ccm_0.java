/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from cCm
 */
public final class ccm_0
implements adx_1<cup_2> {
    @Override
    public boolean a(cup_2 cup_22) {
        TLongArrayList tLongArrayList = cup_22.b();
        int n = tLongArrayList.size();
        for (int k = 0; k < n; ++k) {
            long l = tLongArrayList.getQuick(k);
            bFZ bFZ2 = (bFZ)ccm_1.g().a(l);
            if (bFZ2 == null) continue;
            if (bFZ2.aw()) {
                bFZ2.aC_();
                for (ph_0 ph_02 : bFZ2.av_()) {
                    if (!(ph_02 instanceof abu)) continue;
                    ((abu)((Object)ph_02)).a(new cCn(this));
                }
                continue;
            }
            ccm_0.a(bFZ2, false);
            ccm_1.g().a((pj_0)bFZ2);
        }
        return false;
    }

    static boolean a(pj_0 pj_02, boolean bl) {
        bFZ bFZ2;
        bmr_1 bmr_12 = ans_0.F().k();
        bsx_2 bsx_22 = bmr_12.di();
        if (pj_02 == null) {
            return false;
        }
        if (bsx_22 == null) {
            return false;
        }
        ffq ffq2 = null;
        if (pj_02 instanceof ffq) {
            ffq2 = (ffq)((Object)pj_02);
        } else if (pj_02 instanceof bFZ && (bFZ2 = (bFZ)pj_02).y()) {
            ffq2 = bFZ2.aH_();
        }
        if (ffq2 == null) {
            return false;
        }
        if (bl) {
            bsx_22.a(ffq2);
        } else {
            bsx_22.b(ffq2);
        }
        return false;
    }

    @Override
    public int a() {
        return 13849;
    }
}

