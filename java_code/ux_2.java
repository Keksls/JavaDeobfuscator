/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ux
 */
public class ux_2
implements gs_0 {
    public byte a = 0;
    public byte b = 0;
    public byte c = 0;
    public static final int d = 3;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.put(this.b);
        byteBuffer.put(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.get();
        this.c = byteBuffer.get();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("itemType=").append(this.a).append('\n');
        stringBuilder.append(string).append("contentQuantity=").append(this.b).append('\n');
        stringBuilder.append(string).append("contentQuality=").append(this.c).append('\n');
    }
}

