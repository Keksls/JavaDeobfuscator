/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

public class bNJ
extends fhg_0<bNI> {
    private static final bNJ b = new bNJ();

    public static bNJ a() {
        return b;
    }

    private bNJ() {
    }

    public boolean a(TObjectProcedure<bNI> tObjectProcedure) {
        return this.a.forEachValue(tObjectProcedure);
    }
}

