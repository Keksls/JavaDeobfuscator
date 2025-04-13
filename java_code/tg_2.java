/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tg
 */
final class tg_2 {
    private long b = 0L;
    private final ti_2 c = new ti_2();
    private int d = 0;
    final /* synthetic */ te_1 a;

    tg_2(te_1 te_12) {
        this.a = te_12;
    }

    public void a() {
        this.a.c = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        boolean bl = this.c.a(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.c.a(byteBuffer, 10030001);
        if (!bl) {
            return false;
        }
        this.d = byteBuffer.getInt();
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10030001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        return false;
    }
}

