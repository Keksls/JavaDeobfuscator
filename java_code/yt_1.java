/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yt
 */
final class yt_1 {
    private int b = 0;
    private final ty_1 c = new ty_1();
    final /* synthetic */ ys_2 a;

    yt_1(ys_2 ys_22) {
        this.a = ys_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b.a.clear();
        this.a.b.a.ensureCapacity(this.c.a.size());
        this.a.b.a.addAll(this.c.a);
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

