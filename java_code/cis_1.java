/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Collection;
import java.util.HashSet;

/*
 * Renamed from ciS
 */
final class cis_1
extends chd_1<cty_1, bwh_0> {
    cis_1() {
    }

    @Override
    public boolean a(cty_1 cty_12) {
        int n = cty_12.d();
        long[] lArray = cty_12.c().keys();
        HashSet<blx_1> hashSet = new HashSet<blx_1>();
        for (int k = 0; k < lArray.length; ++k) {
            long l = lArray[k];
            blx_1 blx_12 = bmf_2.a().c(l);
            if (blx_12 == null || blx_12.ak()) continue;
            hashSet.add(blx_12);
        }
        this.a(n, hashSet);
        this.a(cty_12, n);
        baa_0.a().a(n);
        return false;
    }

    private void a(cty_1 cty_12, int n) {
        TLongObjectHashMap<aff_1> tLongObjectHashMap = cty_12.c();
        baR baR2 = new baR(alc_1.q(), emd_1.w.a(), 0, tLongObjectHashMap);
        baa_0.a().a(n, (aku_1)baR2);
        baR2.b(cty_12.b());
        bwl_1.a.a(tLongObjectHashMap);
    }

    private void a(int n, Collection<blx_1> collection) {
        if (!collection.isEmpty()) {
            bbd_0 bbd_02 = bbd_0.a(alc_1.q(), (int)emd_1.I.a(), 0, collection);
            baa_0.a().a(n, (aku_1)bbd_02);
        }
    }
}

