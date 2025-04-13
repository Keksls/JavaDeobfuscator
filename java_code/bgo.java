/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class bgo
implements TObjectProcedure<eel_0> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ bgm b;

    bgo(bgm bgm2, ArrayList arrayList) {
        this.b = bgm2;
        this.a = arrayList;
    }

    public boolean a(eel_0 eel_02) {
        this.a.add(new bgs(eel_02));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eel_0)object);
    }
}

