/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cni
 */
public class cni_0
extends Pw {
    private boolean a;

    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public byte[] b() {
        byte[] byArray = new byte[]{this.a ? (byte)1 : 0};
        return this.a((byte)3, byArray);
    }

    @Override
    public int a() {
        return 13240;
    }
}

