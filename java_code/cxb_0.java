/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cXb
 */
public class cxb_0
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cxb_0.class);
    private static final cxb_0 b = new cxb_0();
    private int c = 0;
    private ans_1 d;

    public static cxb_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18769: {
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.restoreChatOptions", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_02.a(new cxc_0(this));
                return false;
            }
        }
        return true;
    }

    public void c() {
        azu_0.j().b(cww_0.c());
        ((bvx_0)ans_0.D().h()).n();
        aUxx.a().q();
        try {
            bdk_1.b();
        }
        catch (Exception exception) {
            a.error((Object)"immpossible de r\u00e9tablir les param\u00e8tres par d\u00e9faut de chat !", (Throwable)exception);
        }
        azu_0.j().a(cww_0.c());
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
            this.d = new cxd_0(this);
            fpm_0.b().a(this.d);
            fis_1.a().a("chat.editedView", (Object)null);
            fis_1.a().a("chat.viewOver", (Object)null);
            fis_1.a().a("chat.colorEditedObject", (Object)null);
            fyb_0 fyb_02 = fpm_0.b().a("chatOptionsDialog", cfi_0.a("chatOptionsDialog"), 256L, (short)26000);
            if (fyb_02 != null) {
                ((fut_0)fyb_02.getElementMap().a("tabbedContainer")).setSelectedTabIndex(this.c);
            }
            fpm_0.b().a("wakfu.chatOptions", cgg_0.class);
            cww_0.c().a(true);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cww_0.c().a(false);
            this.c = 0;
            fis_1.a().a("chat.editedView");
            fis_1.a().a("chat.viewOver");
            fis_1.a().a("chat.colorEditedObject");
            fpm_0.b().b(this.d);
            fpm_0.b().o("chatOptionsDialog");
            fpm_0.b().e("wakfu.chatOptions");
        }
    }

    public void a(int n) {
        this.c = n;
    }
}

