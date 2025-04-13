/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eww
 */
public class eww_0
extends erO {
    public eww_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        switch (by) {
            case 0: {
                this.b = false;
                break;
            }
            case 1: {
                String string = ((apd_2)arrayList.get(0)).b();
                if (!string.equalsIgnoreCase("target")) break;
                this.b = true;
            }
        }
    }

    @Override
    protected boolean a(un_0 un_02) {
        return un_02 == un_0.a;
    }

    @Override
    public Enum c() {
        return eyO.x;
    }
}

