/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ss
 */
final class ss_1 {
    private final zb_1 b = new zb_1();
    final /* synthetic */ sr_1 a;

    ss_1(sr_1 sr_12) {
        this.a = sr_12;
    }

    public void a() {
        this.a.a.a.clear();
        this.a.a.a.ensureCapacity(this.b.a.size());
        this.a.a.a.addAll(this.b.a);
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

