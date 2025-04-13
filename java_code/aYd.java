/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

class aYd
implements TIntObjectProcedure<bhj_1> {
    final /* synthetic */ Pattern a;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ int[] c;
    final /* synthetic */ aXZ d;

    aYd(aXZ aXZ2, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.d = aXZ2;
        this.a = pattern;
        this.b = stringBuilder;
        this.c = nArray;
    }

    public boolean a(int n, bhj_1 bhj_12) {
        String string = bae.h().a(62, (long)bhj_12.a(), new Object[0]);
        if (string == null) {
            return true;
        }
        if (this.a.matcher(string.toLowerCase()).find()) {
            this.b.append(n).append(" : ").append(string).append("\r\n");
            this.c[0] = this.c[0] + 1;
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bhj_1)object);
    }
}

