/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;

public final class cCl
implements adx_1<cuo_1> {
    @Override
    public boolean a(cuo_1 cuo_12) {
        TLongObjectIterator tLongObjectIterator = cuo_12.b().iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = (Long)((abp_2)tLongObjectIterator.value()).a();
            bFZ bFZ2 = bfv_0.b().e(l);
            if (bFZ2 == null) continue;
            long l2 = tLongObjectIterator.key();
            byte[] byArray = (byte[])((abp_2)tLongObjectIterator.value()).b();
            Long l3 = (Long)((abp_2)tLongObjectIterator.value()).c();
            aff_1 aff_12 = apb_2.a(l3);
            bFZ2.a(aff_12);
            bFZ2.a_(byArray);
            bFZ2.ai();
            bFZ2.b(l2);
            bFZ2.e(l);
            for (ph_0 ph_02 : bFZ2.av_()) {
                if (!(ph_02 instanceof ahv)) continue;
                ahv ahv2 = (ahv)ph_02;
                ahs.d().a(ahv2);
                ahv2.Q();
                aiI.a(ahv2);
            }
            bFZ2.aI_();
            cCl.a(bFZ2, true);
            ccm_1.g().a(bFZ2);
        }
        return false;
    }

    private static boolean a(pj_0 pj_02, boolean bl) {
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
        return 13052;
    }
}

