/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ud
 */
final class ud_1 {
    private int b = 0;
    private boolean c = true;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private short g = 0;
    private int[] h = null;
    final /* synthetic */ uc_2 a;

    ud_1(uc_2 uc_22) {
        this.a = uc_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.f;
        this.a.e = this.g;
        this.a.f = this.h;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getShort();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10075002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10076001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10079000) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10084000) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

