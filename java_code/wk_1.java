/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wK
 */
final class wk_1 {
    private long b = 0L;
    private byte c = (byte)-1;
    private short d = 0;
    private byte e = 1;
    private final ArrayList<wi_2> f = new ArrayList(0);
    private String g = null;
    private boolean h = false;
    private long i = 0L;
    final /* synthetic */ wh_2 a;

    wk_1(wh_2 wh_22) {
        this.a = wh_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e.clear();
        this.a.e.ensureCapacity(this.f.size());
        this.a.e.addAll(this.f);
        this.a.f = this.g;
        this.a.g = this.h;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        this.i = byteBuffer.getLong();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 309);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean i(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean j(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean k(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean l(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean m(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean n(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean o(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean p(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean q(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean r(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean s(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean t(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    private boolean u(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.f.clear();
        this.f.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wi_2();
            boolean bl = ((wi_2)object).a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.f.add((wi_2)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.g = new String((byte[])object, Charsets.UTF_8);
        this.h = byteBuffer.get() == 1;
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
        if (n < 10023) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.i(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.j(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.k(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.l(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.m(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.n(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.o(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.p(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.q(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.r(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.s(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.t(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.u(byteBuffer);
            return bl;
        }
        return false;
    }
}

