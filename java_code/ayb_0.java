/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

/*
 * Renamed from aYb
 */
class ayb_0
implements TIntObjectProcedure<bhd_1> {
    final /* synthetic */ Pattern a;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ int[] c;
    final /* synthetic */ aXZ d;

    ayb_0(aXZ aXZ2, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.d = aXZ2;
        this.a = pattern;
        this.b = stringBuilder;
        this.c = nArray;
    }

    public boolean a(int n, bhd_1 bhd_12) {
        try {
            if (this.a.matcher(bhd_12.a().toLowerCase()).find()) {
                this.b.append(n).append(" : ").append(bhd_12.a()).append("\r\n");
                this.c[0] = this.c[0] + 1;
            }
        }
        catch (Exception exception) {
            aVo.a().a("Probl\u00e8me de data pour le set " + n, 0xFF0000);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bhd_1)object);
    }
}

