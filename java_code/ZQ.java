/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class ZQ
implements TObjectProcedure<ZS> {
    final /* synthetic */ ZN a;

    ZQ(ZN zN) {
        this.a = zN;
    }

    public boolean a(ZS zS) {
        try {
            zS.a();
            zS.d();
            if (zS.b()) {
                this.a.g.add(zS.b);
            }
        }
        catch (Exception exception) {
            ZN.a.error((Object)"", (Throwable)exception);
        }
        zS.c();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ZS)object);
    }
}

