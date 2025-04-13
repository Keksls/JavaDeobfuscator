/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ws
 */
final class ws_1 {
    private final xn_1 b = new xn_1();
    final /* synthetic */ wr_2 a;

    ws_1(wr_2 wr_22) {
        this.a = wr_22;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
        this.a.a.c = this.b.c;
        this.a.a.d = this.b.d;
        this.a.a.e = this.b.e;
        this.a.a.f = this.b.f;
        this.a.a.g = this.b.g;
        this.a.a.h = this.b.h;
        this.a.a.i = this.b.i;
        this.a.a.j = this.b.j;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10024001);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10035004);
        return bl;
    }

    private boolean e(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10035007);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 313) {
            return false;
        }
        if (n < 315) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10024001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        return false;
    }
}

