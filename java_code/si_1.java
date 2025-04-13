/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from si
 */
public class si_1
extends go_1
implements gs_0 {
    public long c = 0L;
    public long d = 0L;
    public short e = 0;
    public String f = null;
    private final fo_1 g = new sj_2(this);

    @Override
    public fo_1 a() {
        return this.g;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c);
        byteBuffer.putLong(this.d);
        byteBuffer.putShort(this.e);
        if (this.f != null) {
            byte[] byArray = this.f.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        this.e = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.f = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void c() {
        this.c = 0L;
        this.d = 0L;
        this.e = 0;
        this.f = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10058000) {
            sk_1 sk_12 = new sk_1(this);
            boolean bl = sk_12.a(byteBuffer, n);
            if (bl) {
                sk_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 8;
        n += 8;
        n += 2;
        n += 2;
        return n += this.f != null ? this.f.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.c).append('\n');
        stringBuilder.append(string).append("blazon=").append(this.d).append('\n');
        stringBuilder.append(string).append("level=").append(this.e).append('\n');
        stringBuilder.append(string).append("guildName=").append(this.f).append('\n');
    }
}

