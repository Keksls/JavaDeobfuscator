/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from oR
 */
public class or_0
extends go_1
implements gs_0 {
    public int[] c = null;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public long g = 0L;
    public long h = 0L;
    public int[] i = null;
    public byte j = 0;
    public byte k = 0;
    public final ArrayList<ot_0> l = new ArrayList(0);
    public byte m = 0;
    public int n = 0;
    private final fo_1 o = new os_0(this);

    @Override
    public fo_1 a() {
        return this.o;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        int n;
        if (this.c != null) {
            if (this.c.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.c.length);
            for (n = 0; n < this.c.length; ++n) {
                byteBuffer.putInt(this.c[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putInt(this.d);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putLong(this.g);
        byteBuffer.putLong(this.h);
        if (this.i != null) {
            if (this.i.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.i.length);
            for (n = 0; n < this.i.length; ++n) {
                byteBuffer.putInt(this.i[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.j);
        byteBuffer.put(this.k);
        if (this.l.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.l.size());
        for (n = 0; n < this.l.size(); ++n) {
            ot_0 ot_02 = this.l.get(n);
            boolean bl = ot_02.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.put(this.m);
        byteBuffer.putInt(this.n);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.c = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.c[n2] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getLong();
        this.h = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.i = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.i[n] = byteBuffer.getInt();
            }
        } else {
            this.i = null;
        }
        this.j = byteBuffer.get();
        this.k = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.l.clear();
        this.l.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ot_0 ot_02 = new ot_0();
            boolean bl = ot_02.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.l.add(ot_02);
        }
        this.m = byteBuffer.get();
        this.n = byteBuffer.getInt();
        return true;
    }

    @Override
    public void c() {
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = 0L;
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.l.clear();
        this.m = 0;
        this.n = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10081000) {
            ou_1 ou_12 = new ou_1(this);
            boolean bl = ou_12.a(byteBuffer, n);
            if (bl) {
                ou_12.a();
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
        n += this.c != null ? this.c.length * 4 : 0;
        n += 4;
        n += 4;
        n += 4;
        n += 8;
        n += 8;
        n += 2;
        n += this.i != null ? this.i.length * 4 : 0;
        ++n;
        ++n;
        n += 2;
        for (int k = 0; k < this.l.size(); ++k) {
            ot_0 ot_02 = this.l.get(k);
            n += ot_02.b();
        }
        ++n;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("adminRights=(").append(this.c.length).append(" bytes)\n");
        stringBuilder.append(string).append("subscriptionLevel=").append(this.d).append('\n');
        stringBuilder.append(string).append("forcedSubscriptionLevel=").append(this.e).append('\n');
        stringBuilder.append(string).append("antiAddictionLevel=").append(this.f).append('\n');
        stringBuilder.append(string).append("sessionStartTime=").append(this.g).append('\n');
        stringBuilder.append(string).append("sessionId=").append(this.h).append('\n');
        stringBuilder.append(string).append("additionalRights=(").append(this.i.length).append(" bytes)\n");
        stringBuilder.append(string).append("additionalSlots=").append(this.j).append('\n');
        stringBuilder.append(string).append("accountSecurityType=").append(this.k).append('\n');
        stringBuilder.append(string).append("accountData=");
        if (this.l.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.l.size()).append(" elements)...\n");
            for (int k = 0; k < this.l.size(); ++k) {
                ot_0 ot_02 = this.l.get(k);
                ot_02.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("languages=").append(this.m).append('\n');
        stringBuilder.append(string).append("accountCommunityId=").append(this.n).append('\n');
    }
}

