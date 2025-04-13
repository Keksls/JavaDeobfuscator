/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aXX
 */
public final class axx_0
extends aXj {
    private static final Logger a = Logger.getLogger(axx_0.class);
    private final String[] b;
    private final byte c;

    public axx_0(byte by, String ... stringArray) {
        this.c = by;
        this.b = stringArray;
    }

    @Override
    public boolean a() {
        return this.b.length == 1;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.c) {
                case 0: {
                    this.a(aaw_22);
                    break;
                }
                case 1: {
                    this.b(aaw_22);
                }
            }
        }
        catch (Exception exception) {
            a.error((Object)"Impossible d'executer la commande, Exception : ", (Throwable)exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        int n = Integer.parseInt(this.b[0]);
        clb_1 clb_12 = new clb_1();
        clb_12.b(n);
        aaw_22.c(clb_12);
    }

    private void b(aaw_2 aaw_22) {
        int n = Integer.parseInt(this.b[0]);
        Pt pt = new Pt();
        pt.a((short)62);
        pt.a((byte)3);
        pt.a(n);
        aaw_22.c(pt);
    }
}

