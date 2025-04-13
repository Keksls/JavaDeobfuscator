/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pU
 */
final class pu_2 {
    private pv_1 b = null;
    final /* synthetic */ ps_1 a;

    pu_2(ps_1 ps_12) {
        this.a = ps_12;
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
            this.b = new pv_1();
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
        if (n < 10060002) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

