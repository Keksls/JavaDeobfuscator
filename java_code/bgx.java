/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class bgx
implements eEJ {
    private final int b;
    private final ArrayList<bgw> c = new ArrayList();
    private int d;
    private int e;
    private final eEI[] f = new eEI[20];
    private final een_0[] g = new een_0[20];

    bgx(int n) {
        this.b = n;
    }

    void a(bgw bgw2) {
        this.c.add(bgw2);
    }

    public void a(TObjectProcedure<bgw> tObjectProcedure) {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            if (tObjectProcedure.execute((Object)this.c.get(k))) continue;
            return;
        }
    }

    @Override
    public int a(int n) {
        return this.d + n * this.e;
    }

    public eEH a(int n, eEK eEK2) {
        int n2 = een_0.a(n);
        return this.f[n2].a(eEK2);
    }

    public boolean a(TObjectProcedure<eel_0> tObjectProcedure, int n) {
        int n2 = een_0.a(n);
        return this.g[n2].a(tObjectProcedure);
    }

    public boolean a(TObjectProcedure<eel_0> tObjectProcedure, int n, eEK eEK2) {
        int n2 = een_0.a(n);
        eEH eEH2 = this.a(n, eEK2);
        return this.g[n2].a(tObjectProcedure, eEK2.o(), eEH2);
    }

    public String a() {
        return bae.h().a(117, (long)this.b, new Object[0]);
    }

    public String b() {
        return bae.h().a(116, (long)this.b, new Object[0]);
    }

    void a(aqt_0 aqt_02, boolean bl) {
        assert (this.f[aqt_02.a()] == null);
        this.f[aqt_02.a()] = new eEI(aqt_02.e(), aqt_02.d(), aqt_02.c(), aqt_02.b(), bl);
    }

    void a(aqv_0 aqv_02) {
        assert (this.g[aqv_02.b()] == null);
        een_0 een_02 = new een_0();
        for (aQu aQu2 : aqv_02.c()) {
            een_02.a(eel_0.a(aQu2.b(), aQu2.c(), aQu2.a(), aQu2.d()));
        }
        this.g[aqv_02.b()] = een_02;
    }

    void a(int n, int n2) {
        this.d = n;
        this.e = n2;
    }

    public String toString() {
        return "DungeonDefinition{m_id=" + this.b + "}";
    }
}

