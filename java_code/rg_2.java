/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rG
 */
public class rg_2
extends go_1
implements gs_0 {
    public int[] c = null;
    public int[] d = null;
    public int[] e = null;
    private final fo_1 f = new rh_1(this);

    @Override
    public fo_1 a() {
        return this.f;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        int n;
        if (this.c != null) {
            if (this.c.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.c.length);
            for (n = 0; n < this.c.length; ++n) {
                byteBuffer.putInt(this.c[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.d != null) {
            if (this.d.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.d.length);
            for (n = 0; n < this.d.length; ++n) {
                byteBuffer.putInt(this.d[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.e != null) {
            if (this.e.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.e.length);
            for (n = 0; n < this.e.length; ++n) {
                byteBuffer.putInt(this.e[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.c = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.c[n2] = byteBuffer.getInt();
            }
        } else {
            this.c = null;
        }
        if ((n2 = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.d = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.d[n] = byteBuffer.getInt();
            }
        } else {
            this.d = null;
        }
        if ((n = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.e = new int[n];
            for (int k = 0; k < n; ++k) {
                this.e[k] = byteBuffer.getInt();
            }
        } else {
            this.e = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10026000) {
            ri_2 ri_22 = new ri_2(this);
            boolean bl = ri_22.a(byteBuffer, n);
            if (bl) {
                ri_22.a();
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
        n += this.c != null ? this.c.length * 4 : 0;
        n += 2;
        n += this.d != null ? this.d.length * 4 : 0;
        n += 2;
        return n += this.e != null ? this.e.length * 4 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildEffects=(").append(this.c.length).append(" bytes)\n");
        stringBuilder.append(string).append("havenWorldEffects=(").append(this.d.length).append(" bytes)\n");
        stringBuilder.append(string).append("antiAddictionEffects=(").append(this.e.length).append(" bytes)\n");
    }
}

