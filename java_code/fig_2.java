/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fIg
 */
public abstract class fig_2
extends fyv_0
implements fim_2 {
    private static Logger a = Logger.getLogger(fig_2.class);
    protected boolean c = false;

    public boolean c() {
        return true;
    }

    @Override
    public boolean isStandAlone() {
        return this.c;
    }

    @Override
    public fjf_2 getContentGreedySize(fso fso2, fvE fvE2, fjf_2 fjf_22) {
        return this.getContentPreferedSize(fso2);
    }

    @Override
    public void a(fso fso2, fvE fvE2) {
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.c = false;
    }

    public fig_2 d() {
        return null;
    }

    public /* synthetic */ Object clone() {
        return this.d();
    }
}

