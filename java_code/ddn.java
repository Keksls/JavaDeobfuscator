/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ddn
implements ahr_1 {
    private static final Logger c = Logger.getLogger(ddn.class);
    private static final ddn d = new ddn();
    public static final int a = 19;
    public static final int b = 2;
    private ans_1 e;
    private bqx_1 f;
    private ArrayList<bqw_1> g;

    private ddn() {
    }

    public static ddn a() {
        return d;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19366: {
                dgL dgL2 = (dgL)adt_12;
                this.a(dgL2.o(), dgL2.b());
                return false;
            }
            case 19599: {
                dgL dgL3 = (dgL)adt_12;
                this.a(dgL3);
                return false;
            }
            case 19095: {
                for (bqw_1 bqw_12 : this.g) {
                    bqw_12.a(1);
                }
                return false;
            }
            case 16844: {
                for (bqw_1 bqw_13 : this.g) {
                    bqw_13.a(-1);
                }
                return false;
            }
            case 16612: {
                dfc dfc2 = (dfc)adt_12;
                for (bqw_1 bqw_14 : this.g) {
                    bqw_14.a(dfc2.h());
                }
                return false;
            }
            case 16044: {
                this.b(ddn.b(1));
                return false;
            }
            case 17424: {
                this.b(ddn.b(-1));
                return false;
            }
            case 16089: {
                this.a(ddn.a(1));
                return false;
            }
            case 19326: {
                this.a(ddn.a(-1));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.e = string -> {
            if (string.equals("stuffPreviewDebugDialog")) {
                azu_0.j().b(d);
            }
        };
        bmr_1 bmr_12 = azu_0.j().k();
        this.f = new bqx_1();
        this.f.a(bmr_12.en());
        this.f.a(bmr_12, bmr_12.cG(), new exh_2[0]);
        fis_1.a().a("stuffPreview", this.f);
        this.a(bmr_12);
        fis_1.a().a("characterCreation.currentDressStyleIndex", 1);
        fis_1.a().a("characterCreation.currentHairStyleIndex", 1);
        fis_1.a().a("characterCreation.totalHairStyleIndex", 19);
        fis_1.a().a("characterCreation.totalDressStyleIndex", 2);
        fis_1.a().a("stuffPreviewDebugCharacters", this.g);
        fpm_0.b().a(this.e);
        fpm_0.b().a("stuffPreviewDebugDialog", cfi_0.a("stuffPreviewDebugDialog"), 1L, (short)10000);
        cdw_0.n().c(600012L);
        fpm_0.b().a("wakfu.stuffPreviewDebug", cJP.class);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cJP.setDraggedItemId(-1L);
            fpm_0.b().b(this.e);
            fpm_0.b().o("stuffPreviewDebugDialog");
            fis_1.a().a("stuffPreview");
            fis_1.a().a("characterCreation.currentDressStyleIndex");
            fis_1.a().a("characterCreation.currentHairStyleIndex");
            fis_1.a().a("stuffPreviewDebugCharacters");
            cdw_0.n().c(600013L);
            this.f = null;
            this.g = null;
            fpm_0.b().e("wakfu.stuffPreviewDebug");
        }
    }

    private void a(bmr_1 bmr_12) {
        byte[] byArray;
        this.g = new ArrayList();
        for (byte by : byArray = new byte[]{0, 1}) {
            for (epn_2 epn_22 : epo_2.b()) {
                bqw_1 bqw_12 = new bqw_1();
                bqw_12.a(bmr_12, by, epn_22);
                this.g.add(bqw_12);
            }
        }
    }

    private void a(exk_2 exk_22, byte by) {
        for (bqw_1 bqw_12 : this.g) {
            bqw_12.a(exk_22, by);
        }
        this.f.a(exk_22, by);
    }

    private void a(dgL dgL2) {
        for (bqw_1 bqw_12 : this.g) {
            bqw_12.a(dgL2.b());
        }
        this.f.b(dgL2.b());
    }

    public void a(int n, boolean bl) {
        for (bqw_1 bqw_12 : this.g) {
            bqw_12.b(n);
            bqw_12.a(bl);
            bqw_12.a();
        }
        this.f.a(n);
    }

    private void a(byte by) {
        for (bqw_1 bqw_12 : this.g) {
            bnh_1 bnh_12 = bqw_12.b();
            int n = bkw_1.a().a(bnh_12.gO(), bnh_12.gX());
            bnh_12.a((byte)(by > n ? 0 : by - 1), true);
            bnh_12.ex();
            bqw_12.a();
        }
    }

    private void b(byte by) {
        for (bqw_1 bqw_12 : this.g) {
            bnh_1 bnh_12 = bqw_12.b();
            int n = bkw_1.a().b(bnh_12.gO(), bnh_12.gX());
            bnh_12.b((byte)(by > n ? 0 : by - 1), true);
            bqw_12.a();
        }
    }

    private static byte a(int n) {
        int n2 = fis_1.a().d("characterCreation.currentDressStyleIndex");
        if ((n2 += n) > 2) {
            n2 = 1;
        }
        if (n2 < 1) {
            n2 = 2;
        }
        fis_1.a().a("characterCreation.currentDressStyleIndex", n2);
        return (byte)n2;
    }

    private static byte b(int n) {
        int n2 = fis_1.a().d("characterCreation.currentHairStyleIndex");
        if ((n2 += n) > 19) {
            n2 = 1;
        }
        if (n2 < 1) {
            n2 = 19;
        }
        fis_1.a().a("characterCreation.currentHairStyleIndex", n2);
        return (byte)n2;
    }

    public bqv_1 c() {
        return this.f;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

