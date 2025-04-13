/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vB
 */
public class vb_1
implements gs_0 {
    public long a = 0L;
    public int b = 0;
    public int c = 0;
    public short d = 0;
    public byte e = 0;
    public boolean f = false;
    public final vf_2 g = new vf_2();
    public oq_0 h = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putShort(this.d);
        byteBuffer.put(this.e);
        byteBuffer.put(this.f ? (byte)1 : 0);
        boolean bl = this.g.a(byteBuffer);
        if (!bl) {
            return false;
        }
        if (this.h == null) {
            return false;
        }
        byteBuffer.put(this.h.a());
        boolean bl2 = this.h.a(byteBuffer);
        return bl2;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        this.f = byteBuffer.get() == 1;
        boolean bl = this.g.b(byteBuffer);
        if (!bl) {
            return false;
        }
        this.h = oq_0.c(byteBuffer);
        return this.h != null;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g.c();
        this.h = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10085001) {
            vc_1 vc_12 = new vc_1(this);
            boolean bl = vc_12.a(byteBuffer, n);
            if (bl) {
                vc_12.a();
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
        n += 4;
        n += 2;
        ++n;
        ++n;
        n += this.g.b();
        ++n;
        return n += this.h.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("templateId=").append(this.a).append('\n');
        stringBuilder.append(string).append("positionX=").append(this.b).append('\n');
        stringBuilder.append(string).append("positionY=").append(this.c).append('\n');
        stringBuilder.append(string).append("positionZ=").append(this.d).append('\n');
        stringBuilder.append(string).append("direction=").append(this.e).append('\n');
        stringBuilder.append(string).append("virtual=").append(this.f).append('\n');
        stringBuilder.append(string).append("itemForm=...\n");
        this.g.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("specificData=<");
        if (this.h == null) {
            stringBuilder.append(">\n");
        } else {
            stringBuilder.append(this.h.getClass().getSimpleName()).append(">...\n");
            this.h.a(stringBuilder, string + "  ");
        }
    }
}

