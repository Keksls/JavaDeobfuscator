/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rw
 */
final class rw_2 {
    private long b = 0L;
    private long c = 0L;
    private byte d = 0;
    private byte e = 0;
    private long f = 0L;
    private byte g = 0;
    private long h = 0L;
    private long i = 0L;
    private long j = 0L;
    final /* synthetic */ ru_2 a;

    rw_2(ru_2 ru_22) {
        this.a = ru_22;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.d;
        this.a.f = this.g;
        this.a.g = this.h;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.e = byteBuffer.get();
        this.f = byteBuffer.getLong();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.e = byteBuffer.get();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.get();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.e = byteBuffer.get();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.get();
        this.h = byteBuffer.getLong();
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.e = byteBuffer.get();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.get();
        this.h = byteBuffer.getLong();
        this.i = byteBuffer.getLong();
        this.j = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10036007) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 0x992329) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10036012) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10036014) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10057000) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        return false;
    }
}

