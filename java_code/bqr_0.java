/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bQR
 */
final class bqr_0
implements Comparator<bqs_0> {
    static final Comparator<bqs_0> a = new bqr_0();

    private bqr_0() {
    }

    public int a(bqs_0 bqs_02, bqs_0 bqs_03) {
        if (bqs_02.g() == bqs_03.g()) {
            return bqs_02.b().compareTo(bqs_03.b());
        }
        return bqs_02.g() - bqs_03.g();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bqs_0)object, (bqs_0)object2);
    }
}

