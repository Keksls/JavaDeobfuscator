/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bvP
 */
class bvp_1
implements TObjectProcedure<eve_1> {
    final /* synthetic */ bvo_1 a;

    bvp_1(bvo_1 bvo_12) {
        this.a = bvo_12;
    }

    public boolean a(eve_1 eve_12) {
        this.a.s.add(new bvk_1(eve_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eve_1)object);
    }
}

