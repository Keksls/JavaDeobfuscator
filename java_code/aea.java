/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class aea
implements TObjectProcedure<adS> {
    final /* synthetic */ adZ a;

    aea(adZ adZ2) {
        this.a = adZ2;
    }

    public boolean a(adS adS2) {
        if (adS2.b() && adS2.e() != 0.0f) {
            adS2.a(this.a.c, 1.0f);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((adS)object);
    }
}

