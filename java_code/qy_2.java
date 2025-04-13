/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qY
 */
final class qy_2 {
    private final wb_2 b = new wb_2();
    final /* synthetic */ qw_2 a;

    qy_2(qw_2 qw_22) {
        this.a = qw_22;
    }

    public void a() {
        this.a.c.a.clear();
        this.a.c.a.ensureCapacity(this.b.a.size());
        this.a.c.a.addAll(this.b.a);
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10021);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10021) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10028001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

