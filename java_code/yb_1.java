/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yB
 */
public class yb_1
implements gs_0 {
    public final tp_1 a = new tp_1();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.a.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.a.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            yc_1 yc_12 = new yc_1(this);
            boolean bl = yc_12.a(byteBuffer, n);
            if (bl) {
                yc_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        return n += this.a.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challenge=...\n");
        this.a.a(stringBuilder, string + "  ");
    }
}

