/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cZv
 */
class czv_0
implements Comparator<byo_2> {
    final /* synthetic */ cZu a;

    czv_0(cZu cZu2) {
        this.a = cZu2;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        byj_2 byj_22 = byp_2.a().a(byo_22.b());
        byj_2 byj_23 = byp_2.a().a(byo_23.b());
        if (byj_22 == null) {
            return -1;
        }
        if (byj_23 == null) {
            return 1;
        }
        if (byj_23.i().d() > byj_22.i().d()) {
            return 1;
        }
        if (byj_23.i().d() < byj_22.i().d()) {
            return -1;
        }
        return byj_22.e().compareTo(byj_23.e());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

