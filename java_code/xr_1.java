/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xr
 */
public class xr_1
implements gs_0 {
    public int a = 0;
    public xc_1 b = null;
    public xs_2 c = null;
    public xt_1 d = null;
    public xe_1 e = null;
    public xa_2 f = null;
    public xo_1 g = null;
    public xj_2 h = null;
    public xk_2 i = null;
    public xq_1 j = null;
    public xi_2 k = null;
    public xy_1 l = null;
    public xg_1 m = null;
    public xv_2 n = null;

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl;
        byteBuffer.putInt(this.a);
        if (this.b != null) {
            byteBuffer.put((byte)1);
            bl = this.b.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.c != null) {
            byteBuffer.put((byte)1);
            bl = this.c.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.d != null) {
            byteBuffer.put((byte)1);
            bl = this.d.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.e != null) {
            byteBuffer.put((byte)1);
            bl = this.e.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.f != null) {
            byteBuffer.put((byte)1);
            bl = this.f.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.g != null) {
            byteBuffer.put((byte)1);
            bl = this.g.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.h != null) {
            byteBuffer.put((byte)1);
            bl = this.h.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.i != null) {
            byteBuffer.put((byte)1);
            bl = this.i.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.j != null) {
            byteBuffer.put((byte)1);
            bl = this.j.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.k != null) {
            byteBuffer.put((byte)1);
            bl = this.k.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.l != null) {
            byteBuffer.put((byte)1);
            bl = this.l.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.m != null) {
            byteBuffer.put((byte)1);
            bl = this.m.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.n != null) {
            byteBuffer.put((byte)1);
            bl = this.n.a(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        boolean bl10;
        boolean bl11;
        boolean bl12;
        boolean bl13;
        this.a = byteBuffer.getInt();
        boolean bl14 = bl13 = byteBuffer.get() == 1;
        if (bl13) {
            this.b = new xc_1();
            bl12 = this.b.b(byteBuffer);
            if (!bl12) {
                return false;
            }
        } else {
            this.b = null;
        }
        boolean bl15 = bl12 = byteBuffer.get() == 1;
        if (bl12) {
            this.c = new xs_2();
            bl11 = this.c.b(byteBuffer);
            if (!bl11) {
                return false;
            }
        } else {
            this.c = null;
        }
        boolean bl16 = bl11 = byteBuffer.get() == 1;
        if (bl11) {
            this.d = new xt_1();
            bl10 = this.d.b(byteBuffer);
            if (!bl10) {
                return false;
            }
        } else {
            this.d = null;
        }
        boolean bl17 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.e = new xe_1();
            bl9 = this.e.b(byteBuffer);
            if (!bl9) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl18 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.f = new xa_2();
            bl8 = this.f.b(byteBuffer);
            if (!bl8) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl19 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.g = new xo_1();
            bl7 = this.g.b(byteBuffer);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl20 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.h = new xj_2();
            bl6 = this.h.b(byteBuffer);
            if (!bl6) {
                return false;
            }
        } else {
            this.h = null;
        }
        boolean bl21 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.i = new xk_2();
            bl5 = this.i.b(byteBuffer);
            if (!bl5) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl22 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.j = new xq_1();
            bl4 = this.j.b(byteBuffer);
            if (!bl4) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl23 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.k = new xi_2();
            bl3 = this.k.b(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl24 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.l = new xy_1();
            bl2 = this.l.b(byteBuffer);
            if (!bl2) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl25 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.m = new xg_1();
            bl = this.m.b(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl26 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.n = new xv_2();
            boolean bl27 = this.n.b(byteBuffer);
            if (!bl27) {
                return false;
            }
        } else {
            this.n = null;
        }
        return true;
    }

    @Override
    public void c() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            xd_2 xd_22 = new xd_2(this);
            boolean bl = xd_22.a(byteBuffer, n);
            if (bl) {
                xd_22.a();
                return true;
            }
            return false;
        }
        return this.b(byteBuffer);
    }

    @Override
    public int b() {
        int n = 0;
        n += 4;
        ++n;
        if (this.b != null) {
            n += this.b.b();
        }
        ++n;
        if (this.c != null) {
            n += this.c.b();
        }
        ++n;
        if (this.d != null) {
            n += this.d.b();
        }
        ++n;
        if (this.e != null) {
            n += this.e.b();
        }
        ++n;
        if (this.f != null) {
            n += this.f.b();
        }
        ++n;
        if (this.g != null) {
            n += this.g.b();
        }
        ++n;
        if (this.h != null) {
            n += this.h.b();
        }
        ++n;
        if (this.i != null) {
            n += this.i.b();
        }
        ++n;
        if (this.j != null) {
            n += this.j.b();
        }
        ++n;
        if (this.k != null) {
            n += this.k.b();
        }
        ++n;
        if (this.l != null) {
            n += this.l.b();
        }
        ++n;
        if (this.m != null) {
            n += this.m.b();
        }
        ++n;
        if (this.n != null) {
            n += this.n.b();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("protectorId=").append(this.a).append('\n');
        stringBuilder.append(string).append("nationality=");
        if (this.b == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.b.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("appearance=");
        if (this.c == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.c.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("challenges=");
        if (this.d == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.d.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("referenceMerchantInventories=");
        if (this.e == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.e.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("nationMerchantInventories=");
        if (this.f == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.f.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("wallet=");
        if (this.g == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.g.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("stake=");
        if (this.h == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.h.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("taxes=");
        if (this.i == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.i.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("weatherModifiers=");
        if (this.j == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.j.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("satisfaction=");
        if (this.k == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.k.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("monsterTargets=");
        if (this.l == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.l.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("resourceTargets=");
        if (this.m == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.m.a(stringBuilder, string + "  ");
        }
        stringBuilder.append(string).append("ecosystem=");
        if (this.n == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.n.a(stringBuilder, string + "  ");
        }
    }
}

