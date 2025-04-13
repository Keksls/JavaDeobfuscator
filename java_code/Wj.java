/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;
import java.util.List;

class Wj
implements TLongProcedure {
    final /* synthetic */ short a;
    final /* synthetic */ va_0 b;
    final /* synthetic */ Wg c;

    Wj(Wg wg, short s2, va_0 va_02) {
        this.c = wg;
        this.a = s2;
        this.b = va_02;
    }

    public boolean execute(long l) {
        List list;
        List list2 = (List)this.c.b.get(this.a);
        if (list2 != null) {
            this.c.a(l, this.b, list2);
        }
        if ((list = (List)this.c.c.get(this.a)) != null) {
            this.c.a(l, this.b, list);
        }
        return true;
    }
}

