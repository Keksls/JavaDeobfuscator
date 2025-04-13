/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pJ
 */
public class pj_2
implements gs_0 {
    public byte[] a = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.a != null) {
            if (this.a.length > 255) {
                return false;
            }
            byteBuffer.put((byte)this.a.length);
            byteBuffer.put(this.a);
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        if (n > 0) {
            this.a = new byte[n];
            byteBuffer.get(this.a);
        } else {
            this.a = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        ++n;
        return n += this.a != null ? this.a.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("encodedPath=(").append(this.a != null ? this.a.length : 0).append(" bytes)\n");
    }
}

