/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yp
 */
final class yp_1 {
    private final ArrayList<yl_2> b = new ArrayList(0);
    private final ArrayList<yn_1> c = new ArrayList(0);
    final /* synthetic */ yk_2 a;

    yp_1(yk_2 yk_22) {
        this.a = yk_22;
    }

    public void a() {
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yl_2 yl_22 = new yl_2();
            boolean bl = yl_22.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.b.add(yl_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yn_1 yn_12 = new yn_1();
            boolean bl = yn_12.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.c.add(yn_12);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yl_2 yl_22 = new yl_2();
            boolean bl = yl_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(yl_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yn_1 yn_12 = new yn_1();
            boolean bl = yn_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.c.add(yn_12);
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
        if (n < 10014) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

