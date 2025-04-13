/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yg
 */
public class yg_2
implements gs_0 {
    public byte a = 0;
    public final ArrayList<yh_2> b = new ArrayList(0);
    public ys_1 c = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.put(this.a);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (n = 0; n < this.b.size(); ++n) {
            yh_2 yh_22 = this.b.get(n);
            boolean bl = yh_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.c == null) {
            return false;
        }
        byteBuffer.put(this.c.a());
        n = this.c.a(byteBuffer) ? 1 : 0;
        return n != 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(yh_22);
        }
        this.c = ys_1.c(byteBuffer);
        return this.c != null;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b.clear();
        this.c = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10085001) {
            yj_1 yj_12 = new yj_1(this);
            boolean bl = yj_12.a(byteBuffer, n);
            if (bl) {
                yj_12.a();
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
        n += 2;
        for (int k = 0; k < this.b.size(); ++k) {
            yh_2 yh_22 = this.b.get(k);
            n += yh_22.b();
        }
        ++n;
        return n += this.c.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("layoutPosition=").append(this.a).append('\n');
        stringBuilder.append(string).append("interactiveElements=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (int k = 0; k < this.b.size(); ++k) {
                yh_2 yh_22 = this.b.get(k);
                yh_22.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("roomSpecificData=<");
        if (this.c == null) {
            stringBuilder.append(">\n");
        } else {
            stringBuilder.append(this.c.getClass().getSimpleName()).append(">...\n");
            this.c.a(stringBuilder, string + "  ");
        }
    }
}

