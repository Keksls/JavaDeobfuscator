/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from diW
 */
class diw_0
implements anr_1 {
    private final did_0 f;
    final /* synthetic */ akx_2 a;
    final /* synthetic */ String b;
    final /* synthetic */ akr_2[] c;
    final /* synthetic */ String d;
    final /* synthetic */ div_0 e;

    diw_0(div_0 div_02, akx_2 akx_22, String string, akr_2[] akr_2Array, String string2) {
        this.e = div_02;
        this.a = akx_22;
        this.b = string;
        this.c = akr_2Array;
        this.d = string2;
        this.f = new did_0(this.a, this.b, this.c);
    }

    @Override
    public void a(String string) {
        if (string.equals(this.d)) {
            this.f.a();
            anl_0.a().b(this.d);
        }
    }
}

