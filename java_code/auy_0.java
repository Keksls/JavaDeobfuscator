/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aUy
 */
class auy_0
implements Comparator<aUr> {
    final /* synthetic */ aUxx a;

    auy_0(aUxx aUxx2) {
        this.a = aUxx2;
    }

    public int a(aUr aUr2, aUr aUr3) {
        int n = this.a.b(aUr2) - this.a.b(aUr3);
        return n == 0 ? aUr2.o().compareTo(aUr3.o()) : n;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aUr)object, (aUr)object2);
    }
}

