/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ue
 */
final class ue_2 {
    private uc_2 b = null;
    final /* synthetic */ ub_2 a;

    ue_2(ub_2 ub_22) {
        this.a = ub_22;
    }

    public void a() {
        this.a.a = this.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.b = new uc_2();
            boolean bl3 = this.b.a(byteBuffer, 0);
            if (!bl3) {
                return false;
            }
        } else {
            this.b = null;
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.b = new uc_2();
            boolean bl3 = this.b.a(byteBuffer, 10075002);
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
            this.b = new uc_2();
            boolean bl3 = this.b.a(byteBuffer, 10076001);
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
            this.b = new uc_2();
            boolean bl3 = this.b.a(byteBuffer, 10079000);
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

