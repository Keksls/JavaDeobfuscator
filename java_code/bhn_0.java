/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bHn
 */
public class bhn_0
extends ewt_1
implements ajh_1,
exc_2 {
    public static final String a = "temporaryBagInventory";
    public static final String b = "temporaryBagSize";
    ArrayList<exk_2> d;

    public bhn_0(exb_2 exb_22) {
        super(exb_22);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            if (this.d == null) {
                this.f();
            }
            return this.d;
        }
        if (string.equals(b)) {
            return 2;
        }
        return null;
    }

    @Override
    protected exg_2 a(long l) {
        Object t = euu_2.b(azu_0.j().k().U_(), l);
        if (t == null) {
            return null;
        }
        return ((epq_2)t).dS().d(l);
    }

    private void e() {
        this.d = null;
        fis_1.a().a((ajf_1)this, a, b);
    }

    @Override
    public void a(exk_2 exk_22) {
        bmr_1 bmr_12;
        azu_0 azu_02 = azu_0.j();
        if (!azu_02.c(dds_0.a())) {
            azu_02.a(dds_0.a());
        }
        if ((bmr_12 = azu_02.k()) == null) {
            this.e();
            return;
        }
        ArrayList<bmr_1> arrayList = new ArrayList<bmr_1>();
        for (long l : euw_2.a.e(bmr_12.U_())) {
            exb_2 exb_22;
            bmr_1 bmr_13 = (bmr_1)euw_2.a.d(l);
            if (bmr_13 == null || (exb_22 = (exb_2)bmr_13.a(ewl_1.b)).e()) continue;
            arrayList.add(bmr_13);
        }
        fis_1.a().a("heroesParty", arrayList, "temporaryTransferInventoryDialog");
        aUh.b("temporaryInventory.itemAdded", exk_22.e(), exk_22.N());
        this.e();
    }

    @Override
    public void b(exk_2 exk_22) {
        exb_2 exb_22 = this.b();
        if (exb_22.e()) {
            Object object = fis_1.a().d("heroesParty", "temporaryTransferInventoryDialog");
            if (object instanceof List) {
                ArrayList arrayList = new ArrayList((List)object);
                arrayList.remove(dds_0.a().c());
                fis_1.a().a("heroesParty", arrayList, "temporaryTransferInventoryDialog");
            }
            boolean bl = true;
            for (long l : euw_2.a.e(azu_0.j().k().U_())) {
                exb_2 exb_23;
                bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
                if (bmr_12 == null || (exb_23 = (exb_2)bmr_12.a(ewl_1.b)).e()) continue;
                dfc dfc2 = new dfc(17346);
                dfc2.a(l);
                add_2.b().a(dfc2);
                bl = false;
                break;
            }
            if (azu_0.j().c(dds_0.a()) && bl) {
                azu_0.j().b(dds_0.a());
                return;
            }
        }
        this.e();
    }

    @Override
    public void c(exk_2 exk_22) {
        this.e();
    }

    @Override
    public void a() {
        this.e();
    }

    private void f() {
        this.d = new ArrayList();
        exb_2 exb_22 = this.b();
        exb_22.a(new bHo(this));
    }
}

