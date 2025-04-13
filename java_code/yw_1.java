/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yW
 */
final class yw_1 {
    private int b = 0;
    final /* synthetic */ yv_2 a;

    yw_1(yv_2 yv_22) {
        this.a = yv_22;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10056001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

