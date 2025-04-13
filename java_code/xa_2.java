/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xA
 */
public class xa_2
implements gs_0 {
    public final xs_1 a = new xs_1();
    public final xs_1 b = new xs_1();
    public final xs_1 c = new xs_1();
    public final xs_1 d = new xs_1();

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.a.a(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.b.a(byteBuffer);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.c.a(byteBuffer);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.d.a(byteBuffer);
        return bl4;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.a.b(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.b.b(byteBuffer);
        if (!bl2) {
            return false;
        }
        boolean bl3 = this.c.b(byteBuffer);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.d.b(byteBuffer);
        return bl4;
    }

    @Override
    public void c() {
        this.a.c();
        this.b.c();
        this.c.c();
        this.d.c();
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            xb_2 xb_22 = new xb_2(this);
            boolean bl = xb_22.a(byteBuffer, n);
            if (bl) {
                xb_22.a();
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
        n += this.b.b();
        n += this.c.b();
        return n += this.d.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challengeMerchantInventory=...\n");
        this.a.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("climateMerchantInventory=...\n");
        this.b.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("buffsMerchantInventory=...\n");
        this.c.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("itemsMerchantInventory=...\n");
        this.d.a(stringBuilder, string + "  ");
    }
}

