/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fbR
 */
class fbr_0
implements Comparator<fbm_0> {
    fbr_0() {
    }

    public int a(fbm_0 fbm_02, fbm_0 fbm_03) {
        if (fbm_02 == fbm_03) {
            return 0;
        }
        return Integer.compare(fbm_02.b(), fbm_03.b());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fbm_0)object, (fbm_0)object2);
    }
}

