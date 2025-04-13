/*
 * Decompiled with CFR 0.152.
 */
public final class aVV
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final int d;
    private final String[] e;

    public aVV(int n, String ... stringArray) {
        this.e = stringArray;
        this.d = n;
    }

    @Override
    public boolean a() {
        switch (this.d) {
            case 1: {
                return this.e.length == 1;
            }
            case 0: 
            case 2: {
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
            switch (this.d) {
                case 1: {
                    this.a(aaw_22);
                    break;
                }
                case 2: {
                    this.b(aaw_22);
                    break;
                }
                case 0: {
                    this.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de check " + exception);
        }
    }

    private void c() {
        aVV.a("(--userGroup | -u) Donne des informations sur les UserGroup de la partition courante.\r\n");
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)92);
        pt.a(Integer.parseInt(this.e[0]));
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)114);
        aaw_22.c(pt);
    }
}

