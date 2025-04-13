/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tp
 */
public class tp_2
implements gs_0 {
    public int a = 0;
    public static final int b = 4;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("collectId=").append(this.a).append('\n');
    }
}

