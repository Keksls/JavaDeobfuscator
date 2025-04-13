/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bKa
 */
public class bka_1
extends ezx_0 {
    private static final Logger a = Logger.getLogger(bka_1.class);

    public bka_1(fac_0 fac_02) {
        super(fac_02);
    }

    @Override
    public void a(long l) {
        fac_0 fac_02 = this.b();
        if (fac_02 == null) {
            a.error((Object)"Propri\u00e9taire d'un item \u00e0 xp inconnu !");
            return;
        }
        ezv_0 ezv_02 = fac_02.x();
        long l2 = ezv_02.b();
        short s2 = ezv_02.c();
        super.a(l);
        long l3 = ezv_02.f().a(ezv_02.c() + 1) - l;
        String string = ((exk_2)this.b()).T().e();
        int n = ezv_02.c() - s2;
        long l4 = l - l2;
        aUh.b("infoPop.xpGain", string, l4, l3, aug_0.g, n);
    }
}

