/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tW
 */
public class tw_2
implements gs_0 {
    public final ArrayList<tx_1> a = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            tx_1 tx_12 = this.a.get(k);
            boolean bl = tx_12.a(byteBuffer);
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
            tx_1 tx_12 = new tx_1();
            boolean bl = tx_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(tx_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            tz_1 tz_12 = new tz_1(this);
            boolean bl = tz_12.a(byteBuffer, n);
            if (bl) {
                tz_12.a();
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
            tx_1 tx_12 = this.a.get(k);
            n += tx_12.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("characteristics=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                tx_1 tx_12 = this.a.get(k);
                tx_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

