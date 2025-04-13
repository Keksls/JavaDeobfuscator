/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rq
 */
final class rq_1 {
    private byte b = 0;
    private long c = 0L;
    private byte d = 0;
    private long e = 0L;
    private long f = 0L;
    private long g = 0L;
    final /* synthetic */ ro_1 a;

    rq_1(ro_1 ro_12) {
        this.a = ro_12;
    }

    public void a() {
        this.a.c = this.d;
        this.a.d = this.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.e = byteBuffer.getLong();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10036007) {
            return false;
        }
        if (n < 0x992329) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10036011) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10036014) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10057000) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

