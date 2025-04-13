/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWr
 */
public class cwr_0
implements ahr_1,
fzi {
    private static final Logger a = Logger.getLogger(cwr_0.class);
    private static final cwr_0 b = new cwr_0();
    private ans_1 c;
    private bkp_1 d;

    public static cwr_0 a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new cws_0(this);
            cff_0.b().a(this);
            this.d = (bkp_1)fis_1.a().e("boosterPackNoticeView");
            long l = (Byte)this.d.b("noticeType") == 0 ? 256L : 0L;
            fpm_0.b().a(this.c);
            fpm_0.b().a("boosterPackNoticeDialog", cfi_0.a("boosterPackNoticeDialog"), 0x10L | l, (short)30000);
            fpm_0.b().a("wakfu.boosterPackNotice", cFJ.class);
            fyy_0 fyy_02 = fpm_0.b().h().d("boosterPackNoticeDialog");
            fru_0 fru_02 = (fru_0)fyy_02.a("buyBoosterButton");
            fbx_1 fbx_12 = new fbx_1();
            fbx_12.onCheckOut();
            fbx_12.setFile("6001079.xps");
            fbx_12.setAlignment(frs_0.h);
            fbx_12.setY(25);
            fru_02.getAppearance().add(fbx_12);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cff_0.b().b(this);
            fpm_0.b().b(this.c);
            fpm_0.b().a("boosterPackNoticeDialog", true);
            fpm_0.b().e("wakfu.boosterPackNotice");
            fis_1.a().a("boosterPackNoticeView");
            cYb.a().b(-1);
        }
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        cef.a(cec.a, string, "closed_escape_key");
        return fzh.a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

