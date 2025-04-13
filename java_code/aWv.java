/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class aWv
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    private final int l;
    private final String[] m;

    public aWv(int n, String ... stringArray) {
        this.m = (String[])stringArray.clone();
        this.l = n;
    }

    @Override
    public boolean a() {
        switch (this.l) {
            case 0: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 7: 
            case 9: {
                return this.m.length == 0;
            }
            case 1: 
            case 6: 
            case 8: 
            case 10: {
                return this.m.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.l) {
                case 0: {
                    aWv.i();
                    break;
                }
                case 1: {
                    this.h();
                    break;
                }
                case 2: {
                    aWv.c();
                    break;
                }
                case 3: {
                    aWv.g();
                    break;
                }
                case 4: {
                    aWv.j();
                    break;
                }
                case 5: {
                    aWv.k();
                    break;
                }
                case 6: {
                    this.l();
                    break;
                }
                case 7: {
                    this.m();
                    break;
                }
                case 8: {
                    this.f();
                    break;
                }
                case 9: {
                    this.e();
                    break;
                }
                case 10: {
                    this.d();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de fight (client) " + exception);
        }
    }

    private static void c() {
        aWv.a("fight ('-showBonusPointSelectbable' | '-sbps') : show available timeline bonuses");
        aWv.a("fight ('-selectBonus' | '-sb') : request to server to select a bonus");
        aWv.a("fight -win : win the fight by victory of your character");
        aWv.a("fight -flee : flee of fights, other stay in");
        aWv.a("fight -ca idDonjon : launch specified arcade fight");
        aWv.a("fight -cb : launch Boufbawl fight");
        aWv.a("fight ('-createCollectFight' | '-ccf') : launch capt'chat fight");
        aWv.a("fight ('-collectFightRandomValue' | '-cfrv') value : change 'normal' percent chance to proc capt'chat fight");
        aWv.a("fight ('-setReconnectionTurnTimeout' | '-srtt') value : Change le nombre de tour limite pour se reconnecter en combat");
    }

    private void d() {
        int n = Integer.parseInt(this.m[0]);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)222);
        pt.a(n);
        aaw_22.c(pt);
    }

    private void e() {
        aWv.a((short)206);
    }

    private void f() {
        int n = Integer.parseInt(this.m[0]);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)390);
        pt.a(n);
        aaw_22.c(pt);
    }

    private static void g() {
        aWv.a((short)103);
    }

    private void h() {
        int n = Integer.parseInt(this.m[0]);
        cnk_0 cnk_02 = new cnk_0();
        cnk_02.b(n);
        azu_0.j().K().c(cnk_02);
    }

    private static void i() {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            aWv.a("Pas de combat, pas de bonus");
        } else {
            List<efh_0> list = bvx_22.A().a().a(bmr_12.a_(), bvx_22.y(bmr_12));
            for (efh_0 efh_02 : list) {
                String string = bae.h().a(30, (long)efh_02.i(), new Object[0]);
                aWv.a("Id : " + efh_02.i() + " : " + string);
            }
        }
    }

    private static void j() {
        aWv.a((short)228);
    }

    private static void k() {
        aWv.a((short)241);
    }

    private void l() {
        int n = Integer.parseInt(this.m[0]);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)311);
        pt.a(n);
        aaw_22.c(pt);
    }

    private void m() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)128);
        aaw_22.c(pt);
    }

    private static void a(short s2) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a(s2);
        aaw_22.c(pt);
    }
}

