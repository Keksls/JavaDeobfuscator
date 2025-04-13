/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aFy
 */
class afy_2
implements Comparator<afu_2> {
    afy_2() {
    }

    public int a(afu_2 afu_22, afu_2 afu_23) {
        if (afu_22.a() < afu_23.a()) {
            return -1;
        }
        return afu_22.a() == afu_23.a() ? 0 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((afu_2)object, (afu_2)object2);
    }
}

