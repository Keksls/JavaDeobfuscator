/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wW
 */
public class ww_1
implements gs_0 {
    public long a = 0L;
    public static final int b = 8;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lawId=").append(this.a).append('\n');
    }
}

