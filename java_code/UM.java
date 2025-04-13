/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class UM {
    public static boolean a(aqs_2 aqs_22, ArrayList<aot_2> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Iterator<aqq_2> iterator = aqs_22.c_().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().b() != 0) continue;
                return true;
            }
            return false;
        }
        for (aqq_2 aqq_22 : aqs_22.c_()) {
            boolean bl = true;
            boolean bl2 = true;
            int n = 0;
            for (int n2 = 0; n2 < arrayList.size(); n2 = (int)((byte)(n2 + 1))) {
                boolean bl3;
                if (n > aqq_22.b() - 1) {
                    bl2 = false;
                    break;
                }
                if (((aqt_2)aqq_22.a(n)).b() == aov_1.d && arrayList.get(n2).t_() != aov_1.d) {
                    bl = false;
                    bl3 = true;
                    while (n2 < arrayList.size()) {
                        if (arrayList.get(n2) == null || arrayList.get(n2).t_() != aov_1.b) {
                            bl3 = false;
                            break;
                        }
                        n2 = (byte)(n2 + 1);
                    }
                    if (bl3) {
                        if (n != aqq_22.b() - 1) {
                            bl2 = false;
                            break;
                        }
                        return true;
                    }
                    n2 = (byte)(n2 - 1);
                    ++n;
                    continue;
                }
                if (((aqt_2)aqq_22.a(n)).b() == aov_1.e) {
                    bl = false;
                    bl3 = true;
                    int n3 = arrayList.size();
                    while (n2 < n3) {
                        if (arrayList.get(n2).t_() != aov_1.a) {
                            bl3 = false;
                            break;
                        }
                        n2 = (byte)(n2 + 1);
                    }
                    if (bl3) {
                        if (n != aqq_22.b() - 1) {
                            bl2 = false;
                            break;
                        }
                        return true;
                    }
                    n2 = (byte)(n2 - 1);
                    ++n;
                    continue;
                }
                if (((aqt_2)aqq_22.a(n)).b() == aov_1.g) {
                    if (arrayList.get(n2) == null) {
                        ++n;
                        continue;
                    }
                    bl = false;
                    bl3 = true;
                    while (n2 < arrayList.size()) {
                        if (arrayList.get(n2).t_() != aov_1.f) {
                            bl3 = false;
                            break;
                        }
                        n2 = (byte)(n2 + 1);
                    }
                    if (bl3) {
                        if (n != aqq_22.b() - 1) {
                            bl2 = false;
                            break;
                        }
                        return true;
                    }
                    n2 = (byte)(n2 - 1);
                    ++n;
                    continue;
                }
                if (arrayList.get(n2) == null) {
                    bl2 = false;
                    break;
                }
                if (arrayList.get(n2).t_() != ((aqt_2)aqq_22.a(n)).b()) {
                    bl2 = false;
                    break;
                }
                ++n;
            }
            if (!bl2 || bl && arrayList.size() != aqq_22.b()) continue;
            return true;
        }
        return false;
    }
}

