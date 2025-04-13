/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bta
implements TObjectProcedure<ezb_2> {
    final /* synthetic */ bsZ a;

    bta(bsZ bsZ2) {
        this.a = bsZ2;
    }

    public boolean a(ezb_2 ezb_22) {
        btb btb2 = new btb(ezb_22.a());
        this.a.y.put(ezb_22.a(), (Object)btb2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ezb_2)object);
    }
}

