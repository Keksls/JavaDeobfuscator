/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bMk
implements YT,
ffz {
    static final Logger f = Logger.getLogger(bMk.class);
    protected final bnh_1 a;
    protected final ffu_0 b;
    protected bMg c;
    protected bMb d;
    protected final ffb_0 e = new bMl(this);

    public bMk(bnh_1 bnh_12, ffu_0 ffu_02) {
        this.a = bnh_12;
        this.b = ffu_02;
        this.b();
    }

    protected void b() {
        biI biI2 = this.a.bv();
        this.c = new bMg(this.b, biI2);
        int n = this.b.e();
        this.c.m(bMj.a(this.b));
        this.c.a(biI2.aC());
        this.c.e("AnimStatique");
        this.c.a(agm.a());
        this.c.g(ahi_0.j.a());
        this.c.b((byte)8);
        this.c.c(true);
        afz_0.d().a(this.c);
        this.c.a(this.b.d());
        Object r2 = eyo_1.g().d(n);
        if (r2 != null) {
            this.c.c(((ezr_0)r2).C());
        }
        bMj.a(this.c, this.a);
        this.c.E();
        this.d = new bMb(this.c);
        biI2.a(this.d);
        ((afv)biI2).a(this.d);
        aff_1 aff_12 = bMb.a(biI2.be(), biI2.bf(), biI2.bg());
        this.c.b(aff_12.d(), (float)aff_12.e(), (float)aff_12.f());
        this.b.a(this.e);
    }

    public void c() {
        afv afv2 = this.c.aK();
        if (afv2 != null) {
            afv2.e(this.c);
        }
        afz_0.d().a(this.c.a());
        this.c.R();
        this.c = null;
        if (this.a.bm()) {
            biI biI2 = this.a.bv();
            biI2.b(this.d);
            biI2.c(this.d);
        }
        this.d = null;
        this.b.b(this.e);
    }

    public ffb_0 d() {
        return this.e;
    }

    @Override
    public void a(boolean bl, YU yU) {
        if (this.c == null || yU != YU.b) {
            return;
        }
        boolean bl2 = this.b.f() > 0;
        boolean bl3 = this.b.m() <= 0 && this.b.n().c();
        this.c.c(bl && bl2 && bl3);
    }

    @Override
    public boolean aQ_() {
        return true;
    }

    @Override
    public ffu_0 f() {
        return this.b;
    }

    @Override
    public long a() {
        return this.c.a();
    }

    public biE g() {
        return this.c;
    }

    public String toString() {
        return "ServerPetHandlerListener{m_player=" + this.a + "}";
    }
}

