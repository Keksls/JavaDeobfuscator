/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eyM
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eyM(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> b() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(false, object, object2, object4, object3);
        if (!(object3 instanceof ejh_0)) {
            return -1;
        }
        ejh_0 ejh_02 = (ejh_0)object3;
        efi_0 efi_02 = this.a(ejh_02);
        if (!(efi_02 instanceof fio_0)) {
            return -1;
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return -1;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        aff_1 aff_12 = this.c(object, object2, object3, object4);
        if (aff_12 == null) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        fio_0 fio_02 = (fio_0)efi_02;
        emb_1<fio_0, epq_2> emb_12 = new emb_1<fio_0, epq_2>(elm_02);
        Object Spell = fio_02.r();
        boolean bl = ((fin_0)Spell).d(fio_02, (Object)epq_22, object2, object4);
        int n = ((fin_0)Spell).i(fio_02, epq_22, object2, object4);
        int n2 = ((fin_0)Spell).j(fio_02, epq_22, object2, object4);
        boolean bl2 = ((fin_0)Spell).a(fio_02, (Object)epq_22, object2, object4);
        boolean bl3 = ((fin_0)Spell).f(fio_02, epq_22, object2, object4);
        boolean bl4 = ((fin_0)Spell).n();
        boolean bl5 = ((fin_0)Spell).l(fio_02, epq_22, object2, object4);
        apc_2 apc_22 = ((fin_0)Spell).p();
        fir_0 fir_02 = emb_12.a(epq_22, fio_02, aff_12, bl, n2, n, bl2, bl3, bl4, bl5, apc_22);
        epq_2 epq_23 = erQ.a(eyJ.c, object, object2, object4, object3);
        boolean bl6 = emb_1.a(epq_22, aff_12, fio_02, epq_23, elm_02);
        if (fir_02 == fir_0.a && bl6) {
            return -1;
        }
        return 0;
    }

    protected efi_0 a(ejh_0 ejh_02) {
        return (efi_0)ejh_02.k();
    }

    protected aff_1 c(Object object, Object object2, Object object3, Object object4) {
        return erQ.d(true, object, object2, object4, object3);
    }

    @Override
    public Enum c() {
        return eyO.fX;
    }

    protected /* synthetic */ List i() {
        return this.b();
    }

    static {
        a.add(esa_0.i);
    }
}

