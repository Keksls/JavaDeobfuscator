/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from uY
 */
public class uy_1
implements gs_0 {
    public String a = null;
    public int b = 0;
    public short c = 0;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a != null) {
            byte[] byArray = this.a.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.b);
        byteBuffer.putShort(this.c);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.a = new String(byArray, Charsets.UTF_8);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        return true;
    }

    @Override
    public void c() {
        this.a = null;
        this.b = 0;
        this.c = 0;
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
        n += 4;
        return n += 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guid=").append(this.a).append('\n');
        stringBuilder.append(string).append("referenceId=").append(this.b).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.c).append('\n');
    }
}

