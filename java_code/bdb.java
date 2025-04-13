/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class bdb
implements eBs,
eBu {
    public static final bdb a = new bdb();

    @Override
    public void a(eBt eBt2) {
        Optional optional = bhh_1.a(end_0.b);
        if (!eBt2.i()) {
            return;
        }
        if (optional.isPresent()) {
            ebe_0 ebe_02 = (ebe_0)optional.get();
            ebe_02.c(-eBt2.d());
        } else {
            ebe_0 ebe_03 = new ebe_0();
            ebe_03.c(-eBt2.d());
            bhh_1.a(ebe_03);
        }
    }

    @Override
    public void b(eBt eBt2) {
        Optional optional = bhh_1.a(end_0.b);
        if (!eBt2.i()) {
            return;
        }
        if (optional.isPresent()) {
            ebe_0 ebe_02 = (ebe_0)optional.get();
            ebe_02.c(eBt2.d());
        } else {
            ebe_0 ebe_03 = new ebe_0();
            ebe_03.c(eBt2.d());
            bhh_1.a(ebe_03);
        }
    }

    @Override
    public void a(eBt eBt2, long l) {
        Optional optional;
        if (!eBt2.i()) {
            return;
        }
        int n = eBt2.d() - Oz.c.a(l);
        if (n > 0 && (optional = bhh_1.a(end_0.b)).isPresent()) {
            ebe_0 ebe_02 = (ebe_0)optional.get();
            ebe_02.c(n);
        }
    }

    @Override
    public void c(eBt eBt2) {
    }

    @Override
    public void d(eBt eBt2) {
    }

    @Override
    public void e(eBt eBt2) {
    }

    @Override
    public void f(eBt eBt2) {
    }

    @Override
    public void g(eBt eBt2) {
        if (!eBt2.i()) {
            Optional optional = bhh_1.a(end_0.b);
            if (optional.isPresent()) {
                ebe_0 ebe_02 = (ebe_0)optional.get();
                ebe_02.c(-eBt2.d());
            } else {
                ebe_0 ebe_03 = new ebe_0();
                ebe_03.c(-eBt2.d());
                bhh_1.a(ebe_03);
            }
        }
    }
}

