/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from vj
 */
final class vj_2 {
    private int b = -1;
    private boolean c = true;
    private final ArrayList<vh_1> d = new ArrayList(0);
    private vg_1 e = null;
    final /* synthetic */ vf_1 a;

    vj_2(vf_1 vf_12) {
        this.a = vf_12;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c.clear();
        this.a.c.ensureCapacity(this.d.size());
        this.a.c.addAll(this.d);
        this.a.d = this.e;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10025000);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        return true;
    }

    private boolean i(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10025001);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10025001);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean j(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean k(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean l(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean m(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean n(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean o(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean p(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean q(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean r(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean s(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean t(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean u(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean v(ByteBuffer byteBuffer) {
        int n;
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.d.clear();
        this.d.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            vh_1 vh_12 = new vh_1();
            boolean bl = vh_12.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.d.add(vh_12);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.e = new vg_1();
            boolean bl = this.e.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
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
        if (n < 10025000) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10025001) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.i(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.j(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.k(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.l(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.m(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.n(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.o(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.p(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.q(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.r(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
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

