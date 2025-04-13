/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rR
 */
public class rr_2
extends go_1
implements gs_0 {
    public int c = 0;
    public int d = 0;
    public short e = 0;
    public long f = 0L;
    public byte g = 0;
    public ru_1 h = null;
    private final fo_1 i = new rs_2(this);

    @Override
    public fo_1 a() {
        return this.i;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
        byteBuffer.putShort(this.e);
        byteBuffer.putLong(this.f);
        byteBuffer.put(this.g);
        if (this.h != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.h.a(byteBuffer);
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
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.get();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.h = new ru_1();
            boolean bl3 = this.h.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.h = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0L;
        this.g = 0;
        this.h = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            rt_1 rt_12 = new rt_1(this);
            boolean bl = rt_12.a(byteBuffer, n);
            if (bl) {
                rt_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        n += 4;
        n += 2;
        n += 8;
        ++n;
        ++n;
        if (this.h != null) {
            n += this.h.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("x=").append(this.c).append('\n');
        stringBuilder.append(string).append("y=").append(this.d).append('\n');
        stringBuilder.append(string).append("z=").append(this.e).append('\n');
        stringBuilder.append(string).append("instanceId=").append(this.f).append('\n');
        stringBuilder.append(string).append("direction=").append(this.g).append('\n');
        stringBuilder.append(string).append("dimBagPosition=");
        if (this.h == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.h.a(stringBuilder, string + "  ");
        }
    }
}

