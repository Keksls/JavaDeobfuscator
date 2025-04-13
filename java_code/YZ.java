/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortObjectProcedure
 */
import gnu.trove.procedure.TShortObjectProcedure;

class YZ
implements TShortObjectProcedure<short[]> {
    final /* synthetic */ YY a;

    YZ(YY yY) {
        this.a = yY;
    }

    public boolean a(short s2, short[] sArray) {
        this.a.a(s2, sArray, true);
        return true;
    }

    public /* synthetic */ boolean execute(short s2, Object object) {
        return this.a(s2, (short[])object);
    }
}

