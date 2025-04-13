/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bwz
 */
public class bwz_0
extends bwu_0 {
    private static final Logger g = Logger.getLogger(bwz_0.class);
    private final blx_1 h;
    private boolean i = false;

    public bwz_0(blx_1 blx_12) {
        this.h = blx_12;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(biI biI2) {
        super.a(biI2);
        this.i = false;
        biI2.e(this.b());
    }

    private static String a(biI biI2, String string, String string2) {
        if (biI2.k(string)) {
            return string;
        }
        return string2;
    }

    @Override
    public void e(biI biI2) {
        if (this.i) {
            return;
        }
        this.i = true;
        assert (biI2 != null);
        this.f(biI2);
        biI2.g(bwz_0.a(biI2, "AnimStatique02", "AnimStatique"));
        biI2.i(bwz_0.a(biI2, "AnimHit02", "AnimHit"));
        biI2.e(this.c());
    }

    @Override
    public void f(biI biI2) {
        boolean bl = biI2.k("AnimMarche02");
        boolean bl2 = biI2.k("AnimCourse02");
        if (bl || bl2) {
            afX afX2 = bl ? aOA.f() : afX.g();
            afr_0 afr_02 = bl2 ? aOz.g() : afr_0.f();
            biI2.a(new agh_0(agm.a(), afX2, afr_02));
        } else {
            biI2.a(agm.a());
        }
    }

    @Override
    public boolean a(bwu_0 bwu_02) {
        if (!super.a(bwu_02)) {
            return false;
        }
        return this.h.gO() == ((bwz_0)bwu_02).h.gO();
    }

    @Override
    protected String b() {
        return bwz_0.a(this.h.bv(), "AnimStatique02-Fin", "AnimStatique");
    }

    @Override
    protected String c() {
        biI biI2 = this.h.bv();
        return bwz_0.a(biI2, "AnimStatique02-Debut", biI2.ab());
    }
}

