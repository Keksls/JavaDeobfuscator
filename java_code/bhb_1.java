/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHb
 */
public class bhb_1
extends bgy_0 {
    private final bHi l;

    public bhb_1(bHi bHi2) {
        this.l = bHi2;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "bagInventory": {
                return this.l.e();
            }
            case "bagSize": {
                return this.l.e().length;
            }
            case "canBeSorted": {
                return false;
            }
        }
        return null;
    }

    public String toString() {
        return "AllBagsView{m_bag=" + this.l + "}";
    }
}

