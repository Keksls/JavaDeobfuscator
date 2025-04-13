/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bHo
implements TObjectProcedure<exk_2> {
    final /* synthetic */ bhn_0 a;

    bHo(bhn_0 bhn_02) {
        this.a = bhn_02;
    }

    public boolean a(exk_2 exk_22) {
        this.a.d.add(exk_22);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((exk_2)object);
    }
}

