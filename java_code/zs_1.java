/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from zs
 */
public class zs_1
implements gs_0 {
    public final ArrayList<zt_1> a = new ArrayList(0);
    public short b = 0;
    public long c = 0L;
    public long d = 0L;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            zt_1 zt_12 = this.a.get(k);
            boolean bl = zt_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putShort(this.b);
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            zt_1 zt_12 = new zt_1();
            boolean bl = zt_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(zt_12);
        }
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        for (int k = 0; k < this.a.size(); ++k) {
            zt_1 zt_12 = this.a.get(k);
            n += zt_12.b();
        }
        n += 2;
        n += 8;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("transactions=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                zt_1 zt_12 = this.a.get(k);
                zt_12.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("newTransactionsCount=").append(this.b).append('\n');
        stringBuilder.append(string).append("newTransactionsKamas=").append(this.c).append('\n');
        stringBuilder.append(string).append("lastReadTransactionDate=").append(this.d).append('\n');
    }
}

