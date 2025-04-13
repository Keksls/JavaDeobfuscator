/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xZ
 */
public class xz_2
implements gs_0 {
    public final ArrayList<ya_2> a = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            ya_2 ya_22 = this.a.get(k);
            boolean bl = ya_22.a(byteBuffer);
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
            ya_2 ya_22 = new ya_2();
            boolean bl = ya_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(ya_22);
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
            yb_2 yb_22 = new yb_2(this);
            boolean bl = yb_22.a(byteBuffer, n);
            if (bl) {
                yb_22.a();
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
            ya_2 ya_22 = this.a.get(k);
            n += ya_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("contentsSelection=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                ya_2 ya_22 = this.a.get(k);
                ya_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

