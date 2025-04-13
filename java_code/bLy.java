/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class bLy
implements TObjectProcedure<esy_2> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ccy_2 b;

    bLy(ArrayList arrayList, ccy_2 ccy_22) {
        this.a = arrayList;
        this.b = ccy_22;
    }

    public boolean a(esy_2 esy_22) {
        etw_2 etw_22 = esy_22.g();
        if (!etw_22.i()) {
            etz_2 etz_22 = (etz_2)etw_22;
            String string = bLx.a(etz_22);
            fjh_1 fjh_12 = bLx.b(etz_22);
            int n = esy_22.h() + esy_22.m().d() / 2;
            int n2 = esy_22.i() + esy_22.m().e() / 2;
            this.a.add(new fjg_1(n, n2, 0.0f, this.b.o(), string, esy_22, fjh_12, bLx.b));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esy_2)object);
    }
}

