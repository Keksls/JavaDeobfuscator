/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pI
 */
final class pi_1 {
    private pj_2 b = null;
    final /* synthetic */ pg_1 a;

    pi_1(pg_1 pg_12) {
        this.a = pg_12;
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
        if (n < 1) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

