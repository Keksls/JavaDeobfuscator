/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rk
 */
public class rk_1
implements gs_0 {
    public int a = -1;
    public int b = -1;
    public long c = -1L;
    public static final int d = 16;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putLong(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = -1;
        this.b = -1;
        this.c = -1L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10053002) {
            rl_2 rl_22 = new rl_2(this);
            boolean bl = rl_22.a(byteBuffer, n);
            if (bl) {
                rl_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 16;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("offendedNationId=").append(this.a).append('\n');
        stringBuilder.append(string).append("lawPoints=").append(this.b).append('\n');
        stringBuilder.append(string).append("date=").append(this.c).append('\n');
    }
}

