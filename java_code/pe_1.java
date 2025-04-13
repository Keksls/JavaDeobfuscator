/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pE
 */
public class pe_1
implements gs_0 {
    public boolean a = false;
    public boolean b = false;
    public short c = 0;
    public boolean d = false;
    public static final int e = 5;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a ? (byte)1 : 0);
        byteBuffer.put(this.b ? (byte)1 : 0);
        byteBuffer.putShort(this.c);
        byteBuffer.put(this.d ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get() == 1;
        this.b = byteBuffer.get() == 1;
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.a = false;
        this.b = false;
        this.c = 0;
        this.d = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10047003) {
            pf_2 pf_22 = new pf_2(this);
            boolean bl = pf_22.a(byteBuffer, n);
            if (bl) {
                pf_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("newCharacter=").append(this.a).append('\n');
        stringBuilder.append(string).append("needsRecustom=").append(this.b).append('\n');
        stringBuilder.append(string).append("recustomValue=").append(this.c).append('\n');
        stringBuilder.append(string).append("needInitialXp=").append(this.d).append('\n');
    }
}

