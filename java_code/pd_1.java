/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pD
 */
final class pd_1 {
    private pe_1 b = null;
    final /* synthetic */ pb_2 a;

    pd_1(pb_2 pb_22) {
        this.a = pb_22;
    }

    public void a() {
        this.a.c = this.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.b = new pe_1();
            boolean bl3 = this.b.a(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.b = null;
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.b = new pe_1();
            boolean bl3 = this.b.a(byteBuffer, 10027003);
            if (!bl3) {
                return false;
            }
        } else {
            this.b = null;
        }
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.b = new pe_1();
            boolean bl3 = this.b.a(byteBuffer, 10031000);
            if (!bl3) {
                return false;
            }
        } else {
            this.b = null;
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
        if (n < 10027003) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10031000) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10047003) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

