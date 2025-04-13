/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aNH
implements Comparator<abz_0> {
    aNH() {
    }

    public int a(abz_0 abz_02, abz_0 abz_03) {
        if (abz_02.aa() < abz_03.aa()) {
            return 1;
        }
        if (abz_02.aa() > abz_03.aa()) {
            return -1;
        }
        return 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((abz_0)object, (abz_0)object2);
    }
}

