/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bzb
 */
public class bzb_2 {
    private final ArrayList<esl_2> a = new ArrayList();

    public boolean a(esl_2 esl_22) {
        return !this.a.contains(esl_22) && this.a.add(esl_22);
    }

    public boolean a(TObjectProcedure<esl_2> tObjectProcedure) {
        for (int k = 0; k < this.a.size(); ++k) {
            if (tObjectProcedure.execute((Object)this.a.get(k))) continue;
            return false;
        }
        return true;
    }
}

