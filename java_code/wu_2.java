/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wU
 */
public class wu_2
implements gs_0 {
    public short a = 0;
    public int b = 0;
    public static final int c = 6;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        byteBuffer.putInt(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
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
        stringBuilder.append(string).append("titleId=").append(this.a).append('\n');
        stringBuilder.append(string).append("nbMandate=").append(this.b).append('\n');
    }
}

