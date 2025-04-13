/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ayw
 */
class ayw_1
implements TObjectProcedure<THashMap<String, ayx_1>> {
    final /* synthetic */ ayv_1 a;

    ayw_1(ayv_1 ayv_12) {
        this.a = ayv_12;
    }

    public boolean a(THashMap<String, ayx_1> tHashMap) {
        tHashMap.forEachValue((TObjectProcedure)this.a.c);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((THashMap<String, ayx_1>)((THashMap)object));
    }
}

