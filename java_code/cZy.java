/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class cZy
implements Comparator<byo_2> {
    final /* synthetic */ cZu a;

    cZy(cZu cZu2) {
        this.a = cZu2;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        return Integer.compare(byo_22.c(), byo_23.c());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

