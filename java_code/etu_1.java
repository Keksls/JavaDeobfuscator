/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTU
 */
public class etu_1
implements TObjectProcedure<etw_2> {
    private final short a;
    private long b;
    private long c;

    public etu_1(short s2) {
        this.a = s2;
    }

    public boolean a(etw_2 etw_22) {
        if (this.a(etw_22.a()) || this.a == etw_22.a()) {
            this.b += (long)etw_22.b();
            this.c += (long)etw_22.g();
        }
        return true;
    }

    private boolean a(short s2) {
        etg_2 etg_22 = eti_2.a.b(s2);
        while (etg_22 != null) {
            if (etg_22.c() == this.a) {
                return true;
            }
            etg_22 = eti_2.a.b(etg_22.c());
        }
        return false;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((etw_2)object);
    }
}

