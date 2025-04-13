/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vp
 */
public class vp_1
implements gs_0 {
    public long a = 0L;
    public long b = 0L;
    public short c = 0;
    public short d = 0;
    public short e = 0;
    public int f = 0;
    public static final int g = 26;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.putShort(this.d);
        byteBuffer.putShort(this.e);
        byteBuffer.putInt(this.f);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0L;
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
        return 26;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.a).append('\n');
        stringBuilder.append(string).append("creationDate=").append(this.b).append('\n');
        stringBuilder.append(string).append("id=").append(this.c).append('\n');
        stringBuilder.append(string).append("x=").append(this.d).append('\n');
        stringBuilder.append(string).append("y=").append(this.e).append('\n');
        stringBuilder.append(string).append("equippedSkinItemId=").append(this.f).append('\n');
    }
}

