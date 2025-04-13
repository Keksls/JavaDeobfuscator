/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qR
 */
public class qr_2
extends go_1
implements gs_0 {
    public final ArrayList<qt_2> c = new ArrayList(0);
    private final fo_1 d = new qs_2(this);

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
            qt_2 qt_22 = this.c.get(k);
            boolean bl = qt_22.a(byteBuffer);
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
            qt_2 qt_22 = new qt_2();
            boolean bl = qt_22.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(qt_22);
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
            qt_2 qt_22 = this.c.get(k);
            n += qt_22.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("landMarks=");
        if (this.c.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.c.size()).append(" elements)...\n");
            for (int k = 0; k < this.c.size(); ++k) {
                qt_2 qt_22 = this.c.get(k);
                qt_22.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

