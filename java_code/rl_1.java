/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rL
 */
final class rl_1 {
    private rn_1 b = null;
    private rm_1 c = null;
    final /* synthetic */ rj_2 a;

    rl_1(rj_2 rj_22) {
        this.a = rj_22;
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
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.b = new rn_1();
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
            this.b = new rn_1();
            boolean bl3 = this.b.a(byteBuffer, 10035004);
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
        if (n < 10035004) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10035005) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        return false;
    }
}

