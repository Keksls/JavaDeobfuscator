/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class brg
implements TObjectProcedure<eve_1> {
    brg() {
    }

    public boolean a(eve_1 eve_12) {
        brd_0.o.add(new bvk_1(eve_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eve_1)object);
    }
}

