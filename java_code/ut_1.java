/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ut
 */
final class ut_1 {
    private final ArrayList<uu_2> b = new ArrayList(0);
    private int c = 0;
    private int d = 0;
    private final zs_1 e = new zs_1();
    private final ud_2 f = new ud_2();
    private final ul_1 g = new ul_1();
    private final uk_2 h = new uk_2();
    @Deprecated
    private final uj_1 i = new uj_1();
    private short j = 0;
    private long k = 0L;
    private boolean l = false;
    final /* synthetic */ us_2 a;

    ut_1(us_2 us_22) {
        this.a = us_22;
    }

    public void a() {
        this.a.a.clear();
        this.a.a.ensureCapacity(this.b.size());
        this.a.a.addAll(this.b);
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d.a.clear();
        this.a.d.a.ensureCapacity(this.e.a.size());
        this.a.d.a.addAll(this.e.a);
        this.a.d.b = this.e.b;
        this.a.d.c = this.e.c;
        this.a.d.d = this.e.d;
        this.a.e.a = this.f.a;
        this.a.e.b.clear();
        this.a.e.b.ensureCapacity(this.f.b.size());
        this.a.e.b.addAll(this.f.b);
        this.a.e.c.clear();
        this.a.e.c.ensureCapacity(this.f.c.size());
        this.a.e.c.addAll(this.f.c);
        this.a.f.a = this.g.a;
        this.a.f.b.clear();
        this.a.f.b.ensureCapacity(this.g.b.size());
        this.a.f.b.addAll(this.g.b);
        this.a.g.a = this.h.a;
        this.a.h = this.j;
        this.a.i = this.k;
        this.a.j = this.l;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 1) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 1);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 1);
        return bl3;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 309);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 309) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 309);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 309);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 309);
        return bl3;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 313) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 313);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 313);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 313);
        return bl3;
    }

    private boolean e(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 314) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 314);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 314);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 314);
        return bl3;
    }

    private boolean f(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 315) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 315);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 315);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 315);
        return bl3;
    }

    private boolean g(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10003) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10003);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10003);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10003);
        return bl3;
    }

    private boolean h(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10014);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10014) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10014);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10014);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10014);
        return bl3;
    }

    private boolean i(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10023) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10023);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10023);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10023);
        return bl3;
    }

    private boolean j(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 1027001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 1027001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 1027001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 1027001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 1027001);
        return bl3;
    }

    private boolean k(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 1027002);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 1027002) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 1027002);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 1027002);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 1027002);
        return bl3;
    }

    private boolean l(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10028000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10028000);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10028000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10028000);
        return bl3;
    }

    private boolean m(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10029000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10029000);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10029000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10029000);
        return bl3;
    }

    private boolean n(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10032003) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10032003);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10032003);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10032003);
        return bl3;
    }

    private boolean o(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10035004) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10035004);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10035004);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10035004);
        return bl3;
    }

    private boolean p(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10035007) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10035007);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10035007);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10035007);
        return bl3;
    }

    private boolean q(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10036004) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10036004);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10036004);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10036004);
        return bl3;
    }

    private boolean r(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10037001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10037001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10037001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10037001);
        return bl3;
    }

    private boolean s(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10037002);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10037002) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10037002);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10037002);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10037002);
        return bl3;
    }

    private boolean t(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10040005) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10040005);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10040005);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10040005);
        return bl3;
    }

    private boolean u(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10045010) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10045010);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10045010);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10045010);
        return bl3;
    }

    private boolean v(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10048000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10048000);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10048000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10048000);
        return bl3;
    }

    private boolean w(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10051000);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10051000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10051000);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10051000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10051000);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 10051000);
        return bl4;
    }

    private boolean x(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10055001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10055001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10055001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10055001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 10055001);
        return bl4;
    }

    private boolean y(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10064001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10064001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10064001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10064001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 10064001);
        return bl4;
    }

    private boolean z(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10066001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10066001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10066001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10066001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 10066001);
        return bl4;
    }

    private boolean A(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 0x999C39);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 0x999C39) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 0x999C39);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 0x999C39);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 0x999C39);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 0x999C39);
        if (!bl4) {
            return false;
        }
        this.j = byteBuffer.getShort();
        this.k = byteBuffer.getLong();
        return true;
    }

    private boolean B(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10069001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10069001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10069001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10069001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10069001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 10069001);
        if (!bl4) {
            return false;
        }
        this.j = byteBuffer.getShort();
        this.k = byteBuffer.getLong();
        return true;
    }

    private boolean C(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10085001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10085001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10085001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10085001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10085001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 10085001);
        if (!bl4) {
            return false;
        }
        this.j = byteBuffer.getShort();
        this.k = byteBuffer.getLong();
        return true;
    }

    private boolean D(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.b.clear();
        this.b.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uu_2 uu_22 = new uu_2();
            bl = uu_22.a(byteBuffer, 10086001);
            if (!bl) {
                return false;
            }
            this.b.add(uu_22);
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        n = this.e.a(byteBuffer, 10086001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.f.a(byteBuffer, 10086001);
        if (!bl2) {
            return false;
        }
        bl = this.g.a(byteBuffer, 10086001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.h.a(byteBuffer, 10086001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.i.a(byteBuffer, 10086001);
        if (!bl4) {
            return false;
        }
        this.j = byteBuffer.getShort();
        this.k = byteBuffer.getLong();
        this.l = byteBuffer.get() == 1;
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
        if (n < 10014) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        if (n < 1027001) {
            boolean bl = this.i(byteBuffer);
            return bl;
        }
        if (n < 1027002) {
            boolean bl = this.j(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.k(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.l(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.m(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.n(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.o(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.p(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.q(byteBuffer);
            return bl;
        }
        if (n < 10037002) {
            boolean bl = this.r(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.s(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.t(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.u(byteBuffer);
            return bl;
        }
        if (n < 10051000) {
            boolean bl = this.v(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.w(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.x(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.y(byteBuffer);
            return bl;
        }
        if (n < 0x999C39) {
            boolean bl = this.z(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.A(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.B(byteBuffer);
            return bl;
        }
        if (n < 10086001) {
            boolean bl = this.C(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.D(byteBuffer);
            return bl;
        }
        return false;
    }
}

