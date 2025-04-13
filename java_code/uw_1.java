/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from uW
 */
final class uw_1 {
    private long b = 0L;
    private long c = 0L;
    private String d = null;
    private long e = 0L;
    private int f = 0;
    private int g = 0;
    private short h = 0;
    private long i = 0L;
    private final us_2 j = new us_2();
    private long k = 0L;
    private String l = null;
    private long m = 0L;
    final /* synthetic */ uv_1 a;

    uw_1(uv_1 uv_12) {
        this.a = uv_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
        this.a.f = this.g;
        this.a.g = this.h;
        this.a.h = this.i;
        this.a.i.a.clear();
        this.a.i.a.ensureCapacity(this.j.a.size());
        this.a.i.a.addAll(this.j.a);
        this.a.i.b = this.j.b;
        this.a.i.c = this.j.c;
        this.a.i.d.a.clear();
        this.a.i.d.a.ensureCapacity(this.j.d.a.size());
        this.a.i.d.a.addAll(this.j.d.a);
        this.a.i.d.b = this.j.d.b;
        this.a.i.d.c = this.j.d.c;
        this.a.i.d.d = this.j.d.d;
        this.a.i.e.a = this.j.e.a;
        this.a.i.e.b.clear();
        this.a.i.e.b.ensureCapacity(this.j.e.b.size());
        this.a.i.e.b.addAll(this.j.e.b);
        this.a.i.e.c.clear();
        this.a.i.e.c.ensureCapacity(this.j.e.c.size());
        this.a.i.e.c.addAll(this.j.e.c);
        this.a.i.f.a = this.j.f.a;
        this.a.i.f.b.clear();
        this.a.i.f.b.ensureCapacity(this.j.f.b.size());
        this.a.i.f.b.addAll(this.j.f.b);
        this.a.i.g.a = this.j.g.a;
        this.a.i.h = this.j.h;
        this.a.i.i = this.j.i;
        this.a.i.j = this.j.j;
        this.a.j = this.k;
        this.a.k = this.l;
        this.a.l = this.m;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 309);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 313);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 314);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 315);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10003);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10005);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean i(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10014);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean j(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10023);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean k(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 1027001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean l(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 1027002);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean m(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10028000);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean n(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10029000);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean o(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10032003);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean p(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10035004);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean q(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10035007);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean r(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10036004);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean s(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10037001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean t(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10037002);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean u(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10040005);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean v(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10045010);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean w(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10048000);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean x(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10051000);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean y(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10055001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean z(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10064001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean A(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10066001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean B(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 0x999C39);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean C(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10069001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean D(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10085001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
        return true;
    }

    private boolean E(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getShort();
        this.i = byteBuffer.getLong();
        boolean bl = this.j.a(byteBuffer, 10086001);
        if (!bl) {
            return false;
        }
        this.k = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.l = new String(byArray2, Charsets.UTF_8);
        this.m = byteBuffer.getLong();
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
        if (n < 10064001) {
            boolean bl = this.y(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.z(byteBuffer);
            return bl;
        }
        if (n < 0x999C39) {
            boolean bl = this.A(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.B(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.C(byteBuffer);
            return bl;
        }
        if (n < 10086001) {
            boolean bl = this.D(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.E(byteBuffer);
            return bl;
        }
        return false;
    }
}

