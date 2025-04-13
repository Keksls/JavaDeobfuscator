/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from axf
 */
class axf_2
implements Comparator<axl_2> {
    axf_2() {
    }

    public int a(axl_2 axl_22, axl_2 axl_23) {
        return axl_22.a.a.compareTo(axl_23.a.a);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((axl_2)object, (axl_2)object2);
    }
}

