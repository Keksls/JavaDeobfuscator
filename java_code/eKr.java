/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

public class eKr
extends eKp {
    public static final eKp a = new eKr();

    private eKp a() {
        return eKt.a;
    }

    private fiz<fio_0> b(epq_2 epq_22, eKq eKq2, short s2) {
        return this.a().a(epq_22, eKq2, s2);
    }

    @Override
    public fiz<fio_0> a(epq_2 epq_22, eKq eKq2, short s2) {
        fig fig2 = epq_22.a(fid.b, (byte)0);
        if (fig2 == null) {
            return this.b(epq_22, eKq2, s2);
        }
        fiz<? extends fio_0> fiz2 = epq_22.hr();
        short s3 = eKq2.d();
        fiz<fio_0> fiz3 = new fiz<fio_0>(s3, fiz2.a(), fiz2.e(), true, false, false);
        Iterator iterator = fiz2.iterator();
        while (iterator.hasNext()) {
            fio_0 fio_02;
            fio_0 fio_03 = fio_02 = eKq2.j() ? (fio_0)((fio_0)iterator.next()).aP_() : (fio_0)iterator.next();
            if (eKq2.j()) {
                fio_02.c(abd_1.c());
            }
            if (fio_02 == null || fio_02.r() == null || ((fin_0)fio_02.r()).w() && !eKq2.k() || !eKq2.m() && !Optional.ofNullable(epq_22.dz()).map(fiO::e).orElse(new ArrayList()).contains(((fin_0)fio_02.r()).i())) continue;
            try {
                ((uf_0)fiz3).a(fio_02);
            }
            catch (Exception exception) {
                b.error((Object)("Unable to add spellLevel " + fio_02 + "to double"), (Throwable)exception);
            }
        }
        if (fiz3.m()) {
            return this.b(epq_22, eKq2, s2);
        }
        return fiz3;
    }
}

