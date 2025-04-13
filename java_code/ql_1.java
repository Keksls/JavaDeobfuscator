/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ql
 */
final class ql_1 {
    private int b = 0;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private byte g = (byte)-1;
    private qm_1 h = null;
    final /* synthetic */ qj_1 a;

    ql_1(qj_1 qj_12) {
        this.a = qj_12;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.d;
        this.a.f = this.e;
        this.a.g = this.f;
        this.a.h = this.g;
        this.a.i = this.h;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.get() == 1;
        this.e = byteBuffer.get() == 1;
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.h = new qm_1();
            boolean bl3 = this.h.a(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.h = null;
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.get() == 1;
        this.e = byteBuffer.get() == 1;
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.h = new qm_1();
            boolean bl3 = this.h.a(byteBuffer, 0x992323);
            if (!bl3) {
                return false;
            }
        } else {
            this.h = null;
        }
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        this.d = byteBuffer.get() == 1;
        this.e = byteBuffer.get() == 1;
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.h = new qm_1();
            boolean bl3 = this.h.a(byteBuffer, 10048002);
            if (!bl3) {
                return false;
            }
        } else {
            this.h = null;
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
        if (n < 0x992323) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

