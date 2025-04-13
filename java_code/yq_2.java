/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yq
 */
public class yq_2
implements gs_0 {
    public int a = 0;
    public final ArrayList<yu_2> b = new ArrayList(0);
    public final ArrayList<yx_1> c = new ArrayList(0);
    public final ArrayList<yr_1> d = new ArrayList(0);
    public final ArrayList<ys_2> e = new ArrayList(0);
    public yw_2 f = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putInt(this.a);
        if (this.b.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.b.size());
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            bl = ((yu_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            bl = ((yx_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.d.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.d.size());
        for (n = 0; n < this.d.size(); ++n) {
            gs_02 = this.d.get(n);
            bl = ((yr_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.e.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.e.size());
        for (n = 0; n < this.e.size(); ++n) {
            gs_02 = this.e.get(n);
            bl = ((ys_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.f != null) {
            byteBuffer.put((byte)1);
            n = this.f.a(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3;
        int n4;
        this.a = byteBuffer.getInt();
        int n5 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n5);
        for (n4 = 0; n4 < n5; ++n4) {
            yu_2 yu_22 = new yu_2();
            boolean bl = yu_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(yu_22);
        }
        n4 = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            yx_1 yx_12 = new yx_1();
            boolean bl = yx_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(yx_12);
        }
        n3 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            yr_1 yr_12 = new yr_1();
            boolean bl = yr_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.d.add(yr_12);
        }
        n2 = byteBuffer.getShort() & 0xFFFF;
        this.e.clear();
        this.e.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ys_2 ys_22 = new ys_2();
            boolean bl = ys_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.e.add(ys_22);
        }
        int n6 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.f = new yw_2();
            boolean bl = this.f.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.f = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            yv_1 yv_12 = new yv_1(this);
            boolean bl = yv_12.a(byteBuffer, n);
            if (bl) {
                yv_12.a();
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
        n2 += 4;
        n2 += 2;
        for (n = 0; n < this.b.size(); ++n) {
            gs_02 = this.b.get(n);
            n2 += ((yu_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            n2 += ((yx_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.d.size(); ++n) {
            gs_02 = this.d.get(n);
            n2 += ((yr_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.e.size(); ++n) {
            gs_02 = this.e.get(n);
            n2 += ((ys_2)gs_02).b();
        }
        ++n2;
        if (this.f != null) {
            n2 += this.f.b();
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
        stringBuilder.append(string).append("scenarioId=").append(this.a).append('\n');
        stringBuilder.append(string).append("globalVars=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (n = 0; n < this.b.size(); ++n) {
                gs_02 = this.b.get(n);
                ((yu_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("currentVarsForAddedUsers=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (n = 0; n < this.c.size(); ++n) {
                gs_02 = this.c.get(n);
                ((yx_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("activeActionGroups=");
        if (this.d.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.d.size()).append(" elements)...\n");
            for (n = 0; n < this.d.size(); ++n) {
                gs_02 = this.d.get(n);
                ((yr_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("executedActionGroups=");
        if (this.e.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.e.size()).append(" elements)...\n");
            for (n = 0; n < this.e.size(); ++n) {
                gs_02 = this.e.get(n);
                ((ys_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("startTime=");
        if (this.f == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.f.a(stringBuilder, string + "  ");
        }
    }
}

