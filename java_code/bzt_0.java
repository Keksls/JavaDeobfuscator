/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZT
 */
final class bzt_0
extends cap_2 {
    private static final Logger c = Logger.getLogger(bzt_0.class);
    private static final String d = "\u0110";
    public static final String a = "fontNarrow28BoldBordered";
    private static final String g = "displayFlyingValue";
    private static final String h = "Affiche un visuel correspondant a l'effet (valeur au dessus de la cible, gfx de l'etat correspondant...)";
    private static final akf_1[] i = new akf_1[]{new akf_1("R", null, akg_2.e, false), new akf_1("G", null, akg_2.e, false), new akf_1("B", null, akg_2.e, false), new akf_1("font", null, akg_2.c, false), new akf_1("suffix", null, akg_2.c, false), new akf_1("negatesValue", null, akg_2.f, true), new akf_1("size", null, akg_2.e, true), new akf_1("isHpLoss", null, akg_2.f, true), new akf_1("caster", null, akg_2.f, true), new akf_1("value", null, akg_2.e, true)};
    private final int j = 3500;
    private final int k = 5000;
    private int l = 1000;
    private static final int m = 50000;
    private static final int n = 10;
    private static final float o = 0.65f;
    private static final float p = 1.3f;

    bzt_0(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    public String a() {
        return g;
    }

    @Override
    public akf_1[] e() {
        return i;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        boolean bl;
        int n2;
        Object object;
        Object object2;
        apv_2 apv_22;
        apv_2 apv_23;
        Object object3;
        if (((bvx_0)ans_0.D().h()).a(agq_0.d)) {
            return;
        }
        float f2 = (float)this.e(0);
        float f3 = (float)this.e(1);
        float f4 = (float)this.e(2);
        float f5 = 1.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        String string = this.i(3);
        boolean bl2 = false;
        boolean bl3 = false;
        int n3 = this.b.w();
        boolean bl4 = true;
        boolean bl5 = false;
        boolean bl6 = false;
        String string2 = "";
        String string3 = null;
        boolean bl7 = false;
        bpe_0 bpe_02 = null;
        ejh_0 ejh_02 = this.b.y();
        if (ejh_02 != null && ejh_02 instanceof eGm) {
            object3 = (eGm)ejh_02;
            bpe_02 = (bpe_0)fih_0.a().a(((eGm)object3).aI());
        }
        switch (this.b.x()) {
            case 4: {
                string2 = bae.h().a("exec.absorb", new Object[0]);
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 1.0f;
                bl5 = true;
                bl4 = true;
                break;
            }
            case 1: {
                string2 = bae.h().a("exec.failed", new Object[0]);
                f5 = 1.0f;
                f6 = 0.0f;
                f7 = 0.0f;
                bl5 = true;
                bl4 = false;
                break;
            }
            case 2: {
                string2 = bae.h().a("exec.immune", new Object[0]);
                f5 = 1.0f;
                f6 = 1.0f;
                f7 = 1.0f;
                bl5 = true;
                bl4 = false;
                break;
            }
            case 13: {
                string2 = bae.h().a("exec.seduction.immunity", new Object[0]);
                f5 = 1.0f;
                f6 = 1.0f;
                f7 = 1.0f;
                bl5 = true;
                bl4 = false;
                break;
            }
            case 6: {
                bl5 = false;
                bl4 = false;
                break;
            }
            case 3: {
                string2 = bae.h().a("exec.resist", new Object[0]);
                f5 = 1.0f;
                f6 = 1.0f;
                f7 = 1.0f;
                bl5 = true;
                bl4 = false;
                break;
            }
            case 11: {
                string2 = bae.h().a("exec.seduction.resist", new Object[0]);
                f5 = 1.0f;
                f6 = 1.0f;
                f7 = 1.0f;
                bl5 = true;
                bl4 = false;
                break;
            }
            case 12: {
                string2 = bae.h().a("exec.level.too.high", new Object[0]);
                f5 = 1.0f;
                f6 = 1.0f;
                f7 = 1.0f;
                bl5 = true;
                bl4 = false;
                break;
            }
            case 0: {
                string2 = bae.h().a("exec.success", new Object[0]);
                bl5 = false;
                bl4 = true;
                break;
            }
            case 14: {
                string2 = bae.h().a("exec.seduction.success", new Object[0]);
                bl5 = true;
                bl4 = false;
                break;
            }
            case 5: {
                bl4 = false;
                if (bpe_02 == null || !bpe_02.j()) break;
                if (ejh_02.k() != null) {
                    boolean bl8 = bl7 = ((efi_0)ejh_02.k()).G_() == 21;
                }
                if (!(ejh_02.i() instanceof epq_2)) {
                    return;
                }
                object3 = (epq_2)ejh_02.i();
                if (((epq_2)object3).f(eoz_1.ah) && ejh_02.i() == ejh_02.h()) {
                    bl6 = false;
                    break;
                }
                bl6 = true;
                string3 = bpe_02.i();
                break;
            }
            case 10: {
                object3 = this.b.y();
                if (object3 != null && ((ejh_0)object3).ap() != null && azu_0.j().k() != null && azu_0.j().k().bz() != null && azu_0.j().k().bz().A() != null) {
                    int bl9 = ((ejh_0)object3).ap().e() - azu_0.j().k().bz().A().u();
                    string2 = bae.h().a("exec.regen", bl9);
                    f5 = 0.6f;
                    f6 = 0.0f;
                    f7 = 0.0f;
                    bl5 = true;
                    bl4 = false;
                    break;
                }
                bl5 = false;
                bl4 = false;
                break;
            }
            case 7: {
                int n4;
                bwh_0 bwh_02 = bwj_1.a().a(this.b.C());
                apv_23 = azu_0.j().k();
                if (bwh_02 == null || apv_23 == null || this.b.C() != apv_23.bA() || !(this.b instanceof bbN)) break;
                apv_22 = bwh_02.e(this.b.h());
                object2 = bwh_02.e(this.b.t());
                if (apv_22 == null) break;
                object = object2 != null && ((epq_2)apv_22).a_() != ((epq_2)object2).a_() ? ((epq_2)apv_22).P_().c(((epq_2)object2).P_()) : ((epq_2)apv_22).F();
                n2 = object.a();
                switch (n2) {
                    case 1: {
                        n4 = anr_0.ah[0];
                        break;
                    }
                    case 3: {
                        n4 = anr_0.ah[1];
                        break;
                    }
                    case 5: {
                        n4 = anr_0.ah[2];
                        break;
                    }
                    case 7: {
                        n4 = anr_0.ah[3];
                        break;
                    }
                    default: {
                        return;
                    }
                }
                FreeParticleSystem freeParticleSystem = aij_0.a().a(n4);
                freeParticleSystem.a(((blx_1)apv_22).bv());
                freeParticleSystem.a(((blx_1)apv_22).bA());
                aik_0.a().b(freeParticleSystem);
            }
        }
        int n5 = 20;
        boolean bl10 = false;
        if (n > 5) {
            bl2 = this.l(5);
        }
        if (n > 6) {
            n5 = Math.max(1, this.d(6));
        }
        if (n > 7) {
            bl = this.l(7);
        }
        if (n > 8) {
            bl3 = this.l(8);
        }
        if (n > 9) {
            n3 = this.d(9);
        }
        apv_23 = null;
        apv_22 = bl3 ? bhf_1.a().a(this.b.t()) : bhf_1.a().a(this.b.h());
        if (apv_22 != null) {
            if (apv_22.at()) {
                apv_23 = apv_22;
            }
        } else {
            apv_23 = bl3 ? this.b.y().h() : this.b.y().i();
        }
        if (apv_23 == null) {
            return;
        }
        if (apv_23 instanceof blx_1 && (object2 = bmf_2.a().c(((blx_1)apv_23).a_())) == null) {
            return;
        }
        object2 = this.i(4);
        if (bl && biL.a(this.b)) {
            object2 = (String)object2 + d;
        }
        object = (bl2 ? "-" : "+") + bae.h().a((long)n3) + (String)object2;
        So so = this.b.y().m();
        if (so instanceof eFr) {
            n2 = ((eFr)so).k();
            if (!aPc.f().b(n2)) {
                return;
            }
        }
        if (bl5 && !string2.isEmpty()) {
            this.a(f5, f6, f7, bzt_0.g(), false, 0, apv_23, string2);
        }
        if (bl4) {
            ayn_2 ayn_22 = string.isEmpty() ? bzt_0.g() : ayq_1.a(string, 0, n5);
            this.a(f2, f3, f4, ayn_22, bl, n3, apv_23, (String)object);
        }
        if (bl6 && string3 != null) {
            this.a(string3, apv_23, bl7);
        }
    }

    private static ayn_2 g() {
        return fpm_0.b().g().d(a).c();
    }

    private void a(String string, apv_2 apv_22, boolean bl) {
        zt_0 zt_02;
        Object object;
        if (apv_22 instanceof biI && box_2.a(((biI)apv_22).bI())) {
            return;
        }
        if (bl) {
            object = null;
            if (object == null) {
                return;
            }
            fvE fvE2 = (fvE)((fyy_0)object).a("numBonusLabel");
            zt_02 = new zq_0(ans_0.D().c(), new fjk_1(fvE2));
        } else {
            zt_02 = new zp_0();
        }
        object = new zo_0(string, 32, 32, zt_02, 5000);
        ((zo_0)object).a(apv_22);
        int n = zd_0.a().b(apv_22, 4);
        ((zn_0)object).g(n * 1000);
        zd_0.a().a((za_0)object);
    }

    private void a(float f2, float f3, float f4, ayn_2 ayn_22, boolean bl, int n, apv_2 apv_22, String string) {
        int n2;
        ZD zD;
        int n3;
        int n4;
        cam_2 cam_22 = new cam_2(apv_22);
        int n5 = zd_0.a().b(cam_22, 3);
        switch (n5) {
            case 0: {
                n4 = 0;
                n3 = 0;
                break;
            }
            case 1: {
                n4 = Hw.b(-20, -10);
                n3 = Hw.b(-20, -10);
                break;
            }
            case 2: {
                n4 = Hw.b(10, 20);
                n3 = Hw.b(-20, -10);
                break;
            }
            default: {
                n4 = Hw.b(-20, 20);
                n3 = Hw.b(-20, -1);
            }
        }
        if (bl) {
            zD = new zw_0(0, 400, n4, 80 + n3, bzt_0.b(n), 50);
            n2 = 1000;
        } else {
            zD = new zv_0(n4, n3, bzt_0.b(n));
            n2 = 3500;
        }
        zu_0 zu_02 = new zu_0(ayn_22, string, zD, n2);
        zu_02.b(f2, f3, f4, 1.0f);
        zu_02.a(cam_22);
        zu_02.g(n5 * 100);
        zd_0.a().a(zu_02);
    }

    private static float b(int n) {
        int n2 = Hw.a(n, 0, 50000);
        int n3 = n2 * 10 / 50000;
        float f2 = (float)n3 / 10.0f;
        return Hw.a(0.65f, 1.3f, f2);
    }

    @Override
    public String b() {
        return h;
    }
}

