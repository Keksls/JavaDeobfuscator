/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongShortProcedure
 */
import gnu.trove.procedure.TLongShortProcedure;

class TM
implements TLongShortProcedure {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ TL b;

    TM(TL tL, StringBuilder stringBuilder) {
        this.b = tL;
        this.a = stringBuilder;
    }

    public boolean execute(long l, short s2) {
        this.a.append(l).append("=>").append(s2).append(' ');
        return true;
    }
}

