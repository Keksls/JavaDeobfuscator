/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pK
 */
public class pk_2
extends go_1
implements gs_0 {
    public final un_2 c = new un_2();
    private final fo_1 d = new pl_2(this);

    @Override
    public fo_1 a() {
        return this.d;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.c.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.c.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.c.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10086002) {
            pm_1 pm_12 = new pm_1(this);
            boolean bl = pm_12.a(byteBuffer, n);
            if (bl) {
                pm_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        return n += this.c.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bag=...\n");
        this.c.a(stringBuilder, string + "  ");
    }
}

