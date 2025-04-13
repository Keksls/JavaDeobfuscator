/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collections;
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUX
 */
public abstract class cux_0
implements ahr_1 {
    private static Logger f = Logger.getLogger(cux_0.class);
    protected blx_1 a = null;
    protected apq_0 b = null;
    public static final byte c = 0;
    public static final byte d = 1;
    public static final byte e = 2;
    private aff_1 g = null;
    private boolean h = false;

    protected cux_0() {
    }

    public void a(blx_1 blx_12) {
        this.a = blx_12;
    }

    protected abstract Sm a();

    protected abstract void a(int var1, int var2, short var3);

    protected abstract void c();

    protected abstract byte d();

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void e() {
        if (this.b != null) {
            this.b.c();
        }
        this.p();
    }

    protected abstract String f();

    protected abstract String g();

    @Nullable
    public aff_1 h() {
        return this.g;
    }

    public blx_1 i() {
        return this.a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18724: {
                this.o();
                return true;
            }
            case 16119: {
                if (this.a == null) {
                    return true;
                }
                dhL dhL2 = (dhL)adt_12;
                aff_1 aff_12 = cyp_0.g().a(dhL2.r(), dhL2.s());
                aff_1 aff_13 = cyp_0.g().h();
                if (Objects.equals(aff_13, aff_12) && dhL2.o()) {
                    this.j();
                }
                azu_0.j().b(this);
            }
        }
        return true;
    }

    private void o() {
        this.l();
        blx_1 blx_12 = (blx_1)this.a.bz().d(this.g);
        blx_1 blx_13 = (blx_1)this.a.bz().d(cyp_0.g().h());
        if (blx_13 == blx_12) {
            return;
        }
        if (blx_12 != null) {
            biM.b(blx_12.bv());
        }
        if (blx_13 != null) {
            this.g = new aff_1(cyp_0.g().h());
            biM.a(blx_13.bv());
        } else {
            this.g = null;
        }
        this.p();
    }

    private void p() {
        fzd_0.a().d();
        String string = this.g();
        if (string != null) {
            this.a(string, this.f());
        } else {
            fyt_0.a().c();
        }
        this.q();
    }

    private void q() {
        fzd_0.a().a(this.f());
    }

    public void j() {
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        short s2 = 0;
        aff_1 aff_12 = cyp_0.g().h();
        if (aff_12 != null && this.b.b(aff_12)) {
            n = aff_12.d();
            n2 = aff_12.e();
            s2 = aff_12.f();
            bl = true;
        }
        if (bl) {
            this.a(n, n2, s2);
            this.c();
        }
        azu_0.j().b(this);
    }

    public boolean k() {
        return this.h;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!this.h) {
            aff_1 aff_12;
            biI biI2;
            YP yP;
            this.h = true;
            cYT.a().i();
            if (azu_0.j().c(cYT.a())) {
                azu_0.j().b(cYT.a());
            }
            if ((yP = dbm_0.a().c()) instanceof biI && aob_2.c((aoc_2)(biI2 = (biI)yP), aff_12 = cyp_0.g().h()) > 0) {
                biM.b(biI2);
            }
            this.o();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (this.h) {
            abz_0 abz_02;
            Object object;
            this.b.c();
            fyt_0.a().c();
            fzd_0.a().d();
            azu_0.j().a(cYT.a());
            this.h = false;
            YP yP = dbm_0.a().c();
            if (yP instanceof biI && !((abz_0)(object = (biI)yP)).aD()) {
                biM.b((biI)object);
            }
            if ((abz_02 = ((aNF)(object = (aNF)ans_0.D().c())).v()) != null && abz_02 instanceof biI) {
                biM.a((biI)abz_02);
            }
        }
    }

    private void a(String string, String string2) {
        if (string == null) {
            return;
        }
        switch (this.d()) {
            case 0: 
            case 2: {
                fyt_0.a().a(frb_0.s, true);
                break;
            }
            case 1: {
                fyt_0.a().a(frb_0.n, true);
            }
        }
        fzd_0.a().a(string, string2, 10, -30, frs_0.a);
    }

    public void l() {
        aff_1 aff_12 = cyp_0.g().h();
        if (aff_12 != null && this.b.b(aff_12)) {
            this.b.a(Collections.singletonList((efi_0)this.a()), this.a, aff_12);
        } else {
            this.b.d();
        }
    }

    public void m() {
        this.p();
        this.b.c();
    }

    public abstract boolean n();
}

