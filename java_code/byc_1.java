/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byc
 */
class byc_1
implements Comparator<bya_1> {
    final /* synthetic */ byb_2 a;

    byc_1(byb_2 byb_22) {
        this.a = byb_22;
    }

    public int a(bya_1 bya_12, bya_1 bya_13) {
        return Hw.b((long)bya_12.e(), (long)bya_13.e());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bya_1)object, (bya_1)object2);
    }
}

