/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tl
 */
public class tl_1
extends go_1
implements gs_0 {
    public short c = 0;
    public byte[] d = null;
    private final fo_1 e = new tm_1(this);

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.c);
        if (this.d != null) {
            if (this.d.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.d.length);
            byteBuffer.put(this.d);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.d = new byte[n];
            byteBuffer.get(this.d);
        } else {
            this.d = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.c = 0;
        this.d = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 2;
        n += 2;
        return n += this.d != null ? this.d.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("level=").append(this.c).append('\n');
        stringBuilder.append(string).append("states=(").append(this.d != null ? this.d.length : 0).append(" bytes)\n");
    }
}

