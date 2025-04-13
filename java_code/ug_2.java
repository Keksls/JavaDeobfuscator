/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ug
 */
public class ug_2
implements gs_0 {
    public int a = 0;
    public byte b = 0;
    public static final int c = 5;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10045002) {
            uh_2 uh_22 = new uh_2(this);
            boolean bl = uh_22.a(byteBuffer, n);
            if (bl) {
                uh_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("refId=").append(this.a).append('\n');
        stringBuilder.append(string).append("bindId=").append(this.b).append('\n');
    }
}

