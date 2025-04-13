/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fpN
 */
class fpn_0
implements TObjectProcedure<String> {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ fpm_0 b;

    fpn_0(fpm_0 fpm_02, StringBuilder stringBuilder) {
        this.b = fpm_02;
        this.a = stringBuilder;
    }

    public boolean a(String string) {
        this.a.append('\t').append(string).append('\n');
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((String)object);
    }
}

