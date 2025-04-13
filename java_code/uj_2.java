/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uJ
 */
public class uj_2
implements gs_0 {
    public short a = 0;
    public byte b = 0;
    public byte c = 0;
    public byte d = 0;
    public byte e = 0;
    public static final int f = 6;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        byteBuffer.put(this.b);
        byteBuffer.put(this.c);
        byteBuffer.put(this.d);
        byteBuffer.put(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
        this.b = byteBuffer.get();
        this.c = byteBuffer.get();
        this.d = byteBuffer.get();
        this.e = byteBuffer.get();
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
        stringBuilder.append(string).append("referenceId=").append(this.a).append('\n');
        stringBuilder.append(string).append("step=").append(this.b).append('\n');
        stringBuilder.append(string).append("x=").append(this.c).append('\n');
        stringBuilder.append(string).append("y=").append(this.d).append('\n');
        stringBuilder.append(string).append("z=").append(this.e).append('\n');
    }
}

