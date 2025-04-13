/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHz
 */
public class bhz_1
implements ajh_1 {
    private boolean a = false;

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        if (string.equals("isEmptySlot")) {
            return true;
        }
        if (string.equals("isEnabled")) {
            return true;
        }
        if (string.equals("darkened")) {
            return this.a;
        }
        return null;
    }

    public void a(boolean bl) {
        this.a = bl;
    }
}

