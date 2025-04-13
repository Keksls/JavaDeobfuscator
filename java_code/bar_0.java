/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.Collection;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bar
 */
public class bar_0
extends ban {
    private static final bwi_0 f = new bwi_0();
    private static final int g = 250;
    private static final int h = 250;
    private final String i = "execution_Time";
    private static final int m = -2;
    private final byte n;
    private final boolean o;
    private int p;

    public bar_0(int n, int n2, int n3, byte by, int n4, boolean bl) {
        super(n, n2, n3, n4);
        this.n = by;
        this.o = bl;
    }

    @Override
    public long o() {
        int n;
        blx_1 blx_12 = this.d(this.h());
        if (blx_12 == null) {
            return 0L;
        }
        boolean bl = this.d.isEmpty();
        switch (this.n) {
            case 0: {
                n = this.i(blx_12);
                break;
            }
            case 1: {
                n = this.h(blx_12);
                break;
            }
            case 2: {
                n = this.b(blx_12);
                break;
            }
            case 3: {
                n = this.a(blx_12);
                break;
            }
            default: {
                n = 0;
            }
        }
        return bl ? 0L : (long)n;
    }

    private int a(blx_1 blx_12) {
        String string;
        if (blx_12 == null) {
            return 0;
        }
        biI biI2 = blx_12.bv();
        if (!biI2.k(string = "AnimFuite")) {
            string = "AnimStatique";
        }
        biI2.e(string);
        int n = biI2.j(string);
        int n2 = n == Integer.MAX_VALUE ? 0 : n;
        this.d(blx_12);
        return n2;
    }

    private int b(blx_1 blx_12) {
        if (blx_12 == null) {
            return 0;
        }
        biI biI2 = blx_12.bv();
        if (this.u()) {
            if (blx_12 instanceof bnh_1) {
                if (this.n() == null || this.n().af_().n()) {
                    this.e(blx_12);
                }
            } else {
                this.c(blx_12);
            }
            if (!blx_12.a(eoz_1.m)) {
                biI2.a((byte)2);
            }
        }
        if (this.p > 0) {
            int n = Math.min(this.p, 30000);
            this.n().s().a(this);
            adi_2.a().a(this, n, -2, 1L);
            return n;
        }
        int n = biI2.j("AnimMort");
        int n2 = n > 0 ? n : 250;
        int n3 = Math.min(n2, 30000);
        this.n().s().a(this);
        adi_2.a().a(this, n3, -2, 1L);
        return Math.min(n3, 250);
    }

    private void c(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        boolean bl = this.g(blx_12);
        if (!bl) {
            this.f(blx_12);
        }
    }

    private boolean u() {
        return this.o;
    }

    private void d(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        biI biI2 = blx_12.bv();
        biI2.g("AnimStatique");
        biI2.bP();
    }

    private void e(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        int n = this.p();
        bar_0.a(blx_12, n);
    }

    public static void a(blx_1 blx_12, int n) {
        if (blx_12 == null) {
            return;
        }
        biI biI2 = blx_12.bv();
        biI2.e("AnimKO-SortieHS");
        FreeParticleSystem freeParticleSystem = aij_0.a().a(blx_12.cb());
        if (freeParticleSystem == null) {
            a.warn((Object)("le system de particule " + blx_12.cb() + "n'exsite pas"));
            return;
        }
        freeParticleSystem.a(biI2);
        freeParticleSystem.a(n);
        aik_0.a().b(freeParticleSystem);
    }

    private void f(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        FreeParticleSystem freeParticleSystem = aij_0.a().a(15000);
        cdw_0.n().d(15384L);
        if (freeParticleSystem == null) {
            a.warn((Object)"le system de particule 15000n'exsite pas");
            return;
        }
        freeParticleSystem.a(blx_12.bv());
        freeParticleSystem.a(this.p());
        aik_0.a().b(freeParticleSystem);
    }

    private boolean g(blx_1 blx_12) {
        if (blx_12 == null) {
            return false;
        }
        int n = blx_12.bG();
        if (n == -1) {
            blx_12.bv().e("AnimMort");
            return true;
        }
        akx_2 akx_22 = aks_1.a().a(n);
        if (akx_22 == null) {
            akx_22 = aks_1.a().a(n, (akr_1[])null, true);
        }
        if (akx_22 == null) {
            a.warn((Object)("Impossible charger le script de mort d'id " + n));
            return false;
        }
        LuaState luaState = akx_22.k();
        try {
            luaState.pushObjectValue((Object)blx_12.a_());
            luaState.setGlobal("killedId");
            luaState.pushObjectValue((Object)blx_12.bA());
            luaState.setGlobal("fightId");
        }
        catch (LuaException luaException) {
            a.error((Object)"Exception levee", (Throwable)luaException);
        }
        luaState.resume(0);
        akr_2 akr_22 = akx_22.c("execution_Time");
        if (akr_22 != null && akr_22.a() == akg_2.e) {
            this.p = ((Double)akr_22.b()).intValue();
        }
        return true;
    }

    private int h(blx_1 blx_12) {
        if (blx_12 == null) {
            return 0;
        }
        biI biI2 = blx_12.bv();
        int n = 0;
        if (this.o) {
            if (biI2.k("AnimKO-SortieOK")) {
                n = biI2.j("AnimKO-SortieOK");
                biI2.e("AnimKO-SortieOK");
            } else {
                biI2.e("AnimStatique");
            }
            biI2.g(this.a(biI2, "AnimStatique02", "AnimStatique"));
        }
        biI2.a((byte)0);
        biI2.c(blx_12.Y());
        biI2.c(blx_12.F());
        return n;
    }

    private int i(blx_1 blx_12) {
        Collection collection;
        if (blx_12 == null) {
            return 0;
        }
        boolean bl = this.o;
        int n = bar_0.a(blx_12, bl);
        long l = blx_12 instanceof bmv_1 ? ((bmv_1)blx_12).cL() : -1L;
        bua_0.a.a(new bur_1(blx_12.a_(), blx_12.gO(), l));
        bwh_0 bwh_02 = this.n();
        if (bwh_02 instanceof bvx_2 && (collection = ((bvx_2)bwh_02).j(blx_12.Y())).size() == 1) {
            bua_0.a.a(new buf_1(l));
        }
        return n;
    }

    public static int a(blx_1 blx_12, boolean bl) {
        if (blx_12 == null) {
            return 0;
        }
        biI biI2 = blx_12.bv();
        int n = 0;
        if (bl && !blx_12.a(eoz_1.m) && !blx_12.a(eoz_1.s)) {
            if (biI2.k("AnimKO-Debut")) {
                biI2.e("AnimKO-Debut");
                n = biI2.j("AnimKO-Debut");
            }
            biI2.g("AnimKO-Boucle");
            biI2.a((byte)1);
        }
        biI2.bZ();
        biI2.ce();
        biI2.cb();
        biI2.cf();
        return n;
    }

    @Override
    protected void l() {
        if (this.n != 2) {
            this.q(this.d(this.h()));
        }
        super.l();
    }

    private void j(blx_1 blx_12) {
        switch (this.n) {
            case 0: {
                this.k(blx_12);
                break;
            }
            case 2: {
                this.l(blx_12);
                break;
            }
            case 1: {
                this.m(blx_12);
            }
        }
    }

    private void k(blx_1 blx_12) {
        if (!this.r()) {
            return;
        }
        if (blx_12 == null) {
            return;
        }
        if (blx_12.a(eoz_1.s)) {
            return;
        }
        if (blx_12.a((ru_0)eps_0.l) && blx_12.c(eps_0.l) > 0) {
            String string = bae.h().a("fight.ko", new ani_2().a().a((CharSequence)blx_12.gd()).b().r());
            f.a(string);
        }
    }

    private void l(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        if (!this.r()) {
            return;
        }
        if (blx_12.a(eoz_1.m)) {
            return;
        }
        if (this.n() != null && !this.n().af_().n()) {
            return;
        }
        if (blx_12.bo()) {
            f.a(bae.h().a("fight.endForMe", new Object[0]));
        } else {
            if (blx_12.gO() == 4378) {
                return;
            }
            String string = blx_12.a(eoz_1.ag) ? bae.h().a("fight.die.for.copies", new ani_2().a().a((CharSequence)blx_12.aq().dp()).b().r()) : bae.h().a("fight.die", new ani_2().a().a((CharSequence)blx_12.dp()).b().r());
            f.a(string);
        }
    }

    private void m(blx_1 blx_12) {
        if (!this.r()) {
            return;
        }
        if (blx_12 == null) {
            return;
        }
        String string = bae.h().a("fight.raise", new ani_2().a().a((CharSequence)blx_12.gd()).b().r());
        f.a(string);
    }

    private void n(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        if (blx_12.bz() != null) {
            this.o(blx_12);
        } else {
            this.p(blx_12);
        }
    }

    private void o(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        bvx_2 bvx_22 = blx_12.bz();
        switch (this.n) {
            case 0: {
                bvx_22.l(blx_12);
                break;
            }
            case 1: {
                bvx_22.m(blx_12);
                break;
            }
            case 3: {
                blx_12.D(true);
            }
            case 2: {
                if (!blx_12.p()) {
                    bvx_22.l(blx_12);
                }
                if (!blx_12.p()) break;
                bvx_22.m(blx_12);
            }
        }
    }

    private void p(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        switch (this.n) {
            case 0: {
                blx_12.n();
                blx_12.A(true);
                break;
            }
            case 1: {
                blx_12.q();
                blx_12.A(false);
                blx_12.a_(false);
                break;
            }
            case 2: {
                blx_12.s();
                blx_12.a_(true);
                break;
            }
            case 3: {
                blx_12.D(true);
                blx_12.s();
            }
        }
    }

    private String a(biI biI2, String string, String string2) {
        if (biI2.k(string)) {
            return string;
        }
        return string2;
    }

    private void q(blx_1 blx_12) {
        this.j(blx_12);
        this.n(blx_12);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (!(adt_12 instanceof adh_2)) {
            return true;
        }
        adh_2 adh_22 = (adh_2)adt_12;
        if (adh_22.c() == -1) {
            return super.a(adh_22);
        }
        if (adh_22.c() == -2) {
            this.n().s().b(this);
            blx_1 blx_12 = this.d(this.h());
            if (blx_12 == null) {
                return false;
            }
            this.d(blx_12);
            this.q(blx_12);
            return false;
        }
        return false;
    }
}

