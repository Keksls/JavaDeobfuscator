/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uL
 */
public class ul_2
implements gs_0 {
    public int a = 0;
    public int b = 0;
    public byte[] c = null;
    public byte d = 0;
    public final yx_2 e = new yx_2();
    public final tw_2 f = new tw_2();
    public final ArrayList<um_1> g = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        if (this.c != null) {
            if (this.c.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.c.length);
            byteBuffer.put(this.c);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.d);
        boolean bl = this.e.a(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer);
        if (!bl2) {
            return false;
        }
        if (this.g.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.g.size());
        for (int k = 0; k < this.g.size(); ++k) {
            um_1 um_12 = this.g.get(k);
            boolean bl3 = um_12.a(byteBuffer);
            if (bl3) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new byte[n];
            byteBuffer.get(this.c);
        } else {
            this.c = null;
        }
        this.d = byteBuffer.get();
        boolean bl = this.e.b(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.f.b(byteBuffer);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.g.clear();
        this.g.ensureCapacity(n2);
        for (int k = 0; k < n2; ++k) {
            um_1 um_12 = new um_1();
            boolean bl3 = um_12.b(byteBuffer);
            if (!bl3) {
                return false;
            }
            this.g.add(um_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.e.c();
        this.f.c();
        this.g.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            un_1 un_12 = new un_1(this);
            boolean bl = un_12.a(byteBuffer, n);
            if (bl) {
                un_12.a();
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
        n += 4;
        n += 2;
        n += this.c != null ? this.c.length : 0;
        ++n;
        n += this.e.b();
        n += this.f.b();
        n += 2;
        for (int k = 0; k < this.g.size(); ++k) {
            um_1 um_12 = this.g.get(k);
            n += um_12.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("power=").append(this.a).append('\n');
        stringBuilder.append(string).append("gfxId=").append(this.b).append('\n');
        stringBuilder.append(string).append("appearanceData=(").append(this.c != null ? this.c.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("doubleType=").append(this.d).append('\n');
        stringBuilder.append(string).append("doublespells=...\n");
        this.e.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("doubleCharac=...\n");
        this.f.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("equipmentAppareances=");
        if (this.g.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.g.size()).append(" elements)...\n");
            for (int k = 0; k < this.g.size(); ++k) {
                um_1 um_12 = this.g.get(k);
                um_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

