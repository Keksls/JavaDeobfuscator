/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cZw
 */
class czw_0
implements Comparator<byo_2> {
    final /* synthetic */ cZu a;

    czw_0(cZu cZu2) {
        this.a = cZu2;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        return byo_22.f().compareTo(byo_23.f());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

