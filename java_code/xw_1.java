/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xW
 */
public class xw_1
implements gs_0 {
    public final ArrayList<xy_2> a = new ArrayList(0);
    public xz_2 b = null;
    public final ArrayList<xx_1> c = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (n = 0; n < this.a.size(); ++n) {
            gs_02 = this.a.get(n);
            bl = ((xy_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.b != null) {
            byteBuffer.put((byte)1);
            n = this.b.a(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            bl = ((xx_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            xy_2 xy_22 = new xy_2();
            n = xy_22.b(byteBuffer);
            if (n == 0) {
                return false;
            }
            this.a.add(xy_22);
        }
        int n4 = n2 = byteBuffer.get() == 1 ? 1 : 0;
        if (n2 != 0) {
            this.b = new xz_2();
            boolean bl = this.b.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.b = null;
        }
        int n5 = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n5);
        for (n = 0; n < n5; ++n) {
            xx_1 xx_12 = new xx_1();
            boolean bl = xx_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(xx_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b = null;
        this.c.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            yc_2 yc_22 = new yc_2(this);
            boolean bl = yc_22.a(byteBuffer, n);
            if (bl) {
                yc_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 2;
        for (n = 0; n < this.a.size(); ++n) {
            gs_02 = this.a.get(n);
            n2 += ((xy_2)gs_02).b();
        }
        ++n2;
        if (this.b != null) {
            n2 += this.b.b();
        }
        n2 += 2;
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            n2 += ((xx_1)gs_02).b();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("contents=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (n = 0; n < this.a.size(); ++n) {
                gs_02 = this.a.get(n);
                ((xy_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("contentsSelection=");
        if (this.b == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.b.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("buyableContents=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (n = 0; n < this.c.size(); ++n) {
                gs_02 = this.c.get(n);
                ((xx_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
    }
}

