/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xE
 */
public class xe_1
implements gs_0 {
    public final xw_1 a = new xw_1();
    public final xw_1 b = new xw_1();
    public final xw_1 c = new xw_1();
    public final xw_1 d = new xw_1();

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
        if (n < 1) {
            xf_2 xf_22 = new xf_2(this);
            boolean bl = xf_22.a(byteBuffer, n);
            if (bl) {
                xf_22.a();
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
        stringBuilder.append(string).append("challengeReferenceInventory=...\n");
        this.a.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("climateReferenceInventory=...\n");
        this.b.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("buffsReferenceInventory=...\n");
        this.c.a(stringBuilder, string + "  ");
        stringBuilder.append(string).append("itemsReferenceInventory=...\n");
        this.d.a(stringBuilder, string + "  ");
    }
}

