/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xM
 */
final class xm_1 {
    private final zr_1 b = new zr_1();
    final /* synthetic */ xl_2 a;

    xm_1(xl_2 xl_22) {
        this.a = xl_22;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 0);
        return bl;
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

