/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vV
 */
final class vv_1 {
    private final yf_2 b = new yf_2();
    final /* synthetic */ vu_1 a;

    vv_1(vu_1 vu_12) {
        this.a = vu_12;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10028000);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10028000) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

