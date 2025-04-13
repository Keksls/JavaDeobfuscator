/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tT
 */
final class tt_2 {
    private int b = 0;
    private final ArrayList<tq_2> c = new ArrayList(0);
    private final ArrayList<tr_1> d = new ArrayList(0);
    private final ArrayList<ts_1> e = new ArrayList(0);
    private final ArrayList<tv_2> f = new ArrayList(0);
    private tu_2 g = null;
    final /* synthetic */ tp_1 a;

    tt_2(tp_1 tp_12) {
        this.a = tp_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b.clear();
        this.a.b.ensureCapacity(this.c.size());
        this.a.b.addAll(this.c);
        this.a.c.clear();
        this.a.c.ensureCapacity(this.d.size());
        this.a.c.addAll(this.d);
        this.a.d.clear();
        this.a.d.ensureCapacity(this.e.size());
        this.a.d.addAll(this.e);
        this.a.e.clear();
        this.a.e.ensureCapacity(this.f.size());
        this.a.e.addAll(this.f);
        this.a.f = this.g;
    }

    private boolean a(ByteBuffer byteBuffer) {
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
        return false;
    }
}

