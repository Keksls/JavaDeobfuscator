/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ym
 */
final class ym_1 {
    private int b = 0;
    private boolean c = false;
    final /* synthetic */ yl_2 a;

    ym_1(yl_2 yl_22) {
        this.a = yl_22;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10014) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

