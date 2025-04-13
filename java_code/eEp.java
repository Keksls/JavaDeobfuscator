/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class eEp
implements eEx {
    eEp() {
    }

    @Override
    public boolean a(long l, ArrayList<eEv> arrayList) {
        if (arrayList.size() < 3) {
            return true;
        }
        return l > arrayList.get(arrayList.size() - 1).g();
    }
}

