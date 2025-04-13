/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from rb
 */
final class rb_1 {
    private final ArrayList<rc_1> b = new ArrayList(0);
    final /* synthetic */ qz_2 a;

    rb_1(qz_2 qz_22) {
        this.a = qz_22;
    }

    public void a() {
        this.a.c.clear();
        this.a.c.ensureCapacity(this.b.size());
        this.a.c.addAll(this.b);
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            rc_1 rc_12 = new rc_1();
            boolean bl = rc_12.a(byteBuffer, 10021);
            if (!bl) {
                return false;
            }
            this.b.add(rc_12);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10021) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

