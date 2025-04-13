/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tn
 */
public class tn_1
extends go_1
implements gs_0 {
    public final ArrayList<tp_2> c = new ArrayList(0);
    private final fo_1 d = new to_1(this);

    @Override
    public fo_1 a() {
        return this.d;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.c.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.c.size());
        for (int k = 0; k < this.c.size(); ++k) {
            tp_2 tp_22 = this.c.get(k);
            boolean bl = tp_22.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            tp_2 tp_22 = new tp_2();
            boolean bl = tp_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(tp_22);
        }
        return true;
    }

    @Override
    public void c() {
        this.c.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        for (int k = 0; k < this.c.size(); ++k) {
            tp_2 tp_22 = this.c.get(k);
            n += tp_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("unavailableActions=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (int k = 0; k < this.c.size(); ++k) {
                tp_2 tp_22 = this.c.get(k);
                tp_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

