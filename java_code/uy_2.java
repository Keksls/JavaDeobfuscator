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
 * Renamed from uy
 */
final class uy_2 {
    private long b = 0L;
    private long c = 0L;
    private String d = null;
    private long e = 0L;
    private int f = 0;
    private final ArrayList<uz_2> g = new ArrayList(0);
    private final ArrayList<ux_2> h = new ArrayList(0);
    final /* synthetic */ uw_2 a;

    uy_2(uw_2 uw_22) {
        this.a = uw_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.e;
        this.a.e = this.f;
        this.a.f.clear();
        this.a.f.ensureCapacity(this.g.size());
        this.a.f.addAll(this.g);
        this.a.g.clear();
        this.a.g.ensureCapacity(this.h.size());
        this.a.g.addAll(this.h);
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10005);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10005);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean i(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean j(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean k(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean l(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean m(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean n(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean o(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean p(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean q(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean r(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean s(ByteBuffer byteBuffer) {
        int n;
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean t(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10060001);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10060001);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean u(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
        }
        return true;
    }

    private boolean v(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.d = new String(byArray, Charsets.UTF_8);
        this.e = byteBuffer.getLong();
        this.f = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.g.clear();
        this.g.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            uz_2 uz_22 = new uz_2();
            boolean bl = uz_22.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.g.add(uz_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.h.clear();
        this.h.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ux_2 ux_22 = new ux_2();
            boolean bl = ux_22.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.h.add(ux_22);
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
        if (n < 10005) {
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
        if (n < 10060001) {
            boolean bl = this.s(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.t(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.u(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.v(byteBuffer);
            return bl;
        }
        return false;
    }
}

