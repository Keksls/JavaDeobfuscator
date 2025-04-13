/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from zq
 */
final class zq_1 {
    private final ArrayList<zo_1> b = new ArrayList(0);
    private byte c = 0;
    final /* synthetic */ zn_1 a;

    zq_1(zn_1 zn_12) {
        this.a = zn_12;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
        this.a.b = this.c;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            zo_1 zo_12 = new zo_1();
            boolean bl = zo_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(zo_12);
        }
        this.c = byteBuffer.get();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10013) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

