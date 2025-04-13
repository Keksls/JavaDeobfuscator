/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xR
 */
public class xr_2
implements gs_0 {
    public long a = 0L;
    public int b = 0;
    public static final int c = 12;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("applicationDate=").append(this.a).append('\n');
        stringBuilder.append(string).append("climateBonusId=").append(this.b).append('\n');
    }
}

