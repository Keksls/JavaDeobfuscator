/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vz
 */
public class vz_2
implements gs_0 {
    public int a = 0;
    public byte b = 0;
    public final tw_2 c = new tw_2();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b);
        boolean bl = this.c.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get();
        boolean bl = this.c.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            va_2 va_22 = new va_2(this);
            boolean bl = va_22.a(byteBuffer, n);
            if (bl) {
                va_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        ++n;
        return n += this.c.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("gfxId=").append(this.a).append('\n');
        stringBuilder.append(string).append("sex=").append(this.b).append('\n');
        stringBuilder.append(string).append("imageCharac=...\n");
        this.c.a(stringBuilder, string + "  ");
    }
}

