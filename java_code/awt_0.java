/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from aWt
 */
class awt_0
implements TObjectProcedure<eok_1> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ aws_0 b;

    awt_0(aws_0 aws_02, ArrayList arrayList) {
        this.b = aws_02;
        this.a = arrayList;
    }

    public boolean a(eok_1 eok_12) {
        this.a.add(new awu_0(eok_12));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eok_1)object);
    }
}

