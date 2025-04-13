/*
 * Decompiled with CFR 0.152.
 */
public class cku
extends ps_0 {
    private boolean a;
    private boolean b;

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public boolean a(byte[] byArray) {
        this.a = byArray[0] == 1;
        this.b = byArray[1] == 1;
        return true;
    }

    @Override
    public int a() {
        return 13844;
    }
}

