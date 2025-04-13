/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;

/*
 * Renamed from aAJ
 */
public class aaj_1
extends aad_1 {
    public aaj_1(float f2, boolean bl) {
        super(f2, bl);
    }

    public aaj_1(float f2, boolean bl, boolean bl2) {
        super(f2, bl, bl2);
    }

    @Override
    public void e() {
        super.e();
        aal_1 aal_12 = new aal_1(0.0f, 0.0f);
        TIntArrayList tIntArrayList = new TIntArrayList();
        this.e(this.b());
        tIntArrayList.add(this.i.size() - 1);
        while (tIntArrayList.size() != 0) {
            int n = tIntArrayList.size();
            int n2 = this.a.nextInt() % n;
            int n3 = tIntArrayList.get(n2);
            afq_2 afq_22 = (afq_2)this.i.get(n3);
            tIntArrayList.set(n2, tIntArrayList.get(n - 1));
            tIntArrayList.removeAt(n - 1);
            aal_12.a(0.0f, 1.5707964f);
            this.a(n3, aal_12);
            ArrayList<aam_1> arrayList = aal_12.a();
            while (arrayList.size() != 0) {
                aam_1 aam_12 = arrayList.get(this.a.nextInt() % arrayList.size());
                float f2 = aam_12.a + (aam_12.b - aam_12.a) * this.a.nextFloat();
                afq_2 afq_23 = this.b(new afq_2(afq_22.a + Hw.g(f2) * 2.0f * this.g, afq_22.b + Hw.f(f2) * 2.0f * this.g));
                this.e(afq_23);
                tIntArrayList.add(this.i.size() - 1);
                aal_12.b(f2 - 1.0471976f, f2 + 1.0471976f);
            }
        }
    }
}

