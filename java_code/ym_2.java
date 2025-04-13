/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yM
 */
public class ym_2
implements gs_0 {
    public byte a = 0;
    public int b = 0;
    public byte c = 0;
    public int d = 0;
    public static final int e = 10;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.put(this.c);
        byteBuffer.putInt(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10064001) {
            yn_2 yn_22 = new yn_2(this);
            boolean bl = yn_22.a(byteBuffer, n);
            if (bl) {
                yn_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.a).append('\n');
        stringBuilder.append(string).append("slottedItemId=").append(this.b).append('\n');
        stringBuilder.append(string).append("slotColor=").append(this.c).append('\n');
        stringBuilder.append(string).append("shardsAmount=").append(this.d).append('\n');
    }
}

