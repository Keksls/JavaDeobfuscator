/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fyE
 */
class fye_0
implements Comparator<fyb_0> {
    fye_0() {
    }

    public int a(fyb_0 fyb_02, fyb_0 fyb_03) {
        return fyb_03.getModalLevel() - fyb_02.getModalLevel();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fyb_0)object, (fyb_0)object2);
    }
}

