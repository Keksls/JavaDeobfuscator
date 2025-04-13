/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vq
 */
public class vq_2
implements gs_0 {
    public short a = 0;
    public short b = 0;
    public short c = 0;
    public static final int d = 6;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        byteBuffer.putShort(this.b);
        byteBuffer.putShort(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
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
        return 6;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.a).append('\n');
        stringBuilder.append(string).append("x=").append(this.b).append('\n');
        stringBuilder.append(string).append("y=").append(this.c).append('\n');
    }
}

