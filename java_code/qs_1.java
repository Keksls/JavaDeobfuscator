/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qs
 */
public class qs_1
extends go_1
implements gs_0 {
    public long c = 0L;
    public long d = 0L;
    public long e = 0L;
    public byte f = 0;
    private final fo_1 h = new qt_1(this);
    public static final int g = 25;

    @Override
    public fo_1 a() {
        return this.h;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.d);
        byteBuffer.putLong(this.e);
        byteBuffer.put(this.f);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.get();
        return true;
    }

    @Override
    public void c() {
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 25;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.c).append('\n');
        stringBuilder.append(string).append("fightXp=").append(this.d).append('\n');
        stringBuilder.append(string).append("jobXP=").append(this.e).append('\n');
        stringBuilder.append(string).append("rank=").append(this.f).append('\n');
    }
}

