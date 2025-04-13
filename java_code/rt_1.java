/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rT
 */
final class rt_1 {
    private int b = 0;
    private int c = 0;
    private short d = 0;
    private long e = 0L;
    private byte f = 0;
    private ru_1 g = null;
    final /* synthetic */ rr_2 a;

    rt_1(rr_2 rr_22) {
        this.a = rr_22;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.d;
        this.a.f = this.e;
        this.a.g = this.f;
        this.a.h = this.g;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.g = new ru_1();
            boolean bl3 = this.g.a(byteBuffer, 0);
            if (!bl3) {
                return false;
            }
        } else {
            this.g = null;
        }
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

