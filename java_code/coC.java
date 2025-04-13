/*
 * Decompiled with CFR 0.152.
 */
public class coC
extends Pw {
    private faC a;
    private final faK b;

    @Override
    public byte[] b() {
        byte[] byArray = this.a.b();
        abx_2 abx_22 = new abx_2(byArray.length + 1);
        abx_22.b(byArray);
        abx_22.a((byte)this.b.ordinal());
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13847;
    }

    public void a(faC faC2) {
        this.a = faC2;
    }

    public coC(faK faK2) {
        this.b = faK2;
    }
}

