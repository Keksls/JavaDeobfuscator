/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from zt
 */
public class zt_1
implements gs_0 {
    public long a = 0L;
    public long b = 0L;
    public String c = null;
    public final ArrayList<zu_1> d = new ArrayList(0);
    public long e = 0L;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        if (this.c != null) {
            byte[] byArray = this.c.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.d.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.d.size());
        for (int k = 0; k < this.d.size(); ++k) {
            zu_1 zu_12 = this.d.get(k);
            boolean bl = zu_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putLong(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        int n2 = byteBuffer.get() & 0xFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (int k = 0; k < n2; ++k) {
            zu_1 zu_12 = new zu_1();
            boolean bl = zu_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.d.add(zu_12);
        }
        this.e = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0L;
        this.c = null;
        this.d.clear();
        this.e = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 8;
        ++n;
        n += this.c != null ? this.c.getBytes(Charsets.UTF_8).length : 0;
        ++n;
        for (int k = 0; k < this.d.size(); ++k) {
            zu_1 zu_12 = this.d.get(k);
            n += zu_12.b();
        }
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("transactionDate=").append(this.a).append('\n');
        stringBuilder.append(string).append("buyerId=").append(this.b).append('\n');
        stringBuilder.append(string).append("buyerName=").append(this.c).append('\n');
        stringBuilder.append(string).append("soldItems=");
        if (this.d.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.d.size()).append(" elements)...\n");
            for (int k = 0; k < this.d.size(); ++k) {
                zu_1 zu_12 = this.d.get(k);
                zu_12.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("totalPrice=").append(this.e).append('\n');
    }
}

