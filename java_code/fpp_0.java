/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fpP
 */
class fpp_0
implements TObjectProcedure<fyb_0> {
    final /* synthetic */ Collection a;
    final /* synthetic */ fpm_0 b;

    fpp_0(fpm_0 fpm_02, Collection collection) {
        this.b = fpm_02;
        this.a = collection;
    }

    public boolean a(fyb_0 fyb_02) {
        try {
            if (!fyb_02.isUnloading() && "MRU".equals(fyb_02.getElementMap().c())) {
                this.a.add(fyb_02);
            }
        }
        catch (Exception exception) {
            fpm_0.C.error((Object)"Exception lev\u00e9e lors du parcours des \u00e9l\u00e9ments charg\u00e9s pour pouvoir fermer les MRU", (Throwable)exception);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fyb_0)object);
    }
}

