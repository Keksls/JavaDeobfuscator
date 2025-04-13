/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wM
 */
public class wm_2
implements gs_0 {
    public final ArrayList<wn_1> a = new ArrayList(0);
    public final ArrayList<wo_1> b = new ArrayList(0);

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
            bl = ((wn_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            bl = ((wo_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            wn_1 wn_12 = new wn_1();
            boolean bl = wn_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(wn_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            wo_1 wo_12 = new wo_1();
            boolean bl = wo_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(wo_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b.clear();
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
            n2 += ((wn_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            n2 += ((wo_1)gs_02).b();
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
        stringBuilder.append(string).append("alignments=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (n = 0; n < this.a.size(); ++n) {
                gs_02 = this.a.get(n);
                ((wn_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("alignmentRequests=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (n = 0; n < this.b.size(); ++n) {
                gs_02 = this.b.get(n);
                ((wo_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
    }
}

