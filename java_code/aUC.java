/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aUC
implements Comparator {
    final /* synthetic */ aUB a;

    aUC(aUB aUB2) {
        this.a = aUB2;
    }

    public int compare(Object object, Object object2) {
        if (object != null && object2 != null && object instanceof aUK && object2 instanceof aUK) {
            aUK aUK2 = (aUK)object;
            aUK aUK3 = (aUK)object2;
            if (aUK2.h() && !aUK3.h()) {
                return -1;
            }
            if (!aUK2.h() && aUK3.h()) {
                return 1;
            }
            if (aUK2.g() != null && aUK3.g() != null) {
                return aUK2.g().compareTo(aUK3.g());
            }
        }
        return 0;
    }
}

