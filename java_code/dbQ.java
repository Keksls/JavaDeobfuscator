/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;

class dbQ
implements adv_1 {
    final /* synthetic */ byn_1 a;
    final /* synthetic */ dbO b;

    dbQ(dbO dbO2, byn_1 byn_12) {
        this.b = dbO2;
        this.a = byn_12;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        eQb eQb2 = this.a.a();
        if (eQb2 == null) {
            return false;
        }
        TLongObjectIterator tLongObjectIterator = eQb2.e().iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bnh_1 bnh_12 = (bnh_1)bzf_1.a(tLongObjectIterator.key());
            if (bnh_12 == null) continue;
            bnh_12.l(((adh_2)adt_12).d());
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

