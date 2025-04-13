/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xS
 */
public class xs_1
implements gs_0 {
    public long a = 0L;
    public final ArrayList<xt_2> b = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (int k = 0; k < this.b.size(); ++k) {
            xt_2 xt_22 = this.b.get(k);
            boolean bl = xt_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(xt_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            xv_1 xv_12 = new xv_1(this);
            boolean bl = xv_12.a(byteBuffer, n);
            if (bl) {
                xv_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 2;
        for (int k = 0; k < this.b.size(); ++k) {
            xt_2 xt_22 = this.b.get(k);
            n += xt_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.a).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (int k = 0; k < this.b.size(); ++k) {
                xt_2 xt_22 = this.b.get(k);
                xt_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

