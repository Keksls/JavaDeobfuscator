/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from dbo
 */
public class dbo_0
implements ahr_1 {
    private static final Logger b = Logger.getLogger(dbo_0.class);
    public static final dbo_0 a = new dbo_0();
    private static final int c = 5000;
    private static final int d = 6000;
    private static final int e = 15000;
    private static final int f = 16000;
    private final blu_0 g = new blu_0();

    private dbo_0() {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        cgu_2.a().a(this);
        fis_1.a().a("stackedNotifications", this.g);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        cgu_2.a().b(this);
        fis_1.a().a("stackedNotifications");
        this.g.c();
        fpm_0.b().o("notificationDialog");
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16575: {
                this.a((dgr_0)adt_12);
                return false;
            }
            case 16372: {
                blv_0 blv_02 = (blv_0)((dfc)adt_12).j();
                blv_02.a();
                this.a(blv_02);
                return false;
            }
            case 16714: {
                blv_0 blv_03 = (blv_0)((dfc)adt_12).j();
                blv_03.b();
                this.a(blv_03);
                return false;
            }
            case 18206: {
                this.a((dgw_0)adt_12);
                return false;
            }
        }
        return true;
    }

    public void a(String string, int n) {
        blt_0.a(string).b(5000).c(6000).d(n).b();
    }

    private void a(dgw_0 dgw_02) {
        String string = bae.h().a("group.guild.invitation", dgw_02.k(), dgw_02.o());
        blv_0 blv_02 = blt_0.a(string).a(15000).c(16000).d(4).a(true).a(() -> {
            azu_0.j().K().c(new czh_2(true));
            dbA.h();
        }).b(true).b(() -> azu_0.j().K().c(new czh_2(false))).c(() -> azu_0.j().K().c(new czh_2(false))).b();
        blv_02.a(() -> cZu.a().b(blv_02));
        cZu.a().a(blv_02);
    }

    private void a(dgr_0 dgr_02) {
        String string = "group.party.invitation";
        StringBuilder stringBuilder = new StringBuilder();
        bmr_1 bmr_12 = azu_0.j().k();
        stringBuilder.append(bae.h().a("group.party.invitation", dgr_02.o()));
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (cct_12 != null && cct_12.f() == Xd.b && cct_12.c()) {
            stringBuilder.append(System.lineSeparator()).append(bae.h().a("group.party.leave.warn.dungeon", new Object[0]));
        }
        blt_0.a(stringBuilder.toString()).d(3).a(true).a(() -> this.a(dgr_02, true)).b(true).b(() -> this.a(dgr_02, false)).c(() -> this.a(dgr_02, false)).b();
    }

    private void a(dgr_0 dgr_02, boolean bl) {
        Qu qu = new Qu();
        qu.a(bl);
        qu.a(dgr_02.o());
        qu.a(dgr_02.p());
        qu.a(Xd.b.a());
        azu_0.j().K().c(qu);
    }

    public void a(blv_0 blv_02) {
        this.g.c(blv_02);
        blv_02.e();
        this.a();
    }

    public void b(blv_0 blv_02) {
        this.g.c(blv_02);
        this.g.b(blv_02);
        this.c();
    }

    private void a() {
        this.g.g();
    }

    private void c() {
        this.g.f();
    }

    public void c(blv_0 blv_02) {
        this.g.a(blv_02);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

