/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from ddi
 */
public class ddi_0
extends cVb {
    protected static final Logger b = Logger.getLogger(ddi_0.class);
    private static final ddi_0 c = new ddi_0();
    bqd_1 d;
    private ans_1 e;

    public static ddi_0 d() {
        return c;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        if (!bl) {
            Object object;
            this.e = new ddj(this);
            fpm_0.b().a(this.e);
            azu_0.j().b(dei.a());
            if (this.d != null && this.d.n() > 0) {
                object = new dfc();
                ((anw_1)object).a_(19126);
                ((anw_1)object).a((byte)0);
                add_2.b().a((adt_1)object);
            }
            object = (fvk_0)fpm_0.b().a("storageBoxDialog", cfi_0.a("storageBoxDialog"), 17L, (short)10000);
            this.a((fvk_0)object);
            fis_1.a().a("storageBox", this.d);
            fpm_0.b().a("wakfu.storageBox", cjo_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        if (!bl) {
            bmr_1 bmr_12;
            cjo_0.setDraggedItemId(-1L);
            if (this.d != null) {
                this.d.q();
                this.d = null;
            }
            if ((bmr_12 = azu_0.j().k()) != null && bmr_12.eE() != null) {
                bmr_12.a(false, true);
            }
            fpm_0.b().e("wakfu.collectMachine");
            fpm_0.b().b(this.e);
            if (fpm_0.b().q("storageBoxDialog")) {
                fpm_0.b().o("storageBoxDialog");
            }
            azu_0.j().a(dei.a());
            fis_1.a().a("storageBox");
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18520: {
                dgL dgL2 = (dgL)adt_12;
                byte by = (byte)dgL2.r();
                long l = dgL2.d();
                bpy_0 bpy_02 = this.d.o();
                if (bpy_02 == null) {
                    b.error((Object)"Aucun compartiment s\u00e9lectionn\u00e9 !");
                    return false;
                }
                bpy_02.a(l, by);
                return false;
            }
            case 16838: {
                dgL dgL3 = (dgL)adt_12;
                long l = dgL3.d();
                byte by = (byte)dgL3.r();
                bpy_0 bpy_03 = this.d.o();
                if (bpy_03 == null) {
                    b.error((Object)"Aucun compartiment s\u00e9lectionn\u00e9, impossible de r\u00e9aliser l'action de drop !!!");
                    return false;
                }
                exk_2 exk_22 = azu_0.j().k().da().i(l);
                bqs_1 bqs_12 = bpy_03.a(exk_22, dgL3.e(), by);
                switch (bqs_12) {
                    case b: {
                        b.warn((Object)"Error while dropping item to storage box, user does not have the rights");
                        aUh.a("storageBox.addItem.unauthorized", new Object[0]);
                        return false;
                    }
                    case c: {
                        b.warn((Object)"Inventory error occurred while dropping item to storage box");
                        aUh.a("storageBox.addItem.unauthorized", new Object[0]);
                        return false;
                    }
                }
                return false;
            }
            case 19489: {
                dgL dgL4 = (dgL)adt_12;
                long l = dgL4.t();
                bpy_0 bpy_04 = this.d.o();
                if (bpy_04 == null) {
                    b.error((Object)"Aucun compartiment s\u00e9lectionn\u00e9, impossible de r\u00e9aliser l'action de drop !!!");
                    return false;
                }
                exk_2 exk_23 = dgL4.o();
                bpy_04.a(exk_23.a(), exk_23.aT_(), dgL4.u(), l, (byte)dgL4.r());
                cjo_0.setDraggedItemId(-1L);
                return false;
            }
            case 16835: {
                dfc dfc2 = (dfc)adt_12;
                byte by = dfc2.b();
                bpy_0 bpy_05 = this.d.o();
                if (bpy_05 == null) {
                    b.error((Object)("impossible de retrouver le compartiment d'index=" + by));
                    return false;
                }
                bpy_05.g();
                return false;
            }
            case 19126: {
                dfc dfc3 = (dfc)adt_12;
                byte by = dfc3.b();
                if (this.d == null) {
                    return false;
                }
                bpy_0 bpy_06 = this.d.a(by);
                if (bpy_06 == null) {
                    b.error((Object)("impossible de retrouver le compartiment d'index=" + by));
                    return false;
                }
                this.a(bpy_06);
                return false;
            }
            case 19570: {
                dfc dfc4 = (dfc)adt_12;
                long l = dfc4.d();
                if (this.d.e() < l) {
                    String string = bae.h().a("error.storage.notEnoughMoneyInBox", new Object[0]);
                    fzn_0 fzn_02 = new fzn_0(102, 0, string, 2L);
                    fpm_0.b().a(fzn_02);
                    return false;
                }
                String string = bae.h().a(l);
                String string2 = bae.h().a("question.storage.withdrawConfirm", string);
                fzn_0 fzn_03 = new fzn_0(102, 0, string2, 24L);
                fzm_0 fzm_02 = fpm_0.b().a(fzn_03);
                fzm_02.a(new ddk_0(this, l));
                return false;
            }
            case 18155: {
                dfc dfc5 = (dfc)adt_12;
                long l = dfc5.d();
                if (azu_0.j().k().dK().a() < l) {
                    String string = bae.h().a("error.storage.notEnoughMoneyInPlayer", new Object[0]);
                    fzn_0 fzn_04 = new fzn_0(102, 0, string, 2L);
                    fpm_0.b().a(fzn_04);
                    return false;
                }
                String string = bae.h().a("question.storage.depositConfirm", l);
                fzn_0 fzn_05 = new fzn_0(102, 0, string, 24L);
                fzm_0 fzm_03 = fpm_0.b().a(fzn_05);
                fzm_03.a(new ddl(this, l));
                return false;
            }
        }
        return true;
    }

    public void a(bpy_0 bpy_02) {
        if (bpy_02.b() || bpy_02.c()) {
            bpy_02.i();
        }
        this.d.a(bpy_02);
        this.d.p();
    }

    @Override
    public long a_() {
        return 12L;
    }

    @Override
    public void a(long l) {
    }

    public void a(Map<Integer, Boolean> map, ery_1 ery_12, long l) {
        this.d = new bql_1(map, ery_12, l);
        fis_1.a().a("storageBox", this.d);
        dfc dfc2 = new dfc();
        dfc2.a_(19126);
        dfc2.a((byte)0);
        add_2.b().a(dfc2);
    }

    public void a(bfu_0 bfu_02) {
        this.d = new bqe_1(bfu_02.ao(), bfu_02.Z());
    }

    public bqd_1 e() {
        return this.d;
    }

    public void b(long l) {
        this.d.a(l);
    }

    public void f() {
        bpy_0 bpy_02 = this.d.o();
        bpy_02.e();
    }

    public void a(ewb_2 ewb_22) {
        bpy_0 bpy_02 = this.d.o();
        bpy_02.a(ewb_22);
        bpy_02.f();
    }

    public void a(km_0 km_02) {
        bql_1 bql_12 = (bql_1)this.d;
        ery_1 ery_12 = new ery_1();
        ery_12.a(km_02);
        bql_12.a(ery_12);
    }
}

