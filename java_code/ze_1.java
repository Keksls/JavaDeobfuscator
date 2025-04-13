/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ze
 */
final class ze_1 {
    private long b = 0L;
    private short c = 0;
    private short d = 0;
    private int e = 0;
    private long f = 0L;
    final /* synthetic */ zd_1 a;

    ze_1(zd_1 zd_12) {
        this.a = zd_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

