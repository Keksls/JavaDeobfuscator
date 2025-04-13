/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rt
 */
final class rt_2 {
    private long b = 0L;
    private long c = 0L;
    final /* synthetic */ rr_1 a;

    rt_2(rr_1 rr_12) {
        this.a = rr_12;
    }

    public void a() {
        this.a.c = this.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10036012) {
            return false;
        }
        if (n < 10036014) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10057000) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

