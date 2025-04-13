/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aDf
 */
class adf_1
implements Comparator<acz_1> {
    adf_1() {
    }

    public int a(acz_1 acz_12, acz_1 acz_13) {
        if (acz_12.d() < acz_13.d()) {
            return -1;
        }
        if (acz_12.d() > acz_13.d()) {
            return 1;
        }
        return acz_12.hashCode() - acz_13.hashCode();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((acz_1)object, (acz_1)object2);
    }
}

