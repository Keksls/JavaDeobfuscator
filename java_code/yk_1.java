/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yK
 */
public class yk_1
implements gs_0 {
    public final ArrayList<ym_2> a = new ArrayList(0);
    public final ArrayList<yl_1> b = new ArrayList(0);
    public int c = 0;
    public int d = 0;
    public byte e = (byte)-1;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.a.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.a.size());
        for (n = 0; n < this.a.size(); ++n) {
            gs_02 = this.a.get(n);
            bl = ((ym_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            bl = ((yl_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.put(this.e);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.a.clear();
        this.a.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ym_2 ym_22 = new ym_2();
            boolean bl = ym_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(ym_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yl_1 yl_12 = new yl_1();
            boolean bl = yl_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(yl_12);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.get();
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b.clear();
        this.c = 0;
        this.d = 0;
        this.e = (byte)-1;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            yo_1 yo_12 = new yo_1(this);
            boolean bl = yo_12.a(byteBuffer, n);
            if (bl) {
                yo_12.a();
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
        n2 += 2;
        for (n = 0; n < this.a.size(); ++n) {
            gs_02 = this.a.get(n);
            n2 += ((ym_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            n2 += ((yl_1)gs_02).b();
        }
        n2 += 4;
        n2 += 4;
        return ++n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("shardSlot=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (n = 0; n < this.a.size(); ++n) {
                gs_02 = this.a.get(n);
                ((ym_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("additionalGems=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (n = 0; n < this.b.size(); ++n) {
                gs_02 = this.b.get(n);
                ((yl_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("sublimationItemId=").append(this.c).append('\n');
        stringBuilder.append(string).append("specialSublimationItemId=").append(this.d).append('\n');
        stringBuilder.append(string).append("charges=").append(this.e).append('\n');
    }
}

