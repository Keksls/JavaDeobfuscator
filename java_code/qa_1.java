/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from qA
 */
public class qa_1
extends go_1
implements gs_0 {
    public String c = null;
    private final fo_1 d = new qb_1(this);

    @Override
    public fo_1 a() {
        return this.d;
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
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.c = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void c() {
        this.c = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        ++n;
        return n += this.c != null ? this.c.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildName=").append(this.c).append('\n');
    }
}

