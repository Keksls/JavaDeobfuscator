/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckl
 */
public abstract class ckl_0
extends Pw {
    private String a;

    public void a(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        return this.a(new abx_2());
    }

    private void b(abx_2 abx_22) {
        abx_22.a(this.a);
    }

    byte[] a(abx_2 abx_22) {
        this.b(abx_22);
        return this.a((byte)3, abx_22.c());
    }
}

