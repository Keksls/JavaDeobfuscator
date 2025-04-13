/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tO
 */
final class to_2 {
    private byte b = 0;
    private short c = 0;
    private short d = 0;
    private String e = null;
    final /* synthetic */ tn_2 a;

    to_2(tn_2 tn_22) {
        this.a = tn_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10013) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

