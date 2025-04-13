/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wh
 */
final class wh_1 {
    private final ul_2 b = new ul_2();
    final /* synthetic */ wg_2 a;

    wh_1(wg_2 wg_22) {
        this.a = wg_22;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
        this.a.a.c = this.b.c;
        this.a.a.d = this.b.d;
        this.a.a.e.a.clear();
        this.a.a.e.a.ensureCapacity(this.b.e.a.size());
        this.a.a.e.a.addAll(this.b.e.a);
        this.a.a.f.a.clear();
        this.a.a.f.a.ensureCapacity(this.b.f.a.size());
        this.a.a.f.a.addAll(this.b.f.a);
        this.a.a.g.clear();
        this.a.a.g.ensureCapacity(this.b.g.size());
        this.a.a.g.addAll(this.b.g);
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 0x992323);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10048002);
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
        if (n < 10048002) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        return false;
    }
}

