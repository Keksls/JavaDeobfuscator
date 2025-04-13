/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class cDS
extends cdx_0 {
    private cdh_0 c;

    public cdh_0 j() {
        return this.c;
    }

    @Override
    public void a(cdh_0 cdh_02) {
        this.c = cdh_02;
    }

    @Override
    public void a(long l) {
        this.a(cdu_0.c);
    }

    @Override
    public void a(ArrayList<cDY> arrayList) {
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cer_0 cer_02) {
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cdh_0 cdh_02) {
        if (this.c == cdh_02) {
            super.a(arrayList);
        }
    }

    @Override
    protected boolean i() {
        return true;
    }
}

