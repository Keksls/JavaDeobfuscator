/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yc
 */
final class yc_2 {
    private final ArrayList<xy_2> b = new ArrayList(0);
    private xz_2 c = null;
    private final ArrayList<xx_1> d = new ArrayList(0);
    final /* synthetic */ xw_1 a;

    yc_2(xw_1 xw_12) {
        this.a = xw_12;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
        this.a.b = this.c;
        this.a.c.clear();
        this.a.c.ensureCapacity(this.d.size());
        this.a.c.addAll(this.d);
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

