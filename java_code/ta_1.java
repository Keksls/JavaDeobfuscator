/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tA
 */
final class ta_1 {
    private int b = 0;
    private final tv_1 c = new tv_1();
    final /* synthetic */ tz_2 a;

    ta_1(tz_2 tz_22) {
        this.a = tz_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b.a = this.c.a;
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

