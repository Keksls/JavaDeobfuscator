/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ro
 */
public class ro_1
extends go_1
implements gs_0 {
    public byte c = 0;
    public long d = 0L;
    private final fo_1 f = new rp_2(this);
    public static final int e = 9;

    @Override
    public fo_1 a() {
        return this.f;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.c);
        byteBuffer.putLong(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.get();
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            rq_1 rq_12 = new rq_1(this);
            boolean bl = rq_12.a(byteBuffer, n);
            if (bl) {
                rq_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 9;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("pvpRank=").append(this.c).append('\n');
        stringBuilder.append(string).append("pvpMoneyAmount=").append(this.d).append('\n');
    }
}

