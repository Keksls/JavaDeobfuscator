/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vL
 */
final class vl_1 {
    private final wn_2 b = new wn_2();
    final /* synthetic */ vk_1 a;

    vl_1(vk_1 vk_12) {
        this.a = vk_12;
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
        if (n < 10036004) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

