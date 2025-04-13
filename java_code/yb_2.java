/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yb
 */
final class yb_2 {
    private final ArrayList<ya_2> b = new ArrayList(0);
    final /* synthetic */ xz_2 a;

    yb_2(xz_2 xz_22) {
        this.a = xz_22;
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
            ya_2 ya_22 = new ya_2();
            boolean bl = ya_22.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.b.add(ya_22);
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

