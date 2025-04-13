/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sG
 */
public class sg_2
extends go_1
implements gs_0 {
    public byte[] c = null;
    private final fo_1 d = new sh_1(this);

    @Override
    public fo_1 a() {
        return this.d;
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
        return true;
    }

    @Override
    public void c() {
        this.c = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056000) {
            si_2 si_22 = new si_2(this);
            boolean bl = si_22.a(byteBuffer, n);
            if (bl) {
                si_22.a();
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
        return n += this.c != null ? this.c.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("data=(").append(this.c != null ? this.c.length : 0).append(" bytes)\n");
    }
}

