/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCW
 */
public class fcw_2
extends fzs {
    private frs_0 i;

    public fcw_2(fvk_0 fvk_02, frs_0 frs_02) {
        this.e = fvk_02;
        this.i = frs_02;
    }

    public frs_0 j() {
        return this.i;
    }

    @Override
    public frd_0 f() {
        return frd_0.O;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.i = null;
    }
}

