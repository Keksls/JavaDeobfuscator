/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yJ
 */
final class yj_2 {
    private ye_2 b = null;
    private ya_1 c = null;
    private final ArrayList<yi_2> d = new ArrayList(0);
    final /* synthetic */ yz_1 a;

    yj_2(yz_1 yz_12) {
        this.a = yz_12;
    }

    public void a() {
        this.a.a = this.b;
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

