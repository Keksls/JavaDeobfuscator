/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

/*
 * Renamed from atX
 */
class atx_1
implements TObjectProcedure<ato_2> {
    final /* synthetic */ atu_1 a;

    atx_1(atu_1 atu_12) {
        this.a = atu_12;
    }

    public boolean a(ato_2 ato_22) {
        List<FR> list = ato_22.b();
        for (FR fR : list) {
            if (fR == null || this.a.f.contains(fR)) continue;
            this.a.f.add(fR);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ato_2)object);
    }
}

