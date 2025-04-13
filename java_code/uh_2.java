/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uh
 */
final class uh_2 {
    private int b = 0;
    private byte c = 0;
    final /* synthetic */ ug_2 a;

    uh_2(ug_2 ug_22) {
        this.a = ug_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10045002) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        return false;
    }
}

