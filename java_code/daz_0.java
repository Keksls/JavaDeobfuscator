/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from daZ
 */
public class daz_0
implements ahr_1 {
    private static final daz_0 a = new daz_0();
    private static Logger b = Logger.getLogger(daz_0.class);
    private String c;
    private long d;
    private String e;
    private boolean f;
    private ans_1 g;

    public static daz_0 a() {
        return a;
    }

    public void a(String string, long l, String string2) {
        if (!azu_0.j().c(this)) {
            this.c = string;
            this.d = l;
            this.e = string2;
            azu_0.j().a(this);
        }
    }

    void c() {
        if (this.f) {
            fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("contactModerator.suretoclose", new Object[0]), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new dba_0(this));
        } else {
            azu_0.j().b(this);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18360: {
                this.c();
                return false;
            }
            case 18283: {
                anw_1 anw_12 = (anw_1)adt_12;
                byte by = anw_12.b();
                int n = aUxx.a().u();
                String string = "contactModerator.closed";
                switch (by) {
                    case 4: {
                        string = "contactModerator.closed";
                        break;
                    }
                    case 5: {
                        string = "contactModerator.disconnected";
                    }
                }
                aUm aUm2 = new aUm(bae.h().a(string, new Object[0]));
                aUm2.a(aup_0.d);
                aUm2.a(n);
                aul_0.a().a(aUm2);
                this.f = false;
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.g = new dbb_0(this);
            fpm_0.b().a(this.g);
            fpm_0.b().a("moderatorChatDialog", cfi_0.a("moderatorChatDialog"), 40977L, (short)10000);
            fpm_0.b().a("wakfu.moderatorChat", cHQ.class);
            dfw dfw2 = new dfw(16701, this.c, new dbc_0(this.e, this.d, this.c));
            add_2.b().a(dfw2);
            this.f = true;
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.g);
            dey.b();
            fpm_0.b().o("moderatorChatDialog");
            fpm_0.b().e("wakfu.moderatorChat");
            if (this.f) {
                PG pG = new PG();
                azu_0.j().K().c(pG);
                this.f = false;
            }
        }
    }
}

