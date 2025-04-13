/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rc
 */
public class rc_1
implements gs_0 {
    public int a = 0;
    public long b = 0L;
    public long c = 0L;
    public int d = 0;
    public long e = 0L;
    public static final int f = 32;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putLong(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putLong(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0L;
        this.c = 0L;
        this.d = 0;
        this.e = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            rd_1 rd_12 = new rd_1(this);
            boolean bl = rd_12.a(byteBuffer, n);
            if (bl) {
                rd_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 32;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lockId=").append(this.a).append('\n');
        stringBuilder.append(string).append("lockDate=").append(this.b).append('\n');
        stringBuilder.append(string).append("unlockDate=").append(this.c).append('\n');
        stringBuilder.append(string).append("currentLockValue=").append(this.d).append('\n');
        stringBuilder.append(string).append("currentLockValueLastModification=").append(this.e).append('\n');
    }
}

