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
 * Renamed from uw
 */
public class uw_2
implements gs_0 {
    public long a = 0L;
    public long b = 0L;
    public String c = null;
    public long d = 0L;
    public int e = 0;
    public final ArrayList<uz_2> f = new ArrayList(0);
    public final ArrayList<ux_2> g = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putLong(this.a);
        byteBuffer.putLong(this.b);
        if (this.c != null) {
            byte[] byArray = this.c.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putLong(this.d);
        byteBuffer.putInt(this.e);
        if (this.f.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.f.size());
        for (n = 0; n < this.f.size(); ++n) {
            gs_02 = this.f.get(n);
            bl = ((uz_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.g.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.g.size());
        for (n = 0; n < this.g.size(); ++n) {
            gs_02 = this.g.get(n);
            bl = ((ux_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.f.clear();
        this.f.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.f.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.g.add(ux_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0L;
        this.b = 0L;
        this.c = null;
        this.d = 0L;
        this.e = 0;
        this.f.clear();
        this.g.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            uy_2 uy_22 = new uy_2(this);
            boolean bl = uy_22.a(byteBuffer, n);
            if (bl) {
                uy_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 8;
        n2 += 8;
        ++n2;
        n2 += this.c != null ? this.c.getBytes(Charsets.UTF_8).length : 0;
        n2 += 8;
        n2 += 4;
        ++n2;
        for (n = 0; n < this.f.size(); ++n) {
            gs_02 = this.f.get(n);
            n2 += ((uz_2)gs_02).b();
        }
        ++n2;
        for (n = 0; n < this.g.size(); ++n) {
            gs_02 = this.g.get(n);
            n2 += ((ux_2)gs_02).b();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("clientId=").append(this.a).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.b).append('\n');
        stringBuilder.append(string).append("ownerName=").append(this.c).append('\n');
        stringBuilder.append(string).append("guildId=").append(this.d).append('\n');
        stringBuilder.append(string).append("customViewModelId=").append(this.e).append('\n');
        stringBuilder.append(string).append("shelfItems=");
        if (this.f.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.f.size()).append(" elements)...\n");
            for (n = 0; n < this.f.size(); ++n) {
                gs_02 = this.f.get(n);
                ((uz_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("merchantDisplays=");
        if (this.g.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.g.size()).append(" elements)...\n");
            for (n = 0; n < this.g.size(); ++n) {
                gs_02 = this.g.get(n);
                ((ux_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
    }
}

