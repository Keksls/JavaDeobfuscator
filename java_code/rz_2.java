/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rz
 */
final class rz_2 {
    private long b = 0L;
    private long c = 0L;
    private long d = 0L;
    private byte e = 0;
    private boolean f = false;
    private byte g = 0;
    private long h = 0L;
    private byte i = 0;
    final /* synthetic */ rx_1 a;

    rz_2(rx_1 rx_12) {
        this.a = rx_12;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.d;
        this.a.f = this.e;
        this.a.g = this.f;
        this.a.h = this.i;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.get();
        this.f = byteBuffer.get() == 1;
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.get();
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get();
        this.h = byteBuffer.getLong();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.get();
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get();
        this.h = byteBuffer.getLong();
        this.i = byteBuffer.get();
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
        if (n < 10057000) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        return false;
    }
}

