/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tY
 */
final class ty_2 {
    private byte b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    final /* synthetic */ tx_1 a;

    ty_2(tx_1 tx_12) {
        this.a = tx_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

