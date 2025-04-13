/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qn
 */
final class qn_2 {
    private final wf_1 b = new wf_1();
    final /* synthetic */ qm_1 a;

    qn_2(qm_1 qm_12) {
        this.a = qm_12;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
        this.a.a.c = this.b.c;
        this.a.a.d = this.b.d;
        this.a.a.e = this.b.e;
        this.a.a.f = this.b.f;
        this.a.a.g = this.b.g;
        this.a.a.h = this.b.h;
        this.a.a.i = this.b.i;
        this.a.a.j = this.b.j;
        this.a.a.k = this.b.k;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 0x992323);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10048002);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 0x992323) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        return false;
    }
}

