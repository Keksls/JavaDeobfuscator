/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vH
 */
final class vh_2 {
    private final wl_2 b = new wl_2();
    final /* synthetic */ vg_2 a;

    vh_2(vg_2 vg_22) {
        this.a = vg_22;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10032003);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10032003) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

