/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

class aYa
implements TIntObjectProcedure<fie_0> {
    final /* synthetic */ Pattern a;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ int[] c;
    final /* synthetic */ aXZ d;

    aYa(aXZ aXZ2, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.d = aXZ2;
        this.a = pattern;
        this.b = stringBuilder;
        this.c = nArray;
    }

    public boolean a(int n, fie_0 fie_02) {
        try {
            bpe_0 bpe_02 = (bpe_0)fie_02;
            String string = bpe_02.h().toLowerCase();
            System.out.println(string);
            if (this.a.matcher(string).find()) {
                this.b.append(n).append(" : ").append(fie_02.g()).append("\r\n");
                this.c[0] = this.c[0] + 1;
            }
        }
        catch (Exception exception) {
            aVo.a().a("Probl\u00e8me de data pour l'\u00e9tat " + n, 0xFF0000);
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (fie_0)object);
    }
}

