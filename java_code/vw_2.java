/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vw
 */
public class vw_2
implements gs_0 {
    public short a = 0;
    public short b = 0;
    public short c = 0;
    public short d = 0;
    public short e = 0;
    public short f = 0;
    public static final int g = 12;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        byteBuffer.putShort(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.d);
        byteBuffer.putShort(this.e);
        byteBuffer.putShort(this.f);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getShort();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("partitionX=").append(this.a).append('\n');
        stringBuilder.append(string).append("partitionY=").append(this.b).append('\n');
        stringBuilder.append(string).append("topLeftPatch=").append(this.c).append('\n');
        stringBuilder.append(string).append("topRightPatch=").append(this.d).append('\n');
        stringBuilder.append(string).append("bottomLeftPatch=").append(this.e).append('\n');
        stringBuilder.append(string).append("bottomRightPatch=").append(this.f).append('\n');
    }
}

