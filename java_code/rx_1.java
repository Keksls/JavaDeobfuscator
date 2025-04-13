/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rx
 */
public class rx_1
extends go_1
implements gs_0 {
    public long c = 0L;
    public long d = 0L;
    public long e = 0L;
    public byte f = 0;
    public boolean g = false;
    public byte h = 0;
    private final fo_1 j = new ry_1(this);
    public static final int i = 27;

    @Override
    public fo_1 a() {
        return this.j;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.d);
        byteBuffer.putLong(this.e);
        byteBuffer.put(this.f);
        byteBuffer.put(this.g ? (byte)1 : 0);
        byteBuffer.put(this.h);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.get();
        this.g = byteBuffer.get() == 1;
        this.h = byteBuffer.get();
        return true;
    }

    @Override
    public void c() {
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0;
        this.g = false;
        this.h = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10057000) {
            rz_2 rz_22 = new rz_2(this);
            boolean bl = rz_22.a(byteBuffer, n);
            if (bl) {
                rz_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 27;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rank=").append(this.c).append('\n');
        stringBuilder.append(string).append("jobs=").append(this.d).append('\n');
        stringBuilder.append(string).append("voteDate=").append(this.e).append('\n');
        stringBuilder.append(string).append("governmentOpinion=").append(this.f).append('\n');
        stringBuilder.append(string).append("isCandidate=").append(this.g).append('\n');
        stringBuilder.append(string).append("pvpRank=").append(this.h).append('\n');
    }
}

