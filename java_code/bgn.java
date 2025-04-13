/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bgn
implements TObjectProcedure<bgw> {
    final /* synthetic */ bgm a;

    bgn(bgm bgm2) {
        this.a = bgm2;
    }

    public boolean a(bgw bgw2) {
        this.a.l.put(bgw2.a(), (Object)new bgq(bgw2));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bgw)object);
    }
}

