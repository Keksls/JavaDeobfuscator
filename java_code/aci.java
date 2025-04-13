/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aci
implements Comparator<ach> {
    aci() {
    }

    public int a(ach ach2, ach ach3) {
        return ach2.compareTo(ach3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ach)object, (ach)object2);
    }
}

