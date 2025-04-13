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
 * Renamed from uo
 */
final class uo_2 {
    private long b = 0L;
    private long c = 0L;
    private String d = null;
    private long e = 0L;
    private short f = 0;
    private long g = 0L;
    private final ArrayList<up_1> h = new ArrayList(0);
    private int i = 0;
    private ur_2 j = null;
    private final ud_2 k = new ud_2();
    @Deprecated
    private final uj_1 l = new uj_1();
    private boolean m = false;
    final /* synthetic */ un_2 a;

    uo_2(un_2 un_22) {
        this.a = un_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
        this.a.f = this.g;
        this.a.g.clear();
        this.a.g.ensureCapacity(this.h.size());
        this.a.g.addAll(this.h);
        this.a.h = this.i;
        this.a.i = this.j;
        this.a.j.a = this.k.a;
        this.a.j.b.clear();
        this.a.j.b.ensureCapacity(this.k.b.size());
        this.a.j.b.addAll(this.k.b);
        this.a.j.c.clear();
        this.a.j.c.ensureCapacity(this.k.c.size());
        this.a.j.c.addAll(this.k.c);
        this.a.k = this.m;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 1);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 1);
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 309);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 309);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 309);
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 313);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 313);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 313);
    }

    private boolean e(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 314);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 314);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 314);
    }

    private boolean f(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 315);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 315);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 315);
    }

    private boolean g(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10003);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10003);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10003);
    }

    private boolean h(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10005);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10005);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10005);
    }

    private boolean i(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10014);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10014);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10014);
    }

    private boolean j(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10023);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10023);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10023);
    }

    private boolean k(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 1027001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 1027001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 1027001);
    }

    private boolean l(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 1027002);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 1027002);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 1027002);
    }

    private boolean m(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10028000);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10028000);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10028000);
    }

    private boolean n(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10029000);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10029000);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10029000);
    }

    private boolean o(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10032003);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10032003);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10032003);
    }

    private boolean p(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10035004);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10035004);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10035004);
    }

    private boolean q(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10035007);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10035007);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10035007);
    }

    private boolean r(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10036004);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10036004);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10036004);
    }

    private boolean s(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10037001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10037001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10037001);
    }

    private boolean t(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10037002);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10037002);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10037002);
    }

    private boolean u(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10040005);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10040005);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10040005);
    }

    private boolean v(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10045010);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10045010);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10045010);
    }

    private boolean w(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            boolean bl2 = up_12.a(byteBuffer, 10048000);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10048000);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        return bl = this.k.a(byteBuffer, 10048000);
    }

    private boolean x(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10051000);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10051000);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10051000))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10051000);
        return bl2;
    }

    private boolean y(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10055001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10055001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10055001))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10055001);
        return bl2;
    }

    private boolean z(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10060001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10060001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10060001))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10060001);
        return bl2;
    }

    private boolean A(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10064001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10064001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10064001))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10064001);
        return bl2;
    }

    private boolean B(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10066001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10066001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10066001))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10066001);
        return bl2;
    }

    private boolean C(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 0x999C39);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 0x999C39);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 0x999C39))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 0x999C39);
        return bl2;
    }

    private boolean D(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10069001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10069001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10069001))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10069001);
        return bl2;
    }

    private boolean E(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10085001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10085001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10085001))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10085001);
        return bl2;
    }

    private boolean F(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getShort();
        this.g = byteBuffer.getLong();
        int n3 = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            up_1 up_12 = new up_1();
            bl2 = up_12.a(byteBuffer, 10086001);
            if (!bl2) {
                return false;
            }
            this.h.add(up_12);
        }
        this.i = byteBuffer.getInt();
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.j = new ur_2();
            boolean bl3 = this.j.a(byteBuffer, 10086001);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        if (!(bl = this.k.a(byteBuffer, 10086001))) {
            return false;
        }
        bl2 = this.l.a(byteBuffer, 10086001);
        if (!bl2) {
            return false;
        }
        this.m = byteBuffer.get() == 1;
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

