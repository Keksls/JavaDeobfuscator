/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from dds
 */
public class dds_0
implements ahr_1,
fzi {
    protected static final Logger a = Logger.getLogger(dds_0.class);
    private static final dds_0 b = new dds_0();
    boolean c = false;
    private bmr_1 d;
    private ans_1 e;

    public static dds_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17346: {
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                this.a((bmr_1)euw_2.a.d(l));
                return false;
            }
            case 16750: {
                this.e();
                return false;
            }
            case 17553: {
                Object object;
                exk_2 exk_22;
                dgL dgL2 = (dgL)adt_12;
                bmr_1 bmr_12 = (bmr_1)euu_2.b(this.d.U_(), dgL2.t());
                exk_2 exk_23 = dgL2.o();
                short s2 = dgL2.r();
                if (!(dgL2.t() == -1L || (exk_22 = ((exg_2)(object = bmr_12.da().d(dgL2.t()))).a(s2)) == null || exk_22.aR_() > 1 && exk_22.a(exk_23) && exk_22.e() != exk_22.aR_())) {
                    return false;
                }
                object = new cob_0();
                ((cnO)object).c(dgL2.t());
                ((cob_0)object).a(s2);
                ((cob_0)object).b(dgL2.u());
                ((cnO)object).b(exk_23.a());
                azu_0.j().K().c(object);
                return false;
            }
        }
        return true;
    }

    public bmr_1 c() {
        return this.d;
    }

    public void d() {
        if (this.d == null || this.d.a_() <= 0L) {
            return;
        }
        this.f();
    }

    public void b(long l) {
        if (this.d == null || this.d.a_() <= 0L) {
            return;
        }
        this.f();
        if (this.d.a_() != l) {
            return;
        }
        this.a(azu_0.j().k());
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        if (string.equals("temporaryTransferInventoryDialog")) {
            this.e();
            return fzh.d;
        }
        return fzh.a;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("temporaryInventory.currentDragItemId", -1);
            this.e = new ddt_0(this);
            fpm_0.b().a(this.e);
            cff_0.b().a(this);
            fpm_0.b().a("temporaryTransferInventoryDialog", cfi_0.a("temporaryTransferInventoryDialog"), 32769L, (short)10000);
            bmr_1 bmr_12 = azu_0.j().k();
            this.a(bmr_12);
            bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
            fis_1.a().a("characterSheet", (Object)bmk_12, "temporaryTransferInventoryDialog");
            this.f();
            fpm_0.b().a("wakfu.temporaryInventory", cJR.class);
            fpm_0.b().a(bae.h().a("temporaryInventory.descr", new Object[0]), cfn_0.a(7), 514L, 102, 1);
        }
    }

    private void a(bmr_1 bmr_12) {
        this.d = bmr_12;
        fis_1.a().a("localPlayer", (Object)this.d, "temporaryTransferInventoryDialog");
        fis_1.a().a("characterSheet", (Object)bzg_1.a.a((bnh_1)euw_2.a.d(this.d.a_())), "temporaryTransferInventoryDialog");
    }

    private void f() {
        if (this.d == null) {
            return;
        }
        ArrayList<bmr_1> arrayList = new ArrayList<bmr_1>();
        for (long l : euw_2.a.e(this.d.U_())) {
            exb_2 exb_22;
            bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
            if (bmr_12 == null || (exb_22 = (exb_2)bmr_12.a(ewl_1.b)).e()) continue;
            arrayList.add(bmr_12);
        }
        if (arrayList.isEmpty()) {
            azu_0.j().b(b);
            return;
        }
        if (((exb_2)this.d.a(ewl_1.b)).e()) {
            this.a((bmr_1)arrayList.get(0));
        }
        fis_1.a().a("heroesParty", arrayList, "temporaryTransferInventoryDialog");
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (fpm_0.b().q("splitStackDialog")) {
                fpm_0.b().o("splitStackDialog");
            }
            fis_1.a().a("temporaryInventory.currentDragItemId");
            fis_1.a().a("localPlayer", (Object)null, "temporaryTransferInventoryDialog");
            fpm_0.b().b(this.e);
            cff_0.b().b(this);
            fpm_0.b().o("temporaryTransferInventoryDialog");
            fpm_0.b().e("wakfu.temporaryInventory");
            this.c = false;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void e() {
        if (this.c) {
            return;
        }
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("temporaryInventory.reallyMove", new Object[0]), cfn_0.a(7), 4102L, 102, 1);
        fzm_02.a(new ddu(this));
        this.c = true;
    }
}

