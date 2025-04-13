/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yY
 */
public class yy_1
implements gs_0 {
    public final yt_2 a = new yt_2();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.a.a(byteBuffer);
        return bl;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.a.b(byteBuffer);
        return bl;
    }

    @Override
    public void c() {
        this.a.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            yz_2 yz_22 = new yz_2(this);
            boolean bl = yz_22.a(byteBuffer, n);
            if (bl) {
                yz_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        return n += this.a.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("spellLevel=...\n");
        this.a.a(stringBuilder, string + "  ");
    }
}

