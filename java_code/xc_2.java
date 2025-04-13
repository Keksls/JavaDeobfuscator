/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xc
 */
public class xc_2
extends oq_0
implements gs_0 {
    public final tl_2 a = new tl_2();
    public static final byte b = 3;

    @Override
    public byte a() {
        return 3;
    }

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

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=...\n");
        this.a.a(stringBuilder, string + "  ");
    }
}

