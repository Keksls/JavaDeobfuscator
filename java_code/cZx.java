/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class cZx
implements Comparator<byo_2> {
    final /* synthetic */ cZu a;

    cZx(cZu cZu2) {
        this.a = cZu2;
    }

    public int a(byo_2 byo_22, byo_2 byo_23) {
        return byo_22.e() - byo_23.e();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byo_2)object, (byo_2)object2);
    }
}

