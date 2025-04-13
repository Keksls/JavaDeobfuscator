/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from bgM
 */
public final class bgm_2
implements rv_0 {
    private static final Logger a = Logger.getLogger(bgm_2.class);
    private final bmv_1 b;
    private int c;

    public bgm_2(bmv_1 bmv_12) {
        this.b = bmv_12;
        this.c = this.b.c(ekd_0.au());
    }

    @Override
    public void a(rs_0 rs_02) {
        int n = rs_02.a();
        if (this.b.hh()) {
            this.a(n);
        } else {
            this.b(n);
        }
        this.c = n;
    }

    private void a(int n) {
        erb_2 erb_22 = this.b.hf();
        if (erb_22 == null) {
            return;
        }
        afv afv2 = ((bnh_1)erb_22).bv().c();
        this.a(n, afv2, 1045, 1045);
    }

    private void b(int n) {
        afv afv2 = this.b.e();
        this.a(n, afv2, 10022, 10022);
    }

    private void a(int n, abz_0 abz_02, int n2, int n3) {
        if (abz_02 == null) {
            return;
        }
        try {
            String string = azs_0.a().a("ANMInteractiveElementPath");
            if (this.d(n)) {
                string = String.format(string, n3);
            } else if (this.c(n)) {
                string = String.format(string, n2);
            } else {
                return;
            }
            abz_02.a(string);
            abz_02.a(string, true);
            abz_02.a(atm_1.b, new bog_2(((bnh_1)this.b.aq()).ew().a()).e());
        }
        catch (gm_0 gm_02) {
            a.error((Object)"Exception levee", (Throwable)gm_02);
        }
        catch (IOException iOException) {
            a.error((Object)"Exception levee", (Throwable)iOException);
        }
    }

    private boolean c(int n) {
        return n > 1 && this.c == 1;
    }

    private boolean d(int n) {
        return n == 1 && this.c > 1;
    }
}

