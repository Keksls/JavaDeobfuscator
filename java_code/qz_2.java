/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qZ
 */
public class qz_2
extends go_1
implements gs_0 {
    public final ArrayList<rc_1> c = new ArrayList(0);
    private final fo_1 d = new ra_2(this);

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
            rc_1 rc_12 = this.c.get(k);
            boolean bl = rc_12.a(byteBuffer);
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
            rc_1 rc_12 = new rc_1();
            boolean bl = rc_12.b(byteBuffer);
            if (!bl) {
                return false;
            }
            this.c.add(rc_12);
        }
        return true;
    }

    @Override
    public void c() {
        this.c.clear();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            rb_1 rb_12 = new rb_1(this);
            boolean bl = rb_12.a(byteBuffer, n);
            if (bl) {
                rb_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        for (int k = 0; k < this.c.size(); ++k) {
            rc_1 rc_12 = this.c.get(k);
            n += rc_12.b();
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
                rc_1 rc_12 = this.c.get(k);
                rc_12.a(stringBuilder, string + k + "/ ");
            }
        }
    }
}

