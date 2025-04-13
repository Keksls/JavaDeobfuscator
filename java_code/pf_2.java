/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pF
 */
final class pf_2 {
    private boolean b = false;
    private boolean c = false;
    private short d = 0;
    private boolean e = false;
    final /* synthetic */ pe_1 a;

    pf_2(pe_1 pe_12) {
        this.a = pe_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get() == 1;
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get() == 1;
        this.c = byteBuffer.get() == 1;
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get() == 1;
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.getShort();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10027003) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10031000) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10047003) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        return false;
    }
}

