/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yx
 */
public class yx_1
implements gs_0 {
    public long a = 0L;
    public final ArrayList<yy_2> b = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (int k = 0; k < this.b.size(); ++k) {
            yy_2 yy_22 = this.b.get(k);
            boolean bl = yy_22.a(byteBuffer);
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
            yy_2 yy_22 = new yy_2();
            boolean bl = yy_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(yy_22);
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
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 2;
        for (int k = 0; k < this.b.size(); ++k) {
            yy_2 yy_22 = this.b.get(k);
            n += yy_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("userId=").append(this.a).append('\n');
        stringBuilder.append(string).append("vars=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (int k = 0; k < this.b.size(); ++k) {
                yy_2 yy_22 = this.b.get(k);
                yy_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

