/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bso
 */
public class bso_1
extends ffe {
    bso_1() {
        super(azu_0.j().n().u(), -1L, "<undefined>", -1L, bsq_0.a, bsp_1.b, new ffg());
        this.j().a(this);
    }

    public final boolean a(short s2, short s3) {
        return this.e(s2, s3);
    }

    @Override
    public void a(yx_0 yx_02) {
        super.a(yx_02);
        bNT.f().a((TObjectProcedure<bNK>)((TObjectProcedure)bNK2 -> {
            bNK2.aM();
            return true;
        }));
    }

    public void a(aoc_0 aoc_02) {
        xk_0 xk_02 = this.a((int)aoc_02.a(), (int)aoc_02.b());
        aoc_02.a(xk_02);
    }

    public void a() {
        for (feY feY2 : this.j) {
            if (!(feY2 instanceof ffi)) continue;
            ffi ffi2 = (ffi)feY2;
            ffi2.k();
        }
        if (azu_0.j().n().u() != this.b) {
            bgg.a.e(this.b);
        }
    }

    @Override
    protected void b() {
    }
}

