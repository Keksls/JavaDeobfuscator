/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vZ
 */
final class vz_1 {
    private long b = 0L;
    final /* synthetic */ vy_2 a;

    vz_1(vy_2 vy_22) {
        this.a = vy_22;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10048000) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

