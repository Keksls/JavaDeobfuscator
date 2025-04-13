/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 */
import gnu.trove.procedure.TObjectObjectProcedure;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/*
 * Renamed from aKm
 */
class akm_2
implements TObjectObjectProcedure<String, ArrayList<Class>> {
    int a = 0;
    final /* synthetic */ akn_1[] b;
    final /* synthetic */ akl_1 c;

    akm_2(akl_1 akl_12, akn_1[] akn_1Array) {
        this.c = akl_12;
        this.b = akn_1Array;
    }

    public boolean a(String string, ArrayList<Class> arrayList) {
        String[] stringArray = new String[arrayList.size()];
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            stringArray[k] = arrayList.get(k).getName();
        }
        Constructor[] constructorArray = akl_1.a(stringArray);
        this.b[this.a++] = string.length() == 0 ? new akn_1(string, null, constructorArray) : new akn_1(string, constructorArray, null);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, Object object2) {
        return this.a((String)object, (ArrayList)object2);
    }
}

