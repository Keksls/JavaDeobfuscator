/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fpS
 */
class fps_0
implements TObjectProcedure<String> {
    final /* synthetic */ fpm_0 a;

    fps_0(fpm_0 fpm_02) {
        this.a = fpm_02;
    }

    public boolean a(String string) {
        fpm_0.C.info((Object)("Unloading " + string));
        if (this.a.J != null) {
            this.a.J.c(string);
        }
        for (ans_1 ans_12 : this.a.ac) {
            try {
                ans_12.dialogUnloaded(string);
            }
            catch (Exception exception) {
                fpm_0.C.error((Object)"Exception raised", (Throwable)exception);
            }
        }
        if (!this.a.ad.isEmpty()) {
            this.a.ac.removeAll(this.a.ad);
            this.a.ad.clear();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((String)object);
    }
}

