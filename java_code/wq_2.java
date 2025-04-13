/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wq
 */
final class wq_2 {
    private final ua_2 b = new ua_2();
    final /* synthetic */ wp_1 a;

    wq_2(wp_1 wp_12) {
        this.a = wp_12;
    }

    public void a() {
        this.a.a.a = this.b.a;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10030002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

