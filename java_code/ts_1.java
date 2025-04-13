/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tS
 */
public class ts_1
implements gs_0 {
    public byte a = 0;
    public long b = 0L;
    public static final int c = 9;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.putLong(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
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
        stringBuilder.append(string).append("varId=").append(this.a).append('\n');
        stringBuilder.append(string).append("value=").append(this.b).append('\n');
    }
}

