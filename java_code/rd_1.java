/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rd
 */
final class rd_1 {
    private int b = 0;
    private long c = 0L;
    private long d = 0L;
    private int e = 0;
    private long f = 0L;
    final /* synthetic */ rc_1 a;

    rd_1(rc_1 rc_12) {
        this.a = rc_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10021) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

