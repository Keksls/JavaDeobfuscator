/*
 * Decompiled with CFR 0.152.
 */
class ceS
implements adx_1<csj_0> {
    ceS() {
    }

    @Override
    public boolean a(csj_0 csj_02) {
        int n;
        String string;
        cVA.h().m();
        if (csj_02.b() != -1) {
            String string2 = bae.h().a("notification.arcadeDungeonBonusTitle", new Object[0]);
            string = bae.h().a("notification.arcadeDungeonBonusText", bgt.a.e(csj_02.b()));
            add_2.b().a(new dhc(string2, string, blr_1.g));
        }
        if ((n = csj_02.c()) != -1) {
            string = bae.h().a("notification.arcadeDungeonEventTitle", new Object[0]);
            String string3 = bae.h().a("notification.arcadeDungeonEventText", bgt.a.c(n));
            add_2.b().a(new dhc(string, string3, blr_1.g));
            cVA.h().a(bgt.a.d(n));
        }
        return false;
    }

    @Override
    public int a() {
        return 12347;
    }
}

