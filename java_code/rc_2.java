/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rC
 */
final class rc_2 {
    private rd_2 b = null;
    final /* synthetic */ ra_1 a;

    rc_2(ra_1 ra_12) {
        this.a = ra_12;
    }

    public void a() {
        this.a.c = this.b;
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

