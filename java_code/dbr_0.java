/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from dbR
 */
public class dbr_0
implements ahr_1 {
    private static final dbr_0 a = new dbr_0();
    private static final Logger b = Logger.getLogger(dbr_0.class);
    private final bQA c = new dbs_0(this);
    private ans_1 d;
    private Set<bQF> e = new HashSet<bQF>();

    public static dbr_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16240: {
                dfc dfc2 = (dfc)adt_12;
                bmr_1 bmr_12 = azu_0.j().k();
                short s2 = bmr_12.eM();
                short s3 = dfc2.e();
                if (s2 != s3) {
                    bmr_12.e(s3);
                    cmn cmn2 = new cmn(bmr_12.a_(), ft_1.g, true, fk_2.i().a(s3).j());
                    azu_0.j().K().c(cmn2);
                }
                return false;
            }
            case 16766: {
                bQF bQF2 = (bQF)((dfc)adt_12).j();
                bQF2.a(false);
                this.e.add(bQF2);
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

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = new dbt_0(this);
            fpm_0.b().a(this.d);
            bqz_1.a.a(this.c);
            fis_1.a().a("secrets", new bOn());
            fis_1.a().a("passportViewMode", 0);
            fis_1.a().a("passportCategory", 0);
            fyb_0 fyb_02 = fpm_0.b().a("passportDialog", cfi_0.a("passportDialog"), 1L, (short)10000);
            bno_0 bno_02 = bno_0.a(azu_0.j().k(), false);
            fis_1.a().a("pvpLadderEntry", (Object)bno_02, fyb_02.getElementMap());
            fpm_0.b().a("wakfu.passport", cJg.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (!this.e.isEmpty()) {
                bol_1.a(ft_1.g, this.e.stream().map(bQF2 -> bQF2.a()).collect(Collectors.toSet()));
                this.e.clear();
            }
            fpm_0.b().o("passportDialog");
            fpm_0.b().b(this.d);
            bqz_1.a.b(this.c);
            fis_1.a().a("secrets");
            fpm_0.b().e("wakfu.passport");
        }
    }
}

