/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tX
 */
public class tx_1
implements gs_0 {
    public byte a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public static final int f = 17;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putInt(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            ty_2 ty_22 = new ty_2(this);
            boolean bl = ty_22.a(byteBuffer, n);
            if (bl) {
                ty_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 17;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("index=").append(this.a).append('\n');
        stringBuilder.append(string).append("current=").append(this.b).append('\n');
        stringBuilder.append(string).append("min=").append(this.c).append('\n');
        stringBuilder.append(string).append("max=").append(this.d).append('\n');
        stringBuilder.append(string).append("maxPercentModifier=").append(this.e).append('\n');
    }
}

