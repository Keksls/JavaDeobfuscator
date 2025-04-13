/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBT
 */
class abt_2
implements Comparator<Short> {
    abt_2() {
    }

    public int a(Short s2, Short s3) {
        return s2.compareTo(s3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Short)object, (Short)object2);
    }
}

