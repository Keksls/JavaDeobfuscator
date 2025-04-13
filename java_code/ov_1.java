/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oV
 */
public class ov_1
extends go_1
implements gs_0 {
    public byte[] c = null;
    public boolean d = false;
    private final fo_1 e = new ow_1(this);

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.c != null) {
            if (this.c.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.c.length);
            byteBuffer.put(this.c);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.d ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.c = new byte[n];
            byteBuffer.get(this.c);
        } else {
            this.c = null;
        }
        this.d = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.c = null;
        this.d = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10064001) {
            ox_1 ox_12 = new ox_1(this);
            boolean bl = ox_12.a(byteBuffer, n);
            if (bl) {
                ox_12.a();
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
        n += this.c != null ? this.c.length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("serializedAchievementsContext=(").append(this.c != null ? this.c.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("isCompressed=").append(this.d).append('\n');
    }
}

