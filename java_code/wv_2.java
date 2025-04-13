/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wV
 */
public class wv_2
implements gs_0 {
    public boolean a = false;
    public final ArrayList<ww_1> b = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a ? (byte)1 : 0);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (int k = 0; k < this.b.size(); ++k) {
            ww_1 ww_12 = this.b.get(k);
            boolean bl = ww_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get() == 1;
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ww_1 ww_12 = new ww_1();
            boolean bl = ww_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(ww_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = false;
        this.b.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        ++n;
        n += 2;
        for (int k = 0; k < this.b.size(); ++k) {
            ww_1 ww_12 = this.b.get(k);
            n += ww_12.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("firstChange=").append(this.a).append('\n');
        stringBuilder.append(string).append("laws=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (int k = 0; k < this.b.size(); ++k) {
                ww_1 ww_12 = this.b.get(k);
                ww_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

