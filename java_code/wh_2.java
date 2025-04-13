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
 * Renamed from wH
 */
public class wh_2
implements gs_0 {
    public long a = 0L;
    public byte b = (byte)-1;
    public short c = 0;
    public byte d = 1;
    public final ArrayList<wi_2> e = new ArrayList(0);
    public String f = null;
    public boolean g = false;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.b);
        byteBuffer.putShort(this.c);
        byteBuffer.put(this.d);
        if (this.e.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.e.size());
        for (int k = 0; k < this.e.size(); ++k) {
            wi_2 wi_22 = this.e.get(k);
            boolean bl = wi_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.f != null) {
            byte[] byArray = this.f.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.g ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.e.clear();
        this.e.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.e.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.f = new String((byte[])object, Charsets.UTF_8);
        this.g = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = (byte)-1;
        this.c = 0;
        this.d = 1;
        this.e.clear();
        this.f = null;
        this.g = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wk_1 wk_12 = new wk_1(this);
            boolean bl = wk_12.a(byteBuffer, n);
            if (bl) {
                wk_12.a();
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
        ++n;
        n += 2;
        ++n;
        n += 2;
        for (int k = 0; k < this.e.size(); ++k) {
            wi_2 wi_22 = this.e.get(k);
            n += wi_22.b();
        }
        n += 2;
        n += this.f != null ? this.f.getBytes(Charsets.UTF_8).length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.a).append('\n');
        stringBuilder.append(string).append("requiredItemType=").append(this.b).append('\n');
        stringBuilder.append(string).append("nSlots=").append(this.c).append('\n');
        stringBuilder.append(string).append("maxPackSize=").append(this.d).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.e.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.e.size()).append(" elements)...\n");
            for (int k = 0; k < this.e.size(); ++k) {
                wi_2 wi_22 = this.e.get(k);
                wi_22.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("shortAd=").append(this.f).append('\n');
        stringBuilder.append(string).append("locked=").append(this.g).append('\n');
    }
}

