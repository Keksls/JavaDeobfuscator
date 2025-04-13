/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bTK
 */
class btk_2
implements Comparator<btm_2> {
    btk_2() {
    }

    public int a(btm_2 btm_22, btm_2 btm_23) {
        return btm_22.a() - btm_23.a();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((btm_2)object, (btm_2)object2);
    }
}

