/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wj
 */
final class wj_1 {
    private final vz_2 b = new vz_2();
    final /* synthetic */ wi_1 a;

    wj_1(wi_1 wi_12) {
        this.a = wi_12;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
        this.a.a.c.a.clear();
        this.a.a.c.a.ensureCapacity(this.b.c.a.size());
        this.a.a.c.a.addAll(this.b.c.a);
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

