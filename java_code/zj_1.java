/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from zj
 */
public class zj_1
implements gs_0 {
    public int a = 0;
    public final ArrayList<zk_1> b = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (int k = 0; k < this.b.size(); ++k) {
            zk_1 zk_12 = this.b.get(k);
            boolean bl = zk_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            zk_1 zk_12 = new zk_1();
            boolean bl = zk_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(zk_12);
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
        if (n < 10069001) {
            zm_1 zm_12 = new zm_1(this);
            boolean bl = zm_12.a(byteBuffer, n);
            if (bl) {
                zm_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        n += 2;
        for (int k = 0; k < this.b.size(); ++k) {
            zk_1 zk_12 = this.b.get(k);
            n += zk_12.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.a).append('\n');
        stringBuilder.append(string).append("items=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (int k = 0; k < this.b.size(); ++k) {
                zk_1 zk_12 = this.b.get(k);
                zk_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

