/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vA
 */
final class va_2 {
    private int b = 0;
    private byte c = 0;
    private final tw_2 d = new tw_2();
    final /* synthetic */ vz_2 a;

    va_2(vz_2 vz_22) {
        this.a = vz_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c.a.clear();
        this.a.c.a.ensureCapacity(this.d.a.size());
        this.a.c.a.addAll(this.d.a);
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get();
        boolean bl = this.d.a(byteBuffer, 1);
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

