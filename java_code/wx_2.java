/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wx
 */
final class wx_2 {
    private final wy_2 b = new wy_2();
    final /* synthetic */ ww_2 a;

    wx_2(ww_2 ww_22) {
        this.a = ww_22;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 314) {
            return false;
        }
        if (n < 10024001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

