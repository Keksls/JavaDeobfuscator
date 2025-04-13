/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xN
 */
final class xn_2 {
    private final ArrayList<xl_2> b = new ArrayList(0);
    final /* synthetic */ xk_2 a;

    xn_2(xk_2 xk_22) {
        this.a = xk_22;
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
            xl_2 xl_22 = new xl_2();
            boolean bl = xl_22.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.b.add(xl_22);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

