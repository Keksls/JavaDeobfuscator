/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yZ
 */
final class yz_2 {
    private final yt_2 b = new yt_2();
    final /* synthetic */ yy_1 a;

    yz_2(yy_1 yy_12) {
        this.a = yy_12;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
        this.a.a.c = this.b.c;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10048002);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10048002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

