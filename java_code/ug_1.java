/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uG
 */
final class ug_1 {
    private final ArrayList<uh_1> b = new ArrayList(0);
    private boolean c = false;
    private final ArrayList<ue_1> d = new ArrayList(0);
    private final ArrayList<uf_2> e = new ArrayList(0);
    final /* synthetic */ ud_2 a;

    ug_1(ud_2 ud_22) {
        this.a = ud_22;
    }

    public void a() {
        this.a.a = this.c;
        this.a.b.clear();
        this.a.b.ensureCapacity(this.d.size());
        this.a.b.addAll(this.d);
        this.a.c.clear();
        this.a.c.ensureCapacity(this.e.size());
        this.a.c.addAll(this.e);
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            uh_1 uh_12 = new uh_1();
            boolean bl = uh_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(uh_12);
        }
        this.c = byteBuffer.get() == 1;
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

