/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from tN
 */
public class tn_2
implements gs_0 {
    public byte a = 0;
    public short b = 0;
    public short c = 0;
    public String d = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
        byteBuffer.putShort(this.b);
        byteBuffer.putShort(this.c);
        if (this.d != null) {
            byte[] byArray = this.d.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.getShort();
        this.c = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10013) {
            to_2 to_22 = new to_2(this);
            boolean bl = to_22.a(byteBuffer, n);
            if (bl) {
                to_22.a();
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
        n += 2;
        n += 2;
        return n += this.d != null ? this.d.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("index=").append(this.a).append('\n');
        stringBuilder.append(string).append("typeId=").append(this.b).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.c).append('\n');
        stringBuilder.append(string).append("name=").append(this.d).append('\n');
    }
}

