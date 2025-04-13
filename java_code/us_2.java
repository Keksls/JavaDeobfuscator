/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from us
 */
public class us_2
implements gs_0 {
    public final ArrayList<uu_2> a = new ArrayList(0);
    public int b = 0;
    public int c = 0;
    public final zs_1 d = new zs_1();
    public final ud_2 e = new ud_2();
    public final ul_1 f = new ul_1();
    public final uk_2 g = new uk_2();
    public short h = 0;
    public long i = 0L;
    public boolean j = false;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        if (this.a.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.a.size());
        for (n = 0; n < this.a.size(); ++n) {
            uu_2 uu_22 = this.a.get(n);
            bl = uu_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        n = this.d.a(byteBuffer) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.e.a(byteBuffer);
        if (!bl2) {
            return false;
        }
        bl = this.f.a(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.g.a(byteBuffer);
        if (!bl3) {
            return false;
        }
        byteBuffer.putShort(this.h);
        byteBuffer.putLong(this.i);
        byteBuffer.put(this.j ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.a.clear();
        this.a.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(uu_22);
        }
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        n = this.d.b(byteBuffer) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.e.b(byteBuffer);
        if (!bl2) {
            return false;
        }
        bl = this.f.b(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.g.b(byteBuffer);
        if (!bl3) {
            return false;
        }
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        this.j = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b = 0;
        this.c = 0;
        this.d.c();
        this.e.c();
        this.f.c();
        this.g.c();
        this.h = 0;
        this.i = 0L;
        this.j = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10086002) {
            ut_1 ut_12 = new ut_1(this);
            boolean bl = ut_12.a(byteBuffer, n);
            if (bl) {
                ut_12.a();
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
        for (int k = 0; k < this.a.size(); ++k) {
            uu_2 uu_22 = this.a.get(k);
            n += uu_22.b();
        }
        n += 4;
        n += 4;
        n += this.d.b();
        n += this.e.b();
        n += this.f.b();
        n += this.g.b();
        n += 2;
        n += 8;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rooms=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                uu_2 uu_22 = this.a.get(k);
                uu_22.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("cash=").append(this.b).append('\n');
        stringBuilder.append(string).append("customViewModelId=").append(this.c).append('\n');
        stringBuilder.append(string).append("transactionLog=...\n");
        this.d.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("permissions=...\n");
        this.e.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("ecosystem=...\n");
        this.f.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("storageBox=...\n");
        this.g.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("playListId=").append(this.h).append('\n');
        stringBuilder.append(string).append("musicId=").append(this.i).append('\n');
        stringBuilder.append(string).append("leaveFleaAtDisconnection=").append(this.j).append('\n');
    }
}

