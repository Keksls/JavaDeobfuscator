/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from bSU
 */
class bsu_0
implements bsa_2 {
    final /* synthetic */ boolean a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ bSO c;

    bsu_0(bSO bSO2, boolean bl, Runnable runnable) {
        this.c = bSO2;
        this.a = bl;
        this.b = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(List<bSt<?>> list) {
        Iterator<bSN> iterator = this.c.w;
        synchronized (iterator) {
            if (!this.a) {
                this.c.B = btn_1.c;
            }
            TObjectProcedure object = bSt2 -> {
                this.c.H.add((bSt<?>)bSt2);
                return true;
            };
            bSO.s.info((Object)"Web shop categories loaded");
            this.c.G.clear();
            this.c.G.addAll(list);
            list.forEach(bSt2 -> bSt2.a(object));
            this.c.U = 3;
        }
        fis_1.a().a((ajf_1)this.c, "categories", "rootCategories", "parentCategory");
        this.b.run();
        for (bSN bSN2 : new ArrayList<bSN>(this.c.E)) {
            bSN2.d();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a() {
        bSO.s.warn((Object)"Error occured during load of shop categories.");
        Object object = this.c.w;
        synchronized (object) {
            this.c.U = 1;
        }
    }
}

