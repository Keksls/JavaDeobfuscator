/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sl
 */
public class sl_2
extends go_1
implements gs_0 {
    public int c = 0;
    public int d = 0;
    public short e = 0;
    public long f = 0L;
    private final fo_1 h = new sm_1(this);
    public static final int g = 18;

    @Override
    public fo_1 a() {
        return this.h;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putShort(this.e);
        byteBuffer.putLong(this.f);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 18;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("x=").append(this.c).append('\n');
        stringBuilder.append(string).append("y=").append(this.d).append('\n');
        stringBuilder.append(string).append("z=").append(this.e).append('\n');
        stringBuilder.append(string).append("instanceId=").append(this.f).append('\n');
    }
}

