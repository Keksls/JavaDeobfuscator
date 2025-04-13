/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bsq
 */
public final class bsq_1
extends ext_2<bHN, bhm_0> {
    private float d;
    private float e;

    public float a() {
        return this.e;
    }

    @Override
    public void a(float f2) {
        this.e = f2;
    }

    public float b() {
        return this.d;
    }

    @Override
    public void b(float f2) {
        this.d = f2;
    }

    public ArrayList<bHN> a(boolean bl) {
        ArrayList<bHN> arrayList = new ArrayList<bHN>(bl ? this.i() : this.h());
        this.a(new bsr_1(this, bl, arrayList));
        return arrayList;
    }

    public bhm_0 a(wh_2 wh_22) {
        eyk_1 eyk_12 = wh_22.b >= 0 ? eyk_1.values()[wh_22.b & 0xFF] : null;
        bhm_0 bhm_02 = new bhm_0(wh_22.a, eyk_12, wh_22.c, wh_22.d);
        if (!bhm_02.b(wh_22)) {
            a.error((Object)"Erreur durant la d\u00e9s\u00e9rialisation du DimensionalBagFlea");
            return null;
        }
        this.a(bhm_02);
        return bhm_02;
    }

    public void c() {
        ArrayList<bHN> arrayList = this.a(false);
        for (int k = 0; k < arrayList.size(); ++k) {
            arrayList.get(k).release();
        }
    }

    @Override
    public void a(int n) {
    }
}

