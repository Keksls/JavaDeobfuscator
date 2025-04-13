/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from zc
 */
final class zc_1 {
    private final ArrayList<zd_1> b = new ArrayList(0);
    final /* synthetic */ zb_1 a;

    zc_1(zb_1 zb_12) {
        this.a = zb_12;
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
            zd_1 zd_12 = new zd_1();
            boolean bl = zd_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(zd_12);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

