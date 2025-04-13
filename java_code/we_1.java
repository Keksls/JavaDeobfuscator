/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wE
 */
final class we_1 {
    private final ArrayList<wc_1> b = new ArrayList(0);
    final /* synthetic */ wb_2 a;

    we_1(wb_2 wb_22) {
        this.a = wb_22;
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
            wc_1 wc_12 = new wc_1();
            boolean bl = wc_12.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.b.add(wc_12);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

