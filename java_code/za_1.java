/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from za
 */
final class za_1 {
    private final ArrayList<yy_1> b = new ArrayList(0);
    final /* synthetic */ yx_2 a;

    za_1(yx_2 yx_22) {
        this.a = yx_22;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yy_1 yy_12 = new yy_1();
            boolean bl = yy_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(yy_12);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yy_1 yy_12 = new yy_1();
            boolean bl = yy_12.a(byteBuffer, 10048002);
            if (!bl) {
                return false;
            }
            this.b.add(yy_12);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10048002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

