/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vT
 */
final class vt_1 {
    private long b = 0L;
    private int c = 0;
    private short d = 0;
    private vy_2 e = null;
    private vr_2 f = null;
    private wa_2 g = null;
    private vm_1 h = null;
    private vw_1 i = null;
    private vu_1 j = null;
    private vi_1 k = null;
    private vg_2 l = null;
    private vk_1 m = null;
    private vo_2 n = null;
    private vq_1 o = null;
    final /* synthetic */ vf_2 a;

    vt_1(vf_2 vf_22) {
        this.a = vf_22;
    }

    public void a() {
        this.a.a = this.b;
        this.a.b = this.c;
        this.a.c = this.d;
        this.a.d = this.f;
        this.a.e = this.g;
        this.a.f = this.i;
        this.a.g = this.k;
        this.a.h = this.l;
        this.a.i = this.m;
        this.a.j = this.n;
        this.a.k = this.o;
    }

    private boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean b(ByteBuffer byteBuffer) {
        boolean bl;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.e = new vy_2();
            boolean bl3 = this.e.a(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.e = null;
        }
        return true;
    }

    private boolean c(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.e = new vy_2();
            bl = this.e.a(byteBuffer, 313);
            if (!bl) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.f = new vr_2();
            boolean bl5 = this.f.a(byteBuffer, 313);
            if (!bl5) {
                return false;
            }
        } else {
            this.f = null;
        }
        return true;
    }

    private boolean d(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl4 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.e = new vy_2();
            bl2 = this.e.a(byteBuffer, 314);
            if (!bl2) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl5 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.f = new vr_2();
            bl = this.f.a(byteBuffer, 314);
            if (!bl) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl6 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.g = new wa_2();
            boolean bl7 = this.g.a(byteBuffer, 314);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        return true;
    }

    private boolean e(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl4 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.e = new vy_2();
            bl2 = this.e.a(byteBuffer, 315);
            if (!bl2) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl5 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.f = new vr_2();
            bl = this.f.a(byteBuffer, 315);
            if (!bl) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl6 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.g = new wa_2();
            boolean bl7 = this.g.a(byteBuffer, 315);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        return true;
    }

    private boolean f(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl5 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.e = new vy_2();
            bl3 = this.e.a(byteBuffer, 10003);
            if (!bl3) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl6 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.f = new vr_2();
            bl2 = this.f.a(byteBuffer, 10003);
            if (!bl2) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl7 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.g = new wa_2();
            bl = this.g.a(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl8 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.h = new vm_1();
            boolean bl9 = this.h.a(byteBuffer, 10003);
            if (!bl9) {
                return false;
            }
        } else {
            this.h = null;
        }
        return true;
    }

    private boolean g(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl5 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.e = new vy_2();
            bl3 = this.e.a(byteBuffer, 10023);
            if (!bl3) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl6 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.f = new vr_2();
            bl2 = this.f.a(byteBuffer, 10023);
            if (!bl2) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl7 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.g = new wa_2();
            bl = this.g.a(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl8 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.i = new vw_1();
            boolean bl9 = this.i.a(byteBuffer, 10023);
            if (!bl9) {
                return false;
            }
        } else {
            this.i = null;
        }
        return true;
    }

    private boolean h(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl6 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.e = new vy_2();
            bl4 = this.e.a(byteBuffer, 10028000);
            if (!bl4) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl7 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.f = new vr_2();
            bl3 = this.f.a(byteBuffer, 10028000);
            if (!bl3) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl8 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.g = new wa_2();
            bl2 = this.g.a(byteBuffer, 10028000);
            if (!bl2) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl9 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.i = new vw_1();
            bl = this.i.a(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl10 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.j = new vu_1();
            boolean bl11 = this.j.a(byteBuffer, 10028000);
            if (!bl11) {
                return false;
            }
        } else {
            this.j = null;
        }
        return true;
    }

    private boolean i(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl7 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.e = new vy_2();
            bl5 = this.e.a(byteBuffer, 10029000);
            if (!bl5) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl8 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.f = new vr_2();
            bl4 = this.f.a(byteBuffer, 10029000);
            if (!bl4) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl9 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.g = new wa_2();
            bl3 = this.g.a(byteBuffer, 10029000);
            if (!bl3) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl10 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.i = new vw_1();
            bl2 = this.i.a(byteBuffer, 10029000);
            if (!bl2) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl11 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.j = new vu_1();
            bl = this.j.a(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl12 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.k = new vi_1();
            boolean bl13 = this.k.a(byteBuffer, 10029000);
            if (!bl13) {
                return false;
            }
        } else {
            this.k = null;
        }
        return true;
    }

    private boolean j(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl8 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.e = new vy_2();
            bl6 = this.e.a(byteBuffer, 10032003);
            if (!bl6) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl9 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.f = new vr_2();
            bl5 = this.f.a(byteBuffer, 10032003);
            if (!bl5) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl10 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.g = new wa_2();
            bl4 = this.g.a(byteBuffer, 10032003);
            if (!bl4) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl11 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.i = new vw_1();
            bl3 = this.i.a(byteBuffer, 10032003);
            if (!bl3) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl12 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.j = new vu_1();
            bl2 = this.j.a(byteBuffer, 10032003);
            if (!bl2) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl13 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.k = new vi_1();
            bl = this.k.a(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl14 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.l = new vg_2();
            boolean bl15 = this.l.a(byteBuffer, 10032003);
            if (!bl15) {
                return false;
            }
        } else {
            this.l = null;
        }
        return true;
    }

    private boolean k(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl8 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.e = new vy_2();
            bl6 = this.e.a(byteBuffer, 10035004);
            if (!bl6) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl9 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.f = new vr_2();
            bl5 = this.f.a(byteBuffer, 10035004);
            if (!bl5) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl10 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.g = new wa_2();
            bl4 = this.g.a(byteBuffer, 10035004);
            if (!bl4) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl11 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.i = new vw_1();
            bl3 = this.i.a(byteBuffer, 10035004);
            if (!bl3) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl12 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.j = new vu_1();
            bl2 = this.j.a(byteBuffer, 10035004);
            if (!bl2) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl13 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.k = new vi_1();
            bl = this.k.a(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl14 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.l = new vg_2();
            boolean bl15 = this.l.a(byteBuffer, 10035004);
            if (!bl15) {
                return false;
            }
        } else {
            this.l = null;
        }
        return true;
    }

    private boolean l(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl8 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.e = new vy_2();
            bl6 = this.e.a(byteBuffer, 10035007);
            if (!bl6) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl9 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.f = new vr_2();
            bl5 = this.f.a(byteBuffer, 10035007);
            if (!bl5) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl10 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.g = new wa_2();
            bl4 = this.g.a(byteBuffer, 10035007);
            if (!bl4) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl11 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.i = new vw_1();
            bl3 = this.i.a(byteBuffer, 10035007);
            if (!bl3) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl12 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.j = new vu_1();
            bl2 = this.j.a(byteBuffer, 10035007);
            if (!bl2) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl13 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.k = new vi_1();
            bl = this.k.a(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl14 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.l = new vg_2();
            boolean bl15 = this.l.a(byteBuffer, 10035007);
            if (!bl15) {
                return false;
            }
        } else {
            this.l = null;
        }
        return true;
    }

    private boolean m(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl9 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.e = new vy_2();
            bl7 = this.e.a(byteBuffer, 10036004);
            if (!bl7) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl10 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.f = new vr_2();
            bl6 = this.f.a(byteBuffer, 10036004);
            if (!bl6) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl11 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.g = new wa_2();
            bl5 = this.g.a(byteBuffer, 10036004);
            if (!bl5) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl12 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.i = new vw_1();
            bl4 = this.i.a(byteBuffer, 10036004);
            if (!bl4) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl13 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.j = new vu_1();
            bl3 = this.j.a(byteBuffer, 10036004);
            if (!bl3) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl14 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.k = new vi_1();
            bl2 = this.k.a(byteBuffer, 10036004);
            if (!bl2) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl15 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.l = new vg_2();
            bl = this.l.a(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl16 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.m = new vk_1();
            boolean bl17 = this.m.a(byteBuffer, 10036004);
            if (!bl17) {
                return false;
            }
        } else {
            this.m = null;
        }
        return true;
    }

    private boolean n(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.e = new vy_2();
            bl8 = this.e.a(byteBuffer, 10037001);
            if (!bl8) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.f = new vr_2();
            bl7 = this.f.a(byteBuffer, 10037001);
            if (!bl7) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.g = new wa_2();
            bl6 = this.g.a(byteBuffer, 10037001);
            if (!bl6) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.i = new vw_1();
            bl5 = this.i.a(byteBuffer, 10037001);
            if (!bl5) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.j = new vu_1();
            bl4 = this.j.a(byteBuffer, 10037001);
            if (!bl4) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.k = new vi_1();
            bl3 = this.k.a(byteBuffer, 10037001);
            if (!bl3) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.l = new vg_2();
            bl2 = this.l.a(byteBuffer, 10037001);
            if (!bl2) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.m = new vk_1();
            bl = this.m.a(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.n = new vo_2();
            boolean bl19 = this.n.a(byteBuffer, 10037001);
            if (!bl19) {
                return false;
            }
        } else {
            this.n = null;
        }
        return true;
    }

    private boolean o(ByteBuffer byteBuffer) {
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
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl11 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.e = new vy_2();
            bl9 = this.e.a(byteBuffer, 10040005);
            if (!bl9) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl12 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.f = new vr_2();
            bl8 = this.f.a(byteBuffer, 10040005);
            if (!bl8) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl13 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.g = new wa_2();
            bl7 = this.g.a(byteBuffer, 10040005);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl14 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.i = new vw_1();
            bl6 = this.i.a(byteBuffer, 10040005);
            if (!bl6) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl15 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.j = new vu_1();
            bl5 = this.j.a(byteBuffer, 10040005);
            if (!bl5) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl16 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.k = new vi_1();
            bl4 = this.k.a(byteBuffer, 10040005);
            if (!bl4) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl17 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.l = new vg_2();
            bl3 = this.l.a(byteBuffer, 10040005);
            if (!bl3) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl18 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.m = new vk_1();
            bl2 = this.m.a(byteBuffer, 10040005);
            if (!bl2) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl19 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.n = new vo_2();
            bl = this.n.a(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
        } else {
            this.n = null;
        }
        boolean bl20 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.o = new vq_1();
            boolean bl21 = this.o.a(byteBuffer, 10040005);
            if (!bl21) {
                return false;
            }
        } else {
            this.o = null;
        }
        return true;
    }

    private boolean p(ByteBuffer byteBuffer) {
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
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl11 = bl10 = byteBuffer.get() == 1;
        if (bl10) {
            this.e = new vy_2();
            bl9 = this.e.a(byteBuffer, 10045010);
            if (!bl9) {
                return false;
            }
        } else {
            this.e = null;
        }
        boolean bl12 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.f = new vr_2();
            bl8 = this.f.a(byteBuffer, 10045010);
            if (!bl8) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl13 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.g = new wa_2();
            bl7 = this.g.a(byteBuffer, 10045010);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl14 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.i = new vw_1();
            bl6 = this.i.a(byteBuffer, 10045010);
            if (!bl6) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl15 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.j = new vu_1();
            bl5 = this.j.a(byteBuffer, 10045010);
            if (!bl5) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl16 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.k = new vi_1();
            bl4 = this.k.a(byteBuffer, 10045010);
            if (!bl4) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl17 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.l = new vg_2();
            bl3 = this.l.a(byteBuffer, 10045010);
            if (!bl3) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl18 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.m = new vk_1();
            bl2 = this.m.a(byteBuffer, 10045010);
            if (!bl2) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl19 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.n = new vo_2();
            bl = this.n.a(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
        } else {
            this.n = null;
        }
        boolean bl20 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.o = new vq_1();
            boolean bl21 = this.o.a(byteBuffer, 10045010);
            if (!bl21) {
                return false;
            }
        } else {
            this.o = null;
        }
        return true;
    }

    private boolean q(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.f = new vr_2();
            bl8 = this.f.a(byteBuffer, 10048000);
            if (!bl8) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.g = new wa_2();
            bl7 = this.g.a(byteBuffer, 10048000);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.i = new vw_1();
            bl6 = this.i.a(byteBuffer, 10048000);
            if (!bl6) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.j = new vu_1();
            bl5 = this.j.a(byteBuffer, 10048000);
            if (!bl5) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.k = new vi_1();
            bl4 = this.k.a(byteBuffer, 10048000);
            if (!bl4) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.l = new vg_2();
            bl3 = this.l.a(byteBuffer, 10048000);
            if (!bl3) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.m = new vk_1();
            bl2 = this.m.a(byteBuffer, 10048000);
            if (!bl2) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.n = new vo_2();
            bl = this.n.a(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
        } else {
            this.n = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.o = new vq_1();
            boolean bl19 = this.o.a(byteBuffer, 10048000);
            if (!bl19) {
                return false;
            }
        } else {
            this.o = null;
        }
        return true;
    }

    private boolean r(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.f = new vr_2();
            bl8 = this.f.a(byteBuffer, 10055001);
            if (!bl8) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.g = new wa_2();
            bl7 = this.g.a(byteBuffer, 10055001);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.i = new vw_1();
            bl6 = this.i.a(byteBuffer, 10055001);
            if (!bl6) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.j = new vu_1();
            bl5 = this.j.a(byteBuffer, 10055001);
            if (!bl5) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.k = new vi_1();
            bl4 = this.k.a(byteBuffer, 10055001);
            if (!bl4) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.l = new vg_2();
            bl3 = this.l.a(byteBuffer, 10055001);
            if (!bl3) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.m = new vk_1();
            bl2 = this.m.a(byteBuffer, 10055001);
            if (!bl2) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.n = new vo_2();
            bl = this.n.a(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
        } else {
            this.n = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.o = new vq_1();
            boolean bl19 = this.o.a(byteBuffer, 10055001);
            if (!bl19) {
                return false;
            }
        } else {
            this.o = null;
        }
        return true;
    }

    private boolean s(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        boolean bl9;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl10 = bl9 = byteBuffer.get() == 1;
        if (bl9) {
            this.f = new vr_2();
            bl8 = this.f.a(byteBuffer, 10064001);
            if (!bl8) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl11 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.g = new wa_2();
            bl7 = this.g.a(byteBuffer, 10064001);
            if (!bl7) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl12 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.i = new vw_1();
            bl6 = this.i.a(byteBuffer, 10064001);
            if (!bl6) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl13 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.j = new vu_1();
            bl5 = this.j.a(byteBuffer, 10064001);
            if (!bl5) {
                return false;
            }
        } else {
            this.j = null;
        }
        boolean bl14 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.k = new vi_1();
            bl4 = this.k.a(byteBuffer, 10064001);
            if (!bl4) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl15 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.l = new vg_2();
            bl3 = this.l.a(byteBuffer, 10064001);
            if (!bl3) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl16 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.m = new vk_1();
            bl2 = this.m.a(byteBuffer, 10064001);
            if (!bl2) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl17 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.n = new vo_2();
            bl = this.n.a(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
        } else {
            this.n = null;
        }
        boolean bl18 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.o = new vq_1();
            boolean bl19 = this.o.a(byteBuffer, 10064001);
            if (!bl19) {
                return false;
            }
        } else {
            this.o = null;
        }
        return true;
    }

    private boolean t(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        boolean bl9 = bl8 = byteBuffer.get() == 1;
        if (bl8) {
            this.f = new vr_2();
            bl7 = this.f.a(byteBuffer, 10066001);
            if (!bl7) {
                return false;
            }
        } else {
            this.f = null;
        }
        boolean bl10 = bl7 = byteBuffer.get() == 1;
        if (bl7) {
            this.g = new wa_2();
            bl6 = this.g.a(byteBuffer, 10066001);
            if (!bl6) {
                return false;
            }
        } else {
            this.g = null;
        }
        boolean bl11 = bl6 = byteBuffer.get() == 1;
        if (bl6) {
            this.i = new vw_1();
            bl5 = this.i.a(byteBuffer, 10066001);
            if (!bl5) {
                return false;
            }
        } else {
            this.i = null;
        }
        boolean bl12 = bl5 = byteBuffer.get() == 1;
        if (bl5) {
            this.k = new vi_1();
            bl4 = this.k.a(byteBuffer, 10066001);
            if (!bl4) {
                return false;
            }
        } else {
            this.k = null;
        }
        boolean bl13 = bl4 = byteBuffer.get() == 1;
        if (bl4) {
            this.l = new vg_2();
            bl3 = this.l.a(byteBuffer, 10066001);
            if (!bl3) {
                return false;
            }
        } else {
            this.l = null;
        }
        boolean bl14 = bl3 = byteBuffer.get() == 1;
        if (bl3) {
            this.m = new vk_1();
            bl2 = this.m.a(byteBuffer, 10066001);
            if (!bl2) {
                return false;
            }
        } else {
            this.m = null;
        }
        boolean bl15 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.n = new vo_2();
            bl = this.n.a(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
        } else {
            this.n = null;
        }
        boolean bl16 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.o = new vq_1();
            boolean bl17 = this.o.a(byteBuffer, 10066001);
            if (!bl17) {
                return false;
            }
        } else {
            this.o = null;
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

