/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bsD
 */
class bsd_1
implements Comparator<bse_1> {
    final /* synthetic */ bsc_1 a;

    bsd_1(bsc_1 bsc_12) {
        this.a = bsc_12;
    }

    public int a(bse_1 bse_12, bse_1 bse_13) {
        return bse_12.b().f(bse_13.b());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bse_1)object, (bse_1)object2);
    }
}

