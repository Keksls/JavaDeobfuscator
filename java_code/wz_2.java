/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wz
 */
public class wz_2
implements gs_0 {
    public int a = 0;
    public int b = 0;
    public short c = 0;
    public byte d = 0;
    public long e = 0L;
    public boolean f = false;
    public static final int g = 20;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.put(this.d);
        byteBuffer.putLong(this.e);
        byteBuffer.put(this.f ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.get();
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0L;
        this.f = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 20;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("positionX=").append(this.a).append('\n');
        stringBuilder.append(string).append("positionY=").append(this.b).append('\n');
        stringBuilder.append(string).append("positionZ=").append(this.c).append('\n');
        stringBuilder.append(string).append("direction=").append(this.d).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.e).append('\n');
        stringBuilder.append(string).append("virtual=").append(this.f).append('\n');
    }
}

