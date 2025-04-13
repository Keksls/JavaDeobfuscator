/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sv
 */
final class sv_1 {
    private final zb_1 b = new zb_1();
    final /* synthetic */ st_1 a;

    sv_1(st_1 st_12) {
        this.a = st_12;
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
        if (n < 10034001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

