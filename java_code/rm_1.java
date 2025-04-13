/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rM
 */
public class rm_1
implements gs_0 {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public static final int g = 24;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
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
        return 24;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("definitionId=").append(this.a).append('\n');
        stringBuilder.append(string).append("colorRefItemId=").append(this.b).append('\n');
        stringBuilder.append(string).append("equippedRefItemId=").append(this.c).append('\n');
        stringBuilder.append(string).append("sleepRefItemId=").append(this.d).append('\n');
        stringBuilder.append(string).append("health=").append(this.e).append('\n');
        stringBuilder.append(string).append("reskinRefItemId=").append(this.f).append('\n');
    }
}

