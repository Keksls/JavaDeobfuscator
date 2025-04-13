/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from vx
 */
public class vx_2
implements gs_0 {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public final ArrayList<vy_1> e = new ArrayList(0);

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        if (this.e.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.e.size());
        for (int k = 0; k < this.e.size(); ++k) {
            vy_1 vy_12 = this.e.get(k);
            boolean bl = vy_12.a(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.e.clear();
        this.e.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vy_1 vy_12 = new vy_1();
            boolean bl = vy_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.e.add(vy_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        n += 4;
        n += 4;
        n += 4;
        n += 2;
        for (int k = 0; k < this.e.size(); ++k) {
            vy_1 vy_12 = this.e.get(k);
            n += vy_12.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("originX=").append(this.a).append('\n');
        stringBuilder.append(string).append("originY=").append(this.b).append('\n');
        stringBuilder.append(string).append("width=").append(this.c).append('\n');
        stringBuilder.append(string).append("height=").append(this.d).append('\n');
        stringBuilder.append(string).append("partitions=");
        if (this.e.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.e.size()).append(" elements)...\n");
            for (int k = 0; k < this.e.size(); ++k) {
                vy_1 vy_12 = this.e.get(k);
                vy_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

