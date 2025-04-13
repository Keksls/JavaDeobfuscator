/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ys
 */
public class ys_2
implements gs_0 {
    public int a = 0;
    public final ty_1 b = new ty_1();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        boolean bl = this.b.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        boolean bl = this.b.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            yt_1 yt_12 = new yt_1(this);
            boolean bl = yt_12.a(byteBuffer, n);
            if (bl) {
                yt_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        return n += this.b.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("actionGroupId=").append(this.a).append('\n');
        stringBuilder.append(string).append("actionGroup=...\n");
        this.b.a(stringBuilder, string + "  ");
    }
}

