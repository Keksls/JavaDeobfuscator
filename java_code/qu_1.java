/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qU
 */
public class qu_1
extends go_1
implements gs_0 {
    public byte[] c = null;
    public float d = 0.0f;
    private final fo_1 e = new qv_1(this);

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
        byteBuffer.putFloat(this.d);
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
        this.d = byteBuffer.getFloat();
        return true;
    }

    @Override
    public void c() {
        this.c = null;
        this.d = 0.0f;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        n += this.c != null ? this.c.length : 0;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guild=(").append(this.c != null ? this.c.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("moderationBonusLearningFactor=").append(this.d).append('\n');
    }
}

