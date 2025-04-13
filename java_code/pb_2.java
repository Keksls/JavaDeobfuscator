/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pB
 */
public class pb_2
extends go_1
implements gs_0 {
    public pe_1 c = null;
    private final fo_1 d = new pc_1(this);

    @Override
    public fo_1 a() {
        return this.d;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.c != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.c.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.c = new pe_1();
            boolean bl3 = this.c.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.c = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.c = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10047003) {
            pd_1 pd_12 = new pd_1(this);
            boolean bl = pd_12.a(byteBuffer, n);
            if (bl) {
                pd_12.a();
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
        if (this.c != null) {
            n += this.c.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("creationData=");
        if (this.c == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.c.a(stringBuilder, string + "  ");
        }
    }
}

