/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wm
 */
final class wm_1 {
    private byte b = 0;
    private long c = 0L;
    private boolean d = false;
    final /* synthetic */ wl_2 a;

    wm_1(wl_2 wl_22) {
        this.a = wl_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10045010) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

