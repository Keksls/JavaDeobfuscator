/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pp
 */
final class pp_1 {
    private final zn_1 b = new zn_1();
    final /* synthetic */ po_2 a;

    pp_1(po_2 po_22) {
        this.a = po_22;
    }

    public void a() {
        this.a.a.a.clear();
        this.a.a.a.ensureCapacity(this.b.a.size());
        this.a.a.a.addAll(this.b.a);
        this.a.a.b = this.b.b;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10013) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

