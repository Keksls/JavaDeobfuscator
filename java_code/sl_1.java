/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sL
 */
public class sl_1
extends go_1
implements gs_0 {
    public final yx_2 c = new yx_2();
    public boolean d = false;
    public boolean e = false;
    private final fo_1 f = new sm_2(this);

    @Override
    public fo_1 a() {
        return this.f;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.c.a(byteBuffer);
        if (!bl) {
            return false;
        }
        byteBuffer.put(this.d ? (byte)1 : 0);
        byteBuffer.put(this.e ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.c.b(byteBuffer);
        if (!bl) {
            return false;
        }
        this.d = byteBuffer.get() == 1;
        this.e = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void c() {
        this.c.c();
        this.d = false;
        this.e = false;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            sn_1 sn_12 = new sn_1(this);
            boolean bl = sn_12.a(byteBuffer, n);
            if (bl) {
                sn_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += this.c.b();
        ++n;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("spellInventory=...\n");
        this.c.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("needSpellRestat=").append(this.d).append('\n');
        stringBuilder.append(string).append("needSpellAutoRestat=").append(this.e).append('\n');
    }
}

