/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wo
 */
public class wo_2
implements gs_0 {
    public wr_2 a = null;
    public ww_2 b = null;
    public wu_1 c = null;
    public wp_1 d = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        if (this.a != null) {
            byteBuffer.put((byte)1);
            bl = this.a.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.b != null) {
            byteBuffer.put((byte)1);
            bl = this.b.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
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
        boolean bl3;
        boolean bl4;
        boolean bl5 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.a = new wr_2();
            bl3 = this.a.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.a = null;
        }
        boolean bl6 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.b = new ww_2();
            bl2 = this.b.b(byteBuffer);
            if (!bl2) {
                return false;
            }
        } else {
            this.b = null;
        }
        boolean bl7 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.c = new wu_1();
            bl = this.c.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.c = null;
        }
        boolean bl8 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.d = new wp_1();
            boolean bl9 = this.d.b(byteBuffer);
            if (!bl9) {
                return false;
            }
        } else {
            this.d = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wt_1 wt_12 = new wt_1(this);
            boolean bl = wt_12.a(byteBuffer, n);
            if (bl) {
                wt_12.a();
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
        if (this.a != null) {
            n += this.a.b();
        }
        ++n;
        if (this.b != null) {
            n += this.b.b();
        }
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
        stringBuilder.append(string).append("pet=");
        if (this.a == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.a.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("xp=");
        if (this.b == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.b.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("shard=");
        if (this.c == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.c.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("companion=");
        if (this.d == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.d.a(stringBuilder, string + "  ");
        }
    }
}

