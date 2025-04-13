/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ve
 */
final class ve_1 {
    private final ArrayList<vc_2> b = new ArrayList(0);
    private int c = 0;
    private final vk_2 d = new vk_2();
    final /* synthetic */ vb_2 a;

    ve_1(vb_2 vb_22) {
        this.a = vb_22;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
        this.a.b = this.c;
        this.a.c.a.clear();
        this.a.c.a.ensureCapacity(this.d.a.size());
        this.a.c.a.addAll(this.d.a);
        this.a.c.b.clear();
        this.a.c.b.ensureCapacity(this.d.b.size());
        this.a.c.b.addAll(this.d.b);
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        n = this.d.a(byteBuffer, 0) ? 1 : 0;
        return n != 0;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        n = this.d.a(byteBuffer, 1) ? 1 : 0;
        return n != 0;
    }

    private boolean c(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        n = this.d.a(byteBuffer, 313) ? 1 : 0;
        return n != 0;
    }

    private boolean d(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        n = this.d.a(byteBuffer, 314) ? 1 : 0;
        return n != 0;
    }

    private boolean e(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        n = this.d.a(byteBuffer, 315) ? 1 : 0;
        return n != 0;
    }

    private boolean f(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        n = this.d.a(byteBuffer, 10003) ? 1 : 0;
        return n != 0;
    }

    private boolean g(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10011);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10011) ? 1 : 0;
        return n != 0;
    }

    private boolean h(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10012);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10012) ? 1 : 0;
        return n != 0;
    }

    private boolean i(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10023) ? 1 : 0;
        return n != 0;
    }

    private boolean j(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10024001);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10024001) ? 1 : 0;
        return n != 0;
    }

    private boolean k(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10025000);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10025000) ? 1 : 0;
        return n != 0;
    }

    private boolean l(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10025001);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10025001) ? 1 : 0;
        return n != 0;
    }

    private boolean m(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10028000) ? 1 : 0;
        return n != 0;
    }

    private boolean n(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10029000) ? 1 : 0;
        return n != 0;
    }

    private boolean o(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10030002);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10030002) ? 1 : 0;
        return n != 0;
    }

    private boolean p(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10032003) ? 1 : 0;
        return n != 0;
    }

    private boolean q(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10035004) ? 1 : 0;
        return n != 0;
    }

    private boolean r(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10035007) ? 1 : 0;
        return n != 0;
    }

    private boolean s(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10036004) ? 1 : 0;
        return n != 0;
    }

    private boolean t(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10036008);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10036008) ? 1 : 0;
        return n != 0;
    }

    private boolean u(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10037001) ? 1 : 0;
        return n != 0;
    }

    private boolean v(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10040005) ? 1 : 0;
        return n != 0;
    }

    private boolean w(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10045010) ? 1 : 0;
        return n != 0;
    }

    private boolean x(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10048000) ? 1 : 0;
        return n != 0;
    }

    private boolean y(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10055001) ? 1 : 0;
        return n != 0;
    }

    private boolean z(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10064001) ? 1 : 0;
        return n != 0;
    }

    private boolean A(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vc_2 vc_22 = new vc_2();
            boolean bl = vc_22.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.b.add(vc_22);
        }
        this.c = byteBuffer.getInt();
        n = this.d.a(byteBuffer, 10066001) ? 1 : 0;
        return n != 0;
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
        if (n < 10011) {
            boolean bl = this.f(byteBuffer);
            return bl;
        }
        if (n < 10012) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        if (n < 10024001) {
            boolean bl = this.i(byteBuffer);
            return bl;
        }
        if (n < 10025000) {
            boolean bl = this.j(byteBuffer);
            return bl;
        }
        if (n < 10025001) {
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
        if (n < 10030002) {
            boolean bl = this.n(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.o(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.p(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.q(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.r(byteBuffer);
            return bl;
        }
        if (n < 10036008) {
            boolean bl = this.s(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.t(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.u(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.v(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.w(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.x(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.y(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.z(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.A(byteBuffer);
            return bl;
        }
        return false;
    }
}

