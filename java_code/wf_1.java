/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wf
 */
public class wf_1
implements gs_0 {
    public short a = 0;
    public String b = null;
    public int c = 0;
    public long d = 0L;
    public short e = 0;
    public byte f = 0;
    public wg_2 g = null;
    public wi_1 h = null;
    public int i = 0;
    public long j = 0L;
    public boolean k = false;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.a);
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
        byteBuffer.putInt(this.c);
        byteBuffer.putLong(this.d);
        byteBuffer.putShort(this.e);
        byteBuffer.put(this.f);
        if (this.g != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.g.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.h != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.h.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putInt(this.i);
        byteBuffer.putLong(this.j);
        byteBuffer.put(this.k ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.a = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.b = new String(byArray, Charsets.UTF_8);
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.get();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.g = new wg_2();
            bl = this.g.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.h = new wi_1();
            boolean bl5 = this.h.b(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.h = null;
        }
        this.i = byteBuffer.getInt();
        this.j = byteBuffer.getLong();
        this.k = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = null;
        this.c = 0;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = 0L;
        this.k = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            wk_2 wk_22 = new wk_2(this);
            boolean bl = wk_22.a(byteBuffer, n);
            if (bl) {
                wk_22.a();
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
        n += 2;
        n += this.b != null ? this.b.getBytes(Charsets.UTF_8).length : 0;
        n += 4;
        n += 8;
        n += 2;
        ++n;
        ++n;
        if (this.g != null) {
            n += this.g.b();
        }
        ++n;
        if (this.h != null) {
            n += this.h.b();
        }
        n += 4;
        n += 8;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("typeid=").append(this.a).append('\n');
        stringBuilder.append(string).append("name=").append(this.b).append('\n');
        stringBuilder.append(string).append("currentHp=").append(this.c).append('\n');
        stringBuilder.append(string).append("summonId=").append(this.d).append('\n');
        stringBuilder.append(string).append("level=").append(this.e).append('\n');
        stringBuilder.append(string).append("obstacleId=").append(this.f).append('\n');
        stringBuilder.append(string).append("DOUBLEINVOC=");
        if (this.g == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.g.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("IMAGEINVOC=");
        if (this.h == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.h.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("direction=").append(this.i).append('\n');
        stringBuilder.append(string).append("summonerId=").append(this.j).append('\n');
        stringBuilder.append(string).append("summonedFromSymbiot=").append(this.k).append('\n');
    }
}

