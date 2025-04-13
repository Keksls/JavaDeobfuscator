/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qb
 */
public class qb_2
extends go_1
implements gs_0 {
    public final ArrayList<qe_2> c = new ArrayList(0);
    private final fo_1 d = new qc_1(this);

    @Override
    public fo_1 a() {
        return this.d;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.c.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.c.size());
        for (int k = 0; k < this.c.size(); ++k) {
            qe_2 qe_22 = this.c.get(k);
            boolean bl = qe_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            qe_2 qe_22 = new qe_2();
            boolean bl = qe_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(qe_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.c.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10040007) {
            qd_2 qd_22 = new qd_2(this);
            boolean bl = qd_22.a(byteBuffer, n);
            if (bl) {
                qd_22.a();
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
        for (int k = 0; k < this.c.size(); ++k) {
            qe_2 qe_22 = this.c.get(k);
            n += qe_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (int k = 0; k < this.c.size(); ++k) {
                qe_2 qe_22 = this.c.get(k);
                qe_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

