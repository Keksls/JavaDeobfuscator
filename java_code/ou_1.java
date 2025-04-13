/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from oU
 */
final class ou_1 {
    private int[] b = null;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private long h = 0L;
    private long i = 0L;
    private int[] j = null;
    private byte k = 0;
    private byte l = 0;
    private byte m = 0;
    private final ArrayList<ot_0> n = new ArrayList(0);
    private byte o = 0;
    private int p = 0;
    final /* synthetic */ or_0 a;

    ou_1(or_0 or_02) {
        this.a = or_02;
    }

    public void a() {
        this.a.c = this.b;
        this.a.d = this.c;
        this.a.e = this.f;
        this.a.f = this.g;
        this.a.g = this.h;
        this.a.h = this.i;
        this.a.i = this.j;
        this.a.j = this.k;
        this.a.k = this.m;
        this.a.l.clear();
        this.a.l.ensureCapacity(this.n.size());
        this.a.l.addAll(this.n);
        this.a.m = this.o;
        this.a.n = this.p;
    }

    private boolean a(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.b = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.b[n] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.j = new int[n];
            for (int k = 0; k < n; ++k) {
                this.j[k] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.b = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.b[n] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.j = new int[n];
            for (int k = 0; k < n; ++k) {
                this.j[k] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        this.k = byteBuffer.get();
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.b = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.b[n] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.j = new int[n];
            for (int k = 0; k < n; ++k) {
                this.j[k] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        this.k = byteBuffer.get();
        this.l = byteBuffer.get();
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.b = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.b[n] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.j = new int[n];
            for (int k = 0; k < n; ++k) {
                this.j[k] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        this.k = byteBuffer.get();
        this.l = byteBuffer.get();
        this.m = byteBuffer.get();
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.b = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.b[n] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.j = new int[n];
            for (int k = 0; k < n; ++k) {
                this.j[k] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        this.k = byteBuffer.get();
        this.m = byteBuffer.get();
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.b = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.b[n2] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.j = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.j[n] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        this.k = byteBuffer.get();
        this.m = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.n.clear();
        this.n.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ot_0 ot_02 = new ot_0();
            boolean bl = ot_02.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.n.add(ot_02);
        }
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.b = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.b[n2] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.j = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.j[n] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        this.k = byteBuffer.get();
        this.m = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.n.clear();
        this.n.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ot_0 ot_02 = new ot_0();
            boolean bl = ot_02.a(byteBuffer, 10054000);
            if (!bl) {
                return false;
            }
            this.n.add(ot_02);
        }
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.b = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.b[n2] = byteBuffer.getInt();
            }
        } else {
            this.b = null;
        }
        this.c = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getLong();
        this.i = byteBuffer.getLong();
        n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.j = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.j[n] = byteBuffer.getInt();
            }
        } else {
            this.j = null;
        }
        this.k = byteBuffer.get();
        this.m = byteBuffer.get();
        n = byteBuffer.getShort() & 0xFFFF;
        this.n.clear();
        this.n.ensureCapacity(n);
        for (int k = 0; k < n; ++k) {
            ot_0 ot_02 = new ot_0();
            boolean bl = ot_02.a(byteBuffer, 10057001);
            if (!bl) {
                return false;
            }
            this.n.add(ot_02);
        }
        return true;
    }

    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.a(byteBuffer);
            return bl;
        }
        if (n < 10035003) {
            boolean bl = this.b(byteBuffer);
            return bl;
        }
        if (n < 10041001) {
            boolean bl = this.c(byteBuffer);
            return bl;
        }
        if (n < 10044001) {
            boolean bl = this.d(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.e(byteBuffer);
            return bl;
        }
        if (n < 10054000) {
            boolean bl = this.f(byteBuffer);
            return bl;
        }
        if (n < 10057001) {
            boolean bl = this.g(byteBuffer);
            return bl;
        }
        if (n < 10081000) {
            boolean bl = this.h(byteBuffer);
            return bl;
        }
        return false;
    }
}

