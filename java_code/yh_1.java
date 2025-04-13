/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yH
 */
final class yh_1 {
    private final yq_2 b = new yq_2();
    final /* synthetic */ yg_1 a;

    yh_1(yg_1 yg_12) {
        this.a = yg_12;
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

