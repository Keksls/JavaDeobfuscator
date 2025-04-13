/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eTR
 */
public class etr_1
implements TObjectProcedure<esy_2> {
    private final short a;
    private int b;

    public etr_1(short s2) {
        this.a = this.a(s2);
    }

    public boolean a(esy_2 esy_22) {
        if (this.a == this.a(esy_22.g().a())) {
            ++this.b;
        }
        return true;
    }

    private short a(short s2) {
        short s3 = s2;
        etg_2 etg_22 = eti_2.a.b(s2);
        while (etg_22 != null) {
            s3 = etg_22.c();
            etg_22 = eti_2.a.b(etg_22.c());
        }
        return s3;
    }

    public int a() {
        return this.b;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esy_2)object);
    }
}

