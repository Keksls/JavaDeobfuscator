/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wC
 */
public class wc_1
implements gs_0 {
    public int a = 0;
    public long b = 0L;
    public int c = 0;
    public long d = 0L;
    public static final int e = 24;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putLong(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            wd_1 wd_12 = new wd_1(this);
            boolean bl = wd_12.a(byteBuffer, n);
            if (bl) {
                wd_12.a();
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
        stringBuilder.append(string).append("lockId=").append(this.a).append('\n');
        stringBuilder.append(string).append("lockDate=").append(this.b).append('\n');
        stringBuilder.append(string).append("currentLockValue=").append(this.c).append('\n');
        stringBuilder.append(string).append("currentLockValueLastChange=").append(this.d).append('\n');
    }
}

