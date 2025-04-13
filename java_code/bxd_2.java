/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxD
 */
public class bxd_2
implements ajh_1,
bxe_2 {
    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals("iconUrl")) {
            return azs_0.a().f(47212409);
        }
        if (string.equals("name")) {
            return bae.h().a("fakeGiftItemName", new Object[0]) + " x1";
        }
        if (string.equals("quantity")) {
            return 1;
        }
        if (string.equals("allowControls")) {
            return false;
        }
        return null;
    }

    @Override
    public boolean a(boolean bl) {
        return false;
    }
}

