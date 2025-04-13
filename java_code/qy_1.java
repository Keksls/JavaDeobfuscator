/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qy
 */
public class qy_1
extends go_1
implements gs_0 {
    public long c = 0L;
    public long d = 0L;
    public int[] e = null;
    private final fo_1 f = new qz_1(this);

    @Override
    public fo_1 a() {
        return this.f;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.d);
        if (this.e != null) {
            if (this.e.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.e.length);
            for (int k = 0; k < this.e.length; ++k) {
                byteBuffer.putInt(this.e[k]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
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
        this.c = 0L;
        this.d = 0L;
        this.e = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 8;
        n += 2;
        return n += this.e != null ? this.e.length * 4 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.c).append('\n');
        stringBuilder.append(string).append("authorisations=").append(this.d).append('\n');
        stringBuilder.append(string).append("activeBuffs=(").append(this.e.length).append(" bytes)\n");
    }
}

