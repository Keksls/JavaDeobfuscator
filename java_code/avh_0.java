/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aVH
 */
public final class avh_0
extends aXj {
    private static final Logger c = Logger.getLogger(avh_0.class);
    public static final int a = 0;
    public static final int b = 1;
    private final int d;
    private final String[] e;

    public avh_0(int n, String ... stringArray) {
        this.d = n;
        this.e = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.d) {
            case 1: {
                return this.e.length == 0;
            }
            case 0: {
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
                case 0: {
                    this.c();
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
        pt.a((short)47);
        aaw_22.c(pt);
    }

    private void c() {
        avh_0.a("-restat : active le restat des aptitude");
    }
}

