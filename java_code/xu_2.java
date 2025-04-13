/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xu
 */
final class xu_2 {
    private int b = 0;
    private int c = 0;
    private int d = 0;
    final /* synthetic */ xt_1 a;

    xu_2(xt_1 xt_12) {
        this.a = xt_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 313) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

