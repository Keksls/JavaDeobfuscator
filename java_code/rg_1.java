/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from rg
 */
public class rg_1
extends go_1
implements gs_0 {
    public final ArrayList<rj_1> c = new ArrayList(0);
    public final ArrayList<rk_1> d = new ArrayList(0);
    private final fo_1 e = new rh_2(this);

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            bl = ((rj_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.d.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.d.size());
        for (n = 0; n < this.d.size(); ++n) {
            gs_02 = this.d.get(n);
            bl = ((rk_1)gs_02).a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            rj_1 rj_12 = new rj_1();
            boolean bl = rj_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(rj_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            rk_1 rk_12 = new rk_1();
            boolean bl = rk_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.d.add(rk_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.c.clear();
        this.d.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10053002) {
            ri_1 ri_12 = new ri_1(this);
            boolean bl = ri_12.a(byteBuffer, n);
            if (bl) {
                ri_12.a();
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
        for (n = 0; n < this.c.size(); ++n) {
            gs_02 = this.c.get(n);
            n2 += ((rj_1)gs_02).b();
        }
        n2 += 2;
        for (n = 0; n < this.d.size(); ++n) {
            gs_02 = this.d.get(n);
            n2 += ((rk_1)gs_02).b();
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
        stringBuilder.append(string).append("nationCitizenScores=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (n = 0; n < this.c.size(); ++n) {
                gs_02 = this.c.get(n);
                ((rj_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("offendedNations=");
        if (this.d.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.d.size()).append(" elements)...\n");
            for (n = 0; n < this.d.size(); ++n) {
                gs_02 = this.d.get(n);
                ((rk_1)gs_02).a(stringBuilder, string + n + "/ ");
            }
        }
    }
}

