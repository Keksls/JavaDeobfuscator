/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wc
 */
public class wc_2
implements gs_0 {
    public short a = 0;
    public final vf_2 b = new vf_2();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
        boolean bl = this.b.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
        boolean bl = this.b.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wd_2 wd_22 = new wd_2(this);
            boolean bl = wd_22.a(byteBuffer, n);
            if (bl) {
                wd_22.a();
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
        return n += this.b.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.a).append('\n');
        stringBuilder.append(string).append("item=...\n");
        this.b.a(stringBuilder, string + "  ");
    }
}

