/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xt
 */
public class xt_1
implements gs_0 {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public static final int d = 12;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
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
        if (n < 313) {
            xu_2 xu_22 = new xu_2(this);
            boolean bl = xu_22.a(byteBuffer, n);
            if (bl) {
                xu_22.a();
                return true;
            }
            return false;
        }
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
        stringBuilder.append(string).append("dropTableId=").append(this.a).append('\n');
        stringBuilder.append(string).append("dropTableIdToBuy=").append(this.b).append('\n');
        stringBuilder.append(string).append("dropTableIdChaos=").append(this.c).append('\n');
    }
}

