/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pg
 */
public class pg_2
extends go_1
implements gs_0 {
    public final te_2 c = new te_2();
    private final fo_1 d = new ph_1(this);

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
        if (n < 10069001) {
            pi_2 pi_22 = new pi_2(this);
            boolean bl = pi_22.a(byteBuffer, n);
            if (bl) {
                pi_22.a();
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
        stringBuilder.append(string).append("bagContainer=...\n");
        this.c.a(stringBuilder, string + "  ");
    }
}

