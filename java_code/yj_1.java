/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yj
 */
final class yj_1 {
    private byte b = 0;
    private final ArrayList<yh_2> c = new ArrayList(0);
    private ys_1 d = null;
    final /* synthetic */ yg_2 a;

    yj_1(yg_2 yg_22) {
        this.a = yg_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b.clear();
        this.a.b.ensureCapacity(this.c.size());
        this.a.b.addAll(this.c);
        this.a.c = this.d;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 1);
        return this.d != null;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 309);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 309);
        return this.d != null;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 313);
        return this.d != null;
    }

    private boolean e(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 314);
        return this.d != null;
    }

    private boolean f(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 315);
        return this.d != null;
    }

    private boolean g(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10003);
        return this.d != null;
    }

    private boolean h(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10023);
        return this.d != null;
    }

    private boolean i(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 1027001);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 1027001);
        return this.d != null;
    }

    private boolean j(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 1027002);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 1027002);
        return this.d != null;
    }

    private boolean k(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10028000);
        return this.d != null;
    }

    private boolean l(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10029000);
        return this.d != null;
    }

    private boolean m(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10032003);
        return this.d != null;
    }

    private boolean n(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10035004);
        return this.d != null;
    }

    private boolean o(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10035007);
        return this.d != null;
    }

    private boolean p(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10036004);
        return this.d != null;
    }

    private boolean q(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10037001);
        return this.d != null;
    }

    private boolean r(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10037002);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10037002);
        return this.d != null;
    }

    private boolean s(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10040005);
        return this.d != null;
    }

    private boolean t(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10045010);
        return this.d != null;
    }

    private boolean u(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10048000);
        return this.d != null;
    }

    private boolean v(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10055001);
        return this.d != null;
    }

    private boolean w(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10064001);
        return this.d != null;
    }

    private boolean x(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10066001);
        return this.d != null;
    }

    private boolean y(ByteBuffer byteBuffer) {
        this.b = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            yh_2 yh_22 = new yh_2();
            boolean bl = yh_22.a(byteBuffer, 10069001);
            if (!bl) {
                return false;
            }
            this.c.add(yh_22);
        }
        this.d = ys_1.b(byteBuffer, 10069001);
        return this.d != null;
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
        if (n < 10023) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 1027001) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        if (n < 1027002) {
            boolean bl = this.i(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.j(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.k(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.l(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.m(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.n(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.o(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.p(byteBuffer);
            return bl;
        }
        if (n < 10037002) {
            boolean bl = this.q(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.r(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.s(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.t(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.u(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.v(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.w(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.x(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.y(byteBuffer);
            return bl;
        }
        return false;
    }
}

