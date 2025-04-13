/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uX
 */
public class ux_1
extends ys_1
implements gs_0 {
    public boolean a = false;
    public int b = 0;
    public long c = 0L;
    public int d = 0;
    public long e = 0L;
    public static final byte f = 0;
    public static final int g = 25;

    @Override
    public byte a() {
        return 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a ? (byte)1 : 0);
        byteBuffer.putInt(this.b);
        byteBuffer.putLong(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putLong(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get() == 1;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = false;
        this.b = 0;
        this.c = 0L;
        this.d = 0;
        this.e = 0L;
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

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("primaryGemLocked=").append(this.a).append('\n');
        stringBuilder.append(string).append("primaryGemitemRefId=").append(this.b).append('\n');
        stringBuilder.append(string).append("primaryGemUniqueId=").append(this.c).append('\n');
        stringBuilder.append(string).append("secondaryGemitemRefId=").append(this.d).append('\n');
        stringBuilder.append(string).append("secondaryGemUniqueId=").append(this.e).append('\n');
    }
}

