/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vu
 */
public class vu_2
implements gs_0 {
    public final vq_2 a = new vq_2();

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
        stringBuilder.append(string).append("building=...\n");
        this.a.a(stringBuilder, string + "  ");
    }
}

