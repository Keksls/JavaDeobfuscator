/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bSV
 */
class bsv_1
implements bsb_2 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bSO b;

    bsv_1(bSO bSO2, Runnable runnable) {
        this.b = bSO2;
        this.a = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(List<bsv_0<?, ?>> list, List<bsv_0<?, ?>> list2, List<bss_0<?, ?>> list3) {
        Object object = this.b.w;
        synchronized (object) {
            this.b.B = btn_1.b;
            this.b.C.a(btv_0.a);
            this.c(list);
            this.a(list2);
            this.b(list3);
            this.a.run();
            this.b.M = null;
            for (bSN bSN2 : new ArrayList<bSN>(this.b.E)) {
                bSN2.c();
            }
            fis_1.a().a((ajf_1)this.b, "mode", "currentCategory", "parentCategory");
        }
    }

    private void a(List<bsv_0<?, ?>> list) {
        this.b.L.clear();
        this.b.L.addAll(list);
        fis_1.a().a((ajf_1)this.b, "highlights");
    }

    private void b(List<bss_0<?, ?>> list) {
        this.b.J.clear();
        this.b.J.addAll(list);
        fis_1.a().a((ajf_1)this.b, "homeArticles");
    }

    private void c(List<bsv_0<?, ?>> list) {
        this.b.I.clear();
        this.b.I.addAll(list);
        fis_1.a().a((ajf_1)this.b, "carrousel");
    }

    @Override
    public void a() {
        bSO.s.warn((Object)"Error occured during load of shop home.");
    }
}

