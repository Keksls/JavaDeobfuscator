/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 */
import gnu.trove.procedure.TObjectObjectProcedure;

/*
 * Renamed from auK
 */
class auk_1
implements TObjectObjectProcedure<String, String> {
    final /* synthetic */ aui_1 a;

    auk_1(aui_1 aui_12) {
        this.a = aui_12;
    }

    public boolean a(String string, String string2) {
        aug_1 aug_12 = this.a.b(string);
        aug_12.a(string, string2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }
}

