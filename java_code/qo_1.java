/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from qo
 */
public class qo_1
extends go_1
implements gs_0 {
    public String c = null;
    public long d = 0L;
    private final fo_1 e = new qp_1(this);

    @Override
    public fo_1 a() {
        return this.e;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        if (this.c != null) {
            byte[] byArray = this.c.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putLong(this.d);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public void c() {
        this.c = null;
        this.d = 0L;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        ++n;
        n += this.c != null ? this.c.getBytes(Charsets.UTF_8).length : 0;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("gameServer=").append(this.c).append('\n');
        stringBuilder.append(string).append("lastLog=").append(this.d).append('\n');
    }
}

