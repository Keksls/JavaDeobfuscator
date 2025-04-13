/*
 * Decompiled with CFR 0.152.
 */
class cFt
implements bco_2 {
    final /* synthetic */ String a;

    cFt(String string) {
        this.a = string;
    }

    @Override
    public void a(String string) {
        String string2 = String.format(this.a, bae.h().f().i(), string);
        cfq_0.a(string2);
    }

    @Override
    public void a() {
        cfq_0.a.error((Object)"Impossible de linker le compte, on n'a pas pu r\u00e9cup\u00e9rer de token ICE");
    }
}

