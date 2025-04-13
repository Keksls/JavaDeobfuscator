/*
 * Decompiled with CFR 0.152.
 */
public class dal
implements ahr_1 {
    private static final dal a = new dal();
    private ans_1 b;
    private bkf_1 c;
    private bkc_1 d;
    private afb_0 e;

    public static dal a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16533: {
                bkd_1 bkd_12 = (bkd_1)((anw_1)adt_12).j();
                this.c.a(bkd_12);
                return false;
            }
            case 16144: {
                bke_1 bke_12 = (bke_1)((anw_1)adt_12).j();
                this.c.a(bke_12);
                return false;
            }
            case 19698: {
                Long l = (Long)((anw_1)adt_12).j();
                this.c.a(l);
                return false;
            }
            case 17842: {
                this.c.c();
                return false;
            }
            case 18275: {
                String string = (String)((anw_1)adt_12).j();
                this.c.a(string);
                return false;
            }
        }
        return true;
    }

    public void c() {
        if (azu_0.j().c(a)) {
            azu_0.j().b(a);
            return;
        }
        this.d = new bkc_1();
        azu_0.j().a(a);
    }

    public void d() {
        if (!azu_0.j().c(a)) {
            return;
        }
        fis_1.a().a((ajf_1)this.c, "currentMusicName");
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new bkf_1(this.d);
            this.c.a();
            bmr_1 bmr_12 = azu_0.j().k();
            this.e = (afe_02, apl_12) -> azu_0.j().b(a);
            bmr_12.bv().a(this.e);
            this.b = string -> {
                if (string.equals("jukeboxDialog")) {
                    azu_0.j().b(a);
                }
            };
            fpm_0.b().a(this.b);
            fpm_0.b().a("wakfu.jukebox", chz_0.class);
            fpm_0.b().a("jukeboxDialog", cfi_0.a("jukeboxDialog"), 32769L, (short)10000);
            fis_1.a().a("jukebox", (Object)this.c, "jukeboxDialog");
            cdw_0.n().c(600012L);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().o("jukeboxDialog");
            azu_0.j().k().bv().b(this.e);
            this.e = null;
            fpm_0.b().b(this.b);
            fpm_0.b().e("wakfu.jukebox");
            cdw_0.n().c(600013L);
            fis_1.a().a("jukebox");
            this.c = null;
            this.d = null;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

