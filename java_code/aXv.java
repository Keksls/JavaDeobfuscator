/*
 * Decompiled with CFR 0.152.
 */
public final class aXv
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private final int i;
    private final String[] j;

    public aXv(int n, String ... stringArray) {
        this.i = n;
        this.j = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.i) {
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return this.j.length == 1;
            }
            case 0: 
            case 1: 
            case 6: 
            case 7: {
                return this.j.length == 0;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.cG().a(exh_2.w) == null && (this.i == 2 || this.i == 3 || this.i == 1)) {
            aVo.a().d("Il faut avoir un familier \u00e9quip\u00e9!");
            return;
        }
        try {
            switch (this.i) {
                case 0: {
                    this.c();
                    break;
                }
                case 3: {
                    this.f(aaw_22);
                    break;
                }
                case 1: {
                    aXv.g(aaw_22);
                    break;
                }
                case 2: {
                    this.e(aaw_22);
                    break;
                }
                case 4: {
                    this.a(aaw_22);
                    break;
                }
                case 5: {
                    this.b(aaw_22);
                    break;
                }
                case 6: {
                    this.d(aaw_22);
                    break;
                }
                case 7: {
                    this.c(aaw_22);
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me d'une commande" + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)394);
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)240);
        aaw_22.c(pt);
    }

    private void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)306);
        aaw_22.c(pt);
    }

    private void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)79);
        aaw_22.c(pt);
    }

    private void e(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)271);
        pt.a(Integer.parseInt(this.j[0]));
        aaw_22.c(pt);
    }

    private void f(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)197);
        pt.a(Integer.parseInt(this.j[0]));
        aaw_22.c(pt);
    }

    private static void g(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)27);
        aaw_22.c(pt);
    }

    private void c() {
        aXv.a("pet ('help'|'h') : display command help");
        aXv.a("pet ('xp') xpDelta : add xpDelta to equipped pet xp");
        aXv.a("pet ('health'|'hp') healthValue : set pet health to healthValue");
        aXv.a("pet ('forceFeed'|'ff') : force equipped pet to be fed");
        aXv.a("pet ('learnSkin'|'ls') skinId : add pet skin to account cosmetic inventory");
        aXv.a("pet ('removeSkin'|'rs') skinId : remove pet skin from account cosmetic inventory");
        aXv.a("pet ('learnAllSkins'|'las') : add all pet skins to account cosmetic inventory");
        aXv.a("pet ('removeAllSkins'|'ras') : remove all pet skins from account cosmetic inventory");
    }
}

