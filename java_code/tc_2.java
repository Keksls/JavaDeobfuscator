/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tC
 */
public class tc_2
implements gs_0 {
    public long a = 0L;
    public int b = 0;
    public byte c = 0;
    public short d = 0;
    public final wb_1 e = new wb_1();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.put(this.c);
        byteBuffer.putShort(this.d);
        boolean bl = this.e.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        boolean bl = this.e.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            td_2 td_22 = new td_2(this);
            boolean bl = td_22.a(byteBuffer, n);
            if (bl) {
                td_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 4;
        ++n;
        n += 2;
        return n += this.e.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uniqueId=").append(this.a).append('\n');
        stringBuilder.append(string).append("referenceId=").append(this.b).append('\n');
        stringBuilder.append(string).append("position=").append(this.c).append('\n');
        stringBuilder.append(string).append("maximumSize=").append(this.d).append('\n');
        stringBuilder.append(string).append("inventory=...\n");
        this.e.a(stringBuilder, string + "  ");
    }
}

