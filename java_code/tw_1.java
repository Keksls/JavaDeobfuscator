/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tw
 */
final class tw_1 {
    private tx_2 b = null;
    final /* synthetic */ tv_1 a;

    tw_1(tv_1 tv_12) {
        this.a = tv_12;
    }

    public void a() {
        this.a.a = this.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
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

