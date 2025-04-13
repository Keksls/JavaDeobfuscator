/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tI
 */
public class ti_2
implements gs_0 {
    public short a = 0;
    public final ArrayList<tk_1> b = new ArrayList(0);
    public final ArrayList<tj_1> c = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putShort(this.a);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            bl = ((tk_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            bl = ((tj_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        this.a = byteBuffer.getShort();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tk_1 tk_12 = new tk_1();
            boolean bl = tk_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(tk_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            tj_1 tj_12 = new tj_1();
            boolean bl = tj_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(tj_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b.clear();
        this.c.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 2;
        n2 += 2;
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            n2 += ((tk_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            n2 += ((tj_1)gs_02).b();
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
        stringBuilder.append(string).append("freePoints=").append(this.a).append('\n');
        stringBuilder.append(string).append("xpBonusPoints=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (n = 0; n < this.b.size(); ++n) {
                gs_02 = this.b.get(n);
                ((tk_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("characteristicBonusPoints=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (n = 0; n < this.c.size(); ++n) {
                gs_02 = this.c.get(n);
                ((tj_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
    }
}

