/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from vb
 */
public class vb_2
implements gs_0 {
    public final ArrayList<vc_2> a = new ArrayList(0);
    public int b = 0;
    public final vk_2 c = new vk_2();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        int n;
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (n = 0; n < this.a.size(); ++n) {
            vc_2 vc_22 = this.a.get(n);
            boolean bl = vc_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.b);
        n = this.c.a(byteBuffer) ? 1 : 0;
        return n != 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(vc_22);
        }
        this.b = byteBuffer.getInt();
        n = this.c.b(byteBuffer) ? 1 : 0;
        return n != 0;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b = 0;
        this.c.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            ve_1 ve_12 = new ve_1(this);
            boolean bl = ve_12.a(byteBuffer, n);
            if (bl) {
                ve_12.a();
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
        for (int k = 0; k < this.a.size(); ++k) {
            vc_2 vc_22 = this.a.get(k);
            n += vc_22.b();
        }
        n += 4;
        return n += this.c.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("compartments=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                vc_2 vc_22 = this.a.get(k);
                vc_22.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("money=").append(this.b).append('\n');
        stringBuilder.append(string).append("history=...\n");
        this.c.a(stringBuilder, string + "  ");
    }
}

