/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from uC
 */
public class uc_1
implements gs_0 {
    public long a = 0L;
    public String b = null;
    public byte c = 0;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        if (this.b != null) {
            byte[] byArray = this.b.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.b = new String(byArray, Charsets.UTF_8);
        this.c = byteBuffer.get();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = null;
        this.c = 0;
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
        n += this.b != null ? this.b.getBytes(Charsets.UTF_8).length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("userId=").append(this.a).append('\n');
        stringBuilder.append(string).append("userName=").append(this.b).append('\n');
        stringBuilder.append(string).append("rights=").append(this.c).append('\n');
    }
}

