/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

/*
 * Renamed from eOg
 */
class eog_2
implements TLongProcedure {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ eof_2 b;

    eog_2(eof_2 eof_22, StringBuilder stringBuilder) {
        this.b = eof_22;
        this.a = stringBuilder;
    }

    public boolean execute(long l) {
        this.a.append('(').append(l).append(':').append(this.b.a().a(l)).append("),");
        return true;
    }
}

