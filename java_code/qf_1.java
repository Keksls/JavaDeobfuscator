/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qf
 */
final class qf_1 {
    private byte b = 0;
    private int c = 0;
    private int d = 0;
    final /* synthetic */ qe_2 a;

    qf_1(qe_2 qe_22) {
        this.a = qe_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10040007) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

