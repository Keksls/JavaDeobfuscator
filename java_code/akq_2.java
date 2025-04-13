/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  org.apache.commons.lang3.StringUtils
 */
import gnu.trove.procedure.TObjectObjectProcedure;
import java.util.Collection;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from aKq
 */
class akq_2
implements TObjectObjectProcedure<String, Class> {
    final /* synthetic */ String a;
    final /* synthetic */ Collection b;
    final /* synthetic */ akp_1 c;

    akq_2(akp_1 akp_12, String string, Collection collection) {
        this.c = akp_12;
        this.a = string;
        this.b = collection;
    }

    public boolean a(String string, Class clazz) {
        if (StringUtils.contains((CharSequence)this.a, (CharSequence)string)) {
            this.b.add(new ako_1(string, clazz));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object, Object object2) {
        return this.a((String)object, (Class)object2);
    }
}

