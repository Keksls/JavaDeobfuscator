/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from uV
 */
public class uv_1
implements gs_0 {
    public long a = 0L;
    public long b = 0L;
    public String c = null;
    public long d = 0L;
    public int e = 0;
    public int f = 0;
    public short g = 0;
    public long h = 0L;
    public final us_2 i = new us_2();
    public long j = 0L;
    public String k = null;
    public long l = 0L;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        if (this.c != null) {
            byte[] byArray = this.c.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putLong(this.d);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putShort(this.g);
        byteBuffer.putLong(this.h);
        boolean bl = this.i.a(byteBuffer);
        if (!bl) {
            return false;
        }
        byteBuffer.putLong(this.j);
        if (this.k != null) {
            byte[] byArray = this.k.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putLong(this.l);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getShort();
        this.h = byteBuffer.getLong();
        boolean bl = this.i.b(byteBuffer);
        if (!bl) {
            return false;
        }
        this.j = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.k = new String(byArray2, Charsets.UTF_8);
        this.l = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0L;
        this.c = null;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0L;
        this.i.c();
        this.j = 0L;
        this.k = null;
        this.l = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10086002) {
            uw_1 uw_12 = new uw_1(this);
            boolean bl = uw_12.a(byteBuffer, n);
            if (bl) {
                uw_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 8;
        n += 2;
        n += this.c != null ? this.c.getBytes(Charsets.UTF_8).length : 0;
        n += 8;
        n += 4;
        n += 4;
        n += 2;
        n += 8;
        n += this.i.b();
        n += 8;
        ++n;
        n += this.k != null ? this.k.getBytes(Charsets.UTF_8).length : 0;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("clientId=").append(this.a).append('\n');
        stringBuilder.append(string).append("characterId=").append(this.b).append('\n');
        stringBuilder.append(string).append("characterName=").append(this.c).append('\n');
        stringBuilder.append(string).append("guildId=").append(this.d).append('\n');
        stringBuilder.append(string).append("positionX=").append(this.e).append('\n');
        stringBuilder.append(string).append("positionY=").append(this.f).append('\n');
        stringBuilder.append(string).append("positionZ=").append(this.g).append('\n');
        stringBuilder.append(string).append("positionWorldId=").append(this.h).append('\n');
        stringBuilder.append(string).append("content=...\n");
        this.i.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("creationDate=").append(this.j).append('\n');
        stringBuilder.append(string).append("gameServer=").append(this.k).append('\n');
        stringBuilder.append(string).append("lastLog=").append(this.l).append('\n');
    }
}

