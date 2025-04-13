/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yP
 */
public class yp_2
implements gs_0 {
    public byte a = 0;
    public long b = 0L;
    public int c = 0;
    public int d = 0;
    public static final int e = 17;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 17;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.a).append('\n');
        stringBuilder.append(string).append("targetUniqueId=").append(this.b).append('\n');
        stringBuilder.append(string).append("targetReferenceId=").append(this.c).append('\n');
        stringBuilder.append(string).append("targetGfxId=").append(this.d).append('\n');
    }
}

