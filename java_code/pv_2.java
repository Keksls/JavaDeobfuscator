/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pv
 */
final class pv_2 {
    private final tw_2 b = new tw_2();
    final /* synthetic */ pt_1 a;

    pv_2(pt_1 pt_12) {
        this.a = pt_12;
    }

    public void a() {
        this.a.c.a.clear();
        this.a.c.a.ensureCapacity(this.b.a.size());
        this.a.c.a.addAll(this.b.a);
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

