/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortShortProcedure
 */
import gnu.trove.procedure.TShortShortProcedure;

class enH
implements TShortShortProcedure {
    final /* synthetic */ abx_2 a;
    final /* synthetic */ enG b;

    enH(enG enG2, abx_2 abx_22) {
        this.b = enG2;
        this.a = abx_22;
    }

    public boolean execute(short s2, short s3) {
        this.a.a(s2);
        this.a.a(s3);
        return true;
    }
}

