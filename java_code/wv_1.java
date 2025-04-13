/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wv
 */
final class wv_1 {
    private final yk_1 b = new yk_1();
    final /* synthetic */ wu_1 a;

    wv_1(wu_1 wu_12) {
        this.a = wu_12;
    }

    public void a() {
        this.a.a.a.clear();
        this.a.a.a.ensureCapacity(this.b.a.size());
        this.a.a.a.addAll(this.b.a);
        this.a.a.b.clear();
        this.a.a.b.ensureCapacity(this.b.b.size());
        this.a.a.b.addAll(this.b.b);
        this.a.a.c = this.b.c;
        this.a.a.d = this.b.d;
        this.a.a.e = this.b.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10024001);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10055001);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10064001);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10024001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

