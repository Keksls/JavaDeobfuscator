/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vD
 */
public class vd_1
implements gs_0 {
    public final yd_1 a = new yd_1();
    public final wb_1 b = new wb_1();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.a.a(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.b.a(byteBuffer);
        return bl2;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.a.b(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.b.b(byteBuffer);
        return bl2;
    }

    @Override
    public void c() {
        this.a.c();
        this.b.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10077000) {
            ve_2 ve_22 = new ve_2(this);
            boolean bl = ve_22.a(byteBuffer, n);
            if (bl) {
                ve_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += this.a.b();
        return n += this.b.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("questInventory=...\n");
        this.a.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("temporaryInventory=...\n");
        this.b.a(stringBuilder, string + "  ");
    }
}

