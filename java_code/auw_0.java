/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aUw
 */
class auw_0
implements Comparator<aUr> {
    final /* synthetic */ aUv a;

    auw_0(aUv aUv2) {
        this.a = aUv2;
    }

    public int a(aUr aUr2, aUr aUr3) {
        return Integer.compare(aUr2.f(), aUr3.f());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aUr)object, (aUr)object2);
    }
}

