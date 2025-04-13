/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pd
 */
final class pd_2 {
    private pc_2 b = null;
    final /* synthetic */ pa_1 a;

    pd_2(pa_1 pa_12) {
        this.a = pa_12;
    }

    public void a() {
        this.a.c = this.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10026000) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

