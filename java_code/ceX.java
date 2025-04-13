/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ceX
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ceX.class);
    private static final ceX b = new ceX();
    private boolean c;

    public static ceX a() {
        return b;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 23226: {
                cbi_0 cbi_02 = (cbi_0)adt_12;
                this.a(cbi_02);
                return false;
            }
            case 23686: {
                cbh_0 cbh_02 = (cbh_0)adt_12;
                this.a(cbh_02);
                return false;
            }
            case 22254: {
                cbb_0 cbb_02 = (cbb_0)adt_12;
                this.a(cbb_02);
                return false;
            }
            case 23849: {
                ceX.a((cbf_0)adt_12, this);
                return false;
            }
            case 22985: {
                this.d();
                return false;
            }
            case 23506: {
                cbd_0 cbd_02 = (cbd_0)adt_12;
                this.a(cbd_02);
                return false;
            }
            case 22619: {
                cbe_0 cbe_02 = (cbe_0)adt_12;
                cWI.a().a(cbe_02);
                return false;
            }
            case 502: {
                ckz_0 ckz_02 = (ckz_0)adt_12;
                if (ckz_02.b() != 0 && ckz_02.b() != 101) {
                    String string = "error.worldSelection";
                    fpm_0.b().a(bae.h().a("error.worldSelection", new Object[0]), cfn_0.a(1), 1027L, 3, 2);
                    cuo_0.e().b();
                }
                return false;
            }
            case 23524: {
                String string = "error.connection.deleteUnderModeration";
                fpm_0.b().a(bae.h().a("error.connection.deleteUnderModeration", new Object[0]), cfn_0.a(1), 1027L, 6, 2);
                return false;
            }
            case 22: {
                pz_0 pz_02 = (pz_0)adt_12;
                if (pz_02.b() == 1) {
                    ceT.a().a(adt_12, "error.connection.loginServerDown", new Object[0]);
                    azu_0.j().b(this);
                }
                return false;
            }
            case 593: {
                cef_0.a((ckp_1)adt_12);
                return false;
            }
            case 22431: {
                cbg_0 cbg_02 = (cbg_0)adt_12;
                cWI.a().b(false);
                if (!cbg_02.b()) {
                    return false;
                }
                bmr_1 bmr_12 = (bmr_1)bmp_1.a().b(cbg_02.c());
                bmr_1 bmr_13 = (bmr_1)bmp_1.a().b(cbg_02.d());
                bmr_12.b(cbg_02.e());
                bmr_13.b(cbg_02.f());
                boi_1.b.a(bmr_12, bmr_13);
                return false;
            }
        }
        return true;
    }

    private void a(cbi_0 cbi_02) {
        bmp_1.a().a(cbi_02.b());
    }

    private void a(cbh_0 cbh_02) {
        ArrayList<byte[]> arrayList = cbh_02.b();
        if (!azu_0.j().c(cWI.a())) {
            azu_0.j().a(cWI.a());
        }
        azu_0.j().b(cfc_1.a);
        ceY ceY2 = new ceY(this, arrayList.size());
        try {
            bmp_1.a().a(arrayList, ceY2);
        }
        catch (Exception exception) {
            a.error((Object)"Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation de la liste des personnages", (Throwable)exception);
        }
        if (bmp_1.a().d() > 0) {
            blx_1 blx_12 = bmp_1.a().e();
            cWI.a().a(blx_12);
        }
        bmp_1.a().h();
        short s2 = bmp_1.a().i();
        fis_1.a().a("hideDownscaling", s2 < 51);
        if (arrayList.isEmpty()) {
            this.c();
        } else {
            cuo_0.e().a().a(bae.h().a("charactersLoading.progress", new Object[0]), arrayList.size());
        }
    }

    private void a(cbb_0 cbb_02) {
        if (cbb_02.c()) {
            long l = cbb_02.b();
            euw_2.a.a(l);
            bmp_1.a().a(l);
            cWI.a().c();
            bmp_1.a().h();
            eZe.a.b(azu_0.j().n().u(), l);
        } else {
            String string = "error.characterDeletion";
            fpm_0.b().a(bae.h().a("error.characterDeletion", new Object[0]), cfn_0.a(1), 1027L, 6, 1);
        }
    }

    private void d() {
        azu_0.j().b(b);
        azu_0.j().a(ceT.a());
        bmp_1.a().b();
        this.c();
    }

    private void a(cbd_0 cbd_02) {
        long l = cbd_02.b();
        String string = cbd_02.c();
        long l2 = cbd_02.d();
        cWI.a().a(l, l2, string);
    }

    public static boolean a(cbf_0 cbf_02, ahr_1 ahr_12) {
        if (cbf_02.b() == 0) {
            azu_0.j().b(ahr_12);
            azu_0.j().a(cfx_2.a);
            azu_0.j().a(cfb_1.a);
            azu_0.j().a(cgu_2.a());
            azu_0.j().a(cfq_1.b);
            azu_0.j().a(cgk_1.b);
            azu_0.j().a(cgq_1.b);
            azu_0.j().a(cjw_2.a);
            aZG.e().a("world", true);
            aZG.e().a("common", true);
            aZG.e().a("binding", true);
            bmp_1.a().b();
            ans_0.D().O();
            return true;
        }
        String string = "error.characterSelection";
        fpm_0.b().a(bae.h().a("error.characterSelection", new Object[0]), cfn_0.a(1), 1027L, 7, 1);
        return false;
    }

    public void c() {
        cuo_0.e().b();
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
            if (!azu_0.j().c(cfx_2.a)) {
                azu_0.j().a(cfx_2.a);
            }
            if (WakfuClient.a.n().q()) {
                a.info((Object)"[WEB-TOKEN-DEBUG] Send request for shopApiKey !");
            }
            azu_0.j().K().c(new cbv_0(bae.h().f().h()));
            if (this.c) {
                azu_0.j().a(cWI.a());
            }
            btn_0.a().a(false);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().o("renameCharacterDialog");
            azu_0.j().b(cWI.a());
        }
    }
}

