/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byf
 */
class byf_2
implements Comparator<bya_1> {
    final /* synthetic */ byb_2 a;

    byf_2(byb_2 byb_22) {
        this.a = byb_22;
    }

    public int a(bya_1 bya_12, bya_1 bya_13) {
        return Hw.b((long)bya_13.f(), (long)bya_12.f());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bya_1)object, (bya_1)object2);
    }
}

