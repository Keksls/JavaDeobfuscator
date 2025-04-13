/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qd
 */
final class qd_2 {
    private final ArrayList<qe_2> b = new ArrayList(0);
    final /* synthetic */ qb_2 a;

    qd_2(qb_2 qb_22) {
        this.a = qb_22;
    }

    public void a() {
        this.a.c.clear();
        this.a.c.ensureCapacity(this.b.size());
        this.a.c.addAll(this.b);
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            qe_2 qe_22 = new qe_2();
            boolean bl = qe_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(qe_22);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10040007) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

