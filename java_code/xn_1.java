/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from xn
 */
public class xn_1
implements gs_0 {
    public int a = 0;
    public String b = null;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public long g = 0L;
    public long h = 0L;
    public int i = 0;
    public long j = 0L;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
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
        byteBuffer.putInt(this.d);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putLong(this.g);
        byteBuffer.putLong(this.h);
        byteBuffer.putInt(this.i);
        byteBuffer.putLong(this.j);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.b = new String(byArray, Charsets.UTF_8);
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getLong();
        this.h = byteBuffer.getLong();
        this.i = byteBuffer.getInt();
        this.j = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = 0L;
        this.i = 0;
        this.j = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10048000) {
            xo_2 xo_22 = new xo_2(this);
            boolean bl = xo_22.a(byteBuffer, n);
            if (bl) {
                xo_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        n += 2;
        n += this.b != null ? this.b.getBytes(Charsets.UTF_8).length : 0;
        n += 4;
        n += 4;
        n += 4;
        n += 4;
        n += 8;
        n += 8;
        n += 4;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("definitionId=").append(this.a).append('\n');
        stringBuilder.append(string).append("name=").append(this.b).append('\n');
        stringBuilder.append(string).append("colorItemRefId=").append(this.c).append('\n');
        stringBuilder.append(string).append("equippedRefItemId=").append(this.d).append('\n');
        stringBuilder.append(string).append("health=").append(this.e).append('\n');
        stringBuilder.append(string).append("xp=").append(this.f).append('\n');
        stringBuilder.append(string).append("lastMealDate=").append(this.g).append('\n');
        stringBuilder.append(string).append("lastHungryDate=").append(this.h).append('\n');
        stringBuilder.append(string).append("sleepRefItemId=").append(this.i).append('\n');
        stringBuilder.append(string).append("sleepDate=").append(this.j).append('\n');
    }
}

