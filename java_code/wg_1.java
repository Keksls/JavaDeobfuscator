/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wG
 */
final class wg_1 {
    private final vf_2 b = new vf_2();
    private short c = 1;
    private int d = 0;
    final /* synthetic */ wf_2 a;

    wg_1(wf_2 wf_22) {
        this.a = wf_22;
    }

    public void a() {
        this.a.a.a = this.b.a;
        this.a.a.b = this.b.b;
        this.a.a.c = this.b.c;
        this.a.a.d = this.b.d;
        this.a.a.e = this.b.e;
        this.a.a.f = this.b.f;
        this.a.a.g = this.b.g;
        this.a.a.h = this.b.h;
        this.a.a.i = this.b.i;
        this.a.a.j = this.b.j;
        this.a.a.k = this.b.k;
        this.a.b = this.c;
        this.a.c = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 313);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 314);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 315);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10003);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10023);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10028000);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean i(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10029000);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean j(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10032003);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean k(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10035004);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean l(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10035007);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean m(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10036004);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean n(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10037001);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean o(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10040005);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean p(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10045010);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean q(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10048000);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean r(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10055001);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean s(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10064001);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
    }

    private boolean t(ByteBuffer byteBuffer) {
        boolean bl = this.b.a(byteBuffer, 10066001);
        if (!bl) {
            return false;
        }
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        return true;
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

