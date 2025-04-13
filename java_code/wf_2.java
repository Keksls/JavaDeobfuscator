/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wF
 */
public class wf_2
implements gs_0 {
    public final vf_2 a = new vf_2();
    public short b = 1;
    public int c = 0;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.a.a(byteBuffer);
        if (!bl) {
            return false;
        }
        byteBuffer.putShort(this.b);
        byteBuffer.putInt(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.a.b(byteBuffer);
        if (!bl) {
            return false;
        }
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.a.c();
        this.b = 1;
        this.c = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wg_1 wg_12 = new wg_1(this);
            boolean bl = wg_12.a(byteBuffer, n);
            if (bl) {
                wg_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += this.a.b();
        n += 2;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("item=...\n");
        this.a.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("packSize=").append(this.b).append('\n');
        stringBuilder.append(string).append("price=").append(this.c).append('\n');
    }
}

