/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uk
 */
final class uk_1 {
    private byte[] b = null;
    final /* synthetic */ uj_1 a;

    uk_1(uj_1 uj_12) {
        this.a = uj_12;
    }

    public void a() {
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
        if (n < 10051000) {
            return false;
        }
        if (n < 10086002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

