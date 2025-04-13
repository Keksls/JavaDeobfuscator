/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vS
 */
final class vs_1 {
    private final xn_1 b = new xn_1();
    final /* synthetic */ vr_2 a;

    vs_1(vr_2 vr_22) {
        this.a = vr_22;
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
        boolean bl = this.b.a(byteBuffer, 313);
        return bl;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 315);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10035004);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
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
        if (n < 10035004) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

