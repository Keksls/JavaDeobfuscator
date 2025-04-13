/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tP
 */
public class tp_1
implements gs_0 {
    public int a = 0;
    public final ArrayList<tq_2> b = new ArrayList(0);
    public final ArrayList<tr_1> c = new ArrayList(0);
    public final ArrayList<ts_1> d = new ArrayList(0);
    public final ArrayList<tv_2> e = new ArrayList(0);
    public tu_2 f = null;

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
            bl = ((tq_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            bl = ((tr_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.d.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.d.size());
        for (n = 0; n < this.d.size(); ++n) {
            gs_02 = this.d.get(n);
            bl = ((ts_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.e.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.e.size());
        for (n = 0; n < this.e.size(); ++n) {
            gs_02 = this.e.get(n);
            bl = ((tv_2)gs_02).a(byteBuffer);
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
            tq_2 tq_22 = new tq_2();
            boolean bl = tq_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.b.add(tq_22);
        }
        n4 = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            tr_1 tr_12 = new tr_1();
            boolean bl = tr_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(tr_12);
        }
        n3 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            ts_1 ts_12 = new ts_1();
            boolean bl = ts_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.d.add(ts_12);
        }
        n2 = byteBuffer.getShort() & 0xFFFF;
        this.e.clear();
        this.e.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tv_2 tv_22 = new tv_2();
            boolean bl = tv_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.e.add(tv_22);
        }
        int n6 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.f = new tu_2();
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
            tt_2 tt_22 = new tt_2(this);
            boolean bl = tt_22.a(byteBuffer, n);
            if (bl) {
                tt_22.a();
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
            n2 += ((tq_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            n2 += ((tr_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.d.size(); ++n) {
            gs_02 = this.d.get(n);
            n2 += ((ts_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.e.size(); ++n) {
            gs_02 = this.e.get(n);
            n2 += ((tv_2)gs_02).b();
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
        stringBuilder.append(string).append("activeGoals=");
        if (this.b.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.b.size()).append(" elements)...\n");
            for (n = 0; n < this.b.size(); ++n) {
                gs_02 = this.b.get(n);
                ((tq_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("executedGoals=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (n = 0; n < this.c.size(); ++n) {
                gs_02 = this.c.get(n);
                ((tr_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("globalVars=");
        if (this.d.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.d.size()).append(" elements)...\n");
            for (n = 0; n < this.d.size(); ++n) {
                gs_02 = this.d.get(n);
                ((ts_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("watchedVars=");
        if (this.e.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.e.size()).append(" elements)...\n");
            for (n = 0; n < this.e.size(); ++n) {
                gs_02 = this.e.get(n);
                ((tv_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("remainingTime=");
        if (this.f == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.f.a(stringBuilder, string + "  ");
        }
    }
}

