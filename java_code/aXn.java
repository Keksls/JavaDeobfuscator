/*
 * Decompiled with CFR 0.152.
 */
public class aXn
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private final int g;
    private final String[] h;

    public aXn(int n, String ... stringArray) {
        this.g = n;
        this.h = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.g) {
            case 1: 
            case 2: 
            case 5: {
                return this.h.length == 1;
            }
            case 0: 
            case 3: 
            case 4: {
                return this.h.length == 0;
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
        try {
            switch (this.g) {
                case 0: {
                    aXn.c();
                    break;
                }
                case 1: {
                    this.a(aaw_22);
                    break;
                }
                case 2: {
                    this.b(aaw_22);
                    break;
                }
                case 3: {
                    this.c(aaw_22);
                    break;
                }
                case 4: {
                    this.d(aaw_22);
                    break;
                }
                case 5: {
                    this.e(aaw_22);
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
        pt.a((short)408);
        pt.a(Integer.parseInt(this.h[0]));
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)28);
        pt.a(Integer.parseInt(this.h[0]));
        aaw_22.c(pt);
    }

    private void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)379);
        aaw_22.c(pt);
    }

    private void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)120);
        aaw_22.c(pt);
    }

    private void e(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)319);
        pt.a(Integer.parseInt(this.h[0]));
        aaw_22.c(pt);
    }

    private static void c() {
        aXn.a("mount ('help'|'h') : display command help");
        aXn.a("mount ('learnSkin'|'ls') skinId : add an skin to the cosmetic inventory, bypass all checks");
        aXn.a("mount ('removeSkin'|'rs') skinId : remove a skin from the cosmetic inventory");
        aXn.a("mount ('learnAllSkins'|'las') : add all mount skins to account cosmetic inventory");
        aXn.a("mount ('removeAllSkins'|'ras') : remove all mount skins from account cosmetic inventory");
        aXn.a("mount ('health'|'hp') hpValue : set equipped mount hp to given value");
    }
}

