/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tZ
 */
final class tz_1 {
    private final ArrayList<tx_1> b = new ArrayList(0);
    final /* synthetic */ tw_2 a;

    tz_1(tw_2 tw_22) {
        this.a = tw_22;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            tx_1 tx_12 = new tx_1();
            boolean bl = tx_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(tx_12);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

