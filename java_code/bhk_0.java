/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bHk
 */
class bhk_0
implements Comparator<exk_2> {
    final /* synthetic */ bHi a;

    bhk_0(bHi bHi2) {
        this.a = bHi2;
    }

    public int a(exk_2 exk_22, exk_2 exk_23) {
        if (exk_22.U().d() != exk_23.U().d()) {
            return exk_22.U().d() - exk_23.U().d();
        }
        return exk_22.N().compareTo(exk_23.N());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((exk_2)object, (exk_2)object2);
    }
}

