/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xV
 */
final class xv_1 {
    private long b = 0L;
    private final ArrayList<xt_2> c = new ArrayList(0);
    final /* synthetic */ xs_1 a;

    xv_1(xs_1 xs_12) {
        this.a = xs_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b.clear();
        this.a.b.ensureCapacity(this.c.size());
        this.a.b.addAll(this.c);
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean i(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean j(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean k(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean l(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean m(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean n(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean o(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean p(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean q(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean r(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean s(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
        return true;
    }

    private boolean t(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.c.clear();
        this.c.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            xt_2 xt_22 = new xt_2();
            boolean bl = xt_22.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.c.add(xt_22);
        }
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

