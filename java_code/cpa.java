/*
 * Decompiled with CFR 0.152.
 */
public abstract class cpa
extends Pw {
    private final faB a;

    cpa(faB faB2) {
        this.a = faB2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2(faB.i());
        this.a.a(abx_22);
        return this.a((byte)3, abx_22.c());
    }
}

