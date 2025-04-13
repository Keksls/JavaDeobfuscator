/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pn
 */
final class pn_2 {
    private po_2 b = null;
    final /* synthetic */ pl_1 a;

    pn_2(pl_1 pl_12) {
        this.a = pl_12;
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
            this.b = new po_2();
            boolean bl3 = this.b.a(byteBuffer, 1);
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
        if (n < 10013) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

