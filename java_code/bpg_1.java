/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bpg
 */
public class bpg_1 {
    protected abc_2<bpk_1> a;
    protected abc_2<bpj_1> b;
    protected bpi_1[] c;

    public void a(bpk_1[] bpk_1Array) {
        if (bpk_1Array == null || bpk_1Array.length == 0) {
            this.a = null;
            return;
        }
        this.a = new abc_2();
        for (bpk_1 bpk_12 : bpk_1Array) {
            this.a(bpk_12);
        }
    }

    public void a(bpk_1 bpk_12) {
        if (this.a == null) {
            this.a = new abc_2<bpk_1>(new bpk_1[]{bpk_12});
            return;
        }
        boolean[] blArray = new boolean[]{false};
        this.a(new bph_1(this, bpk_12, blArray));
        if (!blArray[0]) {
            this.a.a(bpk_12);
        }
    }

    public void a(bpj_1[] bpj_1Array) {
        this.b = bpj_1Array == null ? null : new abc_2<bpj_1>(bpj_1Array);
    }

    public void a(bpj_1 bpj_12) {
        if (this.b == null) {
            this.b = new abc_2<bpj_1>(new bpj_1[]{bpj_12});
        } else {
            this.b.a(bpj_12);
        }
    }

    public void a(bpi_1[] bpi_1Array) {
        this.c = bpi_1Array;
    }

    public boolean a() {
        return this.a != null && this.a.a() > 0;
    }

    public void a(TObjectProcedure<bpk_1> tObjectProcedure) {
        if (this.a == null) {
            return;
        }
        this.a.a(tObjectProcedure);
    }

    public void b(TObjectProcedure<bpj_1> tObjectProcedure) {
        if (this.b == null) {
            return;
        }
        this.b.a(tObjectProcedure);
    }

    public bpi_1[] b() {
        return this.c;
    }
}

