/*
 * Decompiled with CFR 0.152.
 */
public final class aXC
extends aXj {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    private final int f;
    private final String[] g;

    public aXC(int n, String ... stringArray) {
        this.g = stringArray;
        this.f = n;
    }

    @Override
    public boolean a() {
        switch (this.f) {
            case 2: 
            case 3: {
                return this.g.length == 2;
            }
            case 4: 
            case 5: {
                return this.g.length == 1;
            }
            case 1: {
                return true;
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
            switch (this.f) {
                case 2: {
                    this.c(aaw_22);
                    break;
                }
                case 3: {
                    this.d(aaw_22);
                    break;
                }
                case 4: {
                    this.b(aaw_22);
                    break;
                }
                case 5: {
                    this.a(aaw_22);
                    break;
                }
                case 1: {
                    aXC.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de calendrier " + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)173);
        pt.a(Integer.parseInt(this.g[0]));
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)411);
        pt.a(Integer.parseInt(this.g[0]));
        aaw_22.c(pt);
    }

    private static void c() {
        aXC.a("(-changeNation | -cn) protectorId newNationId : change nation of protector\r\n(-addMoney | -am) protectorId amount : give money to protector\r\n");
    }

    private void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)95);
        pt.a(Integer.parseInt(this.g[0]));
        pt.a(Integer.parseInt(this.g[1]));
        aaw_22.c(pt);
    }

    private void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)344);
        pt.a(Integer.parseInt(this.g[0]));
        pt.a(Integer.parseInt(this.g[1]));
        aaw_22.c(pt);
    }
}

