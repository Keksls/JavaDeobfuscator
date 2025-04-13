/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wP
 */
public class wp_2
implements gs_0 {
    public final ArrayList<wr_1> a = new ArrayList(0);
    public final ArrayList<wq_1> b = new ArrayList(0);
    public ws_2 c = null;

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
            bl = ((wr_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            bl = ((wq_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.c != null) {
            byteBuffer.put((byte)1);
            n = this.c.a(byteBuffer) ? 1 : 0;
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
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            wr_1 wr_12 = new wr_1();
            boolean bl = wr_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(wr_12);
        }
        n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            wq_1 wq_12 = new wq_1();
            boolean bl = wq_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(wq_12);
        }
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.c = new ws_2();
            boolean bl = this.c.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.c = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b.clear();
        this.c = null;
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
        for (n = 0; n < this.a.size(); ++n) {
            gs_02 = this.a.get(n);
            n2 += ((wr_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            n2 += ((wq_1)gs_02).b();
        }
        ++n2;
        if (this.c != null) {
            n2 += this.c.b();
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
        stringBuilder.append(string).append("spentCash=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (n = 0; n < this.a.size(); ++n) {
                gs_02 = this.a.get(n);
                ((wr_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("accumulatedTaxes=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (n = 0; n < this.b.size(); ++n) {
                gs_02 = this.b.get(n);
                ((wq_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("totalCash=");
        if (this.c == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.c.a(stringBuilder, string + "  ");
        }
    }
}

