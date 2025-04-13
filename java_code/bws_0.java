/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bwS
 */
class bws_0 {
    bMn a;
    final /* synthetic */ bwr_0 b;

    bws_0(bwr_0 bwr_02) {
        this.b = bwr_02;
    }

    public boolean a() {
        if (this.b.a.af_() != emr_2.c) {
            return false;
        }
        this.a = this.b();
        if (this.a == null) {
            bwr_0.f.error((Object)String.format("Fight id=%d de type %s sans protecteur.", new Object[]{this.b.a.c(), emr_2.c}));
            return false;
        }
        return this.a.m().Y() == 1 - this.b.c;
    }

    private bMn b() {
        for (blx_1 blx_12 : this.b.a.j()) {
            bMn bMn2 = this.a(blx_12);
            if (bMn2 == null) continue;
            return bMn2;
        }
        return null;
    }

    @Nullable
    private bMn a(blx_1 blx_12) {
        if (blx_12.gY() != 1 || !(blx_12 instanceof bmv_1)) {
            return null;
        }
        bmv_1 bmv_12 = (bmv_1)blx_12;
        return bmv_12.cB();
    }
}

