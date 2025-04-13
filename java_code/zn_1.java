/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from zn
 */
public class zn_1
implements gs_0 {
    public final ArrayList<zo_1> a = new ArrayList(0);
    public byte b = 0;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            zo_1 zo_12 = this.a.get(k);
            boolean bl = zo_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.put(this.b);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.a.clear();
        this.a.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            zo_1 zo_12 = new zo_1();
            boolean bl = zo_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.a.add(zo_12);
        }
        this.b = byteBuffer.get();
        return true;
    }

    @Override
    public void c() {
        this.a.clear();
        this.b = 0;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10013) {
            zq_1 zq_12 = new zq_1(this);
            boolean bl = zq_12.a(byteBuffer, n);
            if (bl) {
                zq_12.a();
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
            zo_1 zo_12 = this.a.get(k);
            n += zo_12.b();
        }
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("capturedCreatures=");
        if (this.a.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.a.size()).append(" elements)...\n");
            for (int k = 0; k < this.a.size(); ++k) {
                zo_1 zo_12 = this.a.get(k);
                zo_12.a(stringBuilder, string + k + "/ ");
            }
        }
        stringBuilder.append(string).append("currentCreatureIndex=").append(this.b).append('\n');
    }
}

