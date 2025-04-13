/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wD
 */
final class wd_1 {
    private int b = 0;
    private long c = 0L;
    private int d = 0;
    private long e = 0L;
    final /* synthetic */ wc_1 a;

    wd_1(wc_1 wc_12) {
        this.a = wc_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

