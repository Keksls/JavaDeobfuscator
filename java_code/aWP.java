/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class aWP
extends avv_0 {
    public static aWP a = new aWP();

    private aWP() {
    }

    @Override
    public List<awn_0> a() {
        ArrayList<awn_0> arrayList = new ArrayList<awn_0>();
        emS emS2 = emS.a(azu_0.j().n().v());
        block0: for (ave_0 ave_02 : ave_0.values()) {
            emS[] emSArray;
            if (ave_02.cg) continue;
            if (emS2 == emS.b) {
                aWP.a(arrayList, ave_02.ce, ave_02.cf, ave_02.ch, ave_02.cd);
                continue;
            }
            for (emS emS3 : emSArray = ave_02.ch) {
                if (emS3 != emS2) continue;
                aWP.a(arrayList, ave_02.ce, ave_02.cf, ave_02.ch, ave_02.cd);
                continue block0;
            }
        }
        arrayList.sort(new aWO());
        return arrayList;
    }
}

