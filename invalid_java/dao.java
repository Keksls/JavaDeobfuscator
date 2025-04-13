/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class dao
extends daz {
    private static final Logger g = Logger.getLogger(dao.class);
    private static final dao h = new dao();
    private fac_2 i;
    private fsQ j;
    private bel_0 k = null;
    private ans_1 l;

    public static dao d() {
        return h;
    }

    private dao() {
    }

    public void a(bel_0 bel_02) {
        this.k = bel_02;
    }

    @Override
    protected void a(exk_2 exk_22, short s2) {
        super.a(exk_22, s2);
        this.c.a(feu_0.c);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (azu_0.j().n().a(adt_12.a())) {
            return false;
        }
        switch (adt_12.a()) {
            case 16109: 
            case 16863: 
            case 17774: {
                this.b(adt_12);
                return false;
            }
            case 17949: {
                g.warn((Object)"Unexpected deposit request in FleaFrame. Should not be possible anymore.");
                return false;
            }
            case 16751: {
                if (this.k.aq()) {
                    fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("market.question.unregister", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                    fzm_02.a(new dap_0(this, adt_12));
                } else {
                    this.b(adt_12);
                }
                return false;
            }
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    void b(adt_1 var1_1) {
        var2_2 = azu_0.j().k();
        if (var2_2 == null) {
            dao.g.error((Object)"Pas de local player");
            return;
        }
        var3_3 = var2_2.dj().w();
        switch (var1_1.a()) {
            case 16109: {
                var4_4 = (dfb_0)var1_1;
                var5_6 = (bhm_0)var3_3.b(this.k.ap());
                if (var5_6 == null) {
                    dao.g.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire marchand uid=" + this.k.ap()));
                    return;
                }
                var6_8 = var4_4.s();
                try {
                    var5_6.c(var6_8.a());
                    if (!var5_6.d(var6_8, var4_4.o())) {
                        var5_6.c(var6_8.a());
                        dao.g.error((Object)"L'objet n a pas pu etre inser\u00e9 dans le sac marchand");
                    }
                }
                catch (uz_0 var7_10) {
                    dao.g.error((Object)"InventoryCapacityReachedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_10);
                }
                catch (Uy var7_11) {
                    dao.g.error((Object)"ContentAlreadyPresentException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_11);
                }
                catch (ub_0 var7_12) {
                    dao.g.error((Object)"LastPositionAlreadyUsedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_12);
                }
                catch (uc_0 var7_13) {
                    dao.g.error((Object)"PositionAlreadyUsedException during onMessage for MERCHANT_TRANSFERT_ITEM_REQUEST", (Throwable)var7_13);
                }
                return;
            }
            case 16751: {
                var4_5 = (dfb_0)var1_1;
                var5_7 = (bhm_0)var3_3.b(this.k.ap());
                if (var5_7 == null) {
                    dao.g.error((Object)("Impossible de r\u00e9cup\u00e9rer l'inventaire marchand uid=" + this.k.ap()));
                    return;
                }
                cuu_0.a().C().c(false);
                var6_9 = false;
                var7_14 = null;
                var8_15 = null;
                var9_16 = var4_5.s();
                var10_17 = var9_16.h().a();
                if (!var5_7.d(var10_17)) {
                    dao.g.error((Object)"Merchant inventory doesn't contain item, don't try to remove it");
                    return;
                }
                if (var4_5.r() != -1 && var4_5.r() != var9_16.e()) ** GOTO lbl72
                if (var4_5.t() == -1L) ** GOTO lbl66
                var12_18 = euu_2.l(var2_2.U_(), var4_5.t());
                if (var12_18 == null) ** GOTO lbl67
                try {
                    if (!var12_18.b(var9_16.h(), var4_5.o())) ** GOTO lbl67
                    if (!var12_18.c(var9_16.h(), var4_5.o())) ** GOTO lbl60
                    if (!var12_18.g(var9_16.h())) {
                        var9_16.h().release();
                    }
                    var7_14 = var12_18;
                    ** GOTO lbl67
lbl60:
                    // 1 sources

                    var6_9 = true;
                }
                catch (Exception var13_19) {
                    dao.g.error((Object)("Impossible d'ajouter l'item a la position : position : " + var4_5.o()), (Throwable)var13_19);
                    var6_9 = true;
                }
                ** GOTO lbl67
lbl66:
                // 1 sources

                var7_14 = cyt_0.s().da().c(var9_16.h());
lbl67:
                // 6 sources

                if (var7_14 != null && !var5_7.b(var9_16)) {
                    if (cyt_0.s().da().d(var9_16.h()) == null) {
                        dao.g.error((Object)"On vient d'ajouter un item aux inventaire, mais une erreur et survenu lors de la transaction et on arrive pas a le retirer");
                    }
                    var6_9 = true;
                }
                ** GOTO lbl94
lbl72:
                // 1 sources

                var8_15 = var9_16.h().u();
                var8_15.a(var4_5.r());
                if (var4_5.t() == -1L) ** GOTO lbl90
                var12_18 = euu_2.l(var2_2.U_(), var4_5.t());
                if (var12_18 == null) ** GOTO lbl91
                try {
                    if (!var12_18.b(var8_15, var4_5.o())) ** GOTO lbl91
                    if (!var12_18.c(var8_15, var4_5.o())) ** GOTO lbl84
                    if (!var12_18.g(var8_15)) {
                        var8_15.release();
                    }
                    var7_14 = var12_18;
                    ** GOTO lbl91
lbl84:
                    // 1 sources

                    var6_9 = true;
                }
                catch (Exception var13_20) {
                    dao.g.error((Object)("Impossible d'ajouter l'item a la position : position : " + var4_5.o()), (Throwable)var13_20);
                    var6_9 = true;
                }
                ** GOTO lbl91
lbl90:
                // 1 sources

                var7_14 = cyt_0.s().da().c(var8_15);
lbl91:
                // 6 sources

                if (var7_14 != null) {
                    var5_7.a(var9_16.a(), -var4_5.r());
                }
lbl94:
                // 4 sources

                if (var7_14 != null) {
                    if (!var6_9) {
                        var12_18 = new cpt_0();
                        var12_18.e(var5_7.r());
                        var12_18.b(var9_16.h().a());
                        var12_18.a(var7_14.f());
                        if (var8_15 != null) {
                            var12_18.b(var4_5.r());
                            var12_18.c(var8_15.a());
                            var12_18.a(var7_14.a(var8_15.a()));
                        } else {
                            var12_18.a(var4_5.o());
                        }
                        azu_0.j().K().c(var12_18);
                        aln_2.a().c(new byd_0(bYe.a, var9_16.h().aT_(), var4_5.r(), 0));
                    }
                } else {
                    aUh.a("bagsFull", new Object[0]);
                }
                return;
            }
        }
        super.a(var1_1);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bsx_2 bsx_22 = cuu_0.a();
            bsx_22.w().g();
            fis_1.a().a("fleaDimensionalBag", bsx_22);
            this.l = new daq_0(this);
            fpm_0.b().a(this.l);
            super.a(aav_22, bl);
            fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("fleaDialog", cfi_0.a("fleaDialog"), 32769L, (short)10000);
            this.j = (fsQ)fvk_02.getElementMap().a("fleaList");
            fvk_0 fvk_03 = (fvk_0)fvk_02.getElementMap().a("dimensionalBagWindow");
            this.i = new dar_0(this, fvk_03);
            this.j.addListContentListener(this.i);
            this.a(fvk_02);
            fis_1.a().a("editableDimensionalBag", bsx_22);
            azu_0.j().b(dei.a());
            azu_0.j().K().a(cfq_2.a());
            fpm_0.b().a("wakfu.dimensionalBagFlea", cga_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_0.j().k().a(false, true);
            this.j.removeListContentLoadListener(this.i);
            this.j = null;
            this.i = null;
            fis_1.a().a("fleaDimensionalBag");
            fpm_0.b().b(this.l);
            fpm_0.b().o("fleaDialog");
            fpm_0.b().e("wakfu.dimensionalBagFlea");
            azu_0.j().a(dei.a());
            azu_0.j().K().b(cfq_2.a());
            this.k = null;
            super.b(aav_22, bl);
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

