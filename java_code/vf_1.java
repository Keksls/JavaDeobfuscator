/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from vf
 */
public class vf_1
implements gs_0 {
    public int a = -1;
    public boolean b = true;
    public final ArrayList<vh_1> c = new ArrayList(0);
    public vg_1 d = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b ? (byte)1 : 0);
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (n = 0; n < this.c.size(); ++n) {
            vh_1 vh_12 = this.c.get(n);
            boolean bl = vh_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.d != null) {
            byteBuffer.put((byte)1);
            n = this.d.a(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.d = new vg_1();
            boolean bl = this.d.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.d = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = -1;
        this.b = true;
        this.c.clear();
        this.d = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vj_2 vj_22 = new vj_2(this);
            boolean bl = vj_22.a(byteBuffer, n);
            if (bl) {
                vj_22.a();
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
        n += 2;
        for (int k = 0; k < this.c.size(); ++k) {
            vh_1 vh_12 = this.c.get(k);
            n += vh_12.b();
        }
        ++n;
        if (this.d != null) {
            n += this.d.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.a).append('\n');
        stringBuilder.append(string).append("enabled=").append(this.b).append('\n');
        stringBuilder.append(string).append("items=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (int k = 0; k < this.c.size(); ++k) {
                vh_1 vh_12 = this.c.get(k);
                vh_12.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("building=");
        if (this.d == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.d.a(stringBuilder, string + "  ");
        }
    }
}

