/*
 * Decompiled with CFR 0.152.
 */
class cWS
extends blw_1 {
    private final bks_1 e;
    final /* synthetic */ cwk_0 d;

    private cWS(cwk_0 cwk_02) {
        this.d = cwk_02;
        super(null);
        this.e = new cwt_0(this);
    }

    @Override
    public String[] d() {
        return bks_1.y;
    }

    @Override
    public Object b(String string) {
        if (string.equals("breedInfo")) {
            return this.e;
        }
        return super.b(string);
    }
}

