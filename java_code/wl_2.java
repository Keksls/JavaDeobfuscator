/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wl
 */
public class wl_2
implements gs_0 {
    public byte a = 0;
    public boolean b = false;
    public static final int c = 2;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.put(this.b ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10045010) {
            wm_1 wm_12 = new wm_1(this);
            boolean bl = wm_12.a(byteBuffer, n);
            if (bl) {
                wm_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.a).append('\n');
        stringBuilder.append(string).append("applied=").append(this.b).append('\n');
    }
}

