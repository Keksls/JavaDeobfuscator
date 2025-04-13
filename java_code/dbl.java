/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class dbl
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(dbl.class);
    private static final dbl b = new dbl();
    private ArrayList<bVp> c;
    private ans_1 d;

    public static dbl a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18135: {
                dfc dfc2 = (dfc)adt_12;
                int n = dfc2.c();
                String string = bae.h().a(39, (long)n, new Object[0]);
                String string2 = bae.h().a("question.nationSelectionConfirm", string);
                fzn_0 fzn_02 = new fzn_0(102, 0, string2, null, cfn_0.a(0), 24L);
                fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                fzm_02.a(new dbm(this, n));
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
            if (this.c == null) {
                a.error((Object)"Nations null on ne peut pas afficher le panneau !");
                return;
            }
            bmr_1 bmr_12 = azu_0.j().k();
            fis_1.a().a("nationSelectionList", this.c);
            ani_2 ani_22 = null;
            if (bmr_12.dt() < 1) {
                ani_22 = new ani_2().a(azf_2.h);
                ani_22.a((CharSequence)bae.h().a("levelSup", 1));
            } else if (bmr_12.bM() != 0) {
                ani_22 = new ani_2().a(azf_2.h);
                ani_22.a((CharSequence)bae.h().a("nationSelection.alreadySet", new Object[0]));
            }
            fis_1.a().a("nationSelectionDisabledMessage", ani_22 == null ? ani_22 : ani_22.r());
            fis_1.a().a("selectedNation", (Object)null);
            this.d = new dbn(this);
            fpm_0.b().a(this.d);
            fpm_0.b().a("nationSelectionPanelDialog", cfi_0.a("nationSelectionPanelDialog"), 256L, (short)10000);
            fpm_0.b().a("wakfu.nationSelectionPanel", cId.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = null;
            fis_1.a().a("nationSelectionList");
            fis_1.a().a("selectedNation");
            fpm_0.b().b(this.d);
            fpm_0.b().o("nationSelectionPanelDialog");
            fpm_0.b().e("wakfu.nationSelectionPanel");
        }
    }

    public void a(ArrayList<cwd_1> arrayList) {
        this.c = new ArrayList();
        for (cwd_1 cwd_12 : arrayList) {
            this.c.add(new bVp(cwd_12.a(), cwd_12.b(), cwd_12.c(), cwd_12.d(), cwd_12.e(), cwd_12.f()));
        }
    }
}

