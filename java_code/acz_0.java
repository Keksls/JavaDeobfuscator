/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from acZ
 */
public final class acz_0
extends add_0<aci_0> {
    private boolean c = true;

    public acz_0() {
        super(new ada_0());
    }

    @Override
    protected void a(aci_0 aci_02) {
        if (this.c) {
            aci_02.a();
        }
    }

    @Override
    public void a() {
        for (aci_0 aci_02 : this.a) {
            aci_02.a();
        }
        super.a();
    }

    @Override
    public void a(boolean bl) {
        this.c = bl;
    }
}

