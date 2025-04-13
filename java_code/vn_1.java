/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vN
 */
final class vn_1 {
    private final yk_1 b = new yk_1();
    final /* synthetic */ vm_1 a;

    vn_1(vm_1 vm_12) {
        this.a = vm_12;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10003);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10003) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        return false;
    }
}

