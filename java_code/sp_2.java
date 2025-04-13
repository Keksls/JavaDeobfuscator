/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sp
 */
final class sp_2 {
    private sq_1 b = null;
    private sr_1 c = null;
    final /* synthetic */ sn_2 a;

    sp_2(sn_2 sn_22) {
        this.a = sn_22;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.b = new sq_1();
            bl = this.b.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
        } else {
            this.b = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.c = new sr_1();
            boolean bl5 = this.c.a(byteBuffer, 1);
            if (!bl5) {
                return false;
            }
        } else {
            this.c = null;
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
        if (n < 10034001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

