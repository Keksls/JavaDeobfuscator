/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oX
 */
final class ox_1 {
    private byte[] b = null;
    private boolean c = false;
    final /* synthetic */ ov_1 a;

    ox_1(ov_1 ov_12) {
        this.a = ov_12;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.b = new byte[n];
            byteBuffer.get(this.b);
        } else {
            this.b = null;
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10064001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

