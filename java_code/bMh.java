/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

class bMh
implements TIntObjectProcedure<azj_2> {
    final /* synthetic */ bMg a;

    bMh(bMg bMg2) {
        this.a = bMg2;
    }

    public boolean a(int n, azj_2 azj_22) {
        this.a.a(n, azj_22.v());
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (azj_2)object);
    }
}

