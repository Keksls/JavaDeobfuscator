/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bOo
implements TObjectProcedure<bOk> {
    final /* synthetic */ bOn a;

    bOo(bOn bOn2) {
        this.a = bOn2;
    }

    public boolean a(bOk bOk2) {
        this.a.i.add(new bOm(bOk2));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bOk)object);
    }
}

