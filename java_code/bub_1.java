/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bub
 */
class bub_1
implements TObjectProcedure<btZ> {
    final /* synthetic */ bua_0 a;

    bub_1(bua_0 bua_02) {
        this.a = bua_02;
    }

    public boolean a(btZ btZ2) {
        btZ2.h();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((btZ)object);
    }
}

