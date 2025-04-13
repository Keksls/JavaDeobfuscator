/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rU
 */
public class ru_1
implements gs_0 {
    public int a = 0;
    public int b = 0;
    public short c = 0;
    public long d = 0L;
    public static final int e = 18;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putLong(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0L;
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
        stringBuilder.append(string).append("x=").append(this.a).append('\n');
        stringBuilder.append(string).append("y=").append(this.b).append('\n');
        stringBuilder.append(string).append("z=").append(this.c).append('\n');
        stringBuilder.append(string).append("instanceId=").append(this.d).append('\n');
    }
}

