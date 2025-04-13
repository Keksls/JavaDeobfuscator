/*
 * Decompiled with CFR 0.152.
 */
public class abe
extends aap_0 {
    public abe(int n) {
        super(n, new aat_0[]{new aav_0("r"), new aav_0("g"), new aav_0("b")});
    }

    @Override
    public aas_0 c() {
        return new abf(this);
    }

    @Override
    public void a(ZZ[] zZArray) {
        for (int k = 0; k < zZArray.length; ++k) {
            zZArray[k].a(1.0f);
        }
    }
}

