/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sy
 */
final class sy_2 {
    private final yz_1 b = new yz_1();
    final /* synthetic */ sw_2 a;

    sy_2(sw_2 sw_22) {
        this.a = sw_22;
    }

    public void a() {
        this.a.c.a = this.b.a;
        this.a.c.b = this.b.b;
        this.a.c.c.clear();
        this.a.c.c.ensureCapacity(this.b.c.size());
        this.a.c.c.addAll(this.b.c);
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

