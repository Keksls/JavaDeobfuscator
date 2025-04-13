/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yk
 */
public class yk_2
implements gs_0 {
    public static final int a = 0;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10014) {
            yp_1 yp_12 = new yp_1(this);
            boolean bl = yp_12.a(byteBuffer, n);
            if (bl) {
                yp_12.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
    }
}

