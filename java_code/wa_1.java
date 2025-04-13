/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wA
 */
public class wa_1
implements gs_0 {
    public String a = null;
    public int b = 0;
    public int c = 0;
    public long d = 0L;
    public String e = null;
    public boolean f = false;

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
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putLong(this.d);
        if (this.e != null) {
            byArray = this.e.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.f ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.a = new String(byArray, Charsets.UTF_8);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.e = new String(byArray2, Charsets.UTF_8);
        this.f = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0L;
        this.e = null;
        this.f = false;
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
        n += 4;
        n += 8;
        n += 2;
        n += this.e != null ? this.e.getBytes(Charsets.UTF_8).length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guid=").append(this.a).append('\n');
        stringBuilder.append(string).append("character=").append(this.b).append('\n');
        stringBuilder.append(string).append("pedestal=").append(this.c).append('\n');
        stringBuilder.append(string).append("acquiredOn=").append(this.d).append('\n');
        stringBuilder.append(string).append("note=").append(this.e).append('\n');
        stringBuilder.append(string).append("bound=").append(this.f).append('\n');
    }
}

