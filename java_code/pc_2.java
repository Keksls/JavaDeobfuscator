/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pc
 */
public class pc_2
implements gs_0 {
    public long a = 0L;
    public long b = 0L;
    public static final int c = 16;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 16;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lastConnectionDate=").append(this.a).append('\n');
        stringBuilder.append(string).append("currentUsedQuota=").append(this.b).append('\n');
    }
}

