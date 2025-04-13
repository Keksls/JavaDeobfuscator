/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fur
 */
public class fur_0
extends fvE {
    public static final String TAG = "spacer";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
    }
}

