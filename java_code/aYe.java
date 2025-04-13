/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

class aYe
implements TIntObjectProcedure<bph_0> {
    final /* synthetic */ Pattern a;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ int[] c;
    final /* synthetic */ aXZ d;

    aYe(aXZ aXZ2, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.d = aXZ2;
        this.a = pattern;
        this.b = stringBuilder;
        this.c = nArray;
    }

    public boolean a(int n, bph_0 bph_02) {
        try {
            if (this.a.matcher(bph_02.b().toLowerCase()).find()) {
                this.b.append(n).append(" : ").append(bph_02.b()).append("\r\n");
                this.c[0] = this.c[0] + 1;
            }
        }
        catch (Exception exception) {
            aVo.a().a("Probl\u00e8me de data pour l'item " + n, 0xFF0000);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bph_0)object);
    }
}

