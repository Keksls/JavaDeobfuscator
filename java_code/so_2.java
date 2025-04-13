/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sO
 */
public class so_2
extends go_1
implements gs_0 {
    public int c = 0;
    public int d = 0;
    public short e = 0;
    public short f = 0;
    public final ArrayList<sq_2> g = new ArrayList(0);
    public final ArrayList<su_2> h = new ArrayList(0);
    public final ArrayList<sr_2> i = new ArrayList(0);
    public final ArrayList<sw_1> j = new ArrayList(0);
    public final ArrayList<ss_2> k = new ArrayList(0);
    public final ArrayList<st_2> l = new ArrayList(0);
    public final ArrayList<sv_2> m = new ArrayList(0);
    private final fo_1 n = new sp_1(this);

    @Override
    public fo_1 a() {
        return this.n;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putShort(this.e);
        byteBuffer.putShort(this.f);
        if (this.g.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.g.size());
        for (n = 0; n < this.g.size(); ++n) {
            gs_02 = this.g.get(n);
            bl = ((sq_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.h.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.h.size());
        for (n = 0; n < this.h.size(); ++n) {
            gs_02 = this.h.get(n);
            bl = ((su_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.i.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.i.size());
        for (n = 0; n < this.i.size(); ++n) {
            gs_02 = this.i.get(n);
            bl = ((sr_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.j.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.j.size());
        for (n = 0; n < this.j.size(); ++n) {
            gs_02 = this.j.get(n);
            bl = ((sw_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.k.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.k.size());
        for (n = 0; n < this.k.size(); ++n) {
            gs_02 = this.k.get(n);
            bl = ((ss_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.l.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.l.size());
        for (n = 0; n < this.l.size(); ++n) {
            gs_02 = this.l.get(n);
            bl = ((st_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.m.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.m.size());
        for (n = 0; n < this.m.size(); ++n) {
            gs_02 = this.m.get(n);
            bl = ((sv_2)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getShort();
        int n7 = byteBuffer.getShort() & 0xFFFF;
        this.g.clear();
        this.g.ensureCapacity(n7);
        for (n6 = 0; n6 < n7; ++n6) {
            sq_2 sq_22 = new sq_2();
            boolean bl = sq_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.g.add(sq_22);
        }
        n6 = byteBuffer.getShort() & 0xFFFF;
        this.h.clear();
        this.h.ensureCapacity(n6);
        for (n5 = 0; n5 < n6; ++n5) {
            su_2 su_22 = new su_2();
            boolean bl = su_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.h.add(su_22);
        }
        n5 = byteBuffer.getShort() & 0xFFFF;
        this.i.clear();
        this.i.ensureCapacity(n5);
        for (n4 = 0; n4 < n5; ++n4) {
            sr_2 sr_22 = new sr_2();
            boolean bl = sr_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.i.add(sr_22);
        }
        n4 = byteBuffer.getShort() & 0xFFFF;
        this.j.clear();
        this.j.ensureCapacity(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            sw_1 sw_12 = new sw_1();
            boolean bl = sw_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.j.add(sw_12);
        }
        n3 = byteBuffer.getShort() & 0xFFFF;
        this.k.clear();
        this.k.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            ss_2 ss_22 = new ss_2();
            boolean bl = ss_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.k.add(ss_22);
        }
        n2 = byteBuffer.getShort() & 0xFFFF;
        this.l.clear();
        this.l.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            st_2 st_22 = new st_2();
            boolean bl = st_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.l.add(st_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.m.clear();
        this.m.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            sv_2 sv_22 = new sv_2();
            boolean bl = sv_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.m.add(sv_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 4;
        n2 += 4;
        n2 += 2;
        n2 += 2;
        n2 += 2;
        for (n = 0; n < this.g.size(); ++n) {
            gs_02 = this.g.get(n);
            n2 += ((sq_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.h.size(); ++n) {
            gs_02 = this.h.get(n);
            n2 += ((su_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.i.size(); ++n) {
            gs_02 = this.i.get(n);
            n2 += ((sr_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.j.size(); ++n) {
            gs_02 = this.j.get(n);
            n2 += ((sw_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.k.size(); ++n) {
            gs_02 = this.k.get(n);
            n2 += ((ss_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.l.size(); ++n) {
            gs_02 = this.l.get(n);
            n2 += ((st_2)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.m.size(); ++n) {
            gs_02 = this.m.get(n);
            n2 += ((sv_2)gs_02).b();
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
        stringBuilder.append(string).append("earnedKamas=").append(this.c).append('\n');
        stringBuilder.append(string).append("lostKamas=").append(this.d).append('\n');
        stringBuilder.append(string).append("fightCounter=").append(this.e).append('\n');
        stringBuilder.append(string).append("deathCounter=").append(this.f).append('\n');
        stringBuilder.append(string).append("achievementDates=");
        if (this.g.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.g.size()).append(" elements)...\n");
            for (n = 0; n < this.g.size(); ++n) {
                gs_02 = this.g.get(n);
                ((sq_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("killCounters=");
        if (this.h.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.h.size()).append(" elements)...\n");
            for (n = 0; n < this.h.size(); ++n) {
                gs_02 = this.h.get(n);
                ((su_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("collectCounters=");
        if (this.i.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.i.size()).append(" elements)...\n");
            for (n = 0; n < this.i.size(); ++n) {
                gs_02 = this.i.get(n);
                ((sr_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("plantCounters=");
        if (this.j.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.j.size()).append(" elements)...\n");
            for (n = 0; n < this.j.size(); ++n) {
                gs_02 = this.j.get(n);
                ((sw_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("craftCounters=");
        if (this.k.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.k.size()).append(" elements)...\n");
            for (n = 0; n < this.k.size(); ++n) {
                gs_02 = this.k.get(n);
                ((ss_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("dropCounters=");
        if (this.l.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.l.size()).append(" elements)...\n");
            for (n = 0; n < this.l.size(); ++n) {
                gs_02 = this.l.get(n);
                ((st_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("marketBuyCount=");
        if (this.m.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.m.size()).append(" elements)...\n");
            for (n = 0; n < this.m.size(); ++n) {
                gs_02 = this.m.get(n);
                ((sv_2)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
    }
}

