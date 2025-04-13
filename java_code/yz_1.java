/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yz
 */
public class yz_1
implements gs_0 {
    public ye_2 a = null;
    public ya_1 b = null;
    public final ArrayList<yi_2> c = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        int n;
        if (this.a != null) {
            byteBuffer.put((byte)1);
            n = this.a.a(byteBuffer);
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.b != null) {
            byteBuffer.put((byte)1);
            n = this.b.a(byteBuffer);
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
            yi_2 yi_22 = this.c.get(n);
            boolean bl = yi_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.a = new ye_2();
            bl = this.a.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.a = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.b = new ya_1();
            n = this.b.b(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            this.b = null;
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yi_2 yi_22 = new yi_2();
            boolean bl5 = yi_22.b(byteBuffer);
            if (!bl5) {
                return false;
            }
            this.c.add(yi_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = null;
        this.b = null;
        this.c.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            yj_2 yj_22 = new yj_2(this);
            boolean bl = yj_22.a(byteBuffer, n);
            if (bl) {
                yj_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        ++n;
        if (this.a != null) {
            n += this.a.b();
        }
        ++n;
        if (this.b != null) {
            n += this.b.b();
        }
        n += 2;
        for (int k = 0; k < this.c.size(); ++k) {
            yi_2 yi_22 = this.c.get(k);
            n += yi_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("currentScenarii=");
        if (this.a == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.a.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("currentChallengeInfo=");
        if (this.b == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.b.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("pastScenarii=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (int k = 0; k < this.c.size(); ++k) {
                yi_2 yi_22 = this.c.get(k);
                yi_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

