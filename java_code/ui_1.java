/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uI
 */
final class ui_1 {
    private int b = 0;
    private final yk_2 c = new yk_2();
    final /* synthetic */ uh_1 a;

    ui_1(uh_1 uh_12) {
        this.a = uh_12;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        boolean bl = this.c.a(byteBuffer, 1);
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
        if (n < 10014) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

