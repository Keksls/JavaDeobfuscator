/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from zd
 */
public class zd_1
implements gs_0 {
    public long a = 0L;
    public short b = 0;
    public short c = 0;
    public int d = 0;
    public long e = 0L;
    public static final int f = 24;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putShort(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putLong(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10034001) {
            ze_1 ze_12 = new ze_1(this);
            boolean bl = ze_12.a(byteBuffer, n);
            if (bl) {
                ze_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 24;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.a).append('\n');
        stringBuilder.append(string).append("stateBaseId=").append(this.b).append('\n');
        stringBuilder.append(string).append("level=").append(this.c).append('\n');
        stringBuilder.append(string).append("remainingDurationInMs=").append(this.d).append('\n');
        stringBuilder.append(string).append("startDate=").append(this.e).append('\n');
    }
}

