/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yQ
 */
public class yq_1
implements gs_0 {
    public byte a = 0;
    public final ArrayList<yr_2> b = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (int k = 0; k < this.b.size(); ++k) {
            yr_2 yr_22 = this.b.get(k);
            boolean bl = yr_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yr_2 yr_22 = new yr_2();
            boolean bl = yr_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(yr_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
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
            yr_2 yr_22 = this.b.get(k);
            n += yr_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("type=").append(this.a).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (int k = 0; k < this.b.size(); ++k) {
                yr_2 yr_22 = this.b.get(k);
                yr_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

