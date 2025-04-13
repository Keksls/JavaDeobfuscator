/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xd
 */
public class xd_1
extends oq_0
implements gs_0 {
    public final wh_2 a = new wh_2();
    public static final byte b = 1;

    @Override
    public byte a() {
        return 1;
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
        if (n < 10069001) {
            xe_2 xe_22 = new xe_2(this);
            boolean bl = xe_22.a(byteBuffer, n);
            if (bl) {
                xe_22.a();
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

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=...\n");
        this.a.a(stringBuilder, string + "  ");
    }
}

