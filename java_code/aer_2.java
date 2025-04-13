/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aER
 */
class aer_2
implements Comparator<aes_2> {
    aer_2() {
    }

    public int a(aes_2 aes_22, aes_2 aes_23) {
        return Double.compare(aes_23.e, aes_22.e);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aes_2)object, (aes_2)object2);
    }
}

