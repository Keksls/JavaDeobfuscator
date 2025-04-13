/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGx
 */
public class egx_0
extends ejh_0 {
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 4;
    public static final int A = 5;
    public static final int B = 6;
    public static final int C = 7;
    public static final int D = 8;
    public static final int E = 9;
    public static final int F = 10;
    public static final int G = 11;
    private static final aqr_2 H = new eFw(new eFv("Direction/Type", new eFu(" 0:cellule, 1-2-3-4:NW-NE-SE-SW, 5:rand, ,6:sameCaster, 7:invCaster, 8:turnCasterTowardTarget, 9:turnTargetTowardCaster10:perpendiculaire caster, 11:inverse target", eFx.c)));

    @Override
    public aqr_2 c_() {
        return H;
    }

    public egx_0 aD() {
        egx_0 egx_02 = new egx_0();
        return egx_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.f == null) {
            this.j(true);
            return;
        }
        aej_2 aej_22 = aej_2.a(this.m);
        if (aej_22 == aej_2.k) {
            this.j(true);
            return;
        }
        aej_2 aej_23 = this.f.F();
        this.f.a(aej_22);
        if (aej_23 == aej_22) {
            this.j(true);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        aej_2 aej_22;
        short s2 = this.aZ();
        this.m = this.c != null ? ((efh_0)this.c).a(0, s2, eFb.a) : 5;
        if (this.m == 5) {
            this.m = xc_0.a(1, 4);
        }
        if (this.f == null) {
            this.m = aej_2.k.a();
            return;
        }
        switch (this.m) {
            case 0: {
                afs_2 afs_22 = new afs_2(this.f.G(), this.f.H(), this.f.I(), this.g.d(), this.g.e(), this.g.f());
                aej_22 = afs_22.h();
                break;
            }
            case 2: {
                aej_22 = aej_2.h;
                break;
            }
            case 1: {
                aej_22 = aej_2.f;
                break;
            }
            case 3: {
                aej_22 = aej_2.b;
                break;
            }
            case 4: {
                aej_22 = aej_2.d;
                break;
            }
            case 6: {
                aej_22 = this.e.F();
                break;
            }
            case 7: {
                aej_22 = this.e.F().b();
                break;
            }
            case 8: {
                afs_2 afs_23 = new afs_2(this.e.G(), this.e.H(), this.e.I(), this.f.G(), this.f.H(), this.f.I());
                aej_22 = afs_23.h();
                this.f = this.e;
                break;
            }
            case 9: {
                afs_2 afs_24 = new afs_2(this.f.G(), this.f.H(), this.f.I(), this.e.G(), this.e.H(), this.e.I());
                aej_22 = afs_24.h();
                break;
            }
            case 10: {
                aej_2 aej_23 = this.e.F();
                aej_22 = aej_2.a(aej_23.n, aej_23.m);
                break;
            }
            case 11: {
                aej_22 = this.f.F().b();
                break;
            }
            default: {
                aej_22 = aej_2.k;
            }
        }
        if (this.f == null || this.f.a(eoz_1.Y)) {
            aej_22 = aej_2.k;
        }
        this.m = aej_22.a();
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

