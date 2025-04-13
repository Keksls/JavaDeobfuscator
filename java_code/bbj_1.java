/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bBj
 */
public class bbj_1
extends bfr_0 {
    private biI al;

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.al != null) {
            afz_0.d().b(this.al);
            this.al = null;
        }
    }

    private void aL() {
        bgm_1 bgm_12 = (bgm_1)((Object)this.ad);
        eaa_0 eaa_02 = bgm_12.aa();
        if (this.al != null) {
            afz_0.d().b(this.al);
            this.al = null;
        }
        if (eaa_02 == null) {
            return;
        }
        bbn_2 bbn_22 = new bbn_2(eaa_02);
        bbn_22.cB();
        bbn_22.a(this.ad.F());
        biI biI2 = bbn_22.bv();
        biI2.a(this.ad.F());
        biI2.b(((bFZ)this.ad).J(), ((bFZ)this.ad).K(), ((bFZ)this.ad).L());
        bgn_1 bgn_12 = bgm_12.Z();
        String string = bgn_12.c();
        TByteIntHashMap tByteIntHashMap = bgn_12.d();
        biI2.e(string);
        biI2.g(string);
        TByteIntIterator tByteIntIterator = tByteIntHashMap.iterator();
        while (tByteIntIterator.hasNext()) {
            tByteIntIterator.advance();
            biI2.a(tByteIntIterator.value(), (short)tByteIntIterator.key(), true);
        }
        biI2.t().k |= 2;
        this.al = biI2;
        afz_0.d().a(this.al);
    }

    @Override
    public void e() {
        this.aL();
    }

    @Override
    public void b(int n) {
        if (this.ad == null) {
            return;
        }
        bgm_1 bgm_12 = (bgm_1)((Object)this.ad);
        eaa_0 eaa_02 = bgm_12.aa();
        if (eaa_02 == null) {
            super.b(n);
            return;
        }
        this.aL();
    }

    static /* synthetic */ void a(bbj_1 bbj_12, abm_1 abm_12) {
        bbj_12.a(abm_12);
    }

    static /* synthetic */ Logger aK() {
        return Y;
    }
}

