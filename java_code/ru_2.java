/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ru
 */
public class ru_2
extends go_1
implements gs_0 {
    public long c = 0L;
    public long d = 0L;
    public byte e = 0;
    public byte f = 0;
    public long g = 0L;
    private final fo_1 i = new rv_2(this);
    public static final int h = 26;

    @Override
    public fo_1 a() {
        return this.i;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.d);
        byteBuffer.put(this.e);
        byteBuffer.put(this.f);
        byteBuffer.putLong(this.g);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.get();
        this.f = byteBuffer.get();
        this.g = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.c = 0L;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            rw_2 rw_22 = new rw_2(this);
            boolean bl = rw_22.a(byteBuffer, n);
            if (bl) {
                rw_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 26;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("jobs=").append(this.c).append('\n');
        stringBuilder.append(string).append("voteDate=").append(this.d).append('\n');
        stringBuilder.append(string).append("governmentOpinion=").append(this.e).append('\n');
        stringBuilder.append(string).append("pvpRank=").append(this.f).append('\n');
        stringBuilder.append(string).append("pvpMoneyAmount=").append(this.g).append('\n');
    }
}

