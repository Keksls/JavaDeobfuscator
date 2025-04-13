/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXF
 */
public class axf_0
extends aXj {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    private final byte h;
    private final String[] i;

    public axf_0() {
        this(0, new String[0]);
    }

    public axf_0(byte by, String ... stringArray) {
        this.h = by;
        this.i = stringArray;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        switch (this.h) {
            case 0: {
                axf_0.c();
                break;
            }
            case 2: {
                this.e();
                break;
            }
            case 3: {
                this.f();
                break;
            }
            case 1: {
                this.g();
                break;
            }
            case 4: {
                axf_0.h();
                break;
            }
            case 5: {
                axf_0.i();
                break;
            }
            case 6: {
                this.d();
            }
        }
    }

    private static void c() {
        aVo.a().a("pvp :");
        aVo.a().a("pvp help | h : show this documentation");
        aVo.a().a("pvp set <amount> : set player's PvP points");
        aVo.a().a("pvp add <amount> : add amount to player's PvP points");
        aVo.a().a("pvp state <type> : change pvp state (0 : disabled, 1 : prudent, 2 : opportunistic");
        aVo.a().a("pvp recomputepoints | rp : start the weekly points calc /!\\ ranks are recomputed WITH the weekly loss of points");
        aVo.a().a("pvp rr : reset the regression score of all the players");
        aVo.a().a("pvp addMoney | am : add PvP money");
    }

    private void d() {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)495);
        pt.a(Co.c(this.i[0]));
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void e() {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)245);
        pt.a(Co.c(this.i[0]));
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void f() {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)63);
        pt.a(Co.c(this.i[0]));
        azu_0.j().K().c(pt);
    }

    private void g() {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)118);
        pt.a(Co.c(this.i[0]));
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void h() {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)15);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void i() {
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)381);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

