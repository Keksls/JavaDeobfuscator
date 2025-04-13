/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from biv
 */
class biv_2
implements Comparator<biu_2> {
    final /* synthetic */ biu_2 a;

    biv_2(biu_2 biu_22) {
        this.a = biu_22;
    }

    public int a(biu_2 biu_22, biu_2 biu_23) {
        if (biu_22.g() == this.a.g()) {
            return -1;
        }
        if (biu_23.g() == this.a.g()) {
            return 1;
        }
        return biu_22.e().compareTo(biu_23.e());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((biu_2)object, (biu_2)object2);
    }
}

