/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vi
 */
final class vi_2 {
    private short b = 0;
    private final vf_2 c = new vf_2();
    final /* synthetic */ vh_1 a;

    vi_2(vh_1 vh_12) {
        this.a = vh_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b.a = this.c.a;
        this.a.b.b = this.c.b;
        this.a.b.c = this.c.c;
        this.a.b.d = this.c.d;
        this.a.b.e = this.c.e;
        this.a.b.f = this.c.f;
        this.a.b.g = this.c.g;
        this.a.b.h = this.c.h;
        this.a.b.i = this.c.i;
        this.a.b.j = this.c.j;
        this.a.b.k = this.c.k;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 1);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 313);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 314);
        return bl;
    }

    private boolean e(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 315);
        return bl;
    }

    private boolean f(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10003);
        return bl;
    }

    private boolean g(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10023);
        return bl;
    }

    private boolean h(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10028000);
        return bl;
    }

    private boolean i(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10029000);
        return bl;
    }

    private boolean j(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10032003);
        return bl;
    }

    private boolean k(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10035004);
        return bl;
    }

    private boolean l(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10035007);
        return bl;
    }

    private boolean m(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10036004);
        return bl;
    }

    private boolean n(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10037001);
        return bl;
    }

    private boolean o(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10040005);
        return bl;
    }

    private boolean p(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10045010);
        return bl;
    }

    private boolean q(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10048000);
        return bl;
    }

    private boolean r(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10055001);
        return bl;
    }

    private boolean s(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10064001);
        return bl;
    }

    private boolean t(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getShort();
        boolean bl = this.c.a(byteBuffer, 10066001);
        return bl;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 313) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 314) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 315) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10003) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.f(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.i(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.j(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.k(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.l(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.m(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.n(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.o(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.p(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.q(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.r(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.s(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.t(byteBuffer);
            return bl;
        }
        return false;
    }
}

