/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMM
 */
public class bmm_0
extends bmr_0 {
    private bmf_0 b;

    bmm_0() {
    }

    @Override
    public void a(bmf_0 bmf_02) {
        this.b = bmf_02;
    }

    public bmf_0 a() {
        return this.b;
    }

    @Override
    public bnm_0 b() {
        return bnm_0.b;
    }

    @Override
    public String[] c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return null;
        }
        String[] stringArray = new String[2];
        String string = null;
        if (bae.h().a(66, (long)this.b.e())) {
            string = bae.h().a(66, (long)this.b.e(), new Object[0]);
        }
        stringArray[0] = String.valueOf(string);
        stringArray[1] = String.valueOf(this.b.e() == bmr_12.bO() ? 1 : 0);
        return stringArray;
    }
}

