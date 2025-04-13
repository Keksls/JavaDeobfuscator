/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ri
 */
final class ri_1 {
    private final ArrayList<rj_1> b = new ArrayList(0);
    private final ArrayList<rk_1> c = new ArrayList(0);
    final /* synthetic */ rg_1 a;

    ri_1(rg_1 rg_12) {
        this.a = rg_12;
    }

    public void a() {
        this.a.c.clear();
        this.a.c.ensureCapacity(this.b.size());
        this.a.c.addAll(this.b);
        this.a.d.clear();
        this.a.d.ensureCapacity(this.c.size());
        this.a.d.addAll(this.c);
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            rj_1 rj_12 = new rj_1();
            boolean bl = rj_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(rj_12);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            rj_1 rj_12 = new rj_1();
            boolean bl = rj_12.a(byteBuffer, 222);
            if (!bl) {
                return false;
            }
            this.b.add(rj_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            rk_1 rk_12 = new rk_1();
            boolean bl = rk_12.a(byteBuffer, 222);
            if (!bl) {
                return false;
            }
            this.c.add(rk_12);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 222) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10053002) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

