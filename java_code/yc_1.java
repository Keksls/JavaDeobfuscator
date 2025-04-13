/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yC
 */
final class yc_1 {
    private final tp_1 b = new tp_1();
    final /* synthetic */ yb_1 a;

    yc_1(yb_1 yb_12) {
        this.a = yb_12;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b.clear();
        this.a.a.b.ensureCapacity(this.b.b.size());
        this.a.a.b.addAll(this.b.b);
        this.a.a.c.clear();
        this.a.a.c.ensureCapacity(this.b.c.size());
        this.a.a.c.addAll(this.b.c);
        this.a.a.d.clear();
        this.a.a.d.ensureCapacity(this.b.d.size());
        this.a.a.d.addAll(this.b.d);
        this.a.a.e.clear();
        this.a.a.e.ensureCapacity(this.b.e.size());
        this.a.a.e.addAll(this.b.e);
        this.a.a.f = this.b.f;
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

