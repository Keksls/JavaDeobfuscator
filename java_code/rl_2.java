/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rl
 */
final class rl_2 {
    private int b = -1;
    private int c = -1;
    private long d = -1L;
    final /* synthetic */ rk_1 a;

    rl_2(rk_1 rk_12) {
        this.a = rk_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10053002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

