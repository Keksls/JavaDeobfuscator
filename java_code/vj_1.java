/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vJ
 */
final class vj_1 {
    private final ua_2 b = new ua_2();
    final /* synthetic */ vi_1 a;

    vj_1(vi_1 vi_12) {
        this.a = vi_12;
    }

    public void a() {
        this.a.a.a = this.b.a;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10029000) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

