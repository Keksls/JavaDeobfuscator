/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pA
 */
final class pa_2 {
    private final ub_2 b = new ub_2();
    final /* synthetic */ py_1 a;

    pa_2(py_1 py_12) {
        this.a = py_12;
    }

    public void a() {
        this.a.c.a = this.b.a;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10048007);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10075002);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10076001);
        return bl;
    }

    private boolean e(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10079000);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10048007) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10075002) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10076001) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10079000) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10084000) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        return false;
    }
}

