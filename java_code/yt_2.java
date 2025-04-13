/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yT
 */
public class yt_2
implements gs_0 {
    public long a = 0L;
    public int b = 0;
    public short c = 0;
    public static final int d = 14;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0;
        this.c = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            yu_1 yu_12 = new yu_1(this);
            boolean bl = yu_12.a(byteBuffer, n);
            if (bl) {
                yu_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 14;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uniqueId=").append(this.a).append('\n');
        stringBuilder.append(string).append("spellId=").append(this.b).append('\n');
        stringBuilder.append(string).append("level=").append(this.c).append('\n');
    }
}

