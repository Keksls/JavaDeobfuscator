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
 * Renamed from uZ
 */
public class uz_1
implements gs_0 {
    public String a = null;
    public String b = null;
    public final ArrayList<va_1> c = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byte[] byArray;
        if (this.a != null) {
            byArray = this.a.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.b != null) {
            byArray = this.b.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (int k = 0; k < this.c.size(); ++k) {
            va_1 va_12 = this.c.get(k);
            boolean bl = va_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.a = new String(byArray, Charsets.UTF_8);
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.b = new String(byArray2, Charsets.UTF_8);
        int n3 = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n3);
        for (int k = 0; k < n3; ++k) {
            va_1 va_12 = new va_1();
            boolean bl = va_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(va_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = null;
        this.b = null;
        this.c.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        n += this.a != null ? this.a.getBytes(Charsets.UTF_8).length : 0;
        n += 2;
        n += this.b != null ? this.b.getBytes(Charsets.UTF_8).length : 0;
        n += 2;
        for (int k = 0; k < this.c.size(); ++k) {
            va_1 va_12 = this.c.get(k);
            n += va_12.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("title=").append(this.a).append('\n');
        stringBuilder.append(string).append("message=").append(this.b).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (int k = 0; k < this.c.size(); ++k) {
                va_1 va_12 = this.c.get(k);
                va_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

