/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pM
 */
final class pm_1 {
    private final un_2 b = new un_2();
    final /* synthetic */ pk_2 a;

    pm_1(pk_2 pk_22) {
        this.a = pk_22;
    }

    public void a() {
        this.a.c.a = this.b.a;
        this.a.c.b = this.b.b;
        this.a.c.c = this.b.c;
        this.a.c.d = this.b.d;
        this.a.c.e = this.b.e;
        this.a.c.f = this.b.f;
        this.a.c.g.clear();
        this.a.c.g.ensureCapacity(this.b.g.size());
        this.a.c.g.addAll(this.b.g);
        this.a.c.h = this.b.h;
        this.a.c.i = this.b.i;
        this.a.c.j.a = this.b.j.a;
        this.a.c.j.b.clear();
        this.a.c.j.b.ensureCapacity(this.b.j.b.size());
        this.a.c.j.b.addAll(this.b.j.b);
        this.a.c.j.c.clear();
        this.a.c.j.c.ensureCapacity(this.b.j.c.size());
        this.a.c.j.c.addAll(this.b.j.c);
        this.a.c.k = this.b.k;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        return bl;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 309);
        return bl;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 313);
        return bl;
    }

    private boolean e(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 314);
        return bl;
    }

    private boolean f(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 315);
        return bl;
    }

    private boolean g(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10003);
        return bl;
    }

    private boolean h(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10005);
        return bl;
    }

    private boolean i(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10014);
        return bl;
    }

    private boolean j(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10023);
        return bl;
    }

    private boolean k(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1027001);
        return bl;
    }

    private boolean l(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1027002);
        return bl;
    }

    private boolean m(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10028000);
        return bl;
    }

    private boolean n(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10029000);
        return bl;
    }

    private boolean o(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10032003);
        return bl;
    }

    private boolean p(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10035004);
        return bl;
    }

    private boolean q(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10035007);
        return bl;
    }

    private boolean r(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10036004);
        return bl;
    }

    private boolean s(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10037001);
        return bl;
    }

    private boolean t(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10037002);
        return bl;
    }

    private boolean u(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10040005);
        return bl;
    }

    private boolean v(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10045010);
        return bl;
    }

    private boolean w(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10048000);
        return bl;
    }

    private boolean x(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10051000);
        return bl;
    }

    private boolean y(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10055001);
        return bl;
    }

    private boolean z(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10060001);
        return bl;
    }

    private boolean A(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10064001);
        return bl;
    }

    private boolean B(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10066001);
        return bl;
    }

    private boolean C(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 0x999C39);
        return bl;
    }

    private boolean D(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10069001);
        return bl;
    }

    private boolean E(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10085001);
        return bl;
    }

    private boolean F(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10086001);
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
        if (n < 309) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 313) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 314) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 315) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        if (n < 10003) {
            boolean bl = this.f(byteBuffer);
            return bl;
        }
        if (n < 10005) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10014) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.i(byteBuffer);
            return bl;
        }
        if (n < 1027001) {
            boolean bl = this.j(byteBuffer);
            return bl;
        }
        if (n < 1027002) {
            boolean bl = this.k(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.l(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.m(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.n(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.o(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.p(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.q(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.r(byteBuffer);
            return bl;
        }
        if (n < 10037002) {
            boolean bl = this.s(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.t(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.u(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.v(byteBuffer);
            return bl;
        }
        if (n < 10051000) {
            boolean bl = this.w(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.x(byteBuffer);
            return bl;
        }
        if (n < 10060001) {
            boolean bl = this.y(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.z(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.A(byteBuffer);
            return bl;
        }
        if (n < 0x999C39) {
            boolean bl = this.B(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.C(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.D(byteBuffer);
            return bl;
        }
        if (n < 10086001) {
            boolean bl = this.E(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.F(byteBuffer);
            return bl;
        }
        return false;
    }
}

