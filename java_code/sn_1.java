/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sN
 */
final class sn_1 {
    private short b = 0;
    private long c = 0L;
    private int d = 0;
    private final yx_2 e = new yx_2();
    private boolean f = false;
    private boolean g = false;
    final /* synthetic */ sl_1 a;

    sn_1(sl_1 sl_12) {
        this.a = sl_12;
    }

    public void a() {
        this.a.c.a.clear();
        this.a.c.a.ensureCapacity(this.e.a.size());
        this.a.c.a.addAll(this.e.a);
        this.a.d = this.f;
        this.a.e = this.g;
    }

    private boolean a(ByteBuffer byteBuffer) {
        boolean bl = this.e.a(byteBuffer, 1);
        return bl;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.e.a(byteBuffer, 10006);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        boolean bl = this.e.a(byteBuffer, 10008);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        boolean bl = this.e.a(byteBuffer, 0x990F99);
        if (!bl) {
            return false;
        }
        this.f = byteBuffer.get() == 1;
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        boolean bl = this.e.a(byteBuffer, 10043008);
        if (!bl) {
            return false;
        }
        this.f = byteBuffer.get() == 1;
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        boolean bl = this.e.a(byteBuffer, 10047001);
        if (!bl) {
            return false;
        }
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get() == 1;
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        this.d = byteBuffer.getInt();
        boolean bl = this.e.a(byteBuffer, 10048002);
        if (!bl) {
            return false;
        }
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get() == 1;
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        boolean bl = this.e.a(byteBuffer, 10048003);
        if (!bl) {
            return false;
        }
        this.f = byteBuffer.get() == 1;
        this.g = byteBuffer.get() == 1;
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10006) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10008) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 0x990F99) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10043008) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10047001) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        if (n < 10048002) {
            boolean bl = this.f(byteBuffer);
            return bl;
        }
        if (n < 10048003) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        return false;
    }
}

