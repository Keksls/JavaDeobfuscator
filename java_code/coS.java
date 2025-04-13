/*
 * Decompiled with CFR 0.152.
 */
public class coS
extends Pw {
    private final faC a;

    @Override
    public byte[] b() {
        byte[] byArray = this.a.b();
        abx_2 abx_22 = new abx_2(byArray.length + 1);
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12383;
    }

    public coS(faC faC2) {
        this.a = faC2;
    }
}

