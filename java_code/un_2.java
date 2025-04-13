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
 * Renamed from un
 */
public class un_2
implements gs_0 {
    public long a = 0L;
    public long b = 0L;
    public String c = null;
    public long d = 0L;
    public short e = 0;
    public long f = 0L;
    public final ArrayList<up_1> g = new ArrayList(0);
    public int h = 0;
    public ur_2 i = null;
    public final ud_2 j = new ud_2();
    public boolean k = false;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        int n;
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
        byteBuffer.putShort(this.e);
        byteBuffer.putLong(this.f);
        if (this.g.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.g.size());
        for (n = 0; n < this.g.size(); ++n) {
            up_1 up_12 = this.g.get(n);
            boolean bl = up_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.h);
        if (this.i != null) {
            byteBuffer.put((byte)1);
            n = this.i.a(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        n = this.j.a(byteBuffer) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        byteBuffer.put(this.k ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.b(byteBuffer);
            if (!bl2) {
                return false;
            }
            this.g.add(up_12);
        }
        this.h = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.i = new ur_2();
            boolean bl3 = this.i.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.i = null;
        }
        if (!(bl = this.j.b(byteBuffer))) {
            return false;
        }
        this.k = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0L;
        this.c = null;
        this.d = 0L;
        this.e = 0;
        this.f = 0L;
        this.g.clear();
        this.h = 0;
        this.i = null;
        this.j.c();
        this.k = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10086002) {
            uo_2 uo_22 = new uo_2(this);
            boolean bl = uo_22.a(byteBuffer, n);
            if (bl) {
                uo_22.a();
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
        n += 2;
        n += 8;
        ++n;
        for (int k = 0; k < this.g.size(); ++k) {
            up_1 up_12 = this.g.get(k);
            n += up_12.b();
        }
        n += 4;
        ++n;
        if (this.i != null) {
            n += this.i.b();
        }
        n += this.j.b();
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("clientId=").append(this.a).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.b).append('\n');
        stringBuilder.append(string).append("ownerName=").append(this.c).append('\n');
        stringBuilder.append(string).append("guildId=").append(this.d).append('\n');
        stringBuilder.append(string).append("playListId=").append(this.e).append('\n');
        stringBuilder.append(string).append("musicId=").append(this.f).append('\n');
        stringBuilder.append(string).append("rooms=");
        if (this.g.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.g.size()).append(" elements)...\n");
            for (int k = 0; k < this.g.size(); ++k) {
                up_1 up_12 = this.g.get(k);
                up_12.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("customViewModelId=").append(this.h).append('\n');
        stringBuilder.append(string).append("wallet=");
        if (this.i == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.i.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("permissions=...\n");
        this.j.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("leaveFleaAtDisconnection=").append(this.k).append('\n');
    }
}

