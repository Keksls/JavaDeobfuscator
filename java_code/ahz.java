/*
 * Decompiled with CFR 0.152.
 */
class ahz
implements ahA {
    final /* synthetic */ ahB a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ahy f;

    ahz(ahy ahy2, ahB ahB2, int n, int n2, int n3, boolean bl) {
        this.f = ahy2;
        this.a = ahB2;
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = bl;
    }

    @Override
    public void a() {
        System.out.println("ON REJOUE UPDATE POSITION");
        this.f.a(this.a, this.b, this.c, this.d, this.e);
        this.f.g.remove(this);
    }
}

