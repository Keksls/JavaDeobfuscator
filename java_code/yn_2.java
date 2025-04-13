/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yN
 */
final class yn_2 {
    private byte b = 0;
    private int c = 0;
    private byte d = 0;
    private int e = 0;
    final /* synthetic */ ym_2 a;

    yn_2(ym_2 ym_22) {
        this.a = ym_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
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
        if (n < 10064001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

