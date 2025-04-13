/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xT
 */
public class xt_2
implements gs_0 {
    public short a = 0;
    public byte b = 0;
    public int c = 0;
    public long d = 0L;
    public long e = -1L;
    public final wf_2 f = new wf_2();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        byteBuffer.put(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putLong(this.d);
        byteBuffer.putLong(this.e);
        boolean bl = this.f.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getLong();
        boolean bl = this.f.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0L;
        this.e = -1L;
        this.f.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            xu_1 xu_12 = new xu_1(this);
            boolean bl = xu_12.a(byteBuffer, n);
            if (bl) {
                xu_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        ++n;
        n += 4;
        n += 8;
        n += 8;
        return n += this.f.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.a).append('\n');
        stringBuilder.append(string).append("type=").append(this.b).append('\n');
        stringBuilder.append(string).append("featureReferenceId=").append(this.c).append('\n');
        stringBuilder.append(string).append("duration=").append(this.d).append('\n');
        stringBuilder.append(string).append("startDate=").append(this.e).append('\n');
        stringBuilder.append(string).append("merchantItem=...\n");
        this.f.a(stringBuilder, string + "  ");
    }
}

