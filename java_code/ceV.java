/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ceV
implements ahr_1 {
    private static final Logger a = Logger.getLogger(ceV.class);
    private final cez_0 b;

    public ceV(cez_0 cez_02) {
        this.b = cez_02;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 1: {
                Pm pm = (Pm)adt_12;
                this.b.a(pm.b());
                return false;
            }
            case 36: {
                Pp pp = (Pp)adt_12;
                boolean bl = pp.b();
                byte[] byArray = pp.c();
                if (!bl) {
                    this.b.a(byArray);
                }
                return false;
            }
            case 369: {
                Pn pn = (Pn)adt_12;
                this.b.b(pn.b());
                return false;
            }
            case 360: {
                Pr pr = (Pr)adt_12;
                String string = avm_0.a(pr.c());
                switch (pr.b()) {
                    case 0: {
                        aVo.a().b(string);
                        break;
                    }
                    case 1: {
                        aVo.a().a(string);
                        break;
                    }
                    case 2: {
                        aVo.a().d(string);
                        break;
                    }
                    default: {
                        a.error((Object)("Type de message inconnu " + pr.b()));
                    }
                }
                return false;
            }
            case 346: {
                pu_0 pu_02 = (pu_0)adt_12;
                String string = avm_0.a(pu_02.c());
                switch (pu_02.b()) {
                    case 0: {
                        aVo.a().b(string);
                        break;
                    }
                    case 1: {
                        aVo.a().a(string);
                        break;
                    }
                    case 2: {
                        aVo.a().d(string);
                        break;
                    }
                    case 3: {
                        aVo.a().a(string, pu_02.d());
                        break;
                    }
                    default: {
                        a.error((Object)("Type de message inconnu " + pu_02.b()));
                    }
                }
                return false;
            }
            case 356: {
                PA pA = (PA)adt_12;
                byte by = pA.b();
                PB pB = new PB();
                pB.a(by);
                this.b.K().c(pB);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

