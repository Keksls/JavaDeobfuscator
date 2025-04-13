/*
 * Decompiled with CFR 0.152.
 */
public class bUu
extends fce_0 {
    public bUu(faX faX2) {
        super(faX2);
        this.a(bVt.a);
    }

    @Override
    protected void a(int n, int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            this.d(n);
        }
        abd_2 abd_22 = this.e(n);
        abd_22.b();
        int n2 = nArray.length;
        for (int k = 0; k < n2; ++k) {
            abd_22.a(nArray[k]);
        }
    }

    @Override
    public void b(int n, int[] nArray) {
        throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
    }

    @Override
    public void c(int n, int[] nArray) {
        throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
    }

    @Override
    public void a(int n) {
        throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
    }

    @Override
    public void d(int n, int[] nArray) {
        this.a(n, nArray);
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            bmr_12.w(true);
        }
    }
}

