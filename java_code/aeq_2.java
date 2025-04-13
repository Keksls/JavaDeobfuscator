/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aEQ
 */
class aeq_2
implements Comparator<aes_2> {
    aeq_2() {
    }

    public int a(aes_2 aes_22, aes_2 aes_23) {
        return Double.compare(aes_22.a(), aes_23.a());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aes_2)object, (aes_2)object2);
    }
}

