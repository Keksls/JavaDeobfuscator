/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from zg
 */
public class zg_1
implements gs_0 {
    public final zj_1 a = new zj_1();

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
            zh_1 zh_12 = new zh_1(this);
            boolean bl = zh_12.a(byteBuffer, n);
            if (bl) {
                zh_12.a();
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
        stringBuilder.append(string).append("compartment=...\n");
        this.a.a(stringBuilder, string + "  ");
    }
}

