/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.SteamUtils
 *  com.ankamagames.steam.wrapper.CSteamID
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.common.SteamUtils;
import com.ankamagames.steam.wrapper.CSteamID;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cVV
 */
public class cvv_0
implements ahr_1,
Runnable {
    private static final Logger a = Logger.getLogger(cvv_0.class);
    private static final cvv_0 b = new cvv_0();
    private bVw c;
    private fso d;
    fso e;
    private static final long f = 5000L;
    private final Runnable g = new cvw_0(this);
    private final Runnable h = new cvx_0(this);
    private long i;
    private byte[] j;

    public static cvv_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17697: {
                if (!bPL.a.e()) {
                    return false;
                }
                this.f();
                return false;
            }
            case 17290: {
                dfE dfE2 = (dfE)adt_12;
                String string = dfE2.k();
                bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
                bvx_02.a((agp_0)bWe.d, (boolean)dfE2.p());
                bvx_02.a((agp_0)bWe.e, dfE2.p() != false ? string : "");
                fis_1 fis_12 = fis_1.a();
                fis_12.a("account.name", (Object)(string == null ? "" : string));
                azu_0 azu_02 = azu_0.j();
                azu_02.b(string);
                azu_02.c(dfE2.o());
                azu_02.b(false);
                fzw_0.a.a("loginLock", false);
                if (azu_0.j().o() != azp_0.a) {
                    azu_0.j().a(azp_0.b);
                    ArrayList<QP> arrayList = azs_0.a().s();
                    azu_0.j().a(arrayList);
                } else {
                    fpm_0.b().o("steamLinkAccountDialog");
                    ccl_0.a.a(this.j);
                    byte[] byArray = azu_0.b(this.i);
                    cki_1 cki_12 = new cki_1();
                    cki_12.a(byArray);
                    CSteamID cSteamID = bPL.a.f();
                    cki_12.a(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                    cki_12.a(bPL.a.a().getAuthTicket());
                    azu_0.j().K().c(cki_12);
                }
                return false;
            }
            case 18477: {
                cuo_0.e().a(false).a(bae.h().a("logon.progress", new Object[0]), 0);
                dfc_0 dfc_02 = (dfc_0)adt_12;
                String string = dfc_02.o();
                bvx_0 bvx_03 = (bvx_0)ans_0.D().h();
                bvx_03.a((agp_0)bWe.d, (boolean)dfc_02.q());
                bvx_03.a((agp_0)bWe.e, dfc_02.q() != false ? string : "");
                fis_1 fis_13 = fis_1.a();
                fis_13.a("account.name", (Object)(string == null ? "" : string));
                azu_0 azu_03 = azu_0.j();
                azu_03.b(string);
                azu_03.c(dfc_02.p());
                azu_03.b(false);
                fzw_0.a.a("loginLock", false);
                azu_03.a(dfc_02.k());
                return false;
            }
            case 19132: {
                anw_1 anw_12 = (anw_1)adt_12;
                String string = anw_12.h();
                ckg_1 ckg_12 = new ckg_1();
                ckg_12.a(string);
                azu_0.j().K().c(ckg_12);
                return false;
            }
            case 18093: {
                dfD dfD2 = (dfD)adt_12;
                bae.h().b(dfD2.k());
                ans_0.D().y();
                ans_0.D().w();
                dfc.d((short)18439);
                return false;
            }
            case 18439: {
                return false;
            }
            case 16090: {
                this.g();
                return false;
            }
            case 16399: {
                dhb dhb2 = (dhb)adt_12;
                bvd_0 bvd_02 = dhb2.k();
                if (!dhb2.i() && bvd_02.equals(this.c.c())) {
                    return false;
                }
                this.a(bvd_02);
                this.k();
                return false;
            }
            case 17589: {
                this.a(this.c.g());
                if (!this.c.b()) {
                    cfq_0.setLeftArrowInvisible(null, true);
                }
                this.k();
                return false;
            }
            case 19691: {
                this.a(this.c.h());
                if (!this.c.a()) {
                    cfq_0.setRightArrowInvisible(null, true);
                }
                this.k();
                return false;
            }
            case 19414: {
                float f2 = ((anw_1)adt_12).g();
                bvh_0 bvh_02 = this.c.c().c();
                bvh_02.a(f2);
                fis_1.a().a((ajf_1)bvh_02, "videoSoundVolumeValue", "videoSoundVolumeValue", "videoMuted");
                return false;
            }
            case 17780: {
                float f3 = ((anw_1)adt_12).g();
                bvh_0 bvh_03 = this.c.c().c();
                bvh_03.b(f3);
                fis_1.a().a((ajf_1)bvh_03, "videoCurrentTimeText", "videoProgressionValue");
                return false;
            }
            case 19183: {
                int n = ((anw_1)adt_12).c();
                bvh_0 bvh_04 = this.c.c().c();
                bvh_04.a(this.d, n);
                fis_1.a().a((ajf_1)bvh_04, "selectedQuality");
                return false;
            }
            case 19365: {
                bvh_0 bvh_05;
                bvd_0 bvd_03 = this.c.c();
                if (bvd_03 == null) {
                    return false;
                }
                if (!bvd_03.e()) {
                    return false;
                }
                bvh_05.a(!(bvh_05 = bvd_03.c()).g());
                fis_1.a().a((ajf_1)bvh_05, "videoSoundVolumeValue", "videoSoundVolumeValue", "videoMuted");
                return false;
            }
            case 18086: {
                CSteamID cSteamID = bPL.a.f();
                ckc_1 ckc_12 = new ckc_1();
                ckc_12.a(bae.h().f().i());
                ckc_12.a(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                azu_0.j().K().c(ckc_12);
                return false;
            }
            case 16475: {
                cuo_0.e().b();
                azu_0.j().a("Cancel Steam Link");
                azu_0.j().a(cvv_0.a());
                return false;
            }
        }
        return true;
    }

    private void f() {
        fzw_0.a.a("loginLock", false);
        azu_0.j().a(azp_0.b);
        ArrayList<QP> arrayList = azs_0.a().s();
        azu_0.j().a(arrayList);
    }

    private void g() {
        bvd_0 bvd_02 = this.c.c();
        if (bvd_02 == null) {
            return;
        }
        if (!bvd_02.e()) {
            return;
        }
        bvh_0 bvh_02 = bvd_02.c();
        bvh_02.b();
        fis_1.a().a((ajf_1)bvh_02, "videoPlaying");
        this.j();
        cdw_0.n().a(bvh_02.f().isPaused() ? 1.0f : 0.0f, 1000);
    }

    private void a(bvd_0 bvd_02) {
        bvh_0 bvh_02;
        if (bvd_02 == null) {
            return;
        }
        if (this.c.c() != null && this.c.c().e() && (bvh_02 = this.c.c().c()).e()) {
            this.g();
        }
        this.a(this.c.c() == null);
        this.c.a(bvd_02);
        this.c.a(this.d);
        fis_1.a().a((ajf_1)this.c, this.c.d());
        if (bvd_02.e()) {
            fis_1.a().a((ajf_1)bvd_02.c(), bvh_0.l);
        }
    }

    private void a(boolean bl) {
        int n;
        int n2 = this.e.getAppearance().getModulationColor().i();
        if (n2 == (n = azf_2.e.i())) {
            return;
        }
        azf_2 azf_22 = new azf_2(n2);
        azf_2 azf_23 = new azf_2(n);
        this.e.getAppearance().removeTweensOfType(fjp_2.class);
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, this.e.getAppearance(), 0, 75, 1, false, fjw_2.b);
        fjp_22.a(new cvy_0(this, n, n2, bl));
        this.e.getAppearance().addTween(fjp_22);
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
        if (bl) {
            return;
        }
        fis_1.a().a("overNew", (Object)null);
        fis_1.a().a("languages", bae.h().i());
        fis_1.a().a("currentLanguage", bae.h().j());
        fzw_0.a.b("loginLock");
        String string = "logonDialog";
        fpm_0.b().a("logonDialog", cfi_0.a("logonDialog"), 8192L, (short)10000);
        fis_1.a().a("news", (Object)null);
        try {
            this.c();
        }
        catch (Throwable throwable) {
            a.error((Object)"Erreur au chargement du carousel !");
            throwable.printStackTrace();
        }
        cdw_0.n().r();
        btn_0.a().a(false);
        if (azu_0.j().c(ddp.a())) {
            ddp.a().c();
        } else {
            azu_0.j().a(ddp.a());
        }
    }

    void c() {
        switch (atc_1.a.b()) {
            case d: {
                a.error((Object)"[NEWS] Erreur lors du chargement");
                this.h();
                break;
            }
            case e: {
                a.info((Object)"[NEWS] Chargement effectu\u00e9");
                this.h();
                this.i();
                break;
            }
            case c: 
            case b: {
                a.warn((Object)"[NEWS] Chargement...");
                ado_1.a().a(this.h, 5000L, 1);
            }
        }
    }

    private void h() {
        ado_1.a().b(this.h);
    }

    private void i() {
        asm_1 asm_12 = atc_1.a.c();
        if (asm_12 == null || asm_12.d().isEmpty()) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("logonDialog");
        this.d = (fso)fyy_02.a("newsContainer");
        this.e = (fso)fyy_02.a("blinkContainer");
        this.c = new bVw(asm_12);
        this.a(this.c.f());
        fis_1.a().a((ajf_1)this.c, this.c.d());
        fis_1.a().a("news", this.c);
        this.d();
    }

    private void j() {
        ado_1.a().b(this);
        ado_1.a().b(this.g);
    }

    private void k() {
        this.j();
        ado_1.a().a(this.g, 180000L, 1);
    }

    void d() {
        ado_1.a().a(this, 30000L, -1);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.j();
            this.h();
            cdw_0.n().a(1.0f, 1000);
            if (this.c != null) {
                this.c.e();
            }
            fpm_0.b().o("logonDialog");
            fzw_0.a.c("loginLock");
        }
    }

    @Override
    public void run() {
        if (!this.c.a() && !this.c.b()) {
            return;
        }
        if (!this.c.a()) {
            this.a(this.c.f());
            return;
        }
        this.a(this.c.h());
    }

    public bVw e() {
        return this.c;
    }

    public void a(long l, byte[] byArray) {
        this.i = l;
        this.j = byArray;
    }
}

