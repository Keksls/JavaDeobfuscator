/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class cVS
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cVS.class);
    public static final cVS b = new cVS();
    private bsc c;
    private bse d;
    private ans_1 e;
    private int f;

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16904: {
                dfI dfI2 = (dfI)adt_12;
                brw_0 brw_02 = dfI2.k();
                if (fpm_0.b().q("artisansListDialog")) {
                    return false;
                }
                brw_0 brw_03 = (brw_0)fis_1.a().e("selectedRecipe");
                if (brw_02 == brw_03) {
                    brw_02 = null;
                } else {
                    this.d.a().forEach(bsb2 -> bsb2.a(dfI2.k().g()));
                }
                fis_1.a().a("selectedRecipe", brw_02);
                return false;
            }
            case 16319: {
                brw_0 brw_04;
                Object object;
                if (!fpm_0.b().q("artisansListDialog")) {
                    object = (fvk_0)fpm_0.b().a("artisansListDialog", cfi_0.a("artisansListDialog"), 17L, (short)10000);
                    this.a((fvk_0)object);
                }
                if ((brw_04 = ((dfO)(object = (dfO)adt_12)).k()) != null) {
                    fis_1.a().a("artisansList", (Object)this.d, "artisansListDialog");
                    fis_1.a().a("selectedRecipe", brw_04);
                } else {
                    brw_04 = (brw_0)fis_1.a().e("selectedRecipe");
                }
                if (brw_04 == null) {
                    a.warn((Object)"Trying to view artisans without having selected a recipe beforehand");
                    return false;
                }
                this.a(brw_04.g(), ((dfO)object).o());
                return false;
            }
            case 19199: {
                dfk_0 dfk_02 = (dfk_0)adt_12;
                this.a(dfk_02.k());
                return false;
            }
            case 16484: {
                dfm_0 dfm_02 = (dfm_0)adt_12;
                switch (dfm_02.k()) {
                    case a: {
                        this.a(dfm_02.o());
                        return false;
                    }
                    case b: {
                        this.a();
                        return false;
                    }
                    case c: {
                        this.a(false, Strings.isNullOrEmpty((String)dfm_02.o()) ? (short)0 : Short.parseShort(dfm_02.o()));
                        return false;
                    }
                    case d: {
                        this.a(true, Strings.isNullOrEmpty((String)dfm_02.o()) ? (short)0 : Short.parseShort(dfm_02.o()));
                        return false;
                    }
                }
                return false;
            }
            case 18274: {
                int n = ((dfc)adt_12).c();
                this.c.c(n);
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
        azu_0.j().b(dei.a());
        azu_0.j().b(cyc_0.d());
        this.e = cVS::b;
        fpm_0.b().a(this.e);
        fpm_0.b().a("artisansBookDialog", cfi_0.a("artisansBookDialog"), 17L, (short)10000).getElementMap();
        fis_1.a().a("artisansBook", (Object)this.c, "artisansBookDialog");
        cdw_0.n().c(600012L);
        fpm_0.b().a("wakfu.artisansBook", cFC.class);
        if (!fpm_0.b().d("wakfu.crafts")) {
            fpm_0.b().a("wakfu.crafts", cgu_0.class);
        }
        if (!fpm_0.b().d("wakfu.craftTable")) {
            fpm_0.b().a("wakfu.craftTable", cgv_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().b(this.e);
        fis_1.a().a("selectedRecipe");
        fis_1.a().a("artisansBook");
        if (fpm_0.b().q("artisansBookDialog")) {
            fpm_0.b().o("artisansBookDialog");
        }
        if (fpm_0.b().q("artisansListDialog")) {
            fpm_0.b().o("artisansListDialog");
        }
        cdw_0.n().c(600013L);
        fpm_0.b().e("wakfu.artisansBook");
        if (!(azu_0.j().c(cxa_0.a()) || azu_0.j().c(cXC.a()) || fpm_0.b().q("recipeViewDialog") || fpm_0.b().q("craftLinkedRecipeDialog"))) {
            fpm_0.b().e("wakfu.crafts");
        }
        if (!azu_0.j().c(cXC.a())) {
            fpm_0.b().e("wakfu.craftTable");
        }
        azu_0.j().a(dei.a());
    }

    private void a(eco_0 eco_02, dfp_0 dfp_02) {
        czd_1 czd_12 = new czd_1();
        czd_12.a(eco_02);
        switch (dfp_02) {
            case a: {
                czd_12.b(0);
                break;
            }
            case b: {
                czd_12.b(13 * (this.d.c() + 1));
                break;
            }
            case c: {
                czd_12.b(13 * (this.d.c() - 1));
            }
        }
        azu_0.j().K().c(czd_12);
    }

    private void a(fvk_0 fvk_02) {
        fvk_02.a(new cVT(this, fvk_02));
    }

    public void a(int n, int n2, int n3, List<bsa> list) {
        if (list == null) {
            return;
        }
        brw_0 brw_02 = (brw_0)fis_1.a().e("selectedRecipe");
        ArrayList<bsb> arrayList = new ArrayList<bsb>();
        list.forEach(bsa2 -> {
            boolean bl = aUL.a().f().c(bsa2.a()) != null;
            arrayList.add(new bsb((bsa)bsa2, this.f, bl, brw_02.g()));
        });
        this.d.a(arrayList);
        this.d.a(n);
        this.d.b(n3);
        fis_1.a().a((ajf_1)this.d, "currentArtisansPage", "currentPageText", "currentPage", "totalPages");
    }

    private void a(boolean bl, short s2) {
        if (bl) {
            this.c.b(s2);
        } else {
            this.c.a(s2);
        }
        fis_1.a().a((ajf_1)this.c, "currentPageText", "currentRecipesPage");
    }

    private void a(String string) {
        this.c.a(string);
        fis_1.a().a((ajf_1)this.c, "currentPageText", "currentRecipesPage");
    }

    private void a() {
        this.c.a();
        fis_1.a().a((ajf_1)this.c, "onlyIngredientsOk", "currentPageText", "currentRecipesPage");
    }

    private void a(dfl_0 dfl_02) {
        int n;
        if (dfl_02 == null) {
            return;
        }
        switch (dfl_02) {
            case a: {
                n = this.c.b() + 1;
                if (n < this.c.c()) break;
                return;
            }
            case b: {
                n = this.c.b() - 1;
                if (n >= 0) break;
                return;
            }
            default: {
                return;
            }
        }
        this.c.d(n);
        fis_1.a().a((ajf_1)this.c, "currentRecipesPage", "currentPageText");
    }

    private static void b(String string) {
        if ("artisansBookDialog".equals(string)) {
            azu_0.j().b(b);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bFZ bFZ2) {
        if (!(bFZ2 instanceof bar_1)) {
            return;
        }
        this.f = ((bar_1)bFZ2).p();
        this.c = new bsc(this.f);
        this.d = new bse();
        azu_0.j().a(this);
    }

    public void a(bar_1 bar_12) {
        if (bar_12.p() == this.f) {
            azu_0.j().b(this);
        }
    }
}

