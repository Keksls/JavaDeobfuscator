/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from zp
 */
final class zp_1 {
    private final tn_2 b = new tn_2();
    final /* synthetic */ zo_1 a;

    zp_1(zo_1 zo_12) {
        this.a = zo_12;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
        this.a.a.c = this.b.c;
        this.a.a.d = this.b.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10013) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

