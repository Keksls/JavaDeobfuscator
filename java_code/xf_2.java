/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xF
 */
final class xf_2 {
    private final xw_1 b = new xw_1();
    private final xw_1 c = new xw_1();
    private final xw_1 d = new xw_1();
    private final xw_1 e = new xw_1();
    final /* synthetic */ xe_1 a;

    xf_2(xe_1 xe_12) {
        this.a = xe_12;
    }

    public void a() {
        this.a.a.a.clear();
        this.a.a.a.ensureCapacity(this.b.a.size());
        this.a.a.a.addAll(this.b.a);
        this.a.a.b = this.b.b;
        this.a.a.c.clear();
        this.a.a.c.ensureCapacity(this.b.c.size());
        this.a.a.c.addAll(this.b.c);
        this.a.b.a.clear();
        this.a.b.a.ensureCapacity(this.c.a.size());
        this.a.b.a.addAll(this.c.a);
        this.a.b.b = this.c.b;
        this.a.b.c.clear();
        this.a.b.c.ensureCapacity(this.c.c.size());
        this.a.b.c.addAll(this.c.c);
        this.a.c.a.clear();
        this.a.c.a.ensureCapacity(this.d.a.size());
        this.a.c.a.addAll(this.d.a);
        this.a.c.b = this.d.b;
        this.a.c.c.clear();
        this.a.c.c.ensureCapacity(this.d.c.size());
        this.a.c.c.addAll(this.d.c);
        this.a.d.a.clear();
        this.a.d.a.ensureCapacity(this.e.a.size());
        this.a.d.a.addAll(this.e.a);
        this.a.d.b = this.e.b;
        this.a.d.c.clear();
        this.a.d.c.ensureCapacity(this.e.c.size());
        this.a.d.c.addAll(this.e.c);
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 0);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.c.a(byteBuffer, 0);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.d.a(byteBuffer, 0);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.e.a(byteBuffer, 0);
        return bl4;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

