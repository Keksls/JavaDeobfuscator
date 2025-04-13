/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rr
 */
public class rr_1
extends go_1
implements gs_0 {
    public long c = 0L;
    private final fo_1 e = new rs_1(this);
    public static final int d = 8;

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.c = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            rt_2 rt_22 = new rt_2(this);
            boolean bl = rt_22.a(byteBuffer, n);
            if (bl) {
                rt_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("pvpMoneyAmount=").append(this.c).append('\n');
    }
}

