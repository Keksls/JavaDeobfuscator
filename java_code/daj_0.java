/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from daj
 */
public class daj_0
implements ahr_1 {
    private static final daj_0 a = new daj_0();
    private static final Logger b = Logger.getLogger(daj_0.class);
    private ans_1 c;

    public static daj_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
        return true;
    }

    public void a(int n) {
        fyy_0 fyy_02 = fpm_0.b().h().d("jailInfoDialog");
        if (fyy_02 == null) {
            return;
        }
        fsk_0 fsk_02 = (fsk_0)fyy_02.a("timerImage");
        if (fsk_02 == null) {
            return;
        }
        int n2 = 250;
        int n3 = n / 250;
        if (n3 % 2 != 0) {
            ++n3;
        }
        fqp fqp2 = fsk_02.getAppearance();
        fqp2.addTween(new fjp_2(azf_2.e, azf_2.o, fqp2, 0, 250, n3, true, fjw_2.b));
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new dak(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("jailInfoDialog", cfi_0.a("jailInfoDialog"), 8193L, (short)10000);
            fpm_0.b().a("wakfu.jailInfo", chy_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().e("wakfu.jailInfo");
            fpm_0.b().o("jailInfoDialog");
        }
    }
}

