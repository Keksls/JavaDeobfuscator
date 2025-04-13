/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vP
 */
final class vp_2 {
    private final wl_1 b = new wl_1();
    final /* synthetic */ vo_2 a;

    vp_2(vo_2 vo_22) {
        this.a = vo_22;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10037001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

