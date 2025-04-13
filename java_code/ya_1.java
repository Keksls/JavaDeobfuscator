/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yA
 */
public class ya_1
implements gs_0 {
    public final ArrayList<yb_1> a = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            yb_1 yb_12 = this.a.get(k);
            boolean bl = yb_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yb_1 yb_12 = new yb_1();
            boolean bl = yb_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(yb_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            yd_2 yd_22 = new yd_2(this);
            boolean bl = yd_22.a(byteBuffer, n);
            if (bl) {
                yd_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        for (int k = 0; k < this.a.size(); ++k) {
            yb_1 yb_12 = this.a.get(k);
            n += yb_12.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challenges=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                yb_1 yb_12 = this.a.get(k);
                yb_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

