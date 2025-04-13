/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tq
 */
public class tq_1
extends go_1
implements gs_0 {
    public long c = 0L;
    public final ArrayList<ts_2> d = new ArrayList(0);
    private final fo_1 e = new tr_2(this);

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c);
        if (this.d.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.d.size());
        for (int k = 0; k < this.d.size(); ++k) {
            ts_2 ts_22 = this.d.get(k);
            boolean bl = ts_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.d.add(ts_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.c = 0L;
        this.d.clear();
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
        for (int k = 0; k < this.d.size(); ++k) {
            ts_2 ts_22 = this.d.get(k);
            n += ts_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("groupId=").append(this.c).append('\n');
        stringBuilder.append(string).append("members=");
        if (this.d.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.d.size()).append(" elements)...\n");
            for (int k = 0; k < this.d.size(); ++k) {
                ts_2 ts_22 = this.d.get(k);
                ts_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

