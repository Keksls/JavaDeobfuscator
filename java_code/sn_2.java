/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sn
 */
public class sn_2
extends go_1
implements gs_0 {
    public sq_1 c = null;
    public sr_1 d = null;
    private final fo_1 e = new so_1(this);

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        if (this.c != null) {
            byteBuffer.put((byte)1);
            bl = this.c.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.d != null) {
            byteBuffer.put((byte)1);
            bl = this.d.a(byteBuffer);
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
        boolean bl2;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.c = new sq_1();
            bl = this.c.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.c = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.d = new sr_1();
            boolean bl5 = this.d.b(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.d = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.c = null;
        this.d = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10034001) {
            sp_2 sp_22 = new sp_2(this);
            boolean bl = sp_22.a(byteBuffer, n);
            if (bl) {
                sp_22.a();
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
        ++n;
        if (this.d != null) {
            n += this.d.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("inFightData=");
        if (this.c == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.c.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("outFightData=");
        if (this.d == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.d.a(stringBuilder, string + "  ");
        }
    }
}

