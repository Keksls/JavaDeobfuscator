/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.regex.Pattern;

class aYc
implements TIntObjectProcedure<bpb_1> {
    final /* synthetic */ Pattern a;
    final /* synthetic */ StringBuilder b;
    final /* synthetic */ int[] c;
    final /* synthetic */ aXZ d;

    aYc(aXZ aXZ2, Pattern pattern, StringBuilder stringBuilder, int[] nArray) {
        this.d = aXZ2;
        this.a = pattern;
        this.b = stringBuilder;
        this.c = nArray;
    }

    public boolean a(int n, bpb_1 bpb_12) {
        if (this.a.matcher(bpb_12.f().toLowerCase()).find()) {
            this.b.append(n).append(" : ").append(bpb_12.f()).append("\r\n");
            this.c[0] = this.c[0] + 1;
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bpb_1)object);
    }
}

