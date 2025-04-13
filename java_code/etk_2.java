/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eTK
 */
public class etk_2
extends etl_2 {
    private final ArrayList<etx_2> a = new ArrayList();
    private final boolean b;
    private final int c;
    private final int d;

    public etk_2(short s2, int n, int n2, int n3, boolean bl, short s3) {
        super(s2, n, s3);
        this.c = n2;
        this.d = n3;
        this.b = bl;
    }

    @Override
    public int a() {
        return eta_2.b(this).b();
    }

    public boolean b() {
        return eta_2.b(this).i();
    }

    public int c() {
        return eta_2.b(this).g();
    }

    public int d() {
        return eta_2.b(this).e();
    }

    public int e() {
        return eta_2.b(this).f();
    }

    public boolean f() {
        return this.b;
    }

    public void a(int n, int n2) {
        this.a.add(new etx_2(n, n2));
    }

    public boolean a(TObjectProcedure<etx_2> tObjectProcedure) {
        for (int k = 0; k < this.a.size(); ++k) {
            if (tObjectProcedure.execute((Object)this.a.get(k))) continue;
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", m_conditions=" + this.a + ", m_buyable=" + this.b + "}";
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof etk_2)) {
            return false;
        }
        etk_2 etk_22 = (etk_2)object;
        return this.i() == etk_22.i();
    }

    public int hashCode() {
        return this.i();
    }
}

