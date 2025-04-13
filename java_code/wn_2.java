/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wn
 */
public class wn_2
implements gs_0 {
    public byte a = 0;
    public byte b = 0;
    public static final int c = 2;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.put(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.get();
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
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("damageElements=").append(this.a).append('\n');
        stringBuilder.append(string).append("resistanceElements=").append(this.b).append('\n');
    }
}

