/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wL
 */
public class wl_1
implements gs_0 {
    public int a = 0;
    public byte[] b = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.a);
        if (this.b != null) {
            if (this.b.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.b.length);
            byteBuffer.put(this.b);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.b = new byte[n];
            byteBuffer.get(this.b);
        } else {
            this.b = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        n += 2;
        return n += this.b != null ? this.b.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("version=").append(this.a).append('\n');
        stringBuilder.append(string).append("items=(").append(this.b != null ? this.b.length : 0).append(" bytes)\n");
    }
}

