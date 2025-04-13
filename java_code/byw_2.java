/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from byw
 */
class byw_2
implements Comparator<byj_2> {
    final /* synthetic */ byp_2 a;

    byw_2(byp_2 byp_22) {
        this.a = byp_22;
    }

    public int a(byj_2 byj_22, byj_2 byj_23) {
        return Long.compare(byj_23.g(), byj_22.g());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byj_2)object, (byj_2)object2);
    }
}

